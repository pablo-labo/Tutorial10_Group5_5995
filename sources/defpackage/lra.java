package defpackage;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.GestureHandler;

/* JADX INFO: loaded from: classes3.dex */
public interface lra {
    <T extends GestureHandler> void a(T t, int i, int i2);

    <T extends GestureHandler> void b(T t);

    <T extends GestureHandler> void c(T t, MotionEvent motionEvent);
}
