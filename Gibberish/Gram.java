class Ounce {
    private int grams = 28;
    private int chicken = 0;
    
    //constructers
    public Ounce() {
        this(0, 0);
    }
    
    public Ounce(int i, int b) {
        this.grams = i;
        this.chicken = b;
    }
    
    //toString overwrite
    public String toString() {
        return grams + " " + chicken + ".";
    }
}

public class Gram {
    public static void main(String[] args) {
        Ounce ounce = new Ounce(12, 5);
        System.out.println(ounce);
    }
}