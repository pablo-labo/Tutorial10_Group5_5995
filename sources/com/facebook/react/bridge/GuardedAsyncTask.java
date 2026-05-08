package com.facebook.react.bridge;

import android.os.AsyncTask;
import defpackage.sy3;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0014\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H$¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/bridge/GuardedAsyncTask;", "Params", "Progress", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "params", "doInBackground", "([Ljava/lang/Object;)Ljava/lang/Void;", "Lj6g;", "doInBackgroundGuarded", "([Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/JSExceptionHandler;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    public static final Executor THREAD_POOL_EXECUTOR;
    private final JSExceptionHandler exceptionHandler;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        executor.getClass();
        THREAD_POOL_EXECUTOR = executor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuardedAsyncTask(ReactContext reactContext) {
        reactContext.getClass();
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        exceptionHandler.getClass();
        this(exceptionHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    @sy3
    public final Void doInBackground(Params... params) {
        params.getClass();
        try {
            doInBackgroundGuarded(Arrays.copyOf(params, params.length));
            return null;
        } catch (RuntimeException e) {
            this.exceptionHandler.handleException(e);
            return null;
        }
    }

    public abstract void doInBackgroundGuarded(Params... params);

    public GuardedAsyncTask(JSExceptionHandler jSExceptionHandler) {
        jSExceptionHandler.getClass();
        this.exceptionHandler = jSExceptionHandler;
    }
}
