/*
cuando el valor como argumento no es un numero int
 */
package numerosromanos;

public class NumMayor extends Exception{
    public  NumMayor(int num)
    {
        super("El numero "+num+" que intentas ingresar es mayor a 4000");
    }
}
