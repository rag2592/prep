/**
 * Created by rsr37 on 2/13/2018.
 */
public class findAnagrams {
    public static void printAnagrams(String s, String file){
       System.out.println(s +" "+ file);
    }
    public static void main(String[] args){
        if(args.length < 2) System.out.println("Invalid Arguments!");
        else printAnagrams(args[1],args[0]);
    }
}
