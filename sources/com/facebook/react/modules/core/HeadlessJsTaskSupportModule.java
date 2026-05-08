package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.ch6;
import defpackage.dh6;
import defpackage.nmc;
import defpackage.s55;
import defpackage.zf3;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "HeadlessJsTaskSupport")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;", "Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "taskIdDouble", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "notifyTaskRetry", "(DLcom/facebook/react/bridge/Promise;)V", "notifyTaskFinished", "(D)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double taskIdDouble) {
        boolean zContains;
        int i = (int) taskIdDouble;
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        dh6 dh6VarA = dh6.a.a(reactApplicationContext);
        synchronized (dh6VarA) {
            zContains = dh6VarA.b.contains(Integer.valueOf(i));
        }
        if (!zContains) {
            s55.l(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
            return;
        }
        synchronized (dh6VarA) {
            boolean zRemove = dh6VarA.b.remove(Integer.valueOf(i));
            dh6VarA.c.remove(Integer.valueOf(i));
            SparseArray<Runnable> sparseArray = dh6VarA.d;
            Runnable runnable = sparseArray.get(i);
            if (runnable != null) {
                UiThreadUtil.removeOnUiThread(runnable);
                sparseArray.remove(i);
            }
            if (zRemove) {
                UiThreadUtil.runOnUiThread(new zf3(dh6VarA, i));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double taskIdDouble, Promise promise) {
        boolean zContains;
        promise.getClass();
        int i = (int) taskIdDouble;
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        dh6 dh6VarA = dh6.a.a(reactApplicationContext);
        synchronized (dh6VarA) {
            zContains = dh6VarA.b.contains(Integer.valueOf(i));
        }
        if (!zContains) {
            s55.l(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
            promise.resolve(Boolean.FALSE);
            return;
        }
        synchronized (dh6VarA) {
            if (((ch6) dh6VarA.c.get(Integer.valueOf(i))) == null) {
                throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + i + ".").toString());
            }
        }
        promise.resolve(Boolean.FALSE);
    }
}
