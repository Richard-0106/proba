package pkg02_05_oraimunka;

public class Main {
    



    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 5;
        int d;
        
        if(b < a){
            if(b < c){
                d = b*(a+c);
            }
            else{
                d = c*(a+b);
            }
        }
        else{
            if(a < c){
                d = a*(b+c);
            }
            else{
                d = c*(a+b);
            }
        }
        System.out.println(d);
    }
    
}
