public class Implementation_Of_Stack_Using_Array{
    static class Stack {
        int top;
        int array[];
        Stack(int capacity) {
             array=new int[capacity];
             top=-1;
        }
        public void push(int num) {
            if(top<array.length-1)
            array[++top]=num;
        }
        public int pop() {
            if(top!=-1)
            return array[top--];
            return -1;
        }
        public int top() {
            if(top!=-1)
            return array[top];
            return -1;
        }
        public int isEmpty() {
            if(top==-1)
            return 1;
            return 0;
        }
        public int isFull() {
            if(top==array.length-1)
            return 1;
            return 0;

        }
    }
}