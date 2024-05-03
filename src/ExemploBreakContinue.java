public class ExemploBreakContinue {

    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                break;

            System.out.println(numero);
        }
    }
}

/*

voce pode usar o break para parar ou continue para continuar

 for (int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                continue;

resposta do terminal: 1 2 3 4 5

*/