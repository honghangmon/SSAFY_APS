package SWEA_3499_퍼펙트셔플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class 프로그래머스 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();
	  
	  for(int t=1; t<=T; t++) {
		  int N = sc.nextInt();
		  int min = sc.nextInt();
		  int max = sc.nextInt();
		  
		  int [] arr = new int [N];
		  for(int i=0;i<N;i++) {
			  arr[i] = sc.nextInt();
		  }
		  Arrays.sort(arr);
		  
		  ArrayList<Integer> list = new ArrayList<>();
		  for(int j = 0; j<arr.length;j++) {
			  if(!list.contains(arr[j])) {
				  list.add(arr[j]);
			  }
		  }
		  
		  Collections.sort(list);
		  
		  int abs = -1;
		  int ans = 0;
		  boolean constraint = false;
		  for(int s1= 0; s1<list.size()-1;s1++) {
			  for(int s2=list.size()-1;s2>s1;s2--) {
				  int low = 0;
				  int mid = 0;
				  int high =0;
				  
				  for(int c=0; c<arr.length;c++) {
					  if(arr[c]<=list.get(s1))
						  low++;
					  if(arr[c]>list.get(s1) && arr[c]<list.get(s2)) 
	                        mid++;
	                    if(arr[c]>=list.get(s2))
	                        high++;
	            }
				  if(low>=min&&mid>=min&&high>=min&&low<=max&&mid<=max&&high<=max) {
	                    constraint = true;
	                int [] arr3 = new int [] {low, mid, high};
	                Arrays.sort(arr3);
	                abs = Math.abs(arr3[2]-arr3[0]);
	            if(abs<ans) {
	                ans=abs;
	                }
	            }   
	        }   
	    }
	    if (!constraint) {
	        System.out.println("#"+t+" " + "-1");
	    }
	    else {
	        System.out.println("#"+t+" " + abs);
	    }
	}
				  }
}
    
    		

