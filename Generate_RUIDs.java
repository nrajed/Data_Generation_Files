
public class Generate_RUIDs {
	public static void main(String[] args)
	{
		//Numbers 1,2 are 15 or 16. Numbers 4,5 are 00, Numbers 6,7,8,9 are random
	//	int[] indexed = new int[1000];
	//	for(int i=0; i<indexed.length; i++) {indexed[i]=0;}
		for(int i=0; i<2000; i++){
		int number3 = (int)(Math.random()*10);
		int number2=5;
		if(number3<4) {number2=6;}
		
		int number6to9=i+1257;
		
		//indexed[i]=number6to9;
		int RUID = 100000000+number2*10000000+number3*1000000+number6to9;
		
		
		System.out.println(RUID);
		}
	}
	/*public static int pin(int[] indexed)
	{
		int number6to9=(int)(Math.random()*10000);
		for(int j=0; j<2000; j++)
		{
			if(number6to9==indexed[j]);
			{
				pin(indexed);
			}
		}
		return number6to9;*/
	//}
}
