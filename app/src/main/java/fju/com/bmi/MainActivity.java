package fju.com.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editWeight;
    EditText editHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWeight= findViewById(R.id.ed_Weight);
        editHeight = findViewById(R.id.ed_Height);
        //取得方塊內資料，轉成屬性
    }
    public void BMI(View view){
        Log.d("MainActivity","BMI");
        //取得輸入方塊
        String w = editWeight.getText().toString();
        String h = editHeight.getText().toString();
        Log.d("MainActivity",w +"/"+ h);
        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h);
        float BMI = weight/(height*height);
        Log.d("MainActivity",BMI+" ");
        Toast.makeText(this, "Your BMI is " + BMI, Toast.LENGTH_LONG).show();
    }
}
