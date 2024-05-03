public class ResultadoNotas {
        public static void main(String[] args) {
        
            int nota = 10;
    
            if (nota >= 7)
            System.out.println("Aprovado(a)");
    
            else if (nota >= 5 && nota < 7)
            System.out.println("Em recuperação");
    
            else
            System.out.println("Reprovado(a)");
        }
}