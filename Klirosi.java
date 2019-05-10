/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Klirosi implements Checks{
    private int protonum;
    private int deuteronum;
    private int tritonum;
    private int tetartonum;
    private int pemptonum;
    private int joker;
    private LocalDate klirosiDate;

    public Klirosi() {
    }

    public Klirosi(int protonum, int deuteronum, int tritonum, int tetartonum, int pemptonum, int joker, LocalDate klirosiDate) {
        this.protonum = protonum;
        this.deuteronum = deuteronum;
        this.tritonum = tritonum;
        this.tetartonum = tetartonum;
        this.pemptonum = pemptonum;
        this.joker = joker;
        this.klirosiDate = klirosiDate;
    }

    public Klirosi(LocalDate klirosiDate) {
        this.klirosiDate = klirosiDate;
    }

    public Klirosi(int protonum) {
        this.protonum = protonum;
    }

    public Klirosi(int protonum, int deuteronum, int tritonum, int tetartonum, int pemptonum, int joker) {
        this.protonum = protonum;
        this.deuteronum = deuteronum;
        this.tritonum = tritonum;
        this.tetartonum = tetartonum;
        this.pemptonum = pemptonum;
        this.joker = joker;
    }

    public LocalDate getKlirosiDate() {
        return klirosiDate;
    }

    public int getProtonum() {
        return protonum;
    }

    public int getDeuteronum() {
        return deuteronum;
    }

    public int getTritonum() {
        return tritonum;
    }

    public int getTetartonum() {
        return tetartonum;
    }

    public int getPemptonum() {
        return pemptonum;
    }

    public int getJoker() {
        return joker;
    }

    public void setKlirosiDate(LocalDate klirosiDate) {
        this.klirosiDate = klirosiDate;
    }

    public void setProtonum(int protonum) {
        this.protonum = protonum;
    }

    public void setDeuteronum(int deuteronum) {
        this.deuteronum = deuteronum;
    }

    public void setTritonum(int tritonum) {
        this.tritonum = tritonum;
    }

    public void setTetartonum(int tetartonum) {
        this.tetartonum = tetartonum;
    }

    public void setPemptonum(int pemptonum) {
        this.pemptonum = pemptonum;
    }

    public void setJoker(int joker) {
        this.joker = joker;
    }

    @Override
    public String toString() {
        return "Klirosi{" + "protonum=" + protonum + ", deuteronum=" + deuteronum + ", tritonum=" + tritonum + ", tetartonum=" + tetartonum + ", pemptonum=" + pemptonum + ", joker=" + joker + ", klirosiDate=" + klirosiDate + '}';
    }

    

    @Override
    public boolean isNumberValid() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
     public static int protosKlirotheisArithmos()  {

        int num1 = new Random().nextInt(45)+1;
        
            Collections.arithmoiGiaKlirosiSet.remove(num1);          
        
            return num1;
        
     }
     public static int deuterosKlirotheisArithmos()  {

        
        int num2 = new Random().nextInt(45)+1;
//        
        while(!Collections.arithmoiGiaKlirosiSet.contains(num2)){
            deuterosKlirotheisArithmos();}
        Collections.arithmoiGiaKlirosiSet.remove(num2);
        
        return num2;
        
     }
     public static int tritosKlirotheisArithmos()  {
//        
        int num3 = new Random().nextInt(45)+1;
//        
        while(!Collections.arithmoiGiaKlirosiSet.contains(num3)){
            tritosKlirotheisArithmos();}
        Collections.arithmoiGiaKlirosiSet.remove(num3);
        return num3;
        
     }
     public static int tetartosKlirotheisArithmos()  {
//        
        int num4 = new Random().nextInt(45)+1;
//        
        while(!Collections.arithmoiGiaKlirosiSet.contains(num4)){
            tetartosKlirotheisArithmos();}
        Collections.arithmoiGiaKlirosiSet.remove(num4);
        return num4;
     }
     public static int pemptosKlirotheisArithmos()  {
//       
        int num5 = new Random().nextInt(45)+1;

        while(!Collections.arithmoiGiaKlirosiSet.contains(num5)){
            pemptosKlirotheisArithmos();}
        Collections.arithmoiGiaKlirosiSet.remove(num5);
        return num5;
        
     }
     public static int jokerKlirotheisArithmos()  {
//        
        int joker = new Random().nextInt(20)+1;

        return joker;
        
     }
     public static void kaneKlirosi(){
         Scanner in = new Scanner(System.in);
         List<Integer> listaKlirothentonArithmon=new ArrayList<>();
         int k1=protosKlirotheisArithmos();
         listaKlirothentonArithmon.add(k1);
         int k2=deuterosKlirotheisArithmos();
         listaKlirothentonArithmon.add(k2);
         int k3=tritosKlirotheisArithmos();
         listaKlirothentonArithmon.add(k3);
         int k4=tetartosKlirotheisArithmos();
         listaKlirothentonArithmon.add(k4);
         int k5=pemptosKlirotheisArithmos();
         listaKlirothentonArithmon.add(k5);
         int j=jokerKlirotheisArithmos();
         Klirosi klirosi=new Klirosi(k1,k2,k3,k4,k5,j);
         System.out.println("Poia einai i date tis klirosis?(M/d/yyyy)");
         int x=1;
         while(x==1){
             try{
            String dateinput=in.next();         
            klirosi.setKlirosiDate(dateInput(dateinput));
            System.out.println(klirosi.toString());
             x=2;}
         catch(Exception e){
             System.out.println("you input an invalid date. Please input valid date(M/d/yyyy)");}
         }
         for(int i=0;i<Collections.listaOlonTonDeltion.size();i++){
            if(klirosi.getKlirosiDate().equals(Collections.listaOlonTonDeltion.get(i).getDeltiodate())){
                List<Integer> common = new ArrayList<Integer>(Collections.listaOlonTonDeltion.get(i).getDeltionumbers());
                common.retainAll(listaKlirothentonArithmon);
                if(common.size()==5){
                    Collections.listaKerdoforonDeltion.add(Collections.listaOlonTonDeltion.get(i));
                    if(Collections.listaOlonTonDeltion.get(i).getDeltioarithmoijoker().contains(klirosi.joker)){
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 5 +1 tyherous arithmous");}
                    else{
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 5  tyherous arithmous");}}
                else if(common.size()==4){
                    Collections.listaKerdoforonDeltion.add(Collections.listaOlonTonDeltion.get(i));
                    if(Collections.listaOlonTonDeltion.get(i).getDeltioarithmoijoker().contains(klirosi.joker)){
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 4 +1 tyherous arithmous");}
                    else{
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 4  tyherous arithmous");}}
                else if(common.size()==3){
                    Collections.listaKerdoforonDeltion.add(Collections.listaOlonTonDeltion.get(i));
                    if(Collections.listaOlonTonDeltion.get(i).getDeltioarithmoijoker().contains(klirosi.joker)){
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 3 +1 tyherous arithmous");}
                    else{
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 3  tyherous arithmous");}}
                else if(common.size()==2){
                    Collections.listaKerdoforonDeltion.add(Collections.listaOlonTonDeltion.get(i));
                    if(Collections.listaOlonTonDeltion.get(i).getDeltioarithmoijoker().contains(klirosi.joker)){
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 2 +1 tyherous arithmous");}
                    else{
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 2 tyherous arithmous ");}}
                else if(common.size()==1){
                    Collections.listaKerdoforonDeltion.add(Collections.listaOlonTonDeltion.get(i));
                    if(Collections.listaOlonTonDeltion.get(i).getDeltioarithmoijoker().contains(klirosi.joker)){
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 1 +1 tyherous arithmous");}
                    else{
                        System.out.println(Collections.listaOlonTonDeltion.get(i).toString()+" periehei: 1 tyherous arithmous ");}}

            }
        }
         if(Collections.listaKerdoforonDeltion.isEmpty()){
             System.out.println("kanena deltio den kerdizei");}
         else{
             System.out.println("ta kerdofora deltia einai: "+Collections.listaKerdoforonDeltion.toString());}
     }
    public static LocalDate dateInput(String userInput) {
        
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    LocalDate date = LocalDate.parse(userInput, dateFormat);
    System.out.println(date);
    return date ;
}
    
}
