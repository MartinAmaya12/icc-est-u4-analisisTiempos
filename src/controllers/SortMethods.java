package controllers;

public class SortMethods {
    public void sortBubble(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] < numeros[j]){
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }

    public void sortBubbleAvan(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            boolean swapped = false;
            for(int j = 1; j < numeros.length - 1 - i; j++){
                if(numeros[j] < numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    swapped = true;
                }
            }if(!swapped){
                return;
            }
        }
    }
}
