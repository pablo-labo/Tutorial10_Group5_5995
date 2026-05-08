package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class id6 implements god, y1h, l15 {
    public static final String Y = z39.f("GreedyScheduler");
    public Boolean X;
    public final Context a;
    public final w2h b;
    public final yd3 c;
    public final ss3 e;
    public boolean f;
    public final HashSet d = new HashSet();
    public final ure W = new ure();
    public final Object V = new Object();

    public id6(Context context, a aVar, uqf uqfVar, w2h w2hVar) {
        this.a = context;
        this.b = w2hVar;
        this.c = new yd3(uqfVar, this);
        this.e = new ss3(this, aVar.e);
    }

    @Override // defpackage.y1h
    public final void a(List<r3h> list) {
        Iterator<r3h> it = list.iterator();
        while (it.hasNext()) {
            r2h r2hVarD = yid.d(it.next());
            z39.d().a(Y, "Constraints not met: Cancelling work ID " + r2hVarD);
            tre treVarB = this.W.b(r2hVarD);
            if (treVarB != null) {
                w2h w2hVar = this.b;
                w2hVar.d.a(new xte(w2hVar, treVarB, false));
            }
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        this.W.b(r2hVar);
        synchronized (this.V) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r3h r3hVar = (r3h) it.next();
                    if (yid.d(r3hVar).equals(r2hVar)) {
                        z39.d().a(Y, "Stopping tracking for " + r2hVar);
                        this.d.remove(r3hVar);
                        this.c.d(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.god
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.X;
        w2h w2hVar = this.b;
        if (bool == null) {
            this.X = Boolean.valueOf(iob.a(this.a, w2hVar.b));
        }
        boolean zBooleanValue = this.X.booleanValue();
        String str2 = Y;
        if (!zBooleanValue) {
            z39.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f) {
            w2hVar.f.a(this);
            this.f = true;
        }
        z39.d().a(str2, "Cancelling work ID " + str);
        ss3 ss3Var = this.e;
        if (ss3Var != null && (runnable = (Runnable) ss3Var.c.remove(str)) != null) {
            ((Handler) ss3Var.b.a).removeCallbacks(runnable);
        }
        Iterator it = this.W.c(str).iterator();
        while (it.hasNext()) {
            w2hVar.d.a(new xte(w2hVar, (tre) it.next(), false));
        }
    }

    @Override // defpackage.god
    public final void d(r3h... r3hVarArr) {
        if (this.X == null) {
            this.X = Boolean.valueOf(iob.a(this.a, this.b.b));
        }
        if (!this.X.booleanValue()) {
            z39.d().e(Y, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f) {
            this.b.f.a(this);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int i = 0;
        for (r3h r3hVar : r3hVarArr) {
            if (!this.W.a(yid.d(r3hVar))) {
                long jA = r3hVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (r3hVar.b == s2h.a) {
                    if (jCurrentTimeMillis < jA) {
                        ss3 ss3Var = this.e;
                        if (ss3Var != null) {
                            md2 md2Var = ss3Var.b;
                            HashMap map = ss3Var.c;
                            Runnable runnable = (Runnable) map.remove(r3hVar.a);
                            if (runnable != null) {
                                ((Handler) md2Var.a).removeCallbacks(runnable);
                            }
                            rs3 rs3Var = new rs3(i, ss3Var, r3hVar);
                            map.put(r3hVar.a, rs3Var);
                            ((Handler) md2Var.a).postDelayed(rs3Var, r3hVar.a() - System.currentTimeMillis());
                        }
                    } else if (r3hVar.b()) {
                        jq2 jq2Var = r3hVar.j;
                        if (jq2Var.c) {
                            z39.d().a(Y, "Ignoring " + r3hVar + ". Requires device idle.");
                        } else if (jq2Var.h.isEmpty()) {
                            hashSet.add(r3hVar);
                            hashSet2.add(r3hVar.a);
                        } else {
                            z39.d().a(Y, "Ignoring " + r3hVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.W.a(yid.d(r3hVar))) {
                        z39.d().a(Y, "Starting work for " + r3hVar.a);
                        w2h w2hVar = this.b;
                        ure ureVar = this.W;
                        ureVar.getClass();
                        w2hVar.e(ureVar.d(yid.d(r3hVar)), null);
                    }
                }
            }
        }
        synchronized (this.V) {
            try {
                if (!hashSet.isEmpty()) {
                    z39.d().a(Y, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.d.addAll(hashSet);
                    this.c.d(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.god
    public final boolean e() {
        return false;
    }

    @Override // defpackage.y1h
    public final void f(List<r3h> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            r2h r2hVarD = yid.d((r3h) it.next());
            ure ureVar = this.W;
            if (!ureVar.a(r2hVarD)) {
                z39.d().a(Y, "Constraints met: Scheduling work ID " + r2hVarD);
                this.b.e(ureVar.d(r2hVarD), null);
            }
        }
    }
}
