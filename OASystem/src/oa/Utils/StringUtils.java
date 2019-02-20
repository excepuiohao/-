package oa.Utils;

import java.io.UnsupportedEncodingException;

/**
 * Created by WangNing on 2017-10-11.
 */
public class StringUtils {

    public static String valueOf(String str){
        String value = null;
        try {
            value =  new String(str.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }
}
