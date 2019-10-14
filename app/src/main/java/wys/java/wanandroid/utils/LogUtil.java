package wys.java.wanandroid.utils;

import android.util.Log;

public class LogUtil {
    public static void i(String string){
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        String methodName = s[3].getMethodName();
        Log.i("lgq",methodName+"----"+string);
    }

    public static void e(String string){
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        String methodName = s[3].getMethodName();
        Log.e("lgq",methodName+"----"+string);
    }

}
