package defpackage;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes2.dex */
public interface vo6<T extends View> extends wo6 {
    void addView(T t, View view, int i);

    View getChildAt(T t, int i);

    int getChildCount(T t);

    default void removeAllViews(T t) {
        t.getClass();
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount(t);
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(t, childCount);
            }
        }
    }

    void removeViewAt(T t, int i);
}
