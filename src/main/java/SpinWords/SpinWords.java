package SpinWords;

public class SpinWords {

    public String spinWords(String sentence) {
      String [] palavras = sentence.split(" ");
    
      for(int i=0; i<palavras.length; i++){
        if(palavras[i].length() >= 5){
          palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
        }
      }
      return String.join(" ", palavras);
    }
  }