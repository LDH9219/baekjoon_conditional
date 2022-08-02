/*
 * 14681
 * 문제 : 좌표를 입력받아 어느 사분면에 속하는지 알아내는 프로그램
 * 입력 : 첫줄에 정수 X (-1000<=X<=1000; x!=0) / 다음 줄에 정수 Y(-1000<=Y<=1000; y!=0)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quadrant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        br.close();

        if(x<0){
            if(y<0){
                System.out.println("3");
            }
            else{
                System.out.println("2");
            }
        }
        else if(0<x){
            if(y<0){
                System.out.println("4");
            }
            else{
                System.out.println("1");
            }
        }
    }
}