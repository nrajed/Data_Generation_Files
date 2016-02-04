	import java.text.DecimalFormat;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Random;
public class Generate_GPAs {

	    public static void main(String[] args)
	    {
	        double max = 1.0, min =0.75;
	        double gpa;
	        
	        for(int i = 0; i < 250; i++)
	        {
	            gpa = (Math.random() * (max - min) + min);
	            System.out.printf("%.2f\n", gpa);
	        }
	    }
	}

