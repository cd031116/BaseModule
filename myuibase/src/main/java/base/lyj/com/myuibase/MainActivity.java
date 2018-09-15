package base.lyj.com.myuibase;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import base.lyj.com.basemodule.base.BaseActivity;
import base.lyj.com.myuibase.bean.MainData;
import base.lyj.com.myuibase.recycleAdapter.CommonAdapter;
import base.lyj.com.myuibase.recycleAdapter.MultiItemTypeAdapter;
import base.lyj.com.myuibase.recycleAdapter.ViewHolder;
import base.lyj.com.myuibase.recycleAdapter.wrapper.EmptyWrapper;
import base.lyj.com.myuibase.recycleAdapter.wrapper.HeaderAndFooterWrapper;
import base.lyj.com.myuibase.recycleAdapter.wrapper.LoadMoreWrapper;
import base.lyj.com.myuibase.ui.SwitchButtonActivity;

public class MainActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private CommonAdapter<MainData> mAdapter;
    private List<MainData> mList = new ArrayList<>();
    private String[] datas=new String[]{"SwitchButton","Buttons"};

    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;
    private EmptyWrapper mEmptyWrapper;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {
        recyclerView = findViewById(R.id.recycle);

    }

    @Override
    protected void initData() {
        mAdapter = new CommonAdapter<MainData>(this, R.layout.list_item_mian, mList) {
            @Override
            protected void convert(ViewHolder holder, MainData s, int position) {
            holder.setText(R.id.title,s.getTitle());
            }
        };
        initHeaderAndFooter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (mList.get(position).gettId()){
                    case 1:
                        startActivity(SwitchButtonActivity.class,null);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }


            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {


                return false;
            }
        });

        for (int i=0;i<datas.length;i++)
        {
            mList.add(new MainData(datas[i],i+1));
        }
        mAdapter.notifyDataSetChanged();
    }


//    private void initEmptyView()
//    {
//        mEmptyWrapper = new EmptyWrapper(mAdapter);
//        mEmptyWrapper.setEmptyView(LayoutInflater.from(this).inflate(R.layout.empty_view, recyclerView, false));
//    }

    //添加头部
    private void initHeaderAndFooter()
    {
//        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(mAdapter);
//        TextView t1 = new TextView(this);
//        t1.setText("Header 1");
//        mHeaderAndFooterWrapper.addHeaderView(t1);
    }


}
