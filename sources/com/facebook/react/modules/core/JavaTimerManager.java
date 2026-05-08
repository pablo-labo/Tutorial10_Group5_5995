package com.facebook.react.modules.core;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.a;
import defpackage.cw7;
import defpackage.dh6;
import defpackage.eh6;
import defpackage.f84;
import defpackage.j6g;
import defpackage.rh2;
import defpackage.w24;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0011\u0012\u0013\u0014J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Leh6;", "", "timerId", "", "delay", "", "repeat", "Lj6g;", "createTimer", "(IJZ)V", "deleteTimer", "(I)V", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "c", "d", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaTimerManager implements LifecycleEventListener, eh6 {
    public final SparseArray<c> V;
    public final AtomicBoolean W;
    public final AtomicBoolean X;
    public final d Y;
    public final b Z;
    public final ReactApplicationContext a;
    public a a0;
    public final cw7 b;
    public boolean b0;
    public final com.facebook.react.modules.core.a c;
    public boolean c0;
    public final w24 d;
    public boolean d0;
    public final Object e;
    public final PriorityQueue<c> e0;
    public final Object f;

    public final class a implements Runnable {
        public final long a;
        public volatile boolean b;

        public a(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (this.b) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - (this.a / 1000000);
            long jCurrentTimeMillis = System.currentTimeMillis() - jUptimeMillis;
            if (16.666666f - jUptimeMillis < 1.0f) {
                return;
            }
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (javaTimerManager.f) {
                z = javaTimerManager.d0;
                j6g j6gVar = j6g.a;
            }
            if (z) {
                JavaTimerManager.this.b.callIdleCallbacks(jCurrentTimeMillis);
            }
            JavaTimerManager.this.a0 = null;
        }
    }

    public final class b implements Choreographer.FrameCallback {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (!JavaTimerManager.this.W.get() || JavaTimerManager.this.X.get()) {
                a aVar = JavaTimerManager.this.a0;
                if (aVar != null) {
                    aVar.b = true;
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                a aVar2 = javaTimerManager.new a(j);
                javaTimerManager.a0 = aVar2;
                javaTimerManager.a.runOnJSQueueThread(aVar2);
                JavaTimerManager.this.c.b(a.EnumC0132a.d, this);
            }
        }
    }

    public static final class c {
        public final int a;
        public long b;
        public final int c;
        public final boolean d;

        public c(int i, int i2, long j, boolean z) {
            this.a = i;
            this.b = j;
            this.c = i2;
            this.d = z;
        }
    }

    public final class d implements Choreographer.FrameCallback {
        public WritableArray a;

        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            c cVarPoll;
            if (!JavaTimerManager.this.W.get() || JavaTimerManager.this.X.get()) {
                long j2 = j / 1000000;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (javaTimerManager.e) {
                    while (!javaTimerManager.e0.isEmpty()) {
                        try {
                            c cVarPeek = javaTimerManager.e0.peek();
                            cVarPeek.getClass();
                            if (cVarPeek.b >= j2 || (cVarPoll = javaTimerManager.e0.poll()) == null) {
                                break;
                            }
                            if (this.a == null) {
                                this.a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.a;
                            if (writableArray != null) {
                                writableArray.pushInt(cVarPoll.a);
                            }
                            if (cVarPoll.d) {
                                cVarPoll.b = ((long) cVarPoll.c) + j2;
                                javaTimerManager.e0.add(cVarPoll);
                            } else {
                                javaTimerManager.V.remove(cVarPoll.a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j6g j6gVar = j6g.a;
                }
                WritableArray writableArray2 = this.a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.b.callTimers(writableArray2);
                    this.a = null;
                }
                JavaTimerManager.this.c.b(a.EnumC0132a.c, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, cw7 cw7Var, com.facebook.react.modules.core.a aVar, w24 w24Var) {
        cw7Var.getClass();
        aVar.getClass();
        w24Var.getClass();
        this.a = reactApplicationContext;
        this.b = cw7Var;
        this.c = aVar;
        this.d = w24Var;
        this.e = new Object();
        this.f = new Object();
        this.V = new SparseArray<>();
        this.W = new AtomicBoolean(true);
        this.X = new AtomicBoolean(false);
        this.Y = new d();
        this.Z = new b();
        final rh2 rh2Var = new rh2(5, (byte) 0);
        this.e0 = new PriorityQueue<>(11, new Comparator() { // from class: gw7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) rh2Var.invoke(obj, obj2)).intValue();
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        dh6 dh6VarA = dh6.a.a(reactApplicationContext);
        synchronized (dh6VarA) {
            dh6VarA.a.add(this);
            Iterator it = dh6VarA.b.iterator();
            while (it.hasNext()) {
                ((Number) it.next()).intValue();
                d();
            }
        }
    }

    @Override // defpackage.eh6
    public final void a() {
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        if (dh6.a.a(this.a).b.isEmpty()) {
            this.X.set(false);
            b();
            c();
        }
    }

    public final void b() {
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        dh6 dh6VarA = dh6.a.a(this.a);
        if (this.b0 && this.W.get() && dh6VarA.b.isEmpty()) {
            this.c.c(a.EnumC0132a.c, this.Y);
            this.b0 = false;
        }
    }

    public final void c() {
        if (!this.W.get() || this.X.get()) {
            return;
        }
        b();
    }

    @f84
    public void createTimer(int timerId, long delay, boolean repeat) {
        c cVar = new c(timerId, (int) delay, (System.nanoTime() / 1000000) + delay, repeat);
        synchronized (this.e) {
            this.e0.add(cVar);
            this.V.put(timerId, cVar);
            j6g j6gVar = j6g.a;
        }
    }

    public final void d() {
        if (this.X.getAndSet(true)) {
            return;
        }
        if (!this.b0) {
            this.c.b(a.EnumC0132a.c, this.Y);
            this.b0 = true;
        }
        synchronized (this.f) {
            if (this.d0 && !this.c0) {
                this.c.b(a.EnumC0132a.d, this.Z);
                this.c0 = true;
            }
            j6g j6gVar = j6g.a;
        }
    }

    @f84
    public void deleteTimer(int timerId) {
        synchronized (this.e) {
            c cVar = this.V.get(timerId);
            if (cVar == null) {
                return;
            }
            this.V.remove(timerId);
            this.e0.remove(cVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        b();
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.W.set(true);
        b();
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.W.set(false);
        if (!this.b0) {
            this.c.b(a.EnumC0132a.c, this.Y);
            this.b0 = true;
        }
        synchronized (this.f) {
            if (this.d0 && !this.c0) {
                this.c.b(a.EnumC0132a.d, this.Z);
                this.c0 = true;
            }
            j6g j6gVar = j6g.a;
        }
    }

    @f84
    public void setSendIdleEvents(final boolean sendIdleEvents) {
        synchronized (this.f) {
            this.d0 = sendIdleEvents;
            j6g j6gVar = j6g.a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: hw7
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager javaTimerManager = this.a;
                boolean z = sendIdleEvents;
                synchronized (javaTimerManager.f) {
                    boolean z2 = javaTimerManager.c0;
                    if (z) {
                        if (!z2) {
                            javaTimerManager.c.b(a.EnumC0132a.d, javaTimerManager.Z);
                            javaTimerManager.c0 = true;
                        }
                    } else if (z2) {
                        javaTimerManager.c.c(a.EnumC0132a.d, javaTimerManager.Z);
                        javaTimerManager.c0 = false;
                    }
                    j6g j6gVar2 = j6g.a;
                }
            }
        });
    }
}
