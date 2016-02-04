
public class GenerateLotsandCampus {
	public static void main(String[] args)
	{
		/**Livi Lots :80-100 + any alpha char A-F
		 * College Ave: 70-79
		 * Busch: 20-69
		 * Douglass: 10-19
		 * Cook: 1-9
		 */
		System.out.println("WTF");
		
		for(int i=0; i<2200; i++)
		{
			int j = (int)(Math.random()*100);
			int lotNum=0;
			if(j>80) 
			{
				lotNum=(int)(Math.random()*19)+80;
				System.out.println("Livingston \t" + lotNum);
			}
			if(70<j && j<80) 
			{
				lotNum=(int)(Math.random()*9)+70;
				System.out.println("College Avenue \t" + lotNum);
			}
			if(20<j && j<70) 
			{
				lotNum=(int)(Math.random()*49)+20;
				System.out.println("Busch \t" + lotNum);
			}
			if(10<j && j<20) 
			{
				lotNum=(int)(Math.random()*9)+10;
				System.out.println("Douglass \t" + lotNum);
			}
			if(0<j && j<10) 
			{
				lotNum=(int)(Math.random()*8)+1;
				System.out.println("Cook \t" + lotNum);
			}
		}
		
	}
}
