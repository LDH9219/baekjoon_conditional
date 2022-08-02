import java.util.Scanner;

/*
 * 2884
 * 문제 : 45분 일찍 알람을 설정하는 프로그램
 * 입력 : 첫째 줄에 두 정수 H와 M 이 주어진다. 이것은 현재 알람 H시 M분을 의미.
 * 출력 : 45분 빠른 설정 시간
 * 
 * 
 */

import java.util.Scanner;

public class alert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        if(m<45){
            h--;
            m = 60 - (45-m);
            if(h<0){
                h=23;
            }
            System.out.println(h+" "+m);
        }
        else{
            System.out.println(h+" "+(m-45));
        }
    }
}