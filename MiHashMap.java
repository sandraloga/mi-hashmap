import java.util.ArrayList;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    private String [] key;
    private int[] valor;
  
    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valor = new int[0];
        key = new String[0];
    }

    /**
     * Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. 
     * Asocia el valor especificado con la clave especificada.
     * Si no existía devuelve -1.
     */ 
    public int put(String clave, int valor)
    {
        int valorInicial =-1;
        boolean encontrado = false;
        int index = 0;
        while (!encontrado && index < key.length)
        {
            if (key[index]==clave)
            {
                 valorInicial=  valor[index];
                 valor[index]=valor;
                 encontrado = true;
            }
          index++;
        }

        return valorInicial;
    }
}

    