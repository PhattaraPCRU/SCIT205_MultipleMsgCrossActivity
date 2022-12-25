package pcru.phattara.multiplemsgcrossactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view) {
        Intent intent = new Intent(this, DisplayActivity.class);
        EditText editName = findViewById(R.id.eTxtName);
        EditText editID = findViewById(R.id.eTxtID);
        String name = editName.getText().toString();
        String id = editID.getText().toString();
        intent.putExtra("name", name);
        intent.putExtra("id", id);
        startActivity(intent);

    }


}