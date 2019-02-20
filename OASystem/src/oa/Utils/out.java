package oa.Utils;

/**
 * Created by WangNing
 * on 2017-10-09.
 */
public class out {

    private static final boolean isTest = true;

    public static void print(Object value){
        if(isTest){
            System.out.println(value);
        }
    }
}
