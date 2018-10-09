package fju.com.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BMI(View view){
        Log.d("MainActivity","BMI");
        EditText editWeight = findViewById(R.id.ed_Weight);
        EditText editHeight = findViewById(R.id.ed_Height);
        String w = editWeight.getText().toString();
        String h = editHeight.getText().toString();
        Log.d("MainActivity",w +"/"+ h);
        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h);
        float BMI = weight/(height*height);
        Log.d("MainActivity",BMI+" ");
    }
}
