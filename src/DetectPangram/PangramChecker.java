package DetectPangram;

public class PangramChecker {
    public boolean check(String sentence){
        String abecedario = "abcdefghijklmnopqrstuvwxyz"; // definir abecedario para comparar
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", ""); //tudo para letraminuscula e trocar caracter especial por ""

        for(int i = 0; i < abecedario.length(); i++){ // percorre o abecedario
            boolean encontrou = false; // define boolean para comparação
            for(int j = 0; j < sentence.length(); j++ ){ // percorre a sentence
                if(abecedario.charAt(i) == sentence.charAt(j)){ //se achar a comparação for ok, atualiza boolean p true
                    encontrou = true;
                    break;
                }
            }
            if(encontrou == false){ // se sair desse for sendo falso, quer dizer que a letra do abecedario n foi achada na sentence
                return false;
            }
        }
    
      return true; // saiu do for sem cair no return false
    }
  }