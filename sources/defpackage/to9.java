package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface to9<T extends View> extends yqg {
    void setActions(T t, ReadableArray readableArray);

    void setActionsHash(T t, String str);

    void setHitSlop(T t, ReadableMap readableMap);

    void setShouldOpenOnLongPress(T t, boolean z);

    void setThemeVariant(T t, String str);

    void setTitle(T t, String str);
}
