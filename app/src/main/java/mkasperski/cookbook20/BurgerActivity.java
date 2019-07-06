package mkasperski.cookbook20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger);

        Button button_butger_1 = (Button) findViewById(R.id.button_burger_1);
        Button button_burger_2 = (Button) findViewById(R.id.button_burger_2);


        button_butger_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(BurgerActivity.this, MainActivity.class);
                startActivity(myIntent); }
        });


        button_burger_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(BurgerActivity.this, Burger_reciepe.class);
                startActivity(myIntent);
            }
        });
    }
}
