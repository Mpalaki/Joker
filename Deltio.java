/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joker;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import static joker.Klirosi.dateInput;

/**
 *
 * @author Makis
 */
public class Deltio {
    private List<Integer> deltionumbers;
    private List<Integer>  deltioarithmoijoker;
    private Player player;
    private LocalDate deltiodate;

    public Deltio(List<Integer> deltionumbers, List<Integer> deltioarithmoijoker, Player player, LocalDate deltiodate) {
        this.deltionumbers = deltionumbers;
        this.deltioarithmoijoker = deltioarithmoijoker;
        this.player = player;
        this.deltiodate = deltiodate;
    }

    public Deltio(List<Integer> deltionumbers, List<Integer> deltioarithmoijoker, Player player) {
        this.deltionumbers = deltionumbers;
        this.deltioarithmoijoker = deltioarithmoijoker;
        this.player = player;
    }

    public List<Integer> getDeltioarithmoijoker() {
        return deltioarithmoijoker;
    }

    public void setDeltioarithmoijoker(List<Integer> deltioarithmoijoker) {
        this.deltioarithmoijoker = deltioarithmoijoker;
    }

    
    public Deltio(List<Integer> deltionumbers) {
        this.deltionumbers = deltionumbers;
    }

    public Deltio() {
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public LocalDate getDeltiodate() {
        return deltiodate;
    }

    public void setDeltiodate(LocalDate deltiodate) {
        this.deltiodate = deltiodate;
    }

    public void setDeltionumbers(List<Integer> deltionumbers) {
        this.deltionumbers = deltionumbers;
    }    

    public List<Integer> getDeltionumbers() {
        return deltionumbers;
    }

    @Override
    public String toString() {
        return "Deltio{" + "deltionumbers=" + deltionumbers + ", deltioarithmoijoker=" + deltioarithmoijoker + ", player=" + player + ", deltiodate=" + deltiodate + '}';
    }      
        
    public static void sumpliroseArithmousDeltiou(Player player,List<Deltio> listaDeltion){
        Integer[] ar={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
        22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
        Set<Integer> arithmoiEpileximoiSet = new HashSet(Arrays.asList(ar));
        Integer[] ar1={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Set<Integer> jokersEpileximoiSet = new HashSet(Arrays.asList(ar1));
        List<Integer> listSelectedNumbers = new ArrayList<>();
        List<Integer> listSelectedJokers = new ArrayList<>();
        Scanner in=new Scanner(System.in);
        Deltio deltio=new Deltio();
        deltio.setPlayer(player);
        System.out.println("Poia einai i date pou klironei to epomeno deltio?(M/d/yyyy)");
         int x=1;
         while(x==1){
             try{
            String dateinput=in.next(); 
            deltio.setDeltiodate(dateInput(dateinput));
             x=2;}
         catch(Exception e){
             System.out.println("you input an invalid date. Please input valid date(M/d/yyyy)");}
         }
        System.out.println("Dialekse apo 5 eos 45 arithmous metaksu 1-45. After each number selection press 'Enter'. "
                + "When done selecting, please type 'stop' and press 'Enter'. ");
        int count=0;
        
        while(in.hasNextInt() && count<45){
            int num = in.nextInt();
            if(arithmoiEpileximoiSet.contains(num)){
                listSelectedNumbers.add(num);
            
                arithmoiEpileximoiSet.remove(num);
                count++;
                if(count<5){
                    System.out.println("you need to select at least "+(5-count)+" more numbers");
                }
                else{
                    if(count==45){
                        System.out.println("you have reached maximum number of 45 numbers.");
                    }
                    else{
                        System.out.println("you have selected "+count+" numbers");
                        System.out.println("you may select "+(45-count)+" more numbers. If done selecting, type any letter and press Enter. ");
                    }
                } 
            }
            else if(listSelectedNumbers.contains(num)){
                System.out.println("you have already selected number "+num);}
            else{
                System.out.println("the number is out of range");}
            
        }
        if(in.hasNext()&& count>=5){
            deltio.setDeltionumbers(listSelectedNumbers);
            String a=in.next();
            System.out.println("Dialekse apo 1 eos 20 arithmous metaksu 1-20. After each number selection press 'Enter'. "
                + "When done selecting, please type 'stop' and press 'Enter'. ");
            int countj=0;
        
            while(in.hasNextInt() && countj<20){
               int num = in.nextInt();
                if(jokersEpileximoiSet.contains(num)){
                    listSelectedJokers.add(num);            
                    jokersEpileximoiSet.remove(num);
                    countj++;
                    if(countj<1){
                        System.out.println("you need to select at least "+(1-countj)+" more numbers");
                    }
                    else{
                        if(countj==20){
                            System.out.println("you have reached maximum number of 20 numbers.");
                    }
                        else{
                            System.out.println("you have selected "+countj+" numbers");
                            System.out.println("you may select "+(20-countj)+" more numbers. If done selecting, type any letter and press Enter. ");
                        }
                    } 
                }
                else if(listSelectedJokers.contains(num)){
                    System.out.println("you have already selected number "+num);}
                else{
                System.out.println("the number is out of range");}
            
        }
            if(in.hasNext()&& countj>=1){
                deltio.setDeltioarithmoijoker(listSelectedJokers);
                listaDeltion.add(deltio);
                Collections.deltiaAnaPaiktiMap.put(player, listaDeltion);
                Collections.listaOlonTonDeltion.add(deltio);
                
//                System.out.println(Collections.listaOlonTonDeltion);
//                System.out.println(Collections.deltiaAnaPaiktiMap);
                System.out.println(deltio.toString());
                int arithmosstilon = listSelectedNumbers.size();
                int arithmosjokers = listSelectedJokers.size();
                               
                long kostos = arithmosjokers*factorial(arithmosstilon)/(factorial(arithmosstilon-5)*factorial(5));
                System.out.println("To kostos tou deltiou einai (hreosi: 1 Euro/stili): "+kostos+" Euro.");
            }
             else if(in.hasNext()&& countj==0){
                  System.out.println("you have to select 1-20 numbers as Joker. Please try again.");
                 Collections.deltiaAnaPaiktiMap.clear();
                 sumpliroseArithmousDeltiou(player,listaDeltion);}
            }
            else if(in.hasNext()&& count<5){
                System.out.println("you have to select 5-45 numbers. Please try again.");
                Collections.deltiaAnaPaiktiMap.clear();
                sumpliroseArithmousDeltiou(player, listaDeltion);}
        
    }
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;}
        else{
            return factorial(n-1)*n;}}
    
//    public static BigInteger factorial(BigInteger n) {
//    BigInteger res;
//    if (n == BigInteger.ZERO) {
//        res = BigInteger.ONE;
//    } else {
//        res = n.multiply(factorial(n.subtract(BigInteger.ONE)));
//    }
//
//    return res;
//    }
    
}
