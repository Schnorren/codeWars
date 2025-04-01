package PersistentBugger;

class Persist {
	public static int persistence(long n) {
    int count = 0;    //contador p contar quantas multiplicacoes vai ter
    
    while(n > 9){     //somente 1 caracter
      
      String str = String.valueOf(n);     //converte long p string 
      int aux = 1;
      
      for(int i = 0; i<str.length(); i++){    //percorre a string 
        aux *= Character.getNumericValue(str.charAt(i));     //e calcula a multiplicacao de cada caracter da string
      }
      
      n = aux;    //atualiza o n
      count++;    //soma contador

    }

		return count; // your code
	}
}