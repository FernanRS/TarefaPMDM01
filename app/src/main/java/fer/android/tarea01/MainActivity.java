package fer.android.tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final  String MESSAGE_MAIN_ACTIVITY = "fer.android.firstapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void deleteText(View view){
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(MESSAGE_MAIN_ACTIVITY, message);
        startActivity(intent);
    }

}
