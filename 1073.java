import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      if(i%2==0){
        System.out.println(i+"^2"+" = "+(i*i));
      }
    }
  }
}