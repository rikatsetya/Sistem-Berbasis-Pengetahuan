import java.util.ArrayList;

public class Kuis {
    private ArrayList<Fakta> fakta;

    public static void main(String[] args) {
        rules();
    }

    public static void rules(){
        Fakta fa = new Fakta('A', true);
        Fakta fb = new Fakta('B', false);
        Fakta fc = new Fakta('C', false);
        Fakta fd = new Fakta('D', false);
        Fakta fe = new Fakta('E', true);
        Fakta ff = new Fakta('F', false);
        Fakta fg = new Fakta('G', false);
        Fakta fh = new Fakta('H', false);
        Fakta fi = new Fakta('I', false);
        Fakta fj = new Fakta('J', false);
        Fakta fk = new Fakta('k', false);
        
        if (fa.isFact() == true && fb.isFact() == true) {
            fc.setFact(true);
            System.out.println(fc.getHuruf() +" bernilai " + fc.isFact());
        }
        if (fc.isFact() == true){
            fd.setFact(true);
            System.out.println(fd.getHuruf() +" bernilai " + fd.isFact());
        }
        if (fa.isFact() == true && fe.isFact() == true) {
            ff.setFact(true);
            System.out.println(ff.getHuruf() +" bernilai " + ff.isFact());
        }
        if (fa.isFact() == true){
            fg.setFact(true);
            System.out.println(fg.getHuruf() +" bernilai " + fg.isFact());
        }
        if (ff.isFact() == true && fg.isFact() == true) {
            fd.setFact(true);
            System.out.println(fd.getHuruf() +" bernilai " + fd.isFact());
        }
        if (fg.isFact() == true && fe.isFact() == true) {
            fh.setFact(true);
            System.out.println(fh.getHuruf() +" bernilai " + fh.isFact());
        }
        if (fc.isFact() == true && fh.isFact() == true) {
            fi.setFact(true);
            System.out.println(fi.getHuruf() +" bernilai " + fi.isFact());
        }
        if (fi.isFact() == true && fa.isFact() == true) {
            fj.setFact(true);
            System.out.println(fj.getHuruf() +" bernilai " + fj.isFact());
        }
        if (fg.isFact() == true){
            fj.setFact(true);
            System.out.println(fj.getHuruf() +" bernilai " + fj.isFact());
        }
        if (fj.isFact() == true){
            fk.setFact(true);
            System.out.println(fk.getHuruf() +" bernilai " + fk.isFact());
        }
    }
}
