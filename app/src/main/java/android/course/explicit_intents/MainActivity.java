package android.course.explicit_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_USER_NAME = "theUserName";
    //    public static final String EXTRA_USER_NAME = "theUserName";
    private EditText etUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSave).setOnClickListener(this);
        etUserName = (EditText) findViewById(R.id.etUserName);


    }

    @Override
    public void onClick(View v) {
        //Context
        //if (V.getId() == R.id.btnSave) {}
        //build the intent
        Intent homeIntent = new Intent(this, HomeActivity.class);
        // send some info
        String userName = etUserName.getText().toString();

        homeIntent.putExtra(EXTRA_USER_NAME, userName);
        homeIntent.putExtra("theUserScore", 10);

        //launch the intent
        startActivity(homeIntent);
    }
}
