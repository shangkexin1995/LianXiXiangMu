package student;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("请输入1~10之间的数字");

        try{
            Scanner sc=new Scanner(System.in);
            int num=Integer.parseInt(sc.next());
            if((num>0)&&(num<11)){
                System.out.println("打印乘法表:");
                printTable(num);
            }
            else
                System.out.println("input error");
        }catch(Exception e){
            System.out.println("您输入的数字有误");
        }
    }
    public static void printTable(int maxNum){
        for (int i=1;i<=maxNum;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i+" ");
                if (j==i)
                    System.out.print("\n");

            }
        }
    }
}
