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
        return key.length();

    }
    /**
     *  vacía el mapa
     */
    public boolean  clear()
    {
        valor = new int[0];
        key = new String[0];
    }

}

    