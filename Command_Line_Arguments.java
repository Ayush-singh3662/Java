public class Command_Line_Arguments {
    public static void main(String[] args) {
        double s = 0;
        try {
            for(int i=0; i<args.length; i++) {
                s += Double.parseDouble(args[i]);
            }

            //for each loop
            // for(String x : args) {
            //     s += Double.parseDouble(x);
            // }
            System.out.println(s);
        } catch(Exception e) {
            System.out.println("Invalid Credentials");
        }
    }
}
