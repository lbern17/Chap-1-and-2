import java.util.Scanner;
class practice 
{
    public static void main(String[] args) 
      {
        //Declare Variables
        String name1;
        String name2;
        String name3;

        //Accept User Imput
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Please Enter First Name ");
        name1=keyboard.nextLine();
        System.out.print("Please Enter Second Name ");
        name2=keyboard.nextLine();
        System.out.print("Please Enter Third Name ");
        name3=keyboard.nextLine();


        //Compare

        if((name2.compareToIgnoreCase(name1)<0)&&(name2.compareToIgnoreCase(name3)<0))
        {
            System.out.println(name2);
        }

        //Compare 

        if((name1.compareToIgnoreCase(name2)<0)&&(name1.compareToIgnoreCase(name3)<0))
        {
            System.out.println(name1);
        }

        //Compare

        if((name3.compareToIgnoreCase(name1)<0)&&(name3.compareToIgnoreCase(name2)<0))
        {
            System.out.println(name3);
        }
}
}     