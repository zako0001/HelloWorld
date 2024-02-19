public class Tid {
    public static void main (String[] args) {
        int sekund = 23;
        int minut = 14;
        int time = 11;
        System.out.println("Time: " + time + "\nMinut: " + minut + "\nSekund: " + sekund);
        int sekunderSidenMidnat = (time * 60 + minut) * 60 + sekund;
        System.out.println("Der er gået " + sekunderSidenMidnat + " sekunder siden midnat.");
        int sekunderPerDag = 60 * 60 * 24;
        int sekunderIndtilMidnat = sekunderPerDag - sekunderSidenMidnat;
        System.out.println("Der er " + sekunderIndtilMidnat + " sekunder indtil midnat.");
        int sekundNy = 41;
        int minutNy = 26;
        int timeNy = 11;
        int timerBrugt = timeNy - time;
        int minutterBrugt = minutNy - minut;
        int sekunderBrugt = sekundNy - sekund;
        System.out.println("Der er brugt " + timerBrugt + " timer, " + minutterBrugt + " minutter og " + sekunderBrugt + " sekunder på opgaven.");
    }
}
