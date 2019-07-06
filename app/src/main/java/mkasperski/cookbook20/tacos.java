package mkasperski.cookbook20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tacos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacos);
        ImageButton back_button = (ImageButton) findViewById(R.id.back_button);
        ImageButton button_przepis = (ImageButton) findViewById(R.id.button_przepis);


        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tacos.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        button_przepis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tacos.this, tacos_recipe.class);
                startActivity(myIntent);
            }
        });
    }
}