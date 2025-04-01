package SplitStrings;

public class StringSplit {
    public static String[] solution(String s) {
        
        if(s.length() % 2 != 0) { //se tiver resto 
            s += "_"; // coloca um _ no final
        }

        // agora todas palavras tem lenght par

        String[] resultado = new String[s.length()/2]; // cria array de string para a qt certa de pares

        for (int i = 0; i < s.length(); i += 2) { // pulamos de 2 em 2
            resultado[i / 2] = s.substring(i, i + 2);  // resultado  sendo i/2 para evitar mais variaveis
        }
        
        return resultado; 

    }
}