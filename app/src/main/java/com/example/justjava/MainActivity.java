/**
        * IMPORTANT: Make sure you are using the correct package name.
        * This example uses the package name:
        * package com.example.android.justjava
        * If you get an error when copying this code into Android studio, update it to match teh package name found
        * in the project's AndroidManifest.xml file.
        **/

package com.example.justjava;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*this method will increment the number of order of coffee*/
    public void increment(View view){
        if(quantity>=0) {
            quantity = quantity + 1;
            display(quantity);
        }
    }
    public void decrement(View view){
        if(quantity>0) {
            quantity = quantity - 1;
            display(quantity);
        }
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int no_of_coffee_ordered=2;
        int quantity=3;
        display(no_of_coffee_ordered);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityTextView);
        TextView priceTextView=(TextView) findViewById(R.id.price);
        priceTextView.setText(""+number *5);
        quantityTextView.setText("" + number);
    }
}