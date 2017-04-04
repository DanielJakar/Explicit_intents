package android.course.explicit_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSave).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Context:
        Intent homeIntent = new Intent(this, HomeActivity.class);
        // send some info
        startActivity(homeIntent);
    }
}
