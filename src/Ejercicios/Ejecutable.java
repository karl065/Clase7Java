package Ejercicios;

public class Ejecutable {

    public static void main(String[] args) {

        Alumno a = new Alumno();

        a.setNombre("Carlos Castellanos");
        a.setNif("245522");
        a.setCurso("JAVA");

        System.out.println("Nombre --> " + a.getNombre());
        System.out.println("Curso --> " + a.getCurso());

    }

}
