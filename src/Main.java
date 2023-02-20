import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TODO Task 2
        /*представьте что вы пришли в супермаркет и совершаете покупку,
                расплачиваетесь картой, если сумма на продукты превышает 100 сом у вас
        запрашивается пароль, при вводе, пароль проверяется и если он не верный,
        на консоль выводится "не верный пароль", а если же он верный вы можете
        продолжать операцию. если у вас достаточно средств вы оплачиваете и на
        консоли вы можете увидеть чек (с названиями и ценами на продукты и ощую
                сумму на них), а если нет на консоль выводится "у вас не хватает средств".

                Создайте класс Card (firstname, lastname, cardnumber, balance,
                password).
        Создайте класс product (productname, price).
                Создайте класс basket (products[] ).
        Создайте класс Client с полями(firstname, lastname, age, card, basket).
                Создайте interface cardinterface и метод abstract paywithcard(double
        money) возвращает чек на купленные продукты и getcardbalance() возвращает
        баланс на карте.
                класс Client наследуется от cardinterface и переопределяет его методы.*/

        Card card = new Card("Manas","Abdugani uulu",1,5000,12345);
        Product product1 = new Product("MacBook",1200);
        Product product2 = new Product("MacBook air",1200);
        Product product3 = new Product("Iphone XS",700);
        Product product4 = new Product("Airpods pro",300);
        Product product5 = new Product("Iphone 14",1300);
        Product product6 = new Product("MacBook air case",50);

        Product[] products1 = {product2,product3,product4,product5,product6};

        Product[] products = {product1};
        Basket basket = new Basket(products);
        Client client = new Client("Manas","Abdugani uulu",23,card,basket);
        int counter = 0;
        for (Product a:products1) {
            counter++;
            System.out.println("Choose product: ");
            System.out.println(counter+"."+"Name product: "+a.getProductName()+"\nPrice: "+a.getPrice());

        }
        int b = new Scanner(System.in).nextInt();
        if (b==1){
            if (product2.getPrice()>100){
                System.out.println("Enter password: ");
                int password = new Scanner(System.in).nextInt();
                if (password==client.getCard().getPassword()){
                    if (product2.getPrice()<client.getCard().getBalance()){
                        client.payWithCard(product2.getPrice());
                        System.out.println("Successfully payed.\n Name product: "+product2.getProductName()+"\nSum of product: "+product2.getPrice());

                    }else {
                        System.out.println("Please recharge balance.");
                    }
                }else {
                    System.out.println("incorrect password");
                }
            }else {
                client.payWithCard(product2.getPrice());
                System.out.println("Successfully payed.\n Name product: "+product2.getProductName()+"\nSum of product: "+product2.getPrice());
            }
        } else if (b==2) {
            if (product3.getPrice()>100){
                System.out.println("Enter password: ");
                int password = new Scanner(System.in).nextInt();
                if (password==client.getCard().getPassword()){
                    if (product3.getPrice()<client.getCard().getBalance()){
                        client.payWithCard(product3.getPrice());
                        System.out.println("Successfully payed.\n Name product: "+product3.getProductName()+"\nSum of product: "+product3.getPrice());

                    }else {
                        System.out.println("Please recharge balance.");
                    }
                }else {
                    System.out.println("incorrect password");
                }
            }else {
                client.payWithCard(product3.getPrice());
                System.out.println("Successfully payed.\n Name product: "+product3.getProductName()+"\nSum of product: "+product3.getPrice());
            }
        } else if (b==3) {
            if (product4.getPrice()>100){
                System.out.println("Enter password: ");
                int password = new Scanner(System.in).nextInt();
                if (password==client.getCard().getPassword()){
                    if (product4.getPrice()<client.getCard().getBalance()){
                        client.payWithCard(product4.getPrice());
                        System.out.println("Successfully payed.\n Name product: "+product4.getProductName()+"\nSum of product: "+product4.getPrice());

                    }else {
                        System.out.println("Please recharge balance.");
                    }
                }else {
                    System.out.println("incorrect password");
                }
            }else {
                client.payWithCard(product4.getPrice());
                System.out.println("Successfully payed.\n Name product: "+product4.getProductName()+"\nSum of product: "+product4.getPrice());
            }
        } else if (b==4) {
            if (product5.getPrice()>100){
                System.out.println("Enter password: ");
                int password = new Scanner(System.in).nextInt();
                if (password==client.getCard().getPassword()){
                    if (product5.getPrice()<client.getCard().getBalance()){
                        client.payWithCard(product5.getPrice());
                        System.out.println("Successfully payed.\n Name product: "+product5.getProductName()+"\nSum of product: "+product5.getPrice());

                    }else {
                        System.out.println("Please recharge balance.");
                    }
                }else {
                    System.out.println("incorrect password");
                }
            }else {
                client.payWithCard(product5.getPrice());
                System.out.println("Successfully payed.\n Name product: "+product5.getProductName()+"\nSum of product: "+product5.getPrice());
            }
        }else if (b==5){
            if (product6.getPrice()>100){
                System.out.println("Enter password: ");
                int password = new Scanner(System.in).nextInt();
                if (password==client.getCard().getPassword()){
                    if (product6.getPrice()<client.getCard().getBalance()){
                        client.payWithCard(product6.getPrice());
                        System.out.println("Successfully payed.\n Name product: "+product6.getProductName()+"\nSum of product: "+product6.getPrice());

                    }else {
                        System.out.println("Please recharge balance.");
                    }
                }else {
                    System.out.println("incorrect password");
                }
            }else {
                client.payWithCard(product6.getPrice());
                System.out.println("Successfully payed.\n Name product: "+product6.getProductName()+"\nSum of product: "+product6.getPrice());
            }
        }else {
            System.out.println("Error");
        }
    }
}