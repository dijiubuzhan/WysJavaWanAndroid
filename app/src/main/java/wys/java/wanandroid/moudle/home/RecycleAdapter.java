package wys.java.wanandroid.moudle.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import wys.java.wanandroid.R;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


/**
 * Created by wilson on 2017/4/18.
 */

public class RecycleAdapter extends RecyclerView.Adapter {

    private Context context;

    private List<HomeItemBean.DataBean.DatasBean> mDatas;
    private LayoutInflater m_layoutInflater;

    public RecycleAdapter(Context context, List<HomeItemBean.DataBean.DatasBean> mDatas) {
        this.mDatas=mDatas;
        this.context=context;
        m_layoutInflater= LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemViewHolder holder=new ItemViewHolder(m_layoutInflater.inflate(R.layout.home_item,parent,false));
        return holder;
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewholder, final int position) {
        ItemViewHolder holder= (ItemViewHolder) viewholder;
        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArticle(mDatas.get(position).getApkLink());
            }
        });*/
        holder.title.setText(mDatas.get(position).getTitle());
        if (!TextUtils.isEmpty(mDatas.get(position).getAuthor())) {
            holder.author.setText("作者："+mDatas.get(position).getAuthor());
        }
        if (!TextUtils.isEmpty(mDatas.get(position).getSuperChapterName())) {
            holder.category.setText("分类"+mDatas.get(position).getSuperChapterName());
        }
        if (!TextUtils.isEmpty(mDatas.get(position).getNiceShareDate())) {
            holder.time.setText("时间"+mDatas.get(position).getNiceShareDate());
        }
    }

    private void openArticle(String apkLink) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(apkLink));//Url 就是你要打开的网址
        intent.setAction(Intent.ACTION_VIEW);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView title,author,category,time;
        private ImageView m_imageView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            m_imageView= (ImageView) itemView.findViewById(R.id.like);
            title= (TextView) itemView.findViewById(R.id.title);
            author= (TextView) itemView.findViewById(R.id.author);
            category= (TextView) itemView.findViewById(R.id.Category);
            time= (TextView) itemView.findViewById(R.id.time);
        }
    }
}
