package javaapplication1;
public class JavaApplication1 {
    public static int Power(double base, int exponent) {
        int total = 1;
        for (int i = 1; i <= exponent; i++) {
            total *= base;
 
            
        }
        return total;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int temp = Power(2,3);
        System.out.println(temp);
    }
    
}
    
    

