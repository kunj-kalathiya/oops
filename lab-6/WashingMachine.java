class WashingMachine {

    void switchOn() {
        System.out.println("Washing Machine is Switched ON");
    }

    int acceptClothes(int noOfClothes) {
        System.out.println(noOfClothes + " clothes accepted");
        return noOfClothes;
    }

    void acceptDetergent(String detergentName) {
        System.out.println("Detergent added: " + detergentName);
    }

    void switchOff() {
        System.out.println("Washing Machine is Switched OFF");
    }

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        int clothes = wm.acceptClothes(5);
        wm.acceptDetergent("Surf Excel");
        wm.switchOff();

        System.out.println("Total Clothes Washed: " + clothes);
    }
}