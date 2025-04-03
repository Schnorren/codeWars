package DirectionsReduction;

import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        
        Stack<String> pilha = new Stack<>();            //usar pilha pois eh a melhor solucao
        
        for(int i = 0; i < arr.length; i++){            //percorre o array 
            if(pilha.empty()){                          //adicionando o primeiro valor
                pilha.push(arr[i]);
            } else if(opposite(arr[i], pilha.peek())){  //comparando se o valor do topo é igual ao arr[i]
                pilha.pop();    	                    //se for, tira da pilha
            } else {                                    //se não for
                pilha.push(arr[i]);                     //adiciona na pilha
            }
        }

        return pilha.toArray(new String[pilha.size()]); //retorna a pilha em array
    }


        public static boolean opposite(String a, String b){ //compara se é o oposto
            return 
            a.equals("SOUTH") && b.equals("NORTH") ||
            a.equals("NORTH") && b.equals("SOUTH") ||
            a.equals("EAST") && b.equals("WEST") ||
            a.equals("WEST") && b.equals("EAST");
        }


}

