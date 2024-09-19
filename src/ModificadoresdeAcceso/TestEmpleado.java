package ModificadoresdeAcceso;

public class TestEmpleado {
    public static void main(String[] args) {
        Manager manager = new Manager("Juan", 5000, "Ventas");
        System.out.println("Nombre: " + manager.nombre);
        manager.mostrarDepartamento();
        System.out.println("Salario: " + manager.getSalario());
    }
}