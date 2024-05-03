public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos [] = {"KAROL", "JONAS", "JULIA", "SANDRA"};

        for (int x=0; x<alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}


// voce pode usar o for each também, como no exemplo abaixo:


/*
  String alunos [] = {"KAROL", "JONAS", "JULIA", "SANDRA"};
  
  for(String aluno : alunos {
    System.out.println("Nome do aluno é:" + aluno);
  })
  
  
 
 */