package defpackage;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class at3 implements ViewTreeObserver.OnPreDrawListener {
    public static final /* synthetic */ int a = 0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        declaredField.getClass();
        declaredField.setAccessible(true);
    }
}
