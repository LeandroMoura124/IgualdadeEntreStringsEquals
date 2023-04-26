public class TestaComparacaoString {
    public static void main(String[] args){
        String nome = new String("Leandro");
        String nome2 = new String("Leandro");

        System.out.println(nome == nome2); // retorna false, pois ela nao avalia se o conteudo dentro do objeto é o mesmo
        // avalia se as duas variaveis apontam para o mesmo objeto

        /*O Java só coloca no pool as Strings criadas usando literais. Strings criadas 
        com o operador new não são colocadas no pool automaticamente.

        */

        String nome3 = "Leandro";
        String nome4 = "Leandro";
        System.out.println(nome3 == nome4);// as duas referências estão apontando para o mesmo objeto do pool, o == retorna true.
         // retorna true - MAS porquê?
        //Atribuindo o valor da váriavel String nome3 diretamente, sem chamar um objeto, ela
        //armazenou o conteudo em um espaço da memória, quando atribuí o mesmo valor pra var String nome4 diretamente
        //ela analisou que já existe em um espaço da memória uma variável armazenando o mesmo valor, em suma
        //ela apenas referenciou o nome4 a variável nome3

        String nome5 = new String("Leandro");
        System.out.println(nome3==nome5); //retorna false - avaliou String direta com new String
        //entaoo, o new String armazenou um novo objeto na memória e nao referenciou diferentemente da comparacao nome3==nome4
        //para fugir disso, usamos o EQUALS.
        //              EQUALS
        //refencia e compara o conteudo dentro da variavel STRING, sem avaliar se a variável vem de um objeto ou literal string
        // avaliando-as em suma, mesmo estando em posicoes de memorias diferentes

        System.out.println(nome3.equals(nome5)); // retorna true



        
    }
}
