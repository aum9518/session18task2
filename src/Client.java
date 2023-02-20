import java.time.LocalDate;

public class Client implements CardInterface {
    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }


    @Override
    public void payWithCard(int money) {
      money-=card.getBalance();

    }

    @Override
    public double getCardBalance() {
        return card.getBalance();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
