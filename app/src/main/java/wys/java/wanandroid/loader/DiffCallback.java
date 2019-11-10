package wys.java.wanandroid.loader;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DiffUtil.Callback;

import java.util.List;

import wys.java.wanandroid.moudle.home.HomeItemBean;
import wys.java.wanandroid.moudle.home.RecycleAdapter;

public class DiffCallback extends DiffUtil.Callback {
    private List<HomeItemBean.DataBean.DatasBean> oldItems,items;

    private DiffCallback(List<HomeItemBean.DataBean.DatasBean> oldItems, List<HomeItemBean.DataBean.DatasBean> items) {
        this.oldItems = oldItems;
        this.items = items;
    }


    public static void create(List<HomeItemBean.DataBean.DatasBean> oldItems, List<HomeItemBean.DataBean.DatasBean> items, RecycleAdapter recycleAdapter) {
        DiffCallback diffCallback=new DiffCallback(oldItems,items);
        DiffUtil.DiffResult result=DiffUtil.calculateDiff(diffCallback,true);
        result.dispatchUpdatesTo(recycleAdapter);
    }

    @Override
    public int getOldListSize() {
        return oldItems!=null?oldItems.size():0;
    }

    @Override
    public int getNewListSize() {
        return items!=null?items.size():0;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldItems.get(oldItemPosition).equals(items.get(newItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldItems.get(oldItemPosition).hashCode()==items.get(newItemPosition).hashCode();
    }
}
