public class Alumno {
    private String nombre,  carrera;
    private int calif, nControl;
    Alumno(String nombre, int nControl, int calif, String carrera) {
        this.nombre = nombre;
        this.nControl = nControl;
        this.calif = calif;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNControl() {
        return nControl;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getCalificacion() {
        return calif;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " NControl: " + nControl + " Calificacion: " + calif + " Carrera: " + carrera;
    }

}
