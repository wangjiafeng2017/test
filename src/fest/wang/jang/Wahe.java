package fest.wang.jang;

import java.awt.print.Printable;

import javax.security.auth.x500.X500Principal;

public class Wahe {
	public static void main(String args[]){
		int[] data = new int[]{8,3,4,7,1,0,6};
		System.out.print("排序前的输出:");
		print(data);
		for(int x = 0; x<data.length;x++){
			for(int y=0;y<data.length-1;y++){
				if(data[y]>data[y+1]){
					int t=data[y];
					data[y]=data[y+1];
					data[y+1]=t;
				}
			}
			
		}
		System.out.print("排序后的输出:");
		print(data);
	}
	public static void print(int temp[]){
		for(int x = 0 ; x<temp.length;x++){
			System.out.print(temp[x]+",");
		}
		System.out.println();
	}
}
	