package defpackage;

import android.os.Trace;
import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventEmitterImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ay4 implements EventDispatcher, LifecycleEventListener {
    public static final ol2 f0 = new ol2(1);
    public final ReactApplicationContext a;
    public int b0;
    public final EventEmitterImpl c0;
    public short d0;
    public volatile boolean e0;
    public final Object b = new Object();
    public final Object c = new Object();
    public final LongSparseArray<Integer> d = new LongSparseArray<>();
    public final LinkedHashMap e = new LinkedHashMap();
    public final a f = new a();
    public final ArrayList<ox4<?>> V = new ArrayList<>();
    public final CopyOnWriteArrayList<by4> W = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<le1> X = new CopyOnWriteArrayList<>();
    public final b Y = new b();
    public final AtomicInteger Z = new AtomicInteger();
    public ox4<?>[] a0 = new ox4[16];

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ox4<?>[] ox4VarArr;
            Trace.beginSection(jpf.g("DispatchEventsRunnable"));
            try {
                jpf.c(ay4.this.Z.getAndIncrement(), "ScheduleDispatchFrameCallback");
                ay4.this.e0 = false;
                ay4 ay4Var = ay4.this;
                synchronized (ay4Var.c) {
                    try {
                        int i = ay4Var.b0;
                        if (i > 0) {
                            if (i > 1) {
                                Arrays.sort(ay4Var.a0, 0, i, ay4.f0);
                            }
                            int i2 = ay4Var.b0;
                            int i3 = 0;
                            while (true) {
                                ox4VarArr = ay4Var.a0;
                                if (i3 >= i2) {
                                    break;
                                }
                                ox4<?> ox4Var = ox4VarArr[i3];
                                if (ox4Var != null) {
                                    String eventName = ox4Var.getEventName();
                                    int uniqueID = ox4Var.getUniqueID();
                                    eventName.getClass();
                                    jpf.c(uniqueID, eventName);
                                    ox4Var.dispatchModern(ay4Var.c0);
                                    ox4Var.dispose();
                                }
                                i3++;
                            }
                            Arrays.fill(ox4VarArr, 0, ay4Var.b0, (Object) null);
                            ay4Var.b0 = 0;
                            ay4Var.d.clear();
                        }
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<le1> it = ay4.this.X.iterator();
                it.getClass();
                while (it.hasNext()) {
                    it.next().a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final class b implements Choreographer.FrameCallback {
        public volatile boolean a;
        public boolean b;

        public b() {
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
                aVar.b(a.EnumC0132a.c, ay4.this.Y);
            }
            Trace.beginSection(jpf.g("ScheduleDispatchFrameCallback"));
            try {
                ay4.b(ay4.this);
                if (!ay4.this.e0) {
                    ay4.this.e0 = true;
                    jpf.a(ay4.this.Z.get(), "ScheduleDispatchFrameCallback");
                    ay4 ay4Var = ay4.this;
                    ay4Var.a.runOnJSQueueThread(ay4Var.f);
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public ay4(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.c0 = new EventEmitterImpl(reactApplicationContext);
    }

    public static final void b(ay4 ay4Var) {
        short sShortValue;
        synchronized (ay4Var.b) {
            synchronized (ay4Var.c) {
                try {
                    int size = ay4Var.V.size();
                    for (int i = 0; i < size; i++) {
                        ox4<?> ox4Var = ay4Var.V.get(i);
                        ox4Var.getClass();
                        ox4<?> ox4Var2 = ox4Var;
                        if (ox4Var2.canCoalesce()) {
                            int viewTag = ox4Var2.getViewTag();
                            String eventName = ox4Var2.getEventName();
                            short coalescingKey = ox4Var2.getCoalescingKey();
                            LinkedHashMap linkedHashMap = ay4Var.e;
                            Short sh = (Short) linkedHashMap.get(eventName);
                            if (sh != null) {
                                sShortValue = sh.shortValue();
                            } else {
                                short s = ay4Var.d0;
                                ay4Var.d0 = (short) (s + 1);
                                linkedHashMap.put(eventName, Short.valueOf(s));
                                sShortValue = s;
                            }
                            long j = ((((long) sShortValue) & 65535) << 32) | ((long) viewTag) | ((((long) coalescingKey) & 65535) << 48);
                            Integer num = ay4Var.d.get(j);
                            ox4<?> ox4Var3 = null;
                            if (num == null) {
                                ay4Var.d.put(j, Integer.valueOf(ay4Var.b0));
                            } else {
                                ox4<?> ox4Var4 = ay4Var.a0[num.intValue()];
                                if (ox4Var4 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                ox4<?> ox4VarCoalesce = ox4Var2.coalesce(ox4Var4);
                                if (ox4VarCoalesce != ox4Var4) {
                                    ay4Var.d.put(j, Integer.valueOf(ay4Var.b0));
                                    ay4Var.a0[num.intValue()] = null;
                                    ox4Var3 = ox4Var4;
                                    ox4Var2 = ox4VarCoalesce;
                                } else {
                                    ox4Var3 = ox4Var2;
                                    ox4Var2 = null;
                                }
                            }
                            if (ox4Var2 != null) {
                                ay4Var.e(ox4Var2);
                            }
                            if (ox4Var3 != null) {
                                ox4Var3.dispose();
                            }
                        } else {
                            ay4Var.e(ox4Var2);
                        }
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ay4Var.V.clear();
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public final void a(ox4<?> ox4Var) {
        ox4Var.getClass();
        if (!ox4Var.getIsInitialized()) {
            l5.q("Dispatched event hasn't been initialized");
            return;
        }
        Iterator<by4> it = this.W.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().a(ox4Var);
        }
        synchronized (this.b) {
            this.V.add(ox4Var);
            String eventName = ox4Var.getEventName();
            int uniqueID = ox4Var.getUniqueID();
            eventName.getClass();
            jpf.a(uniqueID, eventName);
            j6g j6gVar = j6g.a;
        }
        f();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @sy3
    public final void c() {
        UiThreadUtil.runOnUiThread(new ky1(this, 5));
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public final void d(d9a d9aVar) {
        this.W.add(d9aVar);
    }

    public final void e(ox4<?> ox4Var) {
        int i = this.b0;
        ox4<?>[] ox4VarArr = this.a0;
        if (i == ox4VarArr.length) {
            this.a0 = (ox4[]) Arrays.copyOf(ox4VarArr, ox4VarArr.length * 2);
        }
        ox4<?>[] ox4VarArr2 = this.a0;
        int i2 = this.b0;
        this.b0 = i2 + 1;
        ox4VarArr2[i2] = ox4Var;
    }

    public final void f() {
        b bVar = this.Y;
        if (bVar.a) {
            return;
        }
        if (!ay4.this.a.isOnUiQueueThread()) {
            ay4.this.a.runOnUiQueueThread(new my1(bVar, 6));
            return;
        }
        if (bVar.a) {
            return;
        }
        bVar.a = true;
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar != null) {
            aVar.b(a.EnumC0132a.c, ay4.this.Y);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.Y.b = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.Y.b = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        f();
    }
}
