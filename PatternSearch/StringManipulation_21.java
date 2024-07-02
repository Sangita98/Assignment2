package assignment;

	import java.util.Scanner;

	public class StringManipulation_21{
		
		private static String reverse(String result) {
			// TODO Auto-generated method stub
			char[] str=result.toCharArray();
			char[] str1=new char[str.length];
			if(str.length==0) {
				System.out.println("String is NULL");
			}
			else {
				int count=0;
				
				for(int i=str.length-1;i>=0;i--) {
					str1[i]=str[count];
					count++;
				}
			}
			return new String(str1);
		}
		
		private static String subString(String str,int len) {
			// TODO Auto-generated method stub
			int length=str.length();
			if(length<len) {
				return "Subtring length is greater";
			}
			else {
				int start=(length-len)/2;
				return str.substring(start, (start+len));
			}
			
		}

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String1: ");
			String s1=sc.nextLine();
			System.out.println("Enter String2: ");
			String s2=sc.nextLine();
			
			System.out.println("Length of "+s1+" : "+s1.length());
			System.out.println("Length of "+s2+" : "+s2.length());
			String result=s1.concat(s2);
			System.out.println("Concatenation: "+result);
			String result1=reverse(result);
			System.out.println("Reverse: "+result1);
			System.out.println("Enter the length of Substring: ");
			int len=sc.nextInt();
			String result2=subString(result1,len);
			System.out.println("Substring of length "+len+": "+result2);
			
			sc.close();
		}
	}

	
