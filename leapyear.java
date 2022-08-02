/*
 * 2753
 * 문제 : 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오
 * 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고 4000보다 작거나 같다
 * 출력 : 윤년이면 1, 아니면 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class leapyear {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());
        
        if(year%4 == 0){
           if(year % 100 != 0 || year % 400 == 0 ){
            System.out.println("1");
           }
           else{
            System.out.println("0");
           }
        }
        else{
            System.out.println("0");
        }

    }
}