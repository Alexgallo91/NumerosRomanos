package numerosromanos;

public class Unidades {

    public static String obtenerUnidades(int unidades) {
        String numeroRomano = "";

        /*obteniendo unidades*/
        while (unidades != 0) {
            if (unidades == 9) {
                numeroRomano += "IX";
                unidades -= 9;
            }

            if (unidades >= 5) {
                numeroRomano += "V";
                unidades -= 5;
            }

            if (unidades == 4) {
                numeroRomano += "IV";
                unidades -= 4;
            }

            if (unidades < 4 && unidades > 0) {
                numeroRomano += "I";
                unidades--;
            }
        }
        //System.out.println(numeroRomano);
        return numeroRomano;

    }

    /*metodo para obtener decenas*/
    public static String obtenerDecenas(int decenas) {
        String numeroRomano = "";

        /*obteniendo unidades*/
        while (decenas != 0) {

            if (decenas == 9) {
                numeroRomano += "XC";
                decenas -= 9;
            }

            if (decenas >= 5) {
                numeroRomano += "L";
                decenas -= 5;
            }

            if (decenas == 4) {
                numeroRomano += "XL";
                decenas -= 4;
            }

            if (decenas > 0 && decenas < 4) {
                numeroRomano += "X";
                decenas -= 1;
            }
            //System.out.println("ciclo con decenas: " + decenas);
        }

        //System.out.println(numeroRomano);
        return numeroRomano;
    }
    
     /*metodo para obtener centenas*/
    public static String obtenerCentenas(int centenas) {
        String numeroRomano = "";

        /*obteniendo unidades*/
        while (centenas != 0) {

            if (centenas == 9) {
                numeroRomano += "CM";
                centenas -= 9;
            }

            if (centenas >= 5) {
                numeroRomano += "D";
                centenas -= 5;
            }

            if (centenas == 4) {
                numeroRomano += "CD";
                centenas -= 4;
            }

            if (centenas > 0 && centenas < 4) {
                numeroRomano += "C";
                centenas -= 1;
            }
            //System.out.println("ciclo con decenas: " + decenas);
        }
        return numeroRomano;
    }
    
    /*metodo para obtener centenas*/
        public static String obtenerMillares(int millares) {
        String numeroRomano = "";

        /*obteniendo unidades*/
        while (millares != 0) {

            if (millares > 0 && millares < 4) {
                numeroRomano += "M";
                millares -= 1;
            }
        }
        return numeroRomano;
    }
}


