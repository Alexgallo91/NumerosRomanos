/*Autor: Araujo Moreno Alexis Abraham*/
package numerosromanos;

import java.util.concurrent.ThreadLocalRandom;

public class Principal {

    public static void main(String args[]) {
        int numeroRandom = 0;
        for (int i = 0; i < 1000; i++) {
            try {
                numeroRandom = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
                System.out.println("Numero random: " + numeroRandom);
                System.out.println(NumerosRomanos.numRoman(numeroRandom));
            } catch (NumMayor e) {
                System.out.println("Hubo un error");
                e.printStackTrace();
            } catch (ExcepcionNoNumber e) {
                System.out.println("Hubo un error");
                e.printStackTrace();
            }
        }

    }

}
