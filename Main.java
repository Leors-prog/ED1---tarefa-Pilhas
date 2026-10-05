// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Online Java!! Happy Coding :)");
  
      Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String entrada = sc.nextLine();
        
        String saida = Inversor
        .inverterPalavras(entrada);
        
        System.out.println("Saída: " + saida);
        
        sc.close();
    }
}
  

