package basicprogramming;

public class ArrayToAnother {

	public static void main(String[] args) {
		
		
		int value[]= {4,6,7,4,3,3,6,9,0};
		int value1[]=new int[value.length];
		
		for(int i=0;i<value.length;i++) {
			for(int j=i+1;j<value.length;j++) {
				
				if(value[i]==value[j]) {
					
				value1[0]=value[i];
				value1[0]++;
					
				}
			}
			
			
		}	
		value1[0]++;
		for(int k=0;k<value1.length;k++)
		{
			System.out.print(value1[k]);
		}
		
	}
	

}
