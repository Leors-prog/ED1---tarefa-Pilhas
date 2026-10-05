import java.util.Stack;

public class Inversor {
    public static String inverterPalavras(String texto) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                pilha.push(c);
            } else {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(' ');
            }
        }
        while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
        }            
     
        return resultado.toString();
    }
}