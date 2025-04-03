package PlayingWithDigits;

public class DigPow {
	
	public static long digPow(int n, int p) {
	long soma = 0;
    String digits = Integer.toString(n);        //converte o n para String (para poder percorrer)
    
    for (int i = 0; i < digits.length(); i++){      //percorre o tamanho o n
        int digit = Character.getNumericValue(digits.charAt(i));        //pega o caracter da posição i de n
        soma += Math.pow(digit,p);      //acrescenta na soma
        p++;        //acresce o exponte
    }

    if(soma%n == 0){        //se restar 0
      return soma/n;        //retorna o valor da divisão
    }
    
    return -1;
	}
	
}
