package crudvector;

import java.util.*;

public class MetodosSistema {
    
    public Vector lista = new Vector();

    public void registrarPersona(Object x) {
        lista.add(x);
    }
    
    public void eliminarPersona(String nombre, String codigo){
        for (int i = 0; i < lista.size(); i++) {
            datosPersona dp = (datosPersona)lista.get(i);
            if (nombre.equals(dp.nombres) && codigo.equals(dp.codigo)) {
                lista.remove(i);
            }
        }
    }
    
}