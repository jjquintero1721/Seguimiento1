package ModificadoresdeAcceso;

class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
}

class Perro extends Animal {
    public Perro() {
        super("Canino");
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}


