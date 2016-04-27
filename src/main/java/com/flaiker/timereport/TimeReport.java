package com.flaiker.timereport;

public class TimeReport {
    public static void erzeugeListe(int persNr, int[][] zeiten, int jahr, int monat) {
        schreibeKopfzeile(persNr, jahr, monat);

        int summe = 0;

        for (int i = 0; i < zeiten.length; i++) {
            if (zeiten[i][0] == 0 && zeiten[i][1] == 0) schreibeZeile(i + 1, 0, 0, 0, "nicht anwesend");
            else if (zeiten[i][1] == 0) schreibeZeile(i + 1, zeiten[i][0], 0, 0, "eine Buchung fehlt");
            else {
                int diff = zeiten[i][1] - zeiten[i][0];
                schreibeZeile(i + 1, zeiten[i][0], zeiten[i][1], diff, "");
                summe += diff;
            }
        }

        schreibeFusszeile(summe);
    }

    private static int tageImMonat(int monat, int jahr) {
        return 30;
    }

    private static void schreibeKopfzeile(int persnr, int jahr, int monat) {
        System.out.printf("Mitarbeiter: %-10d Mai %d\n\n", persnr, jahr);
        System.out.println("Tag\tKommen\tGehen\tAnwesenheit\tBemerkung");
        System.out.println("======================================================");
    }

    private static void schreibeZeile(int tag, int min1, int min2, int anwesenheitTag, String bemerkung) {
        System.out.printf("%-2d\t%s\t%s\t%s\t\t%s\n", tag, getTimeFormatted(min1), getTimeFormatted(min2), getTimeFormatted(anwesenheitTag), bemerkung);
    }

    private static void schreibeFusszeile(int anwesenheitMonat) {
        System.out.println("======================================================");
        System.out.printf("Summe Anwesenheit:\t%s\n", getTimeFormatted(anwesenheitMonat));
    }

    static String getTimeFormatted(int minutes) {
        if (minutes == 0) return "\t";

        return String.format("%02d:%02d", minutes / 60, minutes % 60);
    }
}
