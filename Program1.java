public class  Program1{
    public static void main(String args[]){
        int a = 10, b = 20, c = 0;
        System.out.println("a = "+a+"\t"+"b = "+b);
        c = b;
        b = a;
        a = c;
        System.out.println("a = "+a+"\t");
    }
}