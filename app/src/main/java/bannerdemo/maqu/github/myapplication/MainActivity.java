package bannerdemo.maqu.github.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.yanzhenjie.recyclerview.swipe.SwipeMenuRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeMenuRecyclerView recycler_view;
    Adapter adapter;
    private List<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = (SwipeMenuRecyclerView) findViewById(R.id.recycler_view);
        adapter = new Adapter(this);
        recycler_view.setAdapter(adapter);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.addItemDecoration(new ListViewDecoration());// 添加分割线。
        //recycler_view.setSwipeMenuCreator(new VerticalSwipeMenuCreator(this));
        setData();
    }

    private void setData() {
        array = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            array.add("测试数据，第" + i + "条数据");
        }
        adapter.refresh(array);
    }
}
