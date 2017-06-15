package numerosromanos;
import java.util.Random;

import java.util.InputMismatchException;

public class NumerosRomanos{

    public static String numRoman(int numero) throws ExcepcionNoNumber, NumMayor{

        String numeroRomano = "";
        int decenas, centenas, millar, unidades;
        decenas = centenas = millar = unidades = 0;
        int numeroIngresado = numero;

        while (true) {

            if (numeroIngresado > 0 && numeroIngresado < 4000) {
                break; 
            } else {
                throw new NumMayor(numeroIngresado);
            }
        }
        
        //estableciendo unidades
        if (numeroIngresado >= 1000) {
            millar = numeroIngresado / 1000;
            numeroIngresado %= 1000;
        }

        if (numeroIngresado >= 100) {
            centenas = numeroIngresado / 100;
            numeroIngresado %= 100;
        }

        if (numeroIngresado >= 10) {
            decenas = numeroIngresado / 10;
            numeroIngresado %= 10;
        }

        unidades = numeroIngresado;

        /*estableciendo numero romano*/
        numeroRomano += Unidades.obtenerMillares(millar);
        numeroRomano += Unidades.obtenerCentenas(centenas);
        numeroRomano += Unidades.obtenerDecenas(decenas);
        numeroRomano += Unidades.obtenerUnidades(unidades);
//
//        System.out.println("\nmillar: " + millar);
//        System.out.println("centenas: " + centenas);
//        System.out.println("decenas: " + decenas);
//        System.out.println("unidades: " + unidades);

//        System.out.println("Numero romano: " + numeroRomano);
        return numeroRomano;
    }

}
