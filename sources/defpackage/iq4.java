package defpackage;

import android.content.Context;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import defpackage.kpa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class iq4 {
    public final AtomicReference<Map<Integer, Boolean>> A;
    public final AtomicReference<Boolean> B;
    public Map<String, String> C;
    public long D;
    public long E;
    public final String a;
    public final boolean b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final boolean e;
    public final Context f;
    public final String g;
    public int h;
    public final TimeUnit i;
    public CookieJar j;
    public int k;
    public OkHttpClient l;
    public final p05 m;
    public final EnumSet<o5f> n;
    public final int o;
    public final int p;
    public int q;
    public long r;
    public long s;
    public rl6 t;
    public do1 u;
    public f6c v;
    public Integer w;
    public String x;
    public final AtomicReference<rfa> y;
    public boolean z;

    public iq4(p05 p05Var, Context context, String str, p8e p8eVar) {
        kpa kpaVar;
        context.getClass();
        String simpleName = iq4.class.getSimpleName();
        this.a = simpleName;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.i = kq4.j;
        this.k = kq4.h;
        this.m = p05Var == null ? new gid(context) : p05Var;
        EnumSet<o5f> enumSet = kq4.a;
        this.n = enumSet;
        this.o = kq4.c;
        this.p = kq4.d;
        this.q = kq4.b;
        this.r = kq4.e;
        this.s = kq4.f;
        this.t = rl6.b;
        this.u = do1.Single;
        f6c f6cVar = f6c.b;
        this.v = f6cVar;
        this.w = Integer.valueOf(kq4.g);
        AtomicReference<rfa> atomicReference = new AtomicReference<>();
        this.y = atomicReference;
        this.z = false;
        this.A = new AtomicReference<>();
        this.B = new AtomicReference<>(Boolean.valueOf(kq4.i));
        this.D = kq4.l;
        this.E = kq4.k;
        this.f = context;
        p8eVar.invoke(this);
        if (atomicReference.get() == null) {
            this.e = false;
            if (!wve.K(str, "http", false)) {
                str = (this.v == f6cVar ? "https://" : "http://").concat(str);
            }
            this.g = str;
            Integer num = this.w;
            if (num != null) {
                int iIntValue = num.intValue();
                kpa.a aVar = new kpa.a(str, context);
                rl6 rl6Var = this.t;
                rl6Var.getClass();
                aVar.c = rl6Var;
                enumSet.getClass();
                aVar.d = enumSet;
                aVar.e = iIntValue;
                aVar.h = this.x;
                aVar.f = this.l;
                aVar.g = this.j;
                aVar.i = this.z;
                aVar.j = this.C;
                kpaVar = new kpa(aVar);
            } else {
                kpaVar = null;
            }
            c(kpaVar);
        } else {
            this.e = true;
        }
        int i = this.k;
        if (i > 2) {
            if (i >= 2) {
                o15.b = i;
            } else {
                ScheduledExecutorService scheduledExecutorService = o15.a;
            }
        }
        this.b = true;
        c49.e(simpleName, "Emitter created successfully!", new Object[0]);
    }

    public final void a(rfa rfaVar) {
        String str;
        Context context;
        Context context2;
        boolean zBooleanValue;
        iq4 iq4Var = this;
        boolean z = iq4Var.d.get();
        AtomicBoolean atomicBoolean = iq4Var.c;
        String str2 = iq4Var.a;
        if (z) {
            c49.a(str2, "Emitter paused.", new Object[0]);
            atomicBoolean.compareAndSet(true, false);
            return;
        }
        Context context3 = iq4Var.f;
        if (!yjg.d(context3)) {
            c49.a(str2, "Emitter loop stopping: emitter offline.", new Object[0]);
            atomicBoolean.compareAndSet(true, false);
            return;
        }
        if (rfaVar == null) {
            c49.a(str2, "No networkConnection set.", new Object[0]);
            atomicBoolean.compareAndSet(true, false);
            return;
        }
        p05 p05Var = iq4Var.m;
        if (p05Var.size() <= 0) {
            int i = iq4Var.h;
            if (i >= iq4Var.p) {
                c49.a(str2, "Emitter loop stopping: empty limit reached.", new Object[0]);
                atomicBoolean.compareAndSet(true, false);
                return;
            }
            iq4Var.h = i + 1;
            c49.b(str2, "Emitter database empty: " + iq4Var.h, new Object[0]);
            try {
                iq4Var.i.sleep(iq4Var.o);
            } catch (InterruptedException e) {
                c49.b(str2, "Emitter thread sleep interrupted: " + e, new Object[0]);
            }
            a(rfaVar);
            return;
        }
        iq4Var.h = 0;
        List<lq4> listA = p05Var.a(iq4Var.q);
        rl6 rl6VarC = rfaVar.c();
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (rl6VarC == rl6.a) {
            Iterator<lq4> it = listA.iterator();
            while (it.hasNext()) {
                lq4 next = it.next();
                rqf rqfVar = next != null ? next.a : null;
                if (rqfVar != null) {
                    rqfVar.c("stm", strValueOf);
                    arrayList.add(new o3d(rqfVar, next.b, iq4Var.b(rqfVar, new ArrayList(), rl6VarC)));
                    str2 = str2;
                }
            }
            str = str2;
            context = context3;
        } else {
            str = str2;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (lq4 lq4Var : listA) {
                if (lq4Var != null) {
                    rqf rqfVar2 = lq4Var.a;
                    long j = lq4Var.b;
                    rqfVar2.c("stm", strValueOf);
                    if (iq4Var.b(rqfVar2, new ArrayList(), rl6VarC)) {
                        context2 = context3;
                        arrayList.add(new o3d(rqfVar2, j, true));
                    } else {
                        context2 = context3;
                        if (iq4Var.b(rqfVar2, arrayList3, rl6VarC)) {
                            arrayList.add(new o3d(arrayList3, arrayList2));
                            arrayList3 = new ArrayList();
                            arrayList2 = new ArrayList();
                            arrayList3.add(rqfVar2);
                            arrayList2.add(Long.valueOf(j));
                        } else {
                            arrayList3.add(rqfVar2);
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                } else {
                    context2 = context3;
                }
                context3 = context2;
            }
            context = context3;
            if (!arrayList3.isEmpty()) {
                arrayList.add(new o3d(arrayList3, arrayList2));
            }
        }
        ArrayList arrayListB = rfaVar.b(arrayList);
        String str3 = str;
        c49.e(str3, "Processing emitter results.", new Object[0]);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayListB.iterator();
        int size = 0;
        int size2 = 0;
        int size3 = 0;
        while (it2.hasNext()) {
            p4d p4dVar = (p4d) it2.next();
            int i2 = p4dVar.a;
            boolean z2 = 200 <= i2 && i2 < 300;
            List<Long> list = p4dVar.c;
            if (z2) {
                arrayList4.addAll(list);
                size3 += list.size();
            } else {
                Map<Integer, Boolean> map = iq4Var.A.get();
                Boolean bool = iq4Var.B.get();
                bool.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                Iterator it3 = it2;
                int i3 = p4dVar.a;
                if ((200 <= i3 && i3 < 300) || !zBooleanValue2 || p4dVar.b) {
                    zBooleanValue = false;
                } else if (map == null || !map.containsKey(Integer.valueOf(i2))) {
                    zBooleanValue = !new HashSet(u63.a0(Integer.valueOf(DataOkHttpUploader.HTTP_BAD_REQUEST), Integer.valueOf(DataOkHttpUploader.HTTP_UNAUTHORIZED), Integer.valueOf(DataOkHttpUploader.HTTP_FORBIDDEN), 410, 422)).contains(Integer.valueOf(i2));
                } else {
                    Boolean bool2 = map.get(Integer.valueOf(i2));
                    bool2.getClass();
                    zBooleanValue = bool2.booleanValue();
                }
                if (zBooleanValue) {
                    size += list.size();
                    c49.b(str3, "Request sending failed but we will retry later.", new Object[0]);
                } else {
                    size2 += list.size();
                    arrayList4.addAll(list);
                    c49.b(str3, String.format("Sending events to Collector failed with status %d. Events will be dropped.", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), new Object[0]);
                }
                iq4Var = this;
                it2 = it3;
            }
        }
        p05Var.d(arrayList4);
        c49.a(str3, "Success Count: %s", Integer.valueOf(size3));
        c49.a(str3, "Failure Count: %s", Integer.valueOf(size2 + size));
        if (size <= 0 || size3 != 0) {
            a(rfaVar);
            return;
        }
        if (yjg.d(context)) {
            c49.b(str3, "Ensure collector path is valid: %s", rfaVar.a());
        }
        c49.b(str3, "Emitter loop stopping: failures.", new Object[0]);
        atomicBoolean.compareAndSet(true, false);
    }

    public final boolean b(y6b y6bVar, ArrayList arrayList, rl6 rl6Var) {
        long j = rl6Var == rl6.a ? this.r : this.s;
        long jB = y6bVar.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jB += ((y6b) it.next()).b();
        }
        return jB + ((long) (!arrayList.isEmpty() ? arrayList.size() + 88 : 0)) > j;
    }

    public final void c(rfa rfaVar) {
        this.y.set(rfaVar);
    }

    public final void d() {
        c49.a(this.a, "Shutting down emitter.", new Object[0]);
        this.c.compareAndSet(true, false);
        ScheduledExecutorService scheduledExecutorService = o15.a;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.shutdown();
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to shutdown";
                }
                c49.b("Executor", message, new Object[0]);
            }
            o15.a = null;
        }
    }
}
