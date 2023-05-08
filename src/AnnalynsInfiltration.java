import java.util.Random;

// In this script I try to make a small scenario for a story or game that has randomized options and circumstances every time it's ran
class AnnalynsInfiltration {
    // Generate some random booleans each time the scenario is ran
    private static final boolean isKnightAwake = getRandomBoolean();
    private static final boolean isArcherAwake = getRandomBoolean();
    private static final boolean isPrisonerAwake = getRandomBoolean();
    private static final boolean isDogPresent = getRandomBoolean();

    // Here I make some methods that will see if an option is available or not depending on the above generated booleans
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (!knightIsAwake && !archerIsAwake && prisonerIsAwake);
    }

    // This is the method that generates the random boolean
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    // This is the main method where the story plays out and depending on the methods and variables above different text is printed to the console
    public static void main(String[] args) {
        // The set-up, check who is asleep and print it out
        System.out.println("Annalyn comes up to a camp during the night. There is a knight, an archer and a prisoner.");
        if (!isKnightAwake) {
            System.out.println("The knight appears to be asleep");
        } if (!isArcherAwake) {
            System.out.println("The archer appears to be asleep");
        } if (!isPrisonerAwake) {
            System.out.println("The prisoner appears to be asleep");
        } if (isDogPresent) {
            System.out.println("And her trusty dog is by her side");
        }
        System.out.println("The following options are available to Annalyn:");

        // Here the script checks what options are available depending on who is asleep and if the dog is present
        boolean optionA = canFastAttack(isKnightAwake);
        boolean optionB = canSpy(isKnightAwake, isArcherAwake, isPrisonerAwake);
        boolean optionC = canSignalPrisoner(isArcherAwake, isPrisonerAwake);
        boolean optionD = canFreePrisoner(isKnightAwake, isArcherAwake, isPrisonerAwake, isDogPresent);

        // Here the available options are printed out
        if (optionA) {
            System.out.println("A quick surprise attack could be made on the Archer.");
        } if (optionB) {
            System.out.println("Spying on the camp might be a good idea.");
        } if (optionC) {
            System.out.println("Signaling the prisoner that you are there could help.");
        } if (optionD) {
            System.out.println("Sneaking in and freeing the prisoner seems possible to pull off.");
        }
    }

}