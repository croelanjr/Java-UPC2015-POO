package bancosingleton;

import java.util.Date;

public class CuentaAPlazoFijo extends Cuenta{

    private final Date fechaVencimiento;
    
    public CuentaAPlazoFijo(double balance, Date fechaVencimiento) {
        super(balance);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public boolean retirar(double cantidad) {
        
        Date hoy = new Date();
        if(hoy.after(fechaVencimiento)) {
            if(cantidad <= balance) {
                balance -= cantidad;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String getDescripcion() {
        return "Cuenta a plazo fijo con fecha de vencimiento " +fechaVencimiento;
    }

 
}
