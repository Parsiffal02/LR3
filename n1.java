import java.util.Scanner;

public class n1 {
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
        float[] Array1 = new float[array_size];
        float sum = 0;
        for (int j = 0; j < array_size; j++) {
            sum += array[j];
            Array1[j] = sum/(j+1);
        }
        System.out.println();
        System.out.println("Массив после обработки: ");
        for (int l = 0; l < Array1.length; l++) {
            System.out.println(Array1[l] + " ");
        }
        in.close();
    }
}