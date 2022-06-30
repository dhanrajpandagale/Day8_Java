package Day8;

import java.util.Scanner;

public class NewLineComp {


        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter four different co-ordinate");
            Double firstLine = distanceCordinate(scanner.nextLine().split(""));
            System.out.println("Enter four different co-ordinate");
            Double secondLine = distanceCordinate(scanner.nextLine().split(""));

            if (firstLine.compareTo(secondLine)>0){
                System.out.println("First Line Is Greater");
            }
            else if(firstLine.compareTo(secondLine)<0){
                System.out.println("Second Line Is Greater");
            }
            else{
                System.out.println("Both are Equal");
            }
        }
        public static double distanceCordinate(String[] data){
            double[] value=new double[4];
            for(int i=0;i<data.length;i++)
                value[i]=Double.parseDouble(data[i]);
            return Math.sqrt(Math.pow((value[1]-value[0]),2)+ Math.pow((value[3]-value[2]),2));
        }

    }
