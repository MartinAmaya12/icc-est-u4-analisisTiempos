
import controllers.SortMethods;
import java.util.Arrays;
import java.util.concurrent.Callable;
import models.Results;

public class App {
    public static void main(String[] args) throws Exception {
        SortMethods metodos = new SortMethods();
        int tamanio = 100000;
        int[] array = generate(tamanio);
        int[] arrayBubble = Arrays.copyOf(array, tamanio);
        int[] arrayBubbleAvan = Arrays.copyOf(array, tamanio);

        Callable<Void> miFuncionBubble = () -> {

            metodos.sortBubble(arrayBubble);
            return null;
        };

        Callable<Void> miFuncionBubbleAvan = () -> {

            metodos.sortBubbleAvan(arrayBubbleAvan);
            return null;
        };
        Results resultsBubble = BenchMarking.medirTiempos(miFuncionBubble);
        System.out.println("Burbuja " + resultsBubble.getTimeResult());

        Results resultsBubbleAvan = BenchMarking.medirTiempos(miFuncionBubbleAvan);
        System.out.println("Burbuja Avanzado " + resultsBubbleAvan.getTimeResult());
    }
    public static int[] generate(int size){
        int[] numeros = new int[size];
        for(int i = 0; i < size; i++){
            numeros[i] = (int) (Math.random() * 1000);
        }
        return numeros;
    }
}
