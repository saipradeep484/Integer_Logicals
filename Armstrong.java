package Integer;

import java.util.Scanner;

public class Armstrong {
//	counting the digits
	
    public int countDigits(int num) {

    	String s = String.valueOf(num);
        int count = s.length();
        return count;
    }
	public void Arm() {
        // int b;
        // int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = in.nextInt();
         String s = String.valueOf(a);
        int max = s.length()/2;
        int count=0;
        int i=0;
        
       
        int j=s.length()-1;
        while (i<max && (j)>=max) {
            if(s.charAt(i)==s.charAt(j))
            count++;
            i++;
            j--;
        }   
        if(count==max)
        System.out.println("yes it is Armstrong");
        else
        System.out.println("no it is not a armstrong ");
    }

    // Method to count the number of digits in a number


    public static void main(String[] args) {
        Armstrong m = new Armstrong();
        m.Arm();
        System.out.println(m.countDigits(9987));
    }
}
