package warmup.pkg1_front22;

public class WarmUp1_Front22 {

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
    }

    public static String front22(String str) {
        if (str.length() == 0){
            return "";
        }
        if (str.length() < 2) {
            return str = (str.substring(0, 1)) + str + (str.substring(0, 1));
        }
        return str = (str.substring(0, 2)) + str + (str.substring(0, 2));
    }
    
}
