public class String_Linear_Search {
    public static void main(String[] args){
        String name = "";
        char target = 'z';
        System.out.println(String(name, target));
    }

    static boolean String(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
