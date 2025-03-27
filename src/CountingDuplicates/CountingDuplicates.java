import java.util.Map;
import java.util.HashMap;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    text = text.toLowerCase(); // tudo para minusculo
    
    Map<Character, Integer> aux = new HashMap <>(); //criando hashmap para facilitar a contagem de duplicados 
    
    for(char c : text.toCharArray()){ //percorrer e inserir chaves no map
      if(aux.containsKey(c)){
        aux.put(c, aux.get(c)+1);
      } else {                        //se não tiver a chave, adiciona com valor 1
        aux.put(c,1);
      }
      }
      
      int counter=0;
      
      for(Integer valor : aux.values()){  //percorre o map dos valores identificando valores acima de 1
        if(valor > 1){
          counter ++;
        }
      }
      return counter;
    }
    
    
}
