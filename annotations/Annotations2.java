package annotations;

//user-defined annotations --> used to add metadata to the codebase for keeping track of some details related to projects by developers
@interface My {
    String name();
    String project();
    String version() default "1.0.0";
    String date() default "today";
}

@My(name="Ayush", project="Simple")
public class Annotations2 {

    @My(name = "Ayush", project = "Simple")
    public static void main(@My(name="Ayush", project="Simple") String[] args) {
        @My(name="Ayush", project="Simple")
        int x = 10;
        System.out.println(x);
    }
}
