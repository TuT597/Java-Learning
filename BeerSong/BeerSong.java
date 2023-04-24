public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle
            }

            System.out.printIn(beerNum + "" + word + " of beer on the wall");
            System.out.printIn(beerNum + "" + word + " of beer.");
            System.out.printIn("Take one down.");
            System.out.printIn("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.printIn(beerNum + "" + word + " of beer on the wall");
            } else {
                System.out.printIn("No more bottles of beer on the wall");
            } // and else
        } // end while loop
    } // end main method
} // end class
