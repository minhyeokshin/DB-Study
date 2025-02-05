//public class IntArrayQueue {
//
//
//
//
//        //멤버 (필드)
//        private int[] que; //큐의 데이터 저장소(본체)
//        private int capacity; //큐의 용량
//        private int num; //현재 데이터 개수
//
//        //생성자
//
//    public IntArrayQueue(int capacity) {
//        this.num = num;
//        this.capacity = capacity;
//        try {
//            que = new int[this.capacity]; //큐 배열을 생성
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    //기능 (메소드)
//
//    public class EmptyIntArrayQueueException extends RuntimeException{
//        public EmptyIntArrayQueueException(){}
//    }
//
//    public class OverflowIntArrayQueueException extends RuntimeException{
//        public OverflowIntArrayQueueException(){}
//    }
//
//
//
//    public int enque(int x) throws Exception{
//        if (this.num >= this.capacity) throw OverflowIntArrayQueueException{
//            throw new OverflowIntArrayQueueException();
//        }
//        que[num++] = x;
//        return x;
//    }
//
//    public int deque() throws EmptyIntArrayQueueException{
//        if(num <= 0) throw new EmptyIntArrayQueueException();
//        int x = que[0];
//        for (int i =0;i<(num-1);i++)
//            que[i] = que[i+1];
//        num--;
//        return x;
//    }
//    //peek() : 큐에서 데이터를 피크(맨앞에 있는 데이터를 들여다 본다)
//    public int peek() throws EmptyIntArrayQueueException{
//        if (num<=0) throw new EmptyIntArrayQueueException();
//        return que[num-1];
//    }
//
//    //큐를 비웁니다.
//    public void clear(){
//        num = 0;
//    }
//
//    //큐에서 x를 검색하여 발견하지 못하면 -1을 반환 하는 indexOf() 기능구현
//    public int indexOf(int x){
//        for (int i = 0;i<num;i++){
//            if (que[i] == x) return i; //검색 성공 . 해당 인덱스 전달
//        } return -1; // 검색 실패
//    }
//
//    //큐의 용량을 반환하는 capacity()
//    public  int capacity(){
//        return this.capacity;
//    }
//    //큐가 비어 있는지 확인 boolean isEmpty()
//    public boolean isEmpty(){
//        return num<=0;
//    }
//    //큐안의 모든 데이터를 맨앞 -> 맨끝 순서로 출력 void dump()
//    public void dump(){
//        if (num<=0) System.out.println("Empty");
//        else {
//            for (int data : que) System.out.print(data);
//            System.out.println();
//        }
//    }
//    //큐에 쌓여 있는 데이터수를 변환 int size()
//    public int size(){
//        return num;
//    }
//    //큐가 가득 차있는가?
//    public boolean isFull(){
//        return num>=capacity;
//    }
//
//}
//
//
