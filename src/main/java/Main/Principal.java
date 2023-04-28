
package Main;

import ConexionBD.ConexionBD;
import com.mycompany.integrador_ap4.Entidades.Partido;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        ConexionBD cbd = new ConexionBD();
        Scanner sc = new Scanner(System.in);
        sc.next();
        
        Partido partido[] = new Partido[4];
        
        Partido partido1 = new Partido("Argentina","SAU", 1,2);
        Partido partido2 = new Partido("SAU", "Argentina",1,2);
        Partido partido3 = new Partido("Polonia","Mexico", 0,1);
        Partido partido4 = new Partido("Argentina","SAU", 1,2);
//       
        System.out.println();
        
        
        
    }
}
