package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t4h implements Runnable {
    public static final String h0 = z39.f("WorkerWrapper");
    public final x2h V;
    public final androidx.work.a X;
    public final kob Y;
    public final WorkDatabase Z;
    public final Context a;
    public final s3h a0;
    public final String b;
    public final oy3 b0;
    public final List<god> c;
    public final ArrayList c0;
    public final WorkerParameters.a d;
    public String d0;
    public final r3h e;
    public c f;
    public volatile boolean g0;
    public c.a W = new c.a.C0078a();
    public final fbe<Boolean> e0 = new fbe<>();
    public final fbe<c.a> f0 = new fbe<>();

    public static class a {
        public final Context a;
        public final kob b;
        public final x2h c;
        public final androidx.work.a d;
        public final WorkDatabase e;
        public final r3h f;
        public List<god> g;
        public final ArrayList h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, x2h x2hVar, kob kobVar, WorkDatabase workDatabase, r3h r3hVar, ArrayList arrayList) {
            this.a = context.getApplicationContext();
            this.c = x2hVar;
            this.b = kobVar;
            this.d = aVar;
            this.e = workDatabase;
            this.f = r3hVar;
            this.h = arrayList;
        }
    }

    public t4h(a aVar) {
        this.a = aVar.a;
        this.V = aVar.c;
        this.Y = aVar.b;
        r3h r3hVar = aVar.f;
        this.e = r3hVar;
        this.b = r3hVar.a;
        this.c = aVar.g;
        this.d = aVar.i;
        this.f = null;
        this.X = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.Z = workDatabase;
        this.a0 = workDatabase.D();
        this.b0 = workDatabase.y();
        this.c0 = aVar.h;
    }

    public final void a(c.a aVar) throws Throwable {
        boolean z = aVar instanceof c.a.C0079c;
        r3h r3hVar = this.e;
        String str = h0;
        if (!z) {
            if (aVar instanceof c.a.b) {
                z39.d().e(str, "Worker result RETRY for " + this.d0);
                c();
                return;
            }
            z39.d().e(str, "Worker result FAILURE for " + this.d0);
            if (r3hVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        z39.d().e(str, "Worker result SUCCESS for " + this.d0);
        if (r3hVar.c()) {
            d();
            return;
        }
        oy3 oy3Var = this.b0;
        String str2 = this.b;
        s3h s3hVar = this.a0;
        WorkDatabase workDatabase = this.Z;
        workDatabase.c();
        try {
            s3hVar.e(s2h.c, str2);
            s3hVar.q(str2, ((c.a.C0079c) this.W).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : oy3Var.b(str2)) {
                if (s3hVar.h(str3) == s2h.e && oy3Var.c(str3)) {
                    z39.d().e(str, "Setting status to enqueued for " + str3);
                    s3hVar.e(s2h.a, str3);
                    s3hVar.r(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.w();
            workDatabase.s();
            e(false);
        } catch (Throwable th) {
            workDatabase.s();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean zH = h();
        String str = this.b;
        WorkDatabase workDatabase = this.Z;
        if (!zH) {
            workDatabase.c();
            try {
                s2h s2hVarH = this.a0.h(str);
                workDatabase.C().a(str);
                if (s2hVarH == null) {
                    e(false);
                } else if (s2hVarH == s2h.b) {
                    a(this.W);
                } else if (!s2hVarH.a()) {
                    c();
                }
                workDatabase.w();
                workDatabase.s();
            } catch (Throwable th) {
                workDatabase.s();
                throw th;
            }
        }
        List<god> list = this.c;
        if (list != null) {
            Iterator<god> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(str);
            }
            iod.a(this.X, workDatabase, list);
        }
    }

    public final void c() throws Throwable {
        String str = this.b;
        s3h s3hVar = this.a0;
        WorkDatabase workDatabase = this.Z;
        workDatabase.c();
        try {
            s3hVar.e(s2h.a, str);
            s3hVar.r(System.currentTimeMillis(), str);
            s3hVar.c(-1L, str);
            workDatabase.w();
        } finally {
            workDatabase.s();
            e(true);
        }
    }

    public final void d() throws Throwable {
        String str = this.b;
        s3h s3hVar = this.a0;
        WorkDatabase workDatabase = this.Z;
        workDatabase.c();
        try {
            s3hVar.r(System.currentTimeMillis(), str);
            s3hVar.e(s2h.a, str);
            s3hVar.u(str);
            s3hVar.b(str);
            s3hVar.c(-1L, str);
            workDatabase.w();
        } finally {
            workDatabase.s();
            e(false);
        }
    }

    public final void e(boolean z) throws Throwable {
        boolean zContainsKey;
        this.Z.c();
        try {
            if (!this.Z.D().t()) {
                rya.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.a0.e(s2h.a, this.b);
                this.a0.c(-1L, this.b);
            }
            if (this.e != null && this.f != null) {
                kob kobVar = this.Y;
                String str = this.b;
                synchronized (kobVar.a0) {
                    zContainsKey = kobVar.f.containsKey(str);
                }
                if (zContainsKey) {
                    kob kobVar2 = this.Y;
                    String str2 = this.b;
                    synchronized (kobVar2.a0) {
                        kobVar2.f.remove(str2);
                        kobVar2.i();
                    }
                }
            }
            this.Z.w();
            this.Z.s();
            this.e0.i(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.Z.s();
            throw th;
        }
    }

    public final void f() throws Throwable {
        s3h s3hVar = this.a0;
        String str = this.b;
        s2h s2hVarH = s3hVar.h(str);
        s2h s2hVar = s2h.b;
        String str2 = h0;
        if (s2hVarH == s2hVar) {
            z39.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        z39.d().a(str2, "Status for " + str + " is " + s2hVarH + " ; not doing any work");
        e(false);
    }

    public final void g() throws Throwable {
        String str = this.b;
        WorkDatabase workDatabase = this.Z;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                s3h s3hVar = this.a0;
                if (zIsEmpty) {
                    s3hVar.q(str, ((c.a.C0078a) this.W).a);
                    workDatabase.w();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (s3hVar.h(str2) != s2h.f) {
                        s3hVar.e(s2h.d, str2);
                    }
                    linkedList.addAll(this.b0.b(str2));
                }
            }
        } finally {
            workDatabase.s();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.g0) {
            return false;
        }
        z39.d().a(h0, "Work interrupted for " + this.d0);
        if (this.a0.h(this.b) == null) {
            e(false);
            return true;
        }
        e(!r0.a());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:14:0x0050, B:17:0x005c, B:22:0x0081, B:24:0x0087, B:35:0x00c0, B:30:0x0092, B:32:0x009e), top: B:78:0x0050 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4h.run():void");
    }
}
