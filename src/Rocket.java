package rocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rocket {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameters = reader.readLine();

            int count = 1;

            int size = 1;

            for (String stringFromCycle : parameters.split(" ")) {
                if (count == 1) {
                    size = Integer.parseInt(stringFromCycle);
                }
                count++;
            }

            if (count != 2) {
                System.exit(0);
            }
            int shield_on_top = 0, padding_on_top = size, padding_below=1, n=(size-1), last_character=1, summa = 0;
            for (int i=size; i>0; i-- ){
                summa = summa + i;
            }
            summa = summa * size;
            for (int i=0; i<=(size-1); i++) {
                if ( shield_on_top >= 1 ) {
                    System.out.print(">");
                }
                shield_on_top++;
                for ( int c = 0; c < size; c++) {
                    for (int j = 1; j < shield_on_top; j++) {
                        System.out.print("\\");
                    }
                    for (int j = 0; j <= ( padding_on_top - 1 ); j++) {
                        System.out.print(" ");
                    }

                }
                padding_on_top--;
                System.out.println("");
            }
            System.out.print(">");
            for (int i=0; i<(size*size); i++){
                System.out.print("*");
            }
            System.out.println(">");
            for (int i=(size-1); i>0; i--){
                shield_on_top++;
                System.out.print(">");
                for ( int c = 0; c < size; c++) {
                    for (int j = n; j >= 1; j--) {
                        System.out.print("/");
                    }
                    for (int j = 1; j <= padding_below; j++) {
                        System.out.print(" ");
                    }
                }
                padding_below++;
                n--;
                System.out.println("");
            }

        }catch(Exception e){
        }
    }
}