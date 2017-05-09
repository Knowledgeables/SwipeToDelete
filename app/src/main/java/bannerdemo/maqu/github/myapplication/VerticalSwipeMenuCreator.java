package bannerdemo.maqu.github.myapplication;

import android.content.Context;

import com.yanzhenjie.recyclerview.swipe.SwipeMenu;
import com.yanzhenjie.recyclerview.swipe.SwipeMenuCreator;
import com.yanzhenjie.recyclerview.swipe.SwipeMenuItem;

/**
 * Project :  MyApplication.
 * Package name: bannerdemo.maqu.github.myapplication
 * Created by :  Benjamin.
 * Created time: 2017/5/9 16:44
 * Changed by :  Benjamin.
 * Changed time: 2017/5/9 16:44
 * Class description:
 */

public class VerticalSwipeMenuCreator implements SwipeMenuCreator {
    Context context;

    public VerticalSwipeMenuCreator(Context context) {
        this.context = context;
    }

    @Override
    public void onCreateMenu(SwipeMenu swipeLeftMenu, SwipeMenu swipeRightMenu, int viewType) {
     // 设置菜单方向为竖型的。
        swipeRightMenu.setOrientation(SwipeMenu.HORIZONTAL);
        SwipeMenuItem deleteItem = new SwipeMenuItem(context);
        deleteItem
                .setBackgroundDrawable(R.drawable.selector_red)
                .setHeight(90)
                .setWidth(180)
                //.setImage(R.mipmap.ic_action_delete)
                .setText("删除")
                .setTextColor(R.color.colorAccent);
        swipeRightMenu.addMenuItem(deleteItem);// 添加一个按钮到右侧侧菜单。
    }
}
