package programacion2;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                1,
                "Edgard Mendoza",
                "emendoza10000@gmail.com"
        );

        System.out.println("=== SISTEMA DE CLIENTES ===");
        cliente.mostrarInformacion();
    }
}