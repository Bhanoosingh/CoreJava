package Date_08_01_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		//Input String by User
		int n;
		System.out.println("Enter no of input you want to try:-");
		n = Integer.parseInt(br.readLine());
		String srr[] = new String[n];
		for (int i = 0; i < srr.length; i++) {
			System.out.println("Enter s"+(i+1)+":-");
			srr[i] = br.readLine();
		}
		
		//Manupulating String
		for(int i=0;i<srr.length;i++) {
			int p=0;
			for(int j=0;j<srr[i].length();j++) {
				if(srr[i].charAt(j)==' ') {
					System.out.print(srr[i].substring(p, p+1).toUpperCase()+".");
					p=j+1;
				}
			}
			
			System.out.println(srr[i].substring(p,p+1).toUpperCase()+srr[i].substring(p+1).toLowerCase());
		}

	}

}
