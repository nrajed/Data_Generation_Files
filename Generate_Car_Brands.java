
public class Generate_Car_Brands {
    public static void main(String[] args)
    {
        double brand;
        
        for(int i = 0; i < 2000; i++)
        {
            brand = (Math.random() * 100);
            if(0<brand && brand<15) System.out.println("Toyota");
            if(15<brand && brand<30) System.out.println("Honda");
            if(30<brand && brand<50) System.out.println("Ford");
            if(50<brand && brand<58) System.out.println("Hyundai");
            if(58<brand && brand<65) System.out.println("Mazda");
            if(65<brand && brand<70) System.out.println("Jeep");
            if(70<brand && brand<78) System.out.println("Chevrolet");
            if(78<brand && brand<81) System.out.println("Mercedes");
            if(81<brand && brand<85) System.out.println("BMW");
            if(85<brand && brand<90) System.out.println("Audi");
            if(90<brand && brand<91) System.out.println("Lamborghini");
            if(91<brand && brand<97) System.out.println("Subaru");
            if(97<brand && brand<100) System.out.println("Volvo");
        }
    }
}
