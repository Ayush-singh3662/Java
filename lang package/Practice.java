public class Practice {
    public static void main(String[] args) {
        Float f = 1.3f/0;
        System.out.println(f);
        double d = 1.3/0;
        System.out.println(d);
        System.out.println(Float.NaN == Float.NaN); //false
        System.out.println(f.isInfinite()); //true
    }    
}
