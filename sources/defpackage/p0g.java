package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class p0g implements LifecycleEventListener {
    public final /* synthetic */ WeakReference a;

    public p0g(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        tv8 tv8Var = (tv8) this.a.get();
        if (tv8Var != null) {
            tv8Var.onHostResume();
        }
    }
}
