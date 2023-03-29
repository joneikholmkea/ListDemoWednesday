package jon.listdemowednesday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Note> list;
    private LayoutInflater layoutInflater;
    public MyAdapter(List<Note> list, Context context) {
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position; // give id from object, if there is one
    }

    @Override
    public View getView(int position, View linearLayout, ViewGroup listView) {
        if (linearLayout == null){
            linearLayout = layoutInflater.inflate(R.layout.myrow, null);
        }
        // add stuff
        TextView textView = linearLayout.findViewById(R.id.textView);
        textView.setText(list.get(position).getText());
        ImageView imageView = linearLayout.findViewById(R.id.imageView);
        imageView.setImageResource(list.get(position).getImage());
        return linearLayout;
    }
}
