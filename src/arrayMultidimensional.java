import java.util.Random;

public class arrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //chamada do comando
        //
        //int[] linha = new int[4]; //declara que será 4 posições
        //int[] coluna = new int [4]; 
        
        //int i = 0;
        //int tamanho = lista.lenght;
        //if (i < lista.lenght ) {
        //    int numero = random.nextInt(0, 9);
        //    linha[i] = numero;
        //    System.out.print(linha);

       // }
      //
        
      //*montagem da matriz
      int[][] M = new int[4][4]; //[linha][coluna] = ordem dos colchetes
                                 // int[4][4] indica o tamanho de armazenamento
      
      for(int i = 0; i < M.length; i++) { //aqui determina o tamanho da linha; o i++ ajuda a criar as linhas restantes)
        for (int j = 0; j < M[i]. length; j++) { //aqui percorre o tamanho da linha (número de itens  = colunas)
            M[i][j] = random.nextInt(9);
        }
      }
    
    System.out.println("Matriz: ");
    for ( int [] linha: M) {
        for (int coluna : linha) {
            System.out.print(coluna + " ");  
        }
        System.out.println(); //aqui pula linha para dar a forma da matriz, cada vez que termina de preencheer uma posição na linha
    }
        
}
}
    


