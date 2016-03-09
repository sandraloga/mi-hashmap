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
    public int put(String clave, int val)
    {
        int valorInicial = -1;
        boolean encontrado = false;
        int index = 0;
        while (!encontrado && index < key.length)
        {
            if (key[index].equals(clave))
            {
                valorInicial = valor[index];
                valor[index]=val;
                encontrado = true;
            }
            index++;
        }

        return valorInicial;
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave)
    {
        int claveEspcificada = -1;
        for (int index =0 ; index < key.length ; index++)
        {
            if (key[index]==clave)
            {
                claveEspcificada = valor[index];
            }
        }
        return claveEspcificada;
    }

    /**
     * devuelve true si el mapa no contiene elementos
     */
    public boolean isEmpty()
    {
        boolean noContieneElementos = false;

        if (key.length == 0)
        {
            noContieneElementos = true;
        }
        return noContieneElementos;
    }

    /**
     *  devuelve el número de elementos del mapa.
     */
    public  int size()
    {
        return key.length;

    }

    /**
     *  elimina del mapa el elemento con la clave dada y devuelve su valor.
     *  Si no hay esa clave en el mapa devuelve -1.
     */
    public int remove(String clave)
    {
        int valorEliminado=-1;
        for (int index = 0 ; index < key.length ; index++)
        {
            if(key[index].equals(clave))
            {
                String[] keyBis = new String[key.length-1];
                int[] valorBis = new int[valor.length -1];
                for (int i =0; i < key.length ; i++)
                {
                    valor[i] = valorBis[i];
                    key[i] = keyBis[i];
                }
                for(int i = index ; i < key.length ; i++)
                {
                    valor[i] = valorBis[i+1];
                    key[i] = keyBis[i+1]; 
                }
                valorEliminado = valor[index];
            }

        }
        return valorEliminado;
    }

    /**
     *  vacía el mapa
     */
    public void  clear()
    {
        valor = new int[0];
        key = new String[0];
    }

    /**
     * Devuelve true si el mapa contiene la clave dada
     */
    public boolean containsKey(String clave)
    {
        boolean claveEncontrada = false;
        int index = 0;
        while (!claveEncontrada && index < key.length)
        {
            if (clave == key[index])
            {
                claveEncontrada= true;
            }
            index++;
        }
        return claveEncontrada;
    }

    /**
     * Devuelve true si el mapa contiene el valor dado.
     */
    public boolean containsValue(int val)
    {
        int index =0;
        boolean valorEncontrado = false;
        while (!valorEncontrado && index < valor.length)
        {
            if ( val == valor[index])
            {
                valorEncontrado = true;
            }
            index++;
        }
        return valorEncontrado;

    }



}
