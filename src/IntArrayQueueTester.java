import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //최대 64개를 인큐할수 있는 큐 생성
        IntArrayQueue queue = new IntArrayQueue(64);

        int x = 0;

        while (true){
            System.out.println("현재 데이터 개수 : "+queue.size() + "/" + queue.capacity());
            System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)종료 숫자로 선택하세요.");
            int menu = in.nextInt();
            if (menu==0) break;
            switch (menu){
                case 1:
                    System.out.println("숫자 데이터를 입력하세요.");
                    x = in.nextInt();
                    try {
                        queue.enque(x);
                    } catch (Exception e) {
                        System.out.println("큐가 가득 차있습니다.");
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    x = queue.deque();
                    break;

            }
        }
    }
}
