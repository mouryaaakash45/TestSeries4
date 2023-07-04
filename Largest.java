//Q4.Write a Java program to find the largest of three numbers using nested if-else statements.
public class Largest {

    public static void main(String[] args) {
        double n1 = 48, n2 = 99, n3 = 84;

        if(n1 >= n2){
            if(n1 >= n3)
                System.out.println("is the largest number :" + n1);
            
            else
                System.out.println("is the largest number :" + n3);
            
        }
        else{
            if(n2 >= n3)
                System.out.println("is the largest number :" + n2);
                else
                   System.out.println("is the largest number :" + n3);
        }
    }
    
}
