public class Book {
    String title ;
    String author;
    double price ;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title ,String author,double price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    public void updatePrice(double newPrice) {
        if (newPrice < 0){
            System.out.println("not minus this");
        }else{this.price = newPrice;

        }
    }
    public void applyDiscount(double discountPercentage) {

        if (discountPercentage <= 0.00 || discountPercentage >= 100.00) {
            System.out.println("--- Discount Error ---");
            System.out.printf("ERROR: Cannot apply %.2f%% discount. Discount percentage must be greater than 0.00 and less than 100.00.%n", discountPercentage);

            return;
        }


        double discountFactor = discountPercentage / 100.0;
        double newPrice = this.price * (1.0 - discountFactor);


        this.price = newPrice;


        System.out.println("--- Discount Applied ---");
        System.out.printf("Discount of %.2f%% applied successfully to \"%s\".%n",
                discountPercentage, this.title);
        System.out.printf("Updated Price: $%.2f%n", this.price);
    }
}



