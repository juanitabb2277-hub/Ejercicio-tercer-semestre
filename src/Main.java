public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("sofia",3.5,3.9,4.5);
        e1.mostrarinformacion();
        System.out.println("El promedio es:  "+e1.calcularPromedio());
        System.out.println(e1.estaAprobado(3.0));
    }
}