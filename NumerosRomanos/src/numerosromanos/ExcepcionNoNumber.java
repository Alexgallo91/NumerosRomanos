/*
cuando el valor como argumento no es un numero int
 */
package numerosromanos;

public class ExcepcionNoNumber extends Exception{
    public  ExcepcionNoNumber()
    {
        super("no es un numero entero");
    }
}
