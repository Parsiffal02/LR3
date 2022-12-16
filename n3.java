import java.util.Arrays;
import java.util.Scanner;
public class n3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    
            int array_size = 0;        int array[]; 
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
        for (int i = 1; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = 0;
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

         System.out.println("Оригинальный массив:" + Arrays.toString(array));
    }


}


