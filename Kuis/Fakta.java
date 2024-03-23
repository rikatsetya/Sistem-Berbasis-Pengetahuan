public class Fakta {
    private char huruf;
    private boolean fact = false;
    
    public boolean isFact() {
        return fact;
    }

    public void setFact(boolean fact) {
        this.fact = fact;
    }

    public char getHuruf() {
        return huruf;
    }

    public void setHuruf(char huruf) {
        this.huruf = huruf;
    }

    public Fakta(char huruf, boolean fact) {
        this.huruf = huruf;
        this.fact = fact;
    }

    
}
