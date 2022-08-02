/*
 * 2525
 * 문제 : 현재시간과 필요시간을 더해 끝나는 시각을 계산
 * 입력 : 첫째 줄에는 현재 시각 / 둘째 줄에는 요리에 필요한 시간
 * 출력 : 종료되는 시각의 시와 분을 공백을 사이에 두고 출력
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a = h*60 + m + n;
		h = a/60;
		m = a%60;
		
		if (h>=24) {
			h= h-24;
		}
		System.out.println(h + " "+ m);
	}
}