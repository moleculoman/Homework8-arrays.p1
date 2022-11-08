import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        int [] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double [] secondArray = {1.57 , 7.654, 9.986};
        float [] thirdArray = {1.65F , 689F};

        //Задача 2.
        System.out.println("Задача 2");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + ",");
        }
        System.out.println(" ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]+ ",");
        }
        System.out.println(" ");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]+ ",");
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        for (int i = firstArray.length-1; i >= 0; i--) {
            System.out.print(firstArray[i] + ",");
        }
        System.out.println(" ");
        for (int i = secondArray.length-1; i >= 0; i--) {
            System.out.print(secondArray[i]+ ",");
        }
        System.out.println(" ");
        for (int i = thirdArray.length-1; i >= 0; i--) {
            System.out.print(thirdArray[i]+ ",");
        }
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i< firstArray.length;i++){
            if (firstArray[i] % 2 !=0){
                firstArray[i] +=1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}