public class Implementation_Of_Stack_Using_Array{
    static class Stack {
        int top;
        int array[];
        Stack(int capacity) {
            // Write your code here.
             array=new int[capacity];
             top=-1;
        }
        public void push(int num) {
            // Write your code here.
            if(top<array.length-1)
            array[++top]=num;
        }
        public int pop() {
            // Write your code here.
            if(top!=-1)
            return array[top--];
            return -1;
        }
        public int top() {
            // Write your code here.
            if(top!=-1)
            return array[top];
            return -1;
        }
        public int isEmpty() {
            // Write your code here.
            if(top==-1)
            return 1;
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if(top==array.length-1)
            return 1;
            return 0;

        }
    }
}