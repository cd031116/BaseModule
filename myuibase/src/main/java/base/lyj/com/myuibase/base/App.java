package base.lyj.com.myuibase.base;

import android.app.Application;
import android.os.Handler;

import base.lyj.com.basemodule.utils.LogUtils;
import base.lyj.com.myuibase.BuildConfig;

public class App extends Application{

    private static App mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        //设置是否打印日志
        LogUtils.setIsLog(BuildConfig.LOG_DEBUG);
    }

    public static App getApplication() {
        return mContext;
    }

}
