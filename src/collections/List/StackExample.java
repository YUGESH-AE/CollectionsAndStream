package collections.List;


import java.util.Stack;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
 */
public class StackExample {
    public static void main(String[] args) {

        Stack<String>names=new Stack<>();
        names.push("java");
        names.push("spring");
        names.push("react");


        while (!names.isEmpty()){
            System.out.println(names.pop());
        }

        System.out.println(names.peek());
        System.out.println(names.size());
        System.out.println(names.pop());
        System.out.println(names.size());
        System.out.println(names.peek());
    }
}
