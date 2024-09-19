package ModificadoresdeAcceso;

class CuentaBancaria {
    private double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
