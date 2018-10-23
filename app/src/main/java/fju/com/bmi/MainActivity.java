package fju.com.bmi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editWeight;
    EditText editHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        editWeight= findViewById(R.id.ed_Weight);
        editHeight = findViewById(R.id.ed_Height);
        //取得方塊內資料，轉成屬性
        Button help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","OnClick:hlep");
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("BMI")
                        .setMessage("The body mass index (BMI) or Quetelet index is a value derived from the mass (weight) and height of an individual. ")
                        .setPositiveButton("OK" ,null )
                        .show();


            }
        });
    }

    public void BMI(View view){
        Log.d("MainActivity",getString(R.string.BMI));
        //取得輸入方塊
        String w = editWeight.getText().toString();
        String h = editHeight.getText().toString();
        Log.d("MainActivity",w +"/"+ h);
        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h);
        float BMI = weight/(height*height);
        Log.d("MainActivity",BMI+" ");
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI", BMI);
        startActivity(intent);
        /*Toast.makeText(this, getString(R.string.yourBMIis) + BMI, Toast.LENGTH_LONG).show();
       //創出小的對話框
        new AlertDialog.Builder(this)
                //創出大的對話框
                .setMessage(getString(R.string.yourBMI) + BMI)
                //對話框內的內容
                .setTitle(R.string.BMI)
                //對話框的標題
                .setPositiveButton(R.string.OK, new DialogInterface.OnClickListener()
                //  對話框的按鈕
                {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        editHeight.setText("");
                        editWeight.setText("");
                        //執行完後，刪掉原本輸入的
                    }
                })
                .show();*/
    }
}

