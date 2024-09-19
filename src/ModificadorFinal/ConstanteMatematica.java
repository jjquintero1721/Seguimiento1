package ModificadorFinal;

class ConstanteMatematica {
    final double PI = 3.14159;

    public final double calcularCircunferencia(double radio) {
        return 2 * PI * radio;
    }
}

// Error: No se puede sobrescribir un método final
// class NuevaConstante extends ConstanteMatematica {
//     @Override
//     public double calcularCircunferencia(double radio) {
//         return 0;
//     }
// }


