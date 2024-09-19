package ModificadorFinal;

class Libro {
    final String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void cambiarTitulo(String nuevoTitulo) {
        // Error: No se puede cambiar el valor de un atributo final
        // this.titulo = nuevoTitulo;
    }
}

