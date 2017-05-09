package bannerdemo.maqu.github.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yanzhenjie.recyclerview.swipe.SwipeMenuAdapter;

import java.util.List;

/**
 * Project :  MyApplication.
 * Package name: bannerdemo.maqu.github.myapplication
 * Created by :  Benjamin.
 * Created time: 2017/5/9 15:16
 * Changed by :  Benjamin.
 * Changed time: 2017/5/9 15:16
 * Class description:
 */

public class Adapter extends SwipeMenuAdapter<Adapter.HolderView> {
    private Context context;
    private List<String> list;

    public Adapter(Context context) {
        this.context = context;
    }


    public void refresh(List<String> list) {
        this.list = list;
        this.notifyDataSetChanged();
    }

    @Override
    public View onCreateContentView(ViewGroup parent, int i) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.item_remove, parent, false);
    }

    @Override
    public HolderView onCompatCreateViewHolder(View view, int i) {
        return new HolderView(view);
    }

    @Override
    public void onBindViewHolder(HolderView holder, int position) {
     holder.name.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();

    }


    class HolderView extends RecyclerView.ViewHolder {
        TextView name;

        public HolderView(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
