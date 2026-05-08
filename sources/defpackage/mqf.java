package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.cob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class mqf {
    public boolean A;
    public boolean B;
    public boolean C;
    public lw5 D;
    public final kqf E;
    public final lqf F;
    public final jqf G;
    public final iqf H;
    public final hqf I;
    public final String a;
    public final boolean b;
    public final Context c;
    public final ose d;
    public final String e;
    public final AtomicBoolean f;
    public final ebb g;
    public final iq4 h;
    public cxe i;
    public u8e j;
    public boolean k;
    public y34 l;
    public j39 m;
    public long n;
    public long o;
    public boolean p;
    public final TimeUnit q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public final Runnable[] y;
    public boolean z;

    public mqf(iq4 iq4Var, String str, List list, gbb gbbVar, Context context, q8e q8eVar) {
        iqf iqfVar;
        hqf hqfVar;
        context.getClass();
        this.a = str;
        this.d = new ose();
        this.e = "andr-6.2.0";
        this.f = new AtomicBoolean(true);
        this.g = new ebb(list, gbbVar == null ? new gbb() : gbbVar, context);
        this.h = iq4Var;
        this.k = true;
        this.l = y34.Mobile;
        j39 j39Var = j39.OFF;
        this.m = j39Var;
        this.n = 1800L;
        this.o = 1800L;
        int i = 0;
        this.p = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.q = timeUnit;
        this.r = true;
        this.s = false;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = false;
        Runnable[] runnableArr = {null, null, null, null};
        this.y = runnableArr;
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = true;
        kqf kqfVar = new kqf(this);
        this.E = kqfVar;
        lqf lqfVar = new lqf(this);
        this.F = lqfVar;
        jqf jqfVar = new jqf(this);
        this.G = jqfVar;
        iqf iqfVar2 = new iqf(this);
        this.H = iqfVar2;
        hqf hqfVar2 = new hqf(this);
        this.I = hqfVar2;
        this.c = context;
        q8eVar.invoke(this);
        o15.a(false, iq4Var.a, new gg2(iq4Var, 3));
        String str2 = this.x;
        if (str2 != null) {
            String strE = new pxc("[^A-Za-z0-9.-]").e(str2, "");
            if (strE.length() > 0) {
                String str3 = this.e + ' ' + strE;
                if (!this.b) {
                    this.e = str3;
                }
            }
        }
        if (this.s && this.m == j39Var) {
            j39 j39Var2 = j39.ERROR;
            if (!this.b) {
                this.m = j39Var2;
            }
        }
        j39 j39Var3 = this.m;
        c49 c49Var = c49.a;
        j39Var3.getClass();
        c49.c = j39Var3.a();
        if (this.z) {
            hqfVar = hqfVar2;
            iqfVar = iqfVar2;
            this.j = u8e.q.a(context, this.n, this.o, timeUnit, runnableArr, this.p);
        } else {
            iqfVar = iqfVar2;
            hqfVar = hqfVar2;
        }
        lla.a("SnowplowTrackerDiagnostic", iqfVar);
        lla.a("SnowplowScreenView", lqfVar);
        lla.a("SnowplowLifecycleTracking", kqfVar);
        lla.a("SnowplowInstallTracking", jqfVar);
        lla.a("SnowplowCrashReporting", hqfVar);
        if (this.r && !(Thread.getDefaultUncaughtExceptionHandler() instanceof z05)) {
            Thread.setDefaultUncaughtExceptionHandler(new z05());
        }
        if (this.u) {
            o15.a(false, "zn0", new xn0(context, i));
        }
        if (this.v) {
            synchronized (h8.b) {
                try {
                    if (h8.c == null) {
                        h8 h8Var = new h8();
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application != null) {
                            application.registerActivityLifecycleCallbacks(h8Var);
                        }
                        h8.c = h8Var;
                    }
                    h8.c.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.t) {
            synchronized (cob.a) {
                if (cob.b == cob.b.a) {
                    cob.b = cob.b.b;
                    new Handler(context.getMainLooper()).post(new bob());
                }
            }
            a(new hw8());
        }
        u8e u8eVar = this.j;
        if (u8eVar != null) {
            u8eVar.d(false);
            c49.a("mqf", "Session checking has been resumed.", new Object[0]);
        }
        this.b = true;
        c49.e("mqf", "Tracker created successfully.", new Object[0]);
    }

    public final void a(nse nseVar) {
        ose oseVar = this.d;
        synchronized (oseVar) {
            try {
                nse nseVar2 = oseVar.a.get(nseVar.a());
                if (nseVar2 != null) {
                    if (nseVar.getClass().equals(nseVar2.getClass())) {
                        return;
                    } else {
                        oseVar.d(nseVar.a());
                    }
                }
                oseVar.a.put(nseVar.a(), nseVar);
                oseVar.b.put(nseVar, nseVar.a());
                ose.a(oseVar.c, nseVar.e(), nseVar);
                ose.a(oseVar.d, nseVar.g(), nseVar);
                ose.a(oseVar.e, nseVar.h(), nseVar);
                ose.a(oseVar.f, zr4.a, nseVar);
                ose.a(oseVar.g, nseVar.b(), nseVar);
                ose.a(oseVar.h, nseVar.f(), nseVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        u8e u8eVar = this.j;
        if (u8eVar != null) {
            u8eVar.d(true);
            c49.a("mqf", "Session checking has been paused.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    public final UUID c(rx4 rx4Var) {
        LinkedList linkedList;
        List<rx4> listD;
        if (!this.f.get()) {
            return null;
        }
        ose oseVar = this.d;
        synchronized (oseVar) {
            try {
                linkedList = new LinkedList();
                if (rx4Var instanceof e4) {
                    LinkedList<nse> linkedList2 = new LinkedList();
                    List<nse> list = oseVar.h.get(((e4) rx4Var).d());
                    if (list != null) {
                        linkedList2.addAll(list);
                    }
                    List<nse> list2 = oseVar.h.get("*");
                    if (list2 != null) {
                        linkedList2.addAll(list2);
                    }
                    for (nse nseVar : linkedList2) {
                        if (oseVar.b.get(nseVar) != null && (listD = nseVar.d(rx4Var)) != null) {
                            linkedList.addAll(listD);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList<rx4> arrayListH1 = z92.h1(linkedList, u63.Z(rx4Var));
        Iterator it = arrayListH1.iterator();
        while (it.hasNext()) {
            ((rx4) it.next()).c(this);
        }
        luc lucVar = new luc();
        synchronized (this) {
            try {
                ?? arrayList = new ArrayList(t92.r0(arrayListH1, 10));
                for (rx4 rx4Var2 : arrayListH1) {
                    qqf qqfVar = new qqf(rx4Var2, this.d.e(rx4Var2));
                    d(qqfVar);
                    arrayList.add(new Pair(rx4Var2, qqfVar));
                }
                lucVar.element = arrayList;
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        o15.a(!(rx4Var instanceof pqf), "mqf", new o4(4, lucVar, this));
        return ((qqf) ((Pair) z92.Y0((List) lucVar.element)).e()).f;
    }

    public final void d(qqf qqfVar) {
        v72 v72Var;
        yq2<y9e> yq2Var;
        if (qqfVar.j || !this.z) {
            return;
        }
        String string = qqfVar.f.toString();
        string.getClass();
        long j = qqfVar.g;
        u8e u8eVar = this.j;
        if (u8eVar == null) {
            c49.d("mqf", "Session not ready or method getHasLoadedFromFile returned false with eventId: %s", string);
            return;
        }
        boolean z = this.w;
        synchronized (u8eVar) {
            try {
                c49.e("u8e", "Getting session context...", new Object[0]);
                v72Var = null;
                if (u8eVar.h) {
                    if (!u8eVar.g.get()) {
                        y9e y9eVar = u8eVar.e;
                        Long l = y9eVar != null ? y9eVar.i : null;
                        if (l != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j2 = u8eVar.f.get() ? u8eVar.j : u8eVar.i;
                            if (jCurrentTimeMillis < l.longValue() || jCurrentTimeMillis - l.longValue() > j2) {
                            }
                        }
                    }
                    c49.a("u8e", "Update session information.", new Object[0]);
                    u8eVar.e(j, string);
                    y9e y9eVar2 = u8eVar.e;
                    if (y9eVar2 != null && (yq2Var = u8eVar.o) != null) {
                        Thread thread = new Thread(new jy0(4, yq2Var, y9eVar2));
                        thread.setDaemon(true);
                        thread.start();
                    }
                    if (u8eVar.f.get()) {
                        u8e.a(u8eVar.n);
                    } else {
                        u8e.a(u8eVar.m);
                    }
                    if (!u8eVar.a) {
                        u8eVar.c();
                    }
                }
                y9e y9eVar3 = u8eVar.e;
                if (y9eVar3 == null) {
                    c49.e("u8e", "Session state not present", new Object[0]);
                } else {
                    boolean z2 = u8eVar.h;
                    Integer num = y9eVar3.h;
                    y9eVar3.h = Integer.valueOf((num != null ? num.intValue() : 0) + 1);
                    if (z2) {
                        y9eVar3.i = Long.valueOf(System.currentTimeMillis());
                    }
                    if (u8eVar.a) {
                        u8eVar.c();
                    }
                    HashMap map = new HashMap(y9eVar3.a());
                    if (z) {
                        map.put("userId", "00000000-0000-0000-0000-000000000000");
                        map.put("previousSessionId", null);
                    }
                    v72Var = new v72(map, "iglu:com.snowplowanalytics.snowplow/client_session/jsonschema/1-0-2");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v72Var != null) {
            ((ArrayList) qqfVar.a()).add(v72Var);
        }
    }
}
