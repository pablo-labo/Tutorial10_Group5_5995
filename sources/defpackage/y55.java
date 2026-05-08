package defpackage;

import android.os.Handler;
import android.os.Trace;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventEmitterImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y55 implements EventDispatcher, LifecycleEventListener {
    public static final Handler W = UiThreadUtil.getUiThreadHandler();
    public final h50 V;
    public final ReactApplicationContext a;
    public final EventEmitterImpl b;
    public final CopyOnWriteArrayList<by4> c;
    public final CopyOnWriteArrayList<le1> d;
    public final a e;
    public boolean f;

    public final class a implements Choreographer.FrameCallback {
        public volatile boolean a;
        public boolean b;

        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.b) {
                this.a = false;
            } else {
                com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
                if (aVar == null) {
                    r6.g("ReactChoreographer needs to be initialized.");
                    return;
                }
                aVar.b(a.EnumC0132a.c, y55.this.e);
            }
            Trace.beginSection(jpf.g("BatchEventDispatchedListeners"));
            try {
                Iterator<le1> it = y55.this.d.iterator();
                it.getClass();
                while (it.hasNext()) {
                    it.next().a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public y55(ReactApplicationContext reactApplicationContext, FabricEventEmitter fabricEventEmitter) {
        this.a = reactApplicationContext;
        EventEmitterImpl eventEmitterImpl = new EventEmitterImpl(reactApplicationContext);
        this.b = eventEmitterImpl;
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.e = new a();
        this.V = new h50(this, 3);
        reactApplicationContext.addLifecycleEventListener(this);
        eventEmitterImpl.registerFabricEventEmitter(fabricEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public final void a(ox4<?> ox4Var) {
        ox4Var.getClass();
        Iterator<by4> it = this.c.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().a(ox4Var);
        }
        if (ox4Var.internal_experimental_isSynchronous$ReactAndroid_release()) {
            Trace.beginSection(jpf.g("FabricEventDispatcher.dispatchSynchronous('" + ox4Var.getEventName() + "')"));
            try {
                UIManager uIManagerJ = dmc.j(this.a, 2, true);
                if (uIManagerJ instanceof f2f) {
                    ((f2f) uIManagerJ).receiveEvent(ox4Var.getSurfaceId(), ox4Var.getViewTag(), ox4Var.getEventName(), ox4Var.canCoalesce(), ox4Var.internal_getEventData$ReactAndroid_release(), ox4Var.internal_getEventCategory$ReactAndroid_release(), true);
                } else {
                    ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new IllegalStateException("Fabric UIManager expected to implement SynchronousEventReceiver."));
                }
            } finally {
                Trace.endSection();
            }
        } else {
            ox4Var.dispatchModern(this.b);
        }
        ox4Var.dispose();
        e();
    }

    public final void b() {
        UiThreadUtil.assertOnUiThread();
        if (!ie7.g0.useOptimizedEventBatchingOnAndroid()) {
            this.e.b = true;
        } else {
            this.f = false;
            W.removeCallbacks(this.V);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @sy3
    public final void c() {
        this.b.registerFabricEventEmitter(null);
        UiThreadUtil.runOnUiThread(new qb0(this, 2));
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public final void d(d9a d9aVar) {
        this.c.add(d9aVar);
    }

    public final void e() {
        if (ie7.g0.useOptimizedEventBatchingOnAndroid()) {
            if (this.f) {
                return;
            }
            this.f = true;
            W.postAtFrontOfQueue(this.V);
            return;
        }
        a aVar = this.e;
        if (aVar.a) {
            return;
        }
        if (!y55.this.a.isOnUiQueueThread()) {
            y55.this.a.runOnUiQueueThread(new i50(aVar, 5));
            return;
        }
        if (aVar.a) {
            return;
        }
        aVar.a = true;
        com.facebook.react.modules.core.a aVar2 = com.facebook.react.modules.core.a.f;
        if (aVar2 != null) {
            aVar2.b(a.EnumC0132a.c, y55.this.e);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        e();
        if (ie7.g0.useOptimizedEventBatchingOnAndroid()) {
            return;
        }
        this.e.b = false;
    }
}
