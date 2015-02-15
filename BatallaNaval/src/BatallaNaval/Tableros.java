package BatallaNaval;

import java.util.ArrayList;

class Tableros {

    private ArrayList<String> tableropropio = new ArrayList<>();
    private ArrayList<String> tableroenemigo = new ArrayList<>();
    
    public Tableros()
    {
        tableropropio.add("D6");
        tableroenemigo.add("C2");
    }

    public ArrayList<String> getTableropropio() {
        return tableropropio;
    }

    public void setTableropropio(ArrayList<String> tableropropio) {
        this.tableropropio = tableropropio;
    }

    public ArrayList<String> getTableroenemigo() {
        return tableroenemigo;
    }

    public void setTableroenemigo(ArrayList<String> tableroenemigo) {
        this.tableroenemigo = tableroenemigo;
    }
    
    
    public boolean comprobarSiEstaVacioPropio(ArrayList<String> tableropropio) {
       if(tableropropio != null)
       {
           return true;
       }
        System.out.println("El tablero Propio está vació");
       return false;
    }
    
    public boolean comprobarSiEstaVacioEnemigo(ArrayList<String> tableroenemigo) {
       if(tableroenemigo != null)
       {
           return true;
       }
        System.out.println("El tablero Enemigo está vació");
       return false;
    }

    public String buscarLaCeldaubicada(String posiciones, String tipo) {
        String mensaje = null;
        String mensajes = null;
        if(tipo == "propio")
        {
            if(tableropropio.get(0) == posiciones)
            {
                 mensajes = "La posición del Tablero Propio " + posiciones + " está ocupada";
                 mensaje = "ocupado";
            }
            else if (tableropropio.get(0) != posiciones)
            {
                mensajes = "La posición del Tablero Propio " + posiciones + " no está ocupada.";
                mensaje = "no ocupado";
            }
        }
        else if(tipo == "enemigo")
        {
            if(tableroenemigo.get(0) == posiciones)
            {
                 mensajes = "La posición del Tablero Enemigo " + posiciones + " está ocupada";
                 mensaje = "ocupado";
            }
            else if (tableroenemigo.get(0) != posiciones)
            {
                mensajes = "La posición del Tablero Enemigo " + posiciones + " no está ocupada.";
                mensaje = "no ocupado";
            }            
        }
        System.out.println(mensajes);
        return mensaje;
    }

    public String ponerLaCeldaubicada(String posiciones, String tipo) {
        String mensaje = null;
        String mensajes = null;
        if(tipo == "propio")
        {
            if(tableropropio.get(0) == posiciones)
            {
                 mensajes = "La posición del Tablero Propio " + posiciones + " está registrado, Intente en otra posición.";
                 mensaje = "ubicado";
            }
            else if (tableropropio.get(0) != posiciones)
            {
                mensajes = "La posición del Tablero Propio " + posiciones + " está colocado.";
                mensaje = "registrado";
                tableropropio.add(posiciones);
            }
        }
        else if(tipo == "enemigo")
        {
            if(tableroenemigo.get(0) == posiciones)
            {
                 mensajes = "La posición del Tablero Enemigo " + posiciones + " está registrado, Intente en otra posición.";
                 mensaje = "ubicado";
            }
            else if (tableroenemigo.get(0) != posiciones)
            {
                mensajes = "La posición del Tablero Enemigo " + posiciones + " está colocado.";
                mensaje = "registrado";
                tableroenemigo.add(posiciones);
            }
        }        
        System.out.println(mensajes);
        return mensaje;
    }
    
    public void pantalla()
    {
        System.out.println("Tablero Propio Sus posiciones : " + tableropropio);
        System.out.println("Tablero Enemigo Sus posiciones : " + tableroenemigo);
    }

    public void agregarCeldaubicada(String posiciones, String tipo) {
        if(tipo == "propio")
        {
                tableropropio.add(posiciones);
        }
        else if(tipo == "enemigo")
        {
                tableroenemigo.add(posiciones);
        }                    
    }

    public void moverElbarco(String buscarbarco, String jugador, String movimiento) {
        if(jugador == "propio")
        {
            for(int i = 0; i < tableropropio.size(); i++)
            {
                if(buscarbarco == tableropropio.get(i))
                {
                    tableropropio.set(i, movimiento);
                }             
            }
            System.out.println("Tablero Propio en Movimiento : " + tableropropio);
        }
        else if(jugador == "enemigo")
        {
            for(int i = 0; i < tableroenemigo.size(); i++)
            {
                if(buscarbarco == tableroenemigo.get(i))
                {
                    tableroenemigo.set(i, movimiento);
                }             
            }
            System.out.println("Tablero Enemigo en Movimiento : " + tableroenemigo);
        }
    }

    public void eliminandoCeldaUbicada(String jugador, String eliminar) {
        String mensaje = null;
        if(jugador == "propio")
        {
            for(int i = 0; i < tableropropio.size(); i++)
            {
                if(eliminar == tableropropio.get(i))
                {
                    tableropropio.remove(i);
                }             
            }
        }
        else if(jugador == "enemigo")
        {
            for(int i = 0; i < tableroenemigo.size(); i++)
            {
                if(eliminar == tableroenemigo.get(i))
                {
                    tableroenemigo.remove(i);
                }             
            }
        }
    }

    public void ganadores() {
        int cantidadPropio = tableropropio.size();
        int cantidadEnemigo = tableroenemigo.size();
        if(cantidadPropio < cantidadEnemigo)
            System.out.println("El jugador Propio es el Ganador!");
        else if(cantidadPropio == cantidadEnemigo)
            System.out.println("Los jugadores están empatados");
        else if(cantidadPropio > cantidadEnemigo)
            System.out.println("El jugador enemigo es el Ganador!");
    }
}
