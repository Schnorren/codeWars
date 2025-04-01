package TwoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < numbers.length; i++){            //percorre o for 
            int aux = target - numbers[i];                  //verifica qt falta para atingir o target

            if(map.containsKey(aux)){                       //se map já tiver a chave aux 
                return new int[]{map.get(aux), i};          //retorna array [indice de onde ta o aux,indice atual]
            }

            map.put(numbers[i], i);                         //se não correspondeu, adiciona e segue o baile
        }

        return null; // Do your magic!
    }
}
