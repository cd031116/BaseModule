package base.lyj.com.basemodule.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


import base.lyj.com.basemodule.R;

/**
 * Created by ZHT on 2017/4/18.
 * Fragment基类
 */

public abstract class BaseFragment extends Fragment  {

    private View mView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_base, container, false);

        ViewGroup parent = (ViewGroup) mView.getParent();
        if (null != parent) {
            parent.removeView(mView);
        }

        addChildView(inflater);





        afterCreate(savedInstanceState);

        return mView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 添加子Fragment的布局文件
     * @param inflater
     */
    private void addChildView(LayoutInflater inflater) {

        FrameLayout container = (FrameLayout) mView.findViewById(R.id.container);
        View child = inflater.inflate(getLayoutId(), null);
        container.addView(child, 0);
    }

    protected abstract int getLayoutId();

    protected abstract void afterCreate(Bundle savedInstanceState);



    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
