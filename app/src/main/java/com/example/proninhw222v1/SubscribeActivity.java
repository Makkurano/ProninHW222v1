package com.example.proninhw222v1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SubscribeActivity extends AppCompatActivity {

    private TextView nameenter;
    private TextView editText;
    private TextView donetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);
        editText = findViewById(R.id.editText);
        nameenter = findViewById(R.id.nameenter);
        donetext = findViewById(R.id.donetext);
        Button Buttonok = findViewById(R.id.ok);
        Buttonok.setOnClickListener(new ButtonOk());
        Button Buttonclr = findViewById(R.id.clr);
        Buttonclr.setOnClickListener(new ButtonClr());
    }

    class ButtonClr implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            nameenter.setText("");
            editText.setText("");
            donetext.setText("");
        }
    }

    class ButtonOk implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String name = nameenter.getText().toString();
            donetext.setText(name + "\nВы успешно подписались на рассылку");
        }
    }
}
