/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static joker.Deltio.sumpliroseArithmousDeltiou;

/**
 *
 * @author Makis
 */
public class Player {
    private String name;
    
    
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    public static void createPlayer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please type name of player. If you do not wish to add any more players, "
                + "please type 'stop' and press Enter. ");
        String name = in.next();
        while(!name.equals("stop")){
        Player player=new Player(name);
        List<Deltio> listaDeltion=new ArrayList<>();
        System.out.println("posa deltia tha paixei?");
        int y=1;
        while(y==1){
         try{
            int arithmosDeltion=in.nextInt();
            for(int i=0;i<arithmosDeltion;i++){
            sumpliroseArithmousDeltiou(player,listaDeltion);
            System.out.println("To deltio no: "+(i+1)+" gia ton: "+player.getName().toString()+ " sumplirothike. ");
            
         }
            System.out.println(player.toString()+" ehei ta deltia: ");
            for(int j=0;j<listaDeltion.size();j++){
                System.out.println(j+1+"."+listaDeltion.get(j));}
            y=2;}
        
         catch(Exception e){
             System.out.println("please type number of deltia");
             in.next();};
        }
        System.out.println("Please type name of player. If you do not wish to add any more players, "
                + "please type 'stop' and press Enter. ");
        name=in.next();}
//        
    }

    
}
