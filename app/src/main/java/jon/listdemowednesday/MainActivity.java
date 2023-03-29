package jon.listdemowednesday;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    public static List<Note> items = new ArrayList<>();
    //private ArrayAdapter<String> adapter;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        fillList();
        //adapter = new ArrayAdapter<>(this, R.layout.myrow, R.id.textView, items);
        myAdapter = new MyAdapter(items, this);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener((listView, linearLayout, position, id)->{
            TextView textView = linearLayout.findViewById(R.id.textView);
            System.out.println("textView: " + textView.getText());
            // navigate to next screen (Activity)
            Intent intent = new Intent(this,DetailActivity.class);
            // provide the data as well.
            intent.putExtra("thekey", position);
            startActivity(intent);
        });
    }
    private void fillList(){
        items.add(new Note("A", R.drawable.k1));
        items.add(new Note("B",R.drawable.k2));
        items.add(new Note("C",R.drawable.k3));
    }
}