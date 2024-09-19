package ModificadorFinal;

class Padre {
    public final void saludar() {
        System.out.println("Hola, soy el padre.");
    }
}

class Hijo extends Padre {
    // Error: No se puede sobrescribir un método final
    // public void saludar() {
    //     System.out.println("Hola, soy el hijo.");
    // }
}

