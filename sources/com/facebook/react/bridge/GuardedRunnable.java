package com.facebook.react.bridge;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/GuardedRunnable;", "Ljava/lang/Runnable;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lj6g;", "run", "()V", "runGuarded", "Lcom/facebook/react/bridge/JSExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GuardedRunnable implements Runnable {
    private final JSExceptionHandler exceptionHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    public GuardedRunnable(ReactContext reactContext) {
        reactContext.getClass();
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        exceptionHandler.getClass();
        this(exceptionHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e) {
            this.exceptionHandler.handleException(e);
        }
    }

    public abstract void runGuarded();

    public GuardedRunnable(JSExceptionHandler jSExceptionHandler) {
        jSExceptionHandler.getClass();
        this.exceptionHandler = jSExceptionHandler;
    }
}
