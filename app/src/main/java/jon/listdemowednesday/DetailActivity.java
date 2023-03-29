package jon.listdemowednesday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView detailTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailTextView = findViewById(R.id.detailTextView);
        // how to get the text from MainActivity?
        String s = getIntent().getStringExtra("thekey");
        detailTextView.setText(s);
    }
}