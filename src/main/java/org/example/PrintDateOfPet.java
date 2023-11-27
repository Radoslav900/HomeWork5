package org.example;

    public class PrintDateOfPet {
        public static void main(String[] args) {
            Dog archi = new Dog((byte)2 , "Archi" , "French Bulldog" , "male", 56f , "tiger");
            Parrot arti = new Parrot((byte)7 , "Arti" , "Red macaw" , "male", 0.035f, "red");

            archi.printDataPet();
            archi.eat();
            archi.speak();

            System.out.println();

            arti.printDataPet();
            arti.eat();
            arti.speak();
        }
}
