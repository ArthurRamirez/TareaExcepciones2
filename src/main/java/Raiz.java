public class Raiz {

    static void Calcular (int numero) throws NumeroNegativoExcepcion{
        if (numero < 0){
            throw new NumeroNegativoExcepcion("no se aceptan numeros negativos");
        }
        else{
            System.out.println(numero*numero);
        }
    }
    public static void  main(String args[]){

        try {
            Calcular(-2);
        } catch (NumeroNegativoExcepcion ex) {
            System.out.println("exception ocurred" + ex);
        }
    }
}
