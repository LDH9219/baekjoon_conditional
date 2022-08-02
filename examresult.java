/*
 * 9498
 * 문제 : 시험 점수를 입력받아 90~100점은 A
 * 80~89점은 B / 70~79점은 C / 60~69점은 D / 나머지 F 출력 프로그램 작성
 * 
 * 입력 : 첫째 줄에 시험 점수가 주어진다.
 * 
 * 출력 : 시험 성적을 출력
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class examresult {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int exam = Integer.parseInt(br.readLine());

        if(90 <= exam){
            System.out.println("A");
        }
        else if(80 <= exam){
            System.out.println("B");
        }
        else if(70 <= exam){
            System.out.println("C");
        }
        else if(60 <= exam){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}