package com.company;

import java.util.Scanner;
import java.util.Random;

public class stone_paper_scissors {
    public static void main(String[] args) {
        System.out.println("Stone paper scissors Game");
        try (Scanner sc = new Scanner(System.in)) {
            Random rand=new Random();
            int i=1;
            Byte sin=0;
            Byte scin=0;
            while (i<=5) {
                System.out.println("Score of you "+sin);
                System.out.println("Score of computer "+scin); 
                System.out.println("The "+i+"st match");
                System.out.println("Enter your choice\n"+"0-Stone\n"+"1-Paper\n"+"2-Scissors");
                Byte in=sc.nextByte();
                System.out.println("Your Entered choice is"+in);
                int cin=rand.nextInt(3);
                System.out.println("Computer's choice is"+cin);
                if(in == cin)
                {
                    System.out.println("Its a Draw");
                }
                else if(in==0 && cin==2)
                {
                    System.out.println("You won");
                    sin++;
                }
                else if(in==2 && cin==1)
                {
                    System.out.println("You won");
                    sin++;
                }
                else if(in==1 && cin==0)
                {
                    System.out.println("You won");
                    sin++;
                }
                else
                {
                    System.out.println("Oops!Computer won");
                    scin++;
                }
                System.out.println("Score of you "+sin);
                System.out.println("Score of computer "+scin); 
                i++;
                System.out.println(" ");
            }

            if (sin > scin) {
                System.out.println("You won the match");
            }
            else if(sin == scin){
                System.out.println("Its a tie match");
            }
            else 
            {
                System.out.println("Computer won the match");
            }
        }

        // int rand1=rand.nextInt(3);
        // System.out.println(rand1);
    }
}
