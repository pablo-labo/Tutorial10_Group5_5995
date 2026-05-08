package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes2.dex */
public final class cuc implements LifecycleEventListener {
    public final /* synthetic */ qa0 a;
    public final /* synthetic */ ReactContext b;

    public cuc(qa0 qa0Var, ReactContext reactContext) {
        this.a = qa0Var;
        this.b = reactContext;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.a.run();
        this.b.removeLifecycleEventListener(this);
    }
}
