package ModificadoresdeAcceso;

class Empleado {
    public String nombre;
    private double salario;
    protected String departamento;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Manager extends Empleado {
    public Manager(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        setSalario(salario);
        this.departamento = departamento;
    }

    public void mostrarDepartamento() {
        System.out.println("Departamento: " + departamento);
    }
}
