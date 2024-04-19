public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private  int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        }else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void getPizzaPrice() {
        System.out.println(this.price);
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }
    public void takeAway (){
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + isExtraToppingsAdded + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: " + basePizzaPrice + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
