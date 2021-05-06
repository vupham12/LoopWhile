package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		// 11.1 Tong cac so 1 den 100
		
		int sum100  = 0;
		int iSum100 = 1;
		
		while(iSum100 <= 100) {
			sum100 += iSum100;
			iSum100++;
		}
		System.out.println("Tong 1 - 100 la: " + sum100);
	
		// tong cac so nho hon n chia het cho 3
		System.out.println("Nhap vao n = ");
		int n = sc.nextInt();
		int i3 =0;
		int summod3 = 0;
		
		while(i3 < n) {
			if(i3%3 == 0) {
				summod3 += i3;
			}
			i3++;
		}
		System.out.println("Tong cac so nho hon n chia het cho 3 la: " + summod3);
		
		// In ra 100 so Fibonaci dau tien
		
		long number1 =0 ;
		long number2 =1 ;
		long iFibonaci = 1;
		System.out.println("100 so Fibonaci dau tien la:");
		while(iFibonaci <= 100) {
			System.out.printf("%d\t ",number1);
			long sumNumber1Number2 = number1 + number2;
			number1 = number2;
			number2 = sumNumber1Number2;
			iFibonaci++;
		}
		
		//Polinom
		
		int m,rv,temp,mod;
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.printf("\nNhap vao so m = "); m = Scan.nextInt();
		
		temp = m; rv = 0;
		
	    while (m > 0) {
	    	   mod = m % 10;
	    	   m = m / 10;
	    	   rv= rv * 10 + mod;
	    }
	    
	    if (rv==temp) {
	    	System.out.printf("So %d la so Polinom",temp); 
	    } else {
	                  System.out.printf("So %d kp la so Polinom",temp);
	      }
	    // In ra cac so tu 100 -999 co tong chu so chia het cho 3
	 
		int tempMod = 0;
		int tempDiv = 0;
		int sum  = 0;
		System.out.println("\nCac so tu 100 - 999 co tong cac chu so chia het cho 3 la:");
		
		for(int i = 100; i < 1000 ; i++) {
			tempDiv = i;
			sum = 0;
			
			while(tempDiv > 0 ) {	
			    tempMod = tempDiv%10;
			    tempDiv = tempDiv/10;
			    sum +=tempMod;
			}
			
			
			if(sum%3 == 0) {
				System.out.printf(String.format("%d\t",i));
			}
			
		}

	}



       
       
	}


