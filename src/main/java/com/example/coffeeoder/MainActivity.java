package com.example.coffeeoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public   int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * This method is called when the Plus button is clicked
     */
    public void topUpCoffee(View view)
    {
        quantity += 1;
        display(quantity);
    }

    /**
     *
     * This method is called when the Minus  button is clicked
     */
    public void dropCoffee(View view)
    {
        quantity -= 1;
        display(quantity);


    }

    /**
     *
     * This method is called when the submit button is clicked
     */
    public void submitOder(View view)

    {
        int price = quantity * 5;
        String message = "Price: $" + price;
        message = message + "\nThank you!";
       displayMessage(message);
       //displayPrice(quantity*5);

    }

    /**
     *
     * This method is called when the submit, + and - button is clicked
     */

    public void display(int number)
    {

        TextView quantityTextview = (TextView) findViewById(R.id.tv_Quantity);

        quantityTextview.setText("" + number);

    }

    /**
     *
     * This method is called submit Button is clicked to trigger of the price of coffe
     * depending on te quantity
     */
    private void displayPrice(int price)
    {
        TextView coffeePrice = (TextView)findViewById(R.id.tv_Coffe_Price);

        coffeePrice.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    /**
     *
     * This method is called when submit button is clicked to display the String
     * depending on te quantity
     */
    public void displayMessage(String msg)
    {
        TextView checkCoffee = (TextView)findViewById(R.id.tv_Coffe_Price);
        checkCoffee.setText(msg);
    }



}
