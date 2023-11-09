public class test {
    static final int NOMBRE = 0;
    static final int NCONTROL = 1;
    static final int CALIFICACION = 2;
    static final int CARRERA = 3;
    public static void main(String args[]) {
        Alumno[] alumnos = new Alumno[10];
        alumnos[0] = new Alumno("Francisco", 123456, 90, "ISC");
        alumnos[1] = new Alumno("Mujica", 251917, 100, "Economia");
        alumnos[2] = new Alumno("Alvaro", 1121920, 80, "Derecho");
        alumnos[3] = new Alumno("Josefa", 131415, 70, "DG");
        alumnos[4] = new Alumno("Plutarco", 666, 66, "Teologia");
        alumnos[5] = new Alumno("Jose", 1111111, 90, "IngCivil");
        alumnos[6] = new Alumno("Gustavo", 111300, 92, "Psicologia");
        alumnos[7] = new Alumno("Ernesto", 25000000, 70, "Macro Economia");
        alumnos[8] = new Alumno("Enrique", 20120043, 27, "Fisica Cuantica");
        alumnos[9] = new Alumno("Elena", 0101010, 90, "Fisica");
        OrdenarAlumnoPorCampo(alumnos, NOMBRE, false);
        printArray(alumnos);

        System.out.println("\nNombre");
        printArray(alumnos);
        System.out.println("\nNControl");
        OrdenarAlumnoPorCampo(alumnos, NCONTROL, false);
        printArray(alumnos);
        System.out.println("\nCalificacion");
        OrdenarAlumnoPorCampo(alumnos, CALIFICACION, false);
        printArray(alumnos);
        System.out.println("\nCarrera");
        OrdenarAlumnoPorCampo(alumnos, CARRERA, false);
        printArray(alumnos);

        System.out.println("\nNombre Inverso");
        OrdenarAlumnoPorCampo(alumnos, NOMBRE, true);
        printArray(alumnos);
        System.out.println("\nNControl Inverso");
        OrdenarAlumnoPorCampo(alumnos, NCONTROL, true);
        printArray(alumnos);
        System.out.println("\nCalificacion Inverso");
        OrdenarAlumnoPorCampo(alumnos, CALIFICACION, true);
        printArray(alumnos);
        System.out.println("\nCarrera Inverso");
        OrdenarAlumnoPorCampo(alumnos, CARRERA, true);
        printArray(alumnos);
    }

    public static void OrdenarAlumnoPorCampo(Alumno[] alumnos, int campo, boolean desendiente) {
        int len = alumnos.length, step = 0;
        boolean nskip = true;
        while(nskip && --len > 0) {
            nskip=false;
            for(step = 1; step <= len; step++) {
                if(comparator(alumnos, step, campo, desendiente)) {
                    swap(alumnos, step);
                    nskip=true;
                }
            }
        }
    }

    public static void swap(Alumno alumnos[], int startposswap) {
        Alumno aux = alumnos[startposswap-1];
        alumnos[startposswap-1] = alumnos[startposswap];
        alumnos[startposswap]=aux;
    }

    public static boolean comparator(Alumno alumnos[], int startpos, int field,boolean inverse) {
        boolean resEval = false;
        switch(field) {
        case NOMBRE:
            resEval = alumnos[startpos-1].getNombre().compareTo(alumnos[startpos].getNombre())>0;
            break;
        case CARRERA:
            resEval = alumnos[startpos-1].getCarrera().compareTo(alumnos[startpos].getCarrera())>0;
            break;
        case NCONTROL:
            resEval = alumnos[startpos-1].getNControl() > (alumnos[startpos].getNControl());
            break;
        case CALIFICACION:
            resEval = alumnos[startpos-1].getCalificacion() > (alumnos[startpos].getCalificacion());
            break;
        }
        return inverse? !resEval : resEval;
    }

    public static void printArray(Alumno[] objs) {
        for(Alumno obj:objs ) {
            System.out.println(obj.toString());
        }
    }

}
