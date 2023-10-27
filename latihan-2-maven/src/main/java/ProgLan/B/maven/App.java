package ProgLan.B.maven;
import org.apache.commons.lang3.StringUtils;
public class App

{
    public static void main( String[] args )
    {
        String text = "Hello, Maven anjay!";
        String reversedText = StringUtils.reverse(text);
        System.out.println(reversedText);
    }
}
