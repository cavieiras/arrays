public class ordemInversa{

    public static void main(String[] args) {
       
        int[] lista = {1, 2, 3, 4, 5, 6};

        System.out.println("Lista Original:" + lista);

        int count = 0;
        while(count < (lista.length)) {
        //o argumento length volta o tamanho da lista
        //o -1 ele corrige o tamanho da lista com a quantidade de itens    
            System.out.print(lista[count]+ " ");
            count++;

        }

        System.out.println("Lista Inversa: ");

        for (int i = (lista.length -1); i >= 0; i--) {
            System.out.print(lista[i] + " ");
        }
        
    }
}

