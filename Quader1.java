import java.util.Scanner;

public class Quader1 {
 

    static Scanner scanner;
 

    public Quader1() {
        scanner = new Scanner(System.in);
    }
 

    public static void main(String[] args) {
    	Quader1 program = new Quader1();
        program.run();
        scanner.close();
    }
 
    int x1;
    int y1;
    int z1;
    int x2;
    int y2;
    int z2;
    
    
    public int getRauminhalt()
    {
    	return (x2 - x1)*(y2 -y1)*(z2 - z1);
    }
    
    
    public int getOberfläche()
    {
    	return ((x2 - x1)*(y2 - y1)*2)+((x2 - x1)*(z2 - z1)*2)+((y2 -y1)*(z2 - z1)*2);
    }
    
    public int getLaenge()
    {
    	return ((x2 - x1)+(y2 - y1)+(z2 - z1)*2);
    }
    
    public int getGrundflaeche()
    {
    	return (x2 -x1)*(z2 - z1);
    }
    
    private void run() {
       
    	
    }
}
    
  