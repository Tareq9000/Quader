import java.util.Scanner;

public class Quader {


    static Scanner scanner;

    public Quader() {
        scanner = new Scanner(System.in);
    }
 

    public static void main(String[] args) {
    	Quader1 q = new Quader1();
        q.x1 = 3;
        q.x2 = 5;
        q.y1 = 3;
        q.y2 = 5;
        q.z1 = 3;
        q.z2 = 5;
       
       
        
        int r = q.getRauminhalt();
    	System.out.println("Rauminhalt:" + r);
    	
    	 int r1 = q.getOberfläche();
     	System.out.println("Oberfläche:" + r1);
     	
     	 int r11 = q.getLaenge();
     	System.out.println("Länge aller Kanten:" + r11);
    
    	 int r111 = q.getGrundflaeche();
    	System.out.println("Grundfläche:" + r111);

    }	   
}
    	

    
    
    

