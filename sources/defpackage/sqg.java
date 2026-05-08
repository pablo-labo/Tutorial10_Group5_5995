package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes2.dex */
public interface sqg<T extends View> {
    /* synthetic */ void a(View view, String str, Object obj);

    /* synthetic */ void f(View view, String str, ReadableArray readableArray);

    @sy3
    /* JADX INFO: renamed from: m */
    default void a(T t, String str, Object obj) {
        t.getClass();
        if (str != null) {
            a(t, str, obj);
        } else {
            r6.g("Required value was null.");
        }
    }

    @sy3
    /* JADX INFO: renamed from: s */
    default void f(T t, String str, ReadableArray readableArray) {
        t.getClass();
        if (str == null) {
            r6.g("Required value was null.");
        } else if (readableArray != null) {
            f(t, str, readableArray);
        } else {
            r6.g("Required value was null.");
        }
    }
}
