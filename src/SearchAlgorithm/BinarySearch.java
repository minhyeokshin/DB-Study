package SearchAlgorithm;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("몇개의 데이터 입력? ex)7");
        int number = in.nextInt();
        int[] array = new int[number];

        System.out.print("오름차순으로 입력하세요!!%n");
        System.out.print("array[0] : ");
        array[0] = in.nextInt();

        for (int i = 1;i<array.length;i++){
            do{
                System.out.printf("array[%d] : ",i);
                array[i] = in.nextInt();

            }while (array[i]<array[i-1]); //오름차순으로 배열에 입력값을 저장하겠다.
        }
        for (int i = 0;i<array.length;i++){
            System.out.printf("%d ",array[i]);
        }

//        static int binSearch () {}


    }
}
