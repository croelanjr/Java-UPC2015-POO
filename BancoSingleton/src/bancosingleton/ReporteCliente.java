package bancosingleton;

public class ReporteCliente {

    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void generarReporte() {

        // Imprimir cabecera del reporte
        System.out.println("\t\t\tREPORTE DE CLIENTES");
        System.out.println("\t\t\t================");

        // Para cada cliente
        for(Cliente p : this.banco.getClientes()){
            // Imprimir el nombre del cliente
            System.out.println();
            System.out.println("Cliente: "
                    + p.getApellidos()+ ", "
                    + p.getNombres());

            // Para cada cuenta de este cliente
            for (Cuenta c: p.getCuentas() ) {
                // Imprimir el balance actual de la cuenta
                System.out.println("    " + c);
            }
        }
    }
}
