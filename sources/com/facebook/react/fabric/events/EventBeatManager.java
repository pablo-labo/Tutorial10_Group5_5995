package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import defpackage.f84;
import defpackage.le1;
import defpackage.zkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager;", "Lcom/facebook/jni/HybridClassBase;", "Lle1;", "<init>", "()V", "Lj6g;", "initHybrid", "tick", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
@f84
public final class EventBeatManager extends HybridClassBase implements le1 {
    static {
        zkd.M();
    }

    public EventBeatManager() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void tick();

    @Override // defpackage.le1
    public final void a() {
        tick();
    }
}
