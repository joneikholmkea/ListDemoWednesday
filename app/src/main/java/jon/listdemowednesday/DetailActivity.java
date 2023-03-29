package jon.listdemowednesday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView detailTextView;
    private ImageView detailImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailTextView = findViewById(R.id.detailTextView);
        detailImageView = findViewById(R.id.detailImageView);
        // how to get the text from MainActivity?
        Integer index = getIntent().getIntExtra("thekey", -1);
        Note note = MainActivity.items.get(index);
        detailTextView.setText(note.getText());
        detailImageView.setImageResource(note.getImage());

    }
}