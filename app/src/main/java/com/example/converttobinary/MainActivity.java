
        package com.example.converttobinary;
        import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        textViewResult = findViewById(R.id.textViewResult);

        editTextNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    int number = Integer.parseInt(s.toString());
                    String binaryString = Integer.toBinaryString(number);
                    textViewResult.setText("Binary: " + binaryString);
                } else {
                    textViewResult.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}
