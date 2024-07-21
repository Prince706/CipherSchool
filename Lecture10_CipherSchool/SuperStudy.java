class Loan{
    int rate;
    Loan(){
        System.out.println("Hi, I am default constructor of loan");
    }
    Loan(int rate){
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
    }

}

class carLoan extends Loan{
    int rate;
    carLoan(){
        System.out.println("Hi, I am default constructor of carLoan");
        System.out.println(super.rate);
    }
    carLoan(int rate){
        super(7);
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
        super.printRate();
        System.out.println(super.rate);
    }
}

public class SuperStudy {
    public static void main(String[] args) {
        carLoan cl = new carLoan();
        carLoan cl2 = new carLoan(8);
        cl.printRate();
        cl2.printRate();
    }
}