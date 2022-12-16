import java.util.Arrays;
import java.util.Scanner;
public class n2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    
            int array_size = 0;        int array[];    int[] newArr = null;
                 do {
            System.out.print("Введите размерность массива: ");          
              while (!in.hasNextInt()) {
                System.out.println("Вы ввели не целое число или текст ");               
                 in.next();           
                 }
            array_size = in.nextInt();           
             if (array_size <= 0) {
                System.out.println("Вы ввели отрицательное число или ноль ");           
             }
        } while (array_size <= 0);        
        array = new int[array_size];        
        for (int i = 0; i < array_size; i++) {
            do {
                System.out.print("Введите элемент: ");                
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели не целое число или текст ");                    
                    in.next();               
                 }
                array[i] = in.nextInt();                
                if (array[i] < -9999*9999 || array[i] > 9999*9999) {
                    System.out.println("Вы ввели слишком большое число ");                
                }
            }
            while (array[i] < -9999*9999 || array[i] > 9999*9999);        
        }
    System.out.print("Введите элемент, который нужно удалить из массива:");
            int X = in.nextInt();
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == X) {
                    newArr = new int[array.length - 1];
                    for (int index = 0; index < i; index++) {
                        newArr[index] = array[index];
                    }
                    for (int j = i; j < array.length - 1; j++) {
                        newArr[j] = array[j + 1];
                    }
                    break;
                }
            }
            System.out.println("Оригинальный массив:" + Arrays.toString(array));
            System.out.println("Итоговый массив:" + Arrays.toString(newArr));
   in.close();
 }
    
}

