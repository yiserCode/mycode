package com.yiser.exercise.Utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yishui on 2017/3/17.
 */
public class Utils {

    private static Pattern linePattern = Pattern.compile("_(\\w)");

    public static String lineToCamel(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);

        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group().toUpperCase());
        }

        matcher.appendTail(sb);

        return sb.toString();
    }
}
