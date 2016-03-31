package View;

import Controller.mainCliController;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Michal on 2016-03-31.
 */
public class mainCliView {

    public static void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mainCliController controller = new mainCliController();
        while(true){
            System.out.print("#> ");
            String s = br.readLine();
            controller.menuParser(s);
            if(controller.exit()) {
                break;
            }
        }
    }
}
