import java.util.Scanner;

public class consoantes {
  
    public static void main(String[] args) {
        //essa linha de código cria um array com 6 espaços.
        String[] consoantes = new String[6];
        //aqui será armazenada a quantidade de consoantes
        //que o usuário digitou
        int quantidadeConsoantes = 0;
        int contador = 0;
        do {

        try (//comando para que o usuário
            //digite as letras
    Scanner entrada = new Scanner (System.in)) {
        System.out.println("Escolha 6 letras:");
        String letras = entrada.next();

        //aqui cria-se a lógica
        //para a EXCLUSÃO de vogais 
        //tudo dentro do parenteses do if é a condição
        if ( ! (letras.equalsIgnoreCase("a") |
                letras.equalsIgnoreCase("e") |
                letras.equalsIgnoreCase("i") |
                letras.equalsIgnoreCase("o") |
                letras.equalsIgnoreCase("u"))) {
            //a partir desta linha é o código
            //que o if deve executar
            consoantes[contador] = letras; //armazena as letras consoantes
            quantidadeConsoantes++; //altera a contagem do contador
        }
    } 
            ;
        
            contador++;
                 
         
        
        } while(contador < consoantes.length);
        //essa condição do while faz com que
        //o loop se repita até que o contador
        //seja igual ao tamanho do array


        //aqui é utilizado o loop forEach
        //é preciso determinar a classe (String)]
        //variável de interesse (consoante)
        //determinar o array analisado (consoantes)
        for (String consoante : consoantes) {
            if (consoante != null) //essa linha impede que o espaço não preenchido seja impresso
                System.out.print(consoante + " ");
        }

        System.out.println("\n Quantidade de consoantes: " + quantidadeConsoantes);
    }


}
