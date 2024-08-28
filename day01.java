import java.util.*;

class day01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive number");
            switch(num){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Number");    
            }
            for(int i=1;i<=num;i++){
                System.out.print(i);
            }
            
            System.out.println();

            while(num!=0){
                System.out.print(num);
                num--;
            }

            System.out.println();
           
           
            int i=1;
            do{
                System.out.print(i);
                i++;
                }while(i<=4);
                System.out.println();

        }
        else{
                System.out.println("Negative number");
            }

}
}