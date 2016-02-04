import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Object;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;
public class GenerateTempPermitRequests {
	static String[] data = new String[2000];
	static int[] gpaCount = new int[2000];
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException
	{
		/**
		 * 1. Generate RUID from database in CSV file.
		 * 2. Generate corresponding license plate
		 * 3. Generate lot based on rigging
		 * 4. Generate corresponding campus based on lot
		 */
		
		//Generate lot and campus based on rigging and then collect random RUIDs and license plates
		
		/**Lot request rigging
		 * 70% of requests are for Livi and Busch (randomly assigned)
		 * 20% of requests are for College Ave
		 * 10% of requests are for Cook/Douglass
		 * 
		 * Livi
		 *	-	Of that 75%
			-	20% occur around 12 PM
			-	30% occur around 1: 40 PM
			-	30% occur around 3:20 PM
			-	10% occur around 10 AM
			-	10% occur around 5:00 PM 
			- 
		 **/
				//Date aDate = null;//(2015, 11, 7, 9, 15, 13);
		//aDate.(2015, 11, 7, 9, 15, 13);
		double[] GPA = readFile("Final_project_data.txt");
		for(int i=0; i<2000; i++) gpaCount[i]=0;
		for(int i=0; i<5000; i++)
		{
			@SuppressWarnings("deprecation")

			long offset = Timestamp.valueOf("2015-09-01 11:00:00").getTime();
			long end = Timestamp.valueOf("2015-09-01 12:00:00").getTime();
			long diff = end - offset;
			Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
			//Pick a random date but control the randomness of the time of day.
			//Make the time in between the twenty minute intervals given.
			int pickCampus = (int)(Math.random()*100);
			int timeOfDay = (int)(Math.random()*100);
			long offMyGame, endMyAss =0;
			String campus="";
			
			int findGPA = (int)(Math.random()*2000);
			if(pickCampus > 55)
			{
				campus="Livingston";
				
				if(timeOfDay>80) //12:00 -20%
				{
					offMyGame = Timestamp.valueOf("2015-09-01 11:55:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 12:15:00.000").getTime();
					
				}
				else if(timeOfDay > 50) //1:40
				{
					offMyGame = Timestamp.valueOf("2015-09-01 13:35:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 13:55:00.000").getTime();
				}
				else if(timeOfDay > 20) //3:20
				{
					offMyGame = Timestamp.valueOf("2015-09-01 15:15:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 15:35:00.000").getTime();
				}
				else if(timeOfDay > 10) //10:00
				{
					offMyGame = Timestamp.valueOf("2015-09-01 10:15:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 10:35:00.000").getTime();
				}
				else //5:00
				{
					offMyGame = Timestamp.valueOf("2015-09-01 16:55:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 17:15:00.000").getTime();
				}
				
			}
			else if(pickCampus > 45)
			{
				campus="CollegeAvenue";
				
				if(timeOfDay>80) //11:20-11:40
				{
					offMyGame = Timestamp.valueOf("2015-09-01 11:20:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 12:40:00.000").getTime();
				}
				else if(timeOfDay > 50) //2:40-3:00
				{
					offMyGame = Timestamp.valueOf("2015-09-01 14:40:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 15:00:00.000").getTime();
				}
				else if(timeOfDay > 20) //9:40-10:00 - when people come in the morning
				{
					offMyGame = Timestamp.valueOf("2015-09-01 09:40:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 10:00:00.000").getTime();
				}
				else if(timeOfDay > 10) //4:20-4:40
				{
					offMyGame = Timestamp.valueOf("2015-09-01 16:20:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 16:40:00.000").getTime();
				}
				else //RANDOM
				{
					offMyGame = Timestamp.valueOf("2015-09-01 00:00:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 23:59:59.000").getTime();
				}
				
				//System.out.println((long)diffy);
				//System.out.println(new Timestamp((long)diffy));
				
			}
			else if(pickCampus > 25) //15%
			{
			campus="Busch";
				
				if(timeOfDay>75) //12:00
				{
					offMyGame = Timestamp.valueOf("2015-09-01 11:55:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 12:15:00.000").getTime();
				}
				else if(timeOfDay > 55) //1:40
				{
					offMyGame = Timestamp.valueOf("2015-09-01 13:35:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 13:55:00.000").getTime();
				}
				else if(timeOfDay > 35) //3:20
				{
					offMyGame = Timestamp.valueOf("2015-09-01 15:15:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 15:35:00.000").getTime();
				}
				else if(timeOfDay > 20) //10:00
				{
					offMyGame = Timestamp.valueOf("2015-09-01 10:15:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 10:35:00.000").getTime();
				}
				else //RANDOM
				{
					offMyGame = Timestamp.valueOf("2015-09-01 00:00:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 23:59:59.000").getTime();
				}
				
			}
			else if(pickCampus > 4) //20%
			{
				campus="Douglass";
				
				if(timeOfDay>75) //12:20-12:50 - On Douglass, we saw major traffic in midday...
				{
					offMyGame = Timestamp.valueOf("2015-09-01 12:20:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 12:50:00.000").getTime();
				}
				else if(timeOfDay > 50) //1:50-2:20 -... as shown by the traffic in these time intervals
				{
					offMyGame = Timestamp.valueOf("2015-09-01 13:50:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 14:20:00.000").getTime();
				}
				else if(timeOfDay > 35) //3:40-4:10 - MORE TRAFFIC AROUND CLASS TIMES
				{
					offMyGame = Timestamp.valueOf("2015-09-01 15:40:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 16:10:00.000").getTime();
				}
				else //RANDOM
				{
					offMyGame = Timestamp.valueOf("2015-09-01 00:00:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 23:59:00.000").getTime();
				}
				
			}
			else //5%
			{
				//We didn't see many Cook requests - this could be because they didn't know
				//about our system
				campus="Cook";
				
				if(timeOfDay>75) //12:20-12:50 - On Douglass, we saw major traffic in midday...
				{
					offMyGame = Timestamp.valueOf("2015-09-01 12:20:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 12:50:00.000").getTime();
				}
				else if(timeOfDay > 50) //1:50-2:20 -... as shown by the traffic in these time intervals
				{
					offMyGame = Timestamp.valueOf("2015-09-01 13:50:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 14:20:00.000").getTime();
				}
				else if(timeOfDay > 35) //3:40-4:10 - MORE TRAFFIC AROUND CLASS TIMES
				{
					offMyGame = Timestamp.valueOf("2015-09-01 15:40:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 16:10:00.000").getTime();
				}
				else //RANDOM
				{
					offMyGame = Timestamp.valueOf("2015-09-01 00:00:00.000").getTime();
					endMyAss = Timestamp.valueOf("2015-09-01 23:59:00.000").getTime();
				}
				
			}
			
			
			//Use GPA to generate random GPAs in a certain interval.
			long diffy = (endMyAss - offMyGame);
			
			double ass = Math.random();
			Timestamp rand2 = new Timestamp((offMyGame) + (long)(ass * diffy));
			
			//so shown below - the people latest to class will be in latest 25% bracket and lowest GPAs
			//This is if ass<.75
			//We want the same GPAs to appear more so keep track of counts and increment counts if below a certain GPA.
			
			findGPA=pickGPAIndex(GPA, findGPA, campus, ass);
			double tempGPA=GPA[findGPA];
			if(i>1300) { while(gpaCount[findGPA]==0 && Math.abs(GPA[findGPA]-tempGPA)>.25){findGPA=(int)(Math.random()*2000);}}
			/*switch(campus)
			{
				case "CollegeAvenue": 	if(ass>.6) { while(!(GPA[findGPA] <  2.7)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.7)) {findGPA = (int)(Math.random()*2000);}}
				case "Livingston": 		if(ass>.6) { while(!(GPA[findGPA] <  2.5)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.5)) {findGPA = (int)(Math.random()*2000);}}
				case "Busch": 			if(ass>.6) { while(!(GPA[findGPA] <  2.5)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.5)) {findGPA = (int)(Math.random()*2000);}}
				case "Douglass": 		if(ass>.6) { while(!(GPA[findGPA] <  3.0)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  3.0)) {findGPA = (int)(Math.random()*2000);}}
				case "Cook": 			if(ass>.6) { while(!(GPA[findGPA] <  3.0)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  3.0)) {findGPA = (int)(Math.random()*2000);}}
			}*/
			
			//Match up with RUIDs and just print
			
			/*if(ass>.75) //If they are in the higher end of lateness
				//SHow that people later in College ave have lower GPAs.
			{
				while(!(GPA[findGPA] <  3.0))
				{
					findGPA = (int)(Math.random()*2000);
				}
			}
			else
			{
				while(!(GPA[findGPA] >  3.0))
				{
					findGPA = (int)(Math.random()*2000);
				}
			}*/
			int randMonth = (int)(Math.random()*4) + 8;
			rand2.setMonth(randMonth);
			int randDay = (int)(Math.random()*30) + 1;
			rand2.setDate(randDay);
			rand2.setMonth(randMonth);
			
			
			//Next steps - matching timings of request on campuses with lots and GPAs.
			//Take csv data and use .split at comma to access the GPAs and index them into an array
			//Use the index to find corresponding tuple in csv file of data.
			
			//rand2.setMonth(12-1);
			//Timestamp rand2 = new Timestamp((offMyGame) + diffy);
			//
			String RUID=data[findGPA].split(",")[1];
			String plate = data[findGPA].split(",")[6];
			System.out.println(RUID + "\t" + plate + "\t" + rand2 +"\t" + campus + "\t" + GPA[findGPA] + "\t" + data[findGPA].split(",")[5]);
		}
		
	}
			//System.out.println(rand);
			public static double[] readFile(String fileName)
			{
				Scanner scanner = null;
				try {
					scanner = new Scanner(new File(fileName));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				double[] GPAs = new double[2000];
				int i=0;
				while(scanner.hasNextLine()){
					String line = scanner.nextLine().toString();
					data[i]=line;
					String GPA=line.split(",")[3];
				    GPAs[i]=Double.parseDouble(GPA);
				    //System.out.println(GPAs[i]);
				    i++;
				    
				}
				return GPAs;
				
			}
			public static int pickGPAIndex(double[] GPA, int findGPA, String campus, double ass)
			{
				switch(campus)
				{
					case "CollegeAvenue": 	if(ass>.6) { while(!(GPA[findGPA] <  2.7)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.7)) {findGPA = (int)(Math.random()*2000);}}
					case "Livingston": 		if(ass>.6) { while(!(GPA[findGPA] <  2.5)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.5)) {findGPA = (int)(Math.random()*2000);}}
					case "Busch": 			if(ass>.6) { while(!(GPA[findGPA] <  2.5)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  2.5)) {findGPA = (int)(Math.random()*2000);}}
					case "Douglass": 		if(ass>.6) { while(!(GPA[findGPA] <  3.0)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  3.0)) {findGPA = (int)(Math.random()*2000);}}
					case "Cook": 			if(ass>.6) { while(!(GPA[findGPA] <  3.0)) { findGPA = (int)(Math.random()*2000);}} else { while(!(GPA[findGPA] >  3.0)) {findGPA = (int)(Math.random()*2000);}}
				}
				
				return findGPA;
			}
			
}
		
		
		
		//
		//rand.setNanos(0);
		/*long yourmilliseconds = 1274883865399L;
		long droppedMillis = 1000 * (yourmilliseconds/ 1000);    
		System.out.println(droppedMillis);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(yourmilliseconds));
		c.set(Calendar.MILLISECOND, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.
		System.out.println(sdf.format(c.getTime()));*/
		
		
		/*int ass = (int)(diff*Math.random());
		System.out.println(diff*Math.random());
		System.out.println(new Timestamp(ass+offset));
		//Date anotherDate = new Date(anotherYear, anotherMonth, anotherDay, ...);
		//if (aDate.after(anotherDate)) {...}
		//DateTime yearFromADate = aDate.plusYears(1);*/
		/*int campusChecker = (int)(Math.random()*100);
		//String campus="";
		if(campusChecker>30)
		{
			int buschorLivi= (int)(Math.random()*100);
			if(buschorLivi>.5)
			{
				campus="Livingston";
			}
			else
			{
				campus="Busch";
			}
			int dateRigger=(int)(Math.random()*100);
			int timeRigger=(int)(Math.random()*100);
			
		}
		if(campusChecker<30 && campusChecker>10)
		{
			campus="College Avenue";
			
		}
		if(campusChecker<10)
		{
			int cookorDouglass= (int)(Math.random()*100);
			if(cookorDouglass>.5)
			{
				campus="Cook";
			}
			else
			{
				campus="Douglass";
			}
			
		}*/
