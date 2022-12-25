package pcru.phattara.multiplemsgcrossactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {
    ArrayList<String> elementIDs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        elementIDs.add("txtDisplay");
        elementIDs.add("txtDisplayBold");
        elementIDs.add("txtDisplayIlatic");
        elementIDs.add("txtDisplayBoth");
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String id = intent.getStringExtra("id");
        String msg = "Name: " + name + " ID: " + id;
        for(String elementID : elementIDs) {
            int resID = getResources().getIdentifier(elementID, "id", getPackageName());
            View txtView = findViewById(resID);
            if(txtView instanceof TextView) {
                ((TextView) txtView).setText(msg);
            }
        }
    }

    public void Back(View view) {
        finish();
    }
}