package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean cheesAdded = false;
    boolean toopinAdded = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (this.isVeg = true){
            this.price = 300;
            this.bill = "Base Price Of The Pizza:"+ this.price;
        }else {
            this.price = 400;
            this.bill = "Base Price Of The Pizza:"+ this.price;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheesAdded == false) {
            this.bill += "\nExtra Cheese Added: 80";
            this.price += 80;
            cheesAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toopinAdded = false){
            if (isVeg == true){
                this.bill += "\nExtra Toppings Added: 70";
                this.price += 70;
            }else {
                this.bill += "\nExtra Toppings Added: 120";
                this.price += 120;
            }
            toopinAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.bill += "\nPaperbag Added: 20";
        this.price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill += "\nTotal Price:"+ this.price;

        return this.bill;
    }
}
