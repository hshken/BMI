package fju.com.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
       //創出小的對話框
        new AlertDialog.Builder(this)
                //創出大的對話框
                .setMessage("Your BMI is " + BMI)
                //對話框內的內容
                .setTitle("BMI")
                //對話框的標題
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                //  對話框的按鈕
                {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        editHeight.setText("");
                        editWeight.setText("");
                        //執行完後，刪掉原本輸入的
                    }
                })
                .show();
    }
}
