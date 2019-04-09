package javaCoding18Nov;
//trying refactor
public class ArrayListClass implements Array {

	public static void main(String[] args) {
		//int arrayNum[]= {2,7,8,4,6,5,9};
		int num[][]= {{1,3,5,7},{3,0,9,8}};
		//int sum=0;
		int mincoloumn=0;
		int min = num[0][0]; 
		int size=num.length;
		int k = 0;
		int max=num[0][mincoloumn];
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				//j is coloumn number
				if(num[i][j]<min)
					min=num[i][j];
				mincoloumn=j;
			}
		}
		while( k<size) {
			if(num[k][mincoloumn]>max) {
				max=num[k][mincoloumn];
			}
			k++;
		}
		System.out.println(min);
		System.out.println(max);
		/*for(int i=0;i<arrayNum.length;i++) {
			if(arrayNum[i]==9) {
				System.out.println(i);
			}
			//System.out.println(arrayNum[i]);
			sum=sum+arrayNum[i];
		
		}
		System.out.println(sum);*/
		
	}

}
