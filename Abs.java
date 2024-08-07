abstract class Bank {
    abstract int getRateOfInterest();
}
class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}
class IDBI extends Bank {
    int getRateOfInterest(){
        return 8;
    }
}
class Abs {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest is: " + b.getRateOfInterest() + "%");
        b = new IDBI();
        System.out.println("IDBI Rate of Interest is: " + b.getRateOfInterest() + "%");
    }
}