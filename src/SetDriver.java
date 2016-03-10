/**
 * Created by jaime on 3/7/16.
 */
public class SetDriver {

    public static void main(String[] args){
        Set theSet = new Set();
        theSet.add("you");
        theSet.add("I");
        theSet.add("me");
        //System.out.print(theSet.toString());
        theSet.add("you");
        theSet.add("Jaime");
        theSet.add("Jaime");
        theSet.add("Ramirez");
        theSet.remove("Jaime");
        theSet.add(33);
        System.out.print(theSet.toString());
    }
}
