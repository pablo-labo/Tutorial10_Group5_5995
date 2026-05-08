package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ee6 implements Choreographer.FrameCallback {
    public final JSExceptionHandler a;

    public ee6(ReactContext reactContext) {
        reactContext.getClass();
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        exceptionHandler.getClass();
        this.a = exceptionHandler;
    }

    public abstract void a(long j);

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        try {
            a(j);
        } catch (RuntimeException e) {
            this.a.handleException(e);
        }
    }
}
