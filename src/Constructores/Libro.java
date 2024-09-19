package Constructores;

class Libro {
    String titulo;
    String autor;
    double precio;

    // Constructor 1: Solo inicializa el título
    Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
        this.precio = 0.0;
    }

    // Constructor 2: Inicializa título, autor y precio
    Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Programación en Java");
        Libro libro2 = new Libro("Programación en Java", "Autor Famoso", 29.99);

        System.out.println("Libro 1 - Título: " + libro1.titulo + ", Autor: " + libro1.autor + ", Precio: " + libro1.precio);
        System.out.println("Libro 2 - Título: " + libro2.titulo + ", Autor: " + libro2.autor + ", Precio: " + libro2.precio);
    }
}
