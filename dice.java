/*
 * 2480
 * 문제 : 상금을 계산하는 프로그램 작성
 * 입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 주어진다
 * 출력 : 상금을 출력한다.
 */

import java.util.Scanner;
 
public class dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(a==b && b==c){
            System.out.println(10000 + a * 1000);
        }
        else if(a==b||a==c){
            System.out.println(1000 + a * 100);
        }
        else if(b==c){
            System.out.println(1000 + b * 100);
        }
        else{
           if(a>b && a>c){
            System.out.println(a*100);
           }
           else if(b>a && b>c){
            System.out.println(b*100);
           }
           else{
            System.out.println(c*100);
           }
        }
    }
}