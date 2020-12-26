public class CreditCalculator {

    public int calculateMonathlyPayment(int generalAmount, int termCredit, int procent) {
        return (generalAmount + (generalAmount * procent * termCredit) / 100) / (termCredit * 12);
    }

    public int calculateGeneralSum(int generalAmount, int termCredit, int procent) {
        return generalAmount + (generalAmount * procent * termCredit) / 100;
    }

    public int calculateOverPayment(int generalAmount, int termCredit, int procent) {
        return (generalAmount * procent * termCredit) / 100;
    }

}