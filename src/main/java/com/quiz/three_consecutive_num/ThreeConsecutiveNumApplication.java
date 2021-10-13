package com.quiz.three_consecutive_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ThreeConsecutiveNumApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int cNum = 0;
        
        for (int x = 0; x < n ; x++) {
            arr[x] = scan.nextInt();
        }
        
        for (int i = 2; i < n ; i++) {
            if (arr[i] - arr[i-1] == 1 && arr[i-1] - arr[i-2] == 1) {
                cNum++;
            }
        }
        System.out.print(cNum);
		scan.close();
	}

}
