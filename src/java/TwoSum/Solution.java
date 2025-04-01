package TwoSum;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        
        for(int i = 0; i < numbers.length; i++){            //percorre o for 
            for(int j = i+1;  j < numbers.length; j++){     //e compara com o próximo elemento
                if(numbers[i] + numbers[j] == target){      //se for igual
                    return new int[]{i,j};                  //retorna um array com a dupla
                }
            }

        }

        return null; // Do your magic!
    }
}
