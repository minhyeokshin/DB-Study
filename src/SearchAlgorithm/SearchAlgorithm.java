package SearchAlgorithm;

import java.util.Scanner;

public class SearchAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇개의 데이터를 입력하시겠습니까? ex) 7 ");
        int number = in.nextInt();
        int[] array = new int[number];   //배열의 길이 셋팅하여 배열객체 생성
        int i = 0;

        for(i = 0 ; i < number ; i++){
            System.out.print("array[" +  i + "] : ");
            array[i] = in.nextInt();

        }

        System.out.print("검색할 값은? ");  //key 값을 입력
        int key = in.nextInt();
        int idx = seqSearch(array,number,key);
        if (idx == -1) System.out.println("해당 데이터가 존재하지 않습니다.");
        else {
            System.out.println("해당 데이터가 존재합니다.");
        }



    }

    static int seqSearch(int[] arr, int n, int key){
        int i = 0;
        while(true){
            if(i == n) return -1;  //검색 실패 (-1을 반환)
            if(arr[i] == key) return 1;   //검색 성공 (자료가 있는 인덱스 반환)
            i++;
        }

    }



}