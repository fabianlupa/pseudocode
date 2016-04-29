package com.flaiker.logistics;

import java.util.Arrays;

public class Logistics {
    public static void erstelleLadungsListe(int[][] ladungsliste, double nutzlast, int maxPalettenCount) {
        int currentLoad = 0;
        int currentPalettsOnLkw = 0;
        int currentPalett = 0;

        for (int i = 1; i <= 10; i++) {
            for (int ii = currentPalett; ii < ladungsliste.length; ii++) {
                int load = ladungsliste[ii][0];

                // Darf der LKW beladen werden?
                if ((currentLoad + load) > nutzlast || currentPalettsOnLkw == maxPalettenCount) {
                    // Nein
                    currentLoad = 0;
                    currentPalettsOnLkw = 0;
                    break;
                }

                ladungsliste[ii][1] = i;
                currentLoad += load;
                currentPalettsOnLkw++;
                currentPalett++;
            }
        }

        System.out.println(Arrays.deepToString(ladungsliste));
    }
}
