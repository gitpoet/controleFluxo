import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
try{
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int p = teclado.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int p2 = teclado.nextInt();

    teclado.close();
    
    int interacoes = p2 - p; 

    contar(interacoes);

}
catch(Exception e){
    System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
}
    
}

static void contar(int interacoes)throws ParametrosInvalidosException{
    if (interacoes <= 0){
        throw new ParametrosInvalidosException();
    } 
       
    for(int i = 1; i <= interacoes; i++){
        System.out.println("Imprimindo o número " + i);
    }
}

}
