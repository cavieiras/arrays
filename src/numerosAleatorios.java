import java.util.Random; 
//funcionalidade Random que permite
//que o programa escolha as coisas de forma aleatória

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); 
        //cria um novo objeto random
        //que será "chamado" durante o programa

        int [] numerosAleatorios = new int[20]; 
        //essa linha determina o tamanho do array
        //fixado em 20 posições

        //criação de laço for();
        //o laço forEach() você não tem acesso
        //a posições específicas dentro do array
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(0, 100);
            //o bound é o limite; o random irá escolher 
            //números aleatórios dentro da faixa de valores de zero a 100.
            //a variável numero, neste caso, irá armazenar os valores
            //que o random vai escolher 
            //o i++ vai mostrar o valor subsequente do valor aleatório escolhido

            numerosAleatorios[i] = numero;
            //a variável numerosAleatorios vai assumir o valor aleatório
            //a partir da posição i = 0 até que i < numerosAleatorios.length,
            //caso contrário, i > 20, que é o tamanho do array

        }
        System.out.print("Números aleatórios: "); //indicativo do que será impresso
        for (int numero : numerosAleatorios) {      //condições: imprimir numero dentro do array de números aleatórios
            System.out.print(numero + " ");         //vai ser impresso em uma única linha   
        }

        System.out.print(" \nSucessores dos Números aleatórios: "); //indicativo do que será impresso
        for (int numero : numerosAleatorios) {      //condições: imprimir numero dentro do array de números aleatórios
            System.out.print((numero + 1)+ " ");    //vai ser impresso em uma única linha os números seguintes aos números aleatórios colocados dentro do array  
        }

    }
}
