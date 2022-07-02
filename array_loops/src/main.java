package arrays_loops;
import java.util.Arrays;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
       /*int[] numbers = {0,1,2,3,4,5,6,7,8,9}; // los arrays son todos del mismo tipo, dentro se guardan variables del mismo tipo
        //int, Stinger...
        System.out.println(numbers.length);     //length es un atributo de la array, no un método, no lleva ()

        int[] numbers2 = new int [10];

        System.out.println(numbers2[2]);   // devuelve 0 xq es un valor primitivo, los objetos "falsos" deveuelve null

        numbers2 [0] = 1;

        String words[] = new String[10];

        System.out.println(words[0]);

        words [1] = "Hola";

        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("Hello");
        wordList.add(1,"Hi");
        wordList.add(1,"Hi2");


        System.out.println(wordList.get(0));
        System.out.println(wordList.get(1));
        System.out.println(wordList.get(2));

        wordList.set(1,"Another word in position 1"); //substituye el "valor" de una posición

        System.out.println(wordList.size());

        for(int x = 0; x < wordList.size(); x++){      // bucle for nos permite imprimir lo de arriba con menos lineas
            System.out.println(wordList.get(x));
        }

        int i = 0;
        while(i < wordList.size()){
            System.out.println(wordList.get(i));
            i++;
        }

        int j = 0;
        do {
            System.out.println(j++);
        } while (1 == 0);

        for(String word: wordList){
            System.out.println(word);
        }

        int k = 0;
        for (int k = 0; k < ; k++) {

        }



        // BONUS TRACK

        wordList.stream().forEach(System.out::println);
*/
        int[] numeros = {5, 4, 3, 2, 1};
        int posicionInicial = numeros[0];


        for (int i = 0; i < numeros.length; i++) {
            if (i == (numeros.length-1)) {
                numeros [i] = posicionInicial*numeros[i];
            } else {
                numeros[i] = numeros[i]*numeros[i+1];
            }
        }

        System.out.println(Arrays.toString(numeros));






    }
}