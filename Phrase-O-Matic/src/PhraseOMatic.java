public class PhraseOMatic {
    public static void main (String[] args) {
        // make three sets of words to choose from.
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
        "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
        "distributed", "clustered", "branded", "outside-the-box", "positioned"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
        "mind-share", "portal", "space", "vision", "paradigm"};

        // find out how many words are in each list.
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + ".";

        // print it out
        System.out.println("What we need is a " + phrase);
    }
}
