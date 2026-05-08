package defpackage;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q44 implements NotThreadSafeBridgeIdleDebugListener, ila {
    public final ArrayList<Long> a = new ArrayList<>(20);
    public final ArrayList<Long> b = new ArrayList<>(20);
    public final ArrayList<Long> c = new ArrayList<>(20);
    public final ArrayList<Long> d = new ArrayList<>(20);
    public volatile boolean e = true;

    @Override // defpackage.ila
    public final synchronized void a() {
        this.d.add(Long.valueOf(System.nanoTime()));
    }

    @Override // defpackage.ila
    public final synchronized void b() {
        this.c.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onTransitionToBridgeBusy() {
        this.b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onTransitionToBridgeIdle() {
        this.a.add(Long.valueOf(System.nanoTime()));
    }
}
