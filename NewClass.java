
package idman;

public class NewClass {
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squad_sayisi;

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public int getSquad_sayisi() {
        return squad_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public void setSquad_sayisi(int squad_sayisi) {
        this.squad_sayisi = squad_sayisi;
    }

    public NewClass(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squad_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squad_sayisi = squad_sayisi;
    }
    
    public void hareketyap(String hareketTuru,int sayi){
        
        if(hareketTuru.equals("burpee")){
            
            burpeeYap(sayi);
        }
        else if(hareketTuru.equals("pushup")){
            
            pushupYap(sayi);
        }
        else if(hareketTuru.equals("situp")){
            
            situpYap(sayi);
        }
        else if(hareketTuru.equals("squad")){
            
            squadYap(sayi);
        }
        else{
            System.out.println("geçersiz işlem...");
        }
        
            
    }
    public void burpeeYap(int sayi){
        
        if(burpee_sayisi==0){
            System.out.println("yapacak burpee kalmadı..");
        }
        else if(burpee_sayisi-sayi<0){
            System.out.println("hedeflediğiniz burpeeyi geçtiniz tebrikler...");
            burpee_sayisi=0;
            System.out.println("kalan burpee sayisi: "+burpee_sayisi);
        }
        else if(burpee_sayisi-sayi>0){
            burpee_sayisi-=sayi;
            System.out.println("kalam burpee sayisi: "+burpee_sayisi);
        }
    }
    public void pushupYap(int sayi){
        
        if(pushup_sayisi==0){
            System.out.println("yapacak pushup kalmadı..");
        }
        else if(pushup_sayisi-sayi<0){
            System.out.println("hedeflediğiniz pushupı geçtiniz tebrikler...");
            pushup_sayisi=0;
            System.out.println("kalan pushup sayisi: "+pushup_sayisi);
        }
        else if(pushup_sayisi-sayi>0){
            pushup_sayisi-=sayi;
            System.out.println("kalam pushup sayisi: "+pushup_sayisi);
        }
    }
    public void situpYap(int sayi){
        
        if(situp_sayisi==0){
            System.out.println("yapacak situp kalmadı..");
        }
        else if(situp_sayisi-sayi<0){
            System.out.println("hedeflediğiniz situpı geçtiniz tebrikler...");
            situp_sayisi=0;
            System.out.println("kalan situp sayisi: "+situp_sayisi);
        }
        else if(situp_sayisi-sayi>0){
            situp_sayisi-=sayi;
            System.out.println("kalam situp sayisi: "+situp_sayisi);
        }
    }
    public void squadYap(int sayi){
        
        if(squad_sayisi==0){
            System.out.println("yapacak squad kalmadı..");
        }
        else if(squad_sayisi-sayi<0){
            System.out.println("hedeflediğiniz squad sayısını geçtiniz tebrikler...");
            squad_sayisi=0;
            System.out.println("kalan squad sayisi: "+squad_sayisi);
        }
        else if(squad_sayisi-sayi>0){
            squad_sayisi-=sayi;
            System.out.println("kalam squad sayisi: "+squad_sayisi);
        }
    }
    
    public boolean idmanbittiMi(){
        
        return (burpee_sayisi==0 && situp_sayisi==0 && squad_sayisi==0 && pushup_sayisi==0);
    }
    
}
