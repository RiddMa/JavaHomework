package hw15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class GenerateHTMLTable {
    public static void main(String[] args) {
        File f = new File("src/hw15/table.html");
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(f));
            br.write("<html>\n\t<table border=\"2\" align=\"center\">" + "\n\t\t<th>Power of 2</th>" + "\n\t\t<th>Value</th>");
            Integer i = 0;
            for (i = 0; i <= 9; i++) {
                br.write("\n\t\t<tr align=\"center\">" + "\n\t\t\t<td>" + i + "</td>");
                br.write("\n\t\t\t<td>" + (int) Math.pow(2, i) + "</td>\n\t\t</tr>");
            }
            br.write("\n\t<table>" + "\n</html>");
            br.close();
        } catch (IOException e) {
        }
    }
}
