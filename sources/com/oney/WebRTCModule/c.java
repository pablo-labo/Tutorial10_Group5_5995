package com.oney.WebRTCModule;

import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import defpackage.ly1;
import defpackage.my1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements LifecycleEventListener {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Log.d("com.oney.WebRTCModule.b", "onHostDestroy");
        this.a.e.execute(new my1(this, 1));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        Log.d("com.oney.WebRTCModule.b", "onHostPause");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.a.e.execute(new ly1(this, 2));
    }
}
