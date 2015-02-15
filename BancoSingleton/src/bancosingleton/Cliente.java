package bancosingleton;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombres;
    private String apellidos;
    private List<Cuenta> cuentas;
    
    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        // initializar array de cuentas
        cuentas = new ArrayList<Cuenta>();
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }


    public void agregarCuenta(Cuenta cuenta) {
       cuentas.add(cuenta);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
