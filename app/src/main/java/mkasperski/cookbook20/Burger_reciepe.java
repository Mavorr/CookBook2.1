package mkasperski.cookbook20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Burger_reciepe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_reciepe);

        Button button_burger_reciepe = (Button) findViewById(R.id.button_burger_reciepe);


        button_burger_reciepe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Burger_reciepe.this, BurgerActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
