class Dog {
    String name;
    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.name = "Pantie";

        // now make a Dog array, the 3 is the size
        Dog[] myDogs = new Dog[3];
        // now I put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        // and now I insert the previously created dog object
        myDogs[2] = dog1;

        // now im going to give names to the dogs referenced in the array
        myDogs[0].name = "Triangle";
        myDogs[1].name = "Princess";
        // I already named the next dog before so ill print out the name
        System.out.println("Last dog's name is " + myDogs[2].name);

        // now I will loop through the array and make all the dogs bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x += 1;
        }
    } // closes the main method

    // time to actually teach the dogs how to bark
    public void bark() {
        System.out.println(name + " says Arf!");
    }
} // closes the dog class
