package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Spinner spnCountType = findViewById(R.id.spnCountType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.Count_types,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCountType.setAdapter(adapter);
    }

    public void onClickCount(View view) {
        Spinner spnCountType = findViewById(R.id.spnCountType);
        TextView txtResult = findViewById(R.id.txtResult);
        EditText etInputText = findViewById(R.id.etInputText);
        String userInput = etInputText.getText().toString();

        if (userInput.trim().isEmpty()) {
            Toast.makeText(this, R.string.empty_input_message, Toast.LENGTH_SHORT).show();
            return;
        }

        int position = spnCountType.getSelectedItemPosition();
        int result;
        if (position == 0) { //pasirenkama pozicija pagal kuria vyks skaiciavimai
            result = Counter.getWordCount(userInput);
        } else if (position == 1) {
            result = Counter.getCharCount(userInput);
        } else if (position == 2){
            result = Counter.getSentenceCount(userInput);
        }
        else{
            result=Counter.getNumberCount(userInput);
        }

        txtResult.setText(String.valueOf(result));
    }
}