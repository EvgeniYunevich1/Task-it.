package Lesson7;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        CardVisa cardVisa = new CardMasterCard();
        CardMasterCard cardMasterCard = new CardMasterCard();
        System.out.println(card.BankAccount);
        cardVisa.BankAccount();
        cardVisa.СontactlessPayment();
        cardMasterCard.PaymentIsEverywhere();
        cardMasterCard.BankAccount();
       cardMasterCard.СontactlessPayment();
    }
}
