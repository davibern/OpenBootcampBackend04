package ejercicio;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("davibern");
        cliente.setEdad(42);
        cliente.setTelefono("111222333");
        cliente.setCredito(20000);

        trabajador.setSalario(2999);

        System.out.println("Cliente: " + cliente.getNombre() + ", edad: " + cliente.getEdad()
                            + ", telefono: " + cliente.getTelefono() + ", credito: " + cliente.getCredito());

        System.out.println("El salario de trabajador es de " + trabajador.getSalario());
    }

}
