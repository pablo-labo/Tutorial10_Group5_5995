package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes2.dex */
public interface vi3<T extends View> extends yqg {
    void clearElementsHighlights(T t);

    void highlightElements(T t, ReadableArray readableArray);

    void highlightTraceUpdates(T t, ReadableArray readableArray);
}
