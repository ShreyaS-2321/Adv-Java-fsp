import java.util.*;

public class collections2 {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<> ();
        stack1.push("ABD");
        stack1.push("Virat");
        stack1.push("Shubman");
        stack1.push("Rohit");
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        stack1.peek();
        System.out.println(stack1);    
        stack1.isEmpty();
        System.out.println(stack1);
        System.out.println("Index based iteration");
        for(int i=0;i<stack1.size();i++){
            System.out.print(stack1.get(i)+" ");
        }
        System.out.println("\nDynamic iteration");
        for(String ele:stack1){
            System.out.print(ele+" ");
        }
        System.out.println("\nIteration using Iterator object");
        Iterator<String> itr = stack1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
