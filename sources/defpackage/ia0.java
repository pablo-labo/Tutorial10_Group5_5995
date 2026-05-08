package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes2.dex */
public interface ia0<T extends View> extends yqg {
    void setColors(T t, ReadableArray readableArray);

    void setEnabled(T t, boolean z);

    void setNativeRefreshing(T t, boolean z);

    void setProgressBackgroundColor(T t, Integer num);

    void setProgressViewOffset(T t, float f);

    void setRefreshing(T t, boolean z);

    void setSize(T t, String str);
}
