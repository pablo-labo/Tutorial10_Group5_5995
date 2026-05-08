package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.efd;
import defpackage.tze;
import defpackage.xa1;
import defpackage.xed;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ved extends xa1 {
    public final qf3 c;
    public final efd d;
    public final List<xed.b> e;
    public final qo2 f;
    public sze g;

    public static final class a extends efd {
        @Override // defpackage.efd
        public final void a(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final void b(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final void c(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final void d(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final void e(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final void f(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.efd
        public final efd.a g(zhd zhdVar) {
            zhdVar.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    public final class b extends tze.a {
        public b(int i) {
            super(i);
        }

        @Override // tze.a
        public final void c(at5 at5Var) {
            ved.this.f(new qze(at5Var));
        }

        @Override // tze.a
        public final void d(at5 at5Var, int i, int i2) {
            f(at5Var, i, i2);
        }

        @Override // tze.a
        public final void e(at5 at5Var) throws Throwable {
            qze qzeVar = new qze(at5Var);
            ved vedVar = ved.this;
            vedVar.h(qzeVar);
            vedVar.g = at5Var;
        }

        @Override // tze.a
        public final void f(at5 at5Var, int i, int i2) {
            ved.this.g(new qze(at5Var), i, i2);
        }
    }

    public ved(qf3 qf3Var, bt btVar) {
        xed.d dVar = qf3Var.g;
        this.c = qf3Var;
        this.d = new a(-1, "", "");
        List<xed.b> list = qf3Var.e;
        zr4 zr4Var = zr4.a;
        this.e = list == null ? zr4Var : list;
        ArrayList arrayListG1 = z92.g1(new wed(new cj(this, 10)), list == null ? zr4Var : list);
        Context context = qf3Var.a;
        String str = qf3Var.b;
        tze.c cVar = qf3Var.c;
        xed.e eVar = qf3Var.d;
        boolean z = qf3Var.f;
        Executor executor = qf3Var.h;
        Executor executor2 = qf3Var.i;
        Intent intent = qf3Var.j;
        boolean z2 = qf3Var.k;
        boolean z3 = qf3Var.l;
        Set<Integer> set = qf3Var.m;
        String str2 = qf3Var.n;
        File file = qf3Var.o;
        Callable<InputStream> callable = qf3Var.p;
        List<Object> list2 = qf3Var.q;
        List<ak2> list3 = qf3Var.r;
        boolean z4 = qf3Var.s;
        aid aidVar = qf3Var.t;
        v03 v03Var = qf3Var.u;
        context.getClass();
        eVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = new rze(new hc0((tze) btVar.invoke(new qf3(context, str, cVar, eVar, arrayListG1, z, dVar, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, aidVar, v03Var))));
        boolean z5 = dVar == xed.d.c;
        tze tzeVarJ = j();
        if (tzeVarJ != null) {
            tzeVarJ.setWriteAheadLoggingEnabled(z5);
        }
    }

    @Override // defpackage.xa1
    public final List<xed.b> c() {
        return this.e;
    }

    @Override // defpackage.xa1
    public final qf3 d() {
        return this.c;
    }

    @Override // defpackage.xa1
    public final efd e() {
        return this.d;
    }

    public final tze j() {
        qo2 qo2Var = this.f;
        rze rzeVar = qo2Var instanceof rze ? (rze) qo2Var : null;
        if (rzeVar != null) {
            return (tze) rzeVar.a.b;
        }
        return null;
    }

    public ved(qf3 qf3Var, efd efdVar) {
        int i;
        wo2 wo2Var;
        xed.d dVar = qf3Var.g;
        tze.c cVar = qf3Var.c;
        String str = qf3Var.b;
        this.c = qf3Var;
        this.d = efdVar;
        List<xed.b> list = qf3Var.e;
        this.e = list == null ? zr4.a : list;
        aid aidVar = qf3Var.t;
        if (aidVar != null) {
            if (str == null) {
                wo2Var = new wo2(new xa1.a(this, aidVar));
            } else {
                xa1.a aVar = new xa1.a(this, aidVar);
                int iOrdinal = dVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        m6.l(dVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = dVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    m6.l(dVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                wo2Var = new wo2(aVar, str, i);
            }
            this.f = wo2Var;
        } else if (cVar != null) {
            Context context = qf3Var.a;
            context.getClass();
            this.f = new rze(new hc0(cVar.c(new tze.b(context, str, new b(efdVar.a), false, false))));
        } else {
            l5.q("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        boolean z = dVar == xed.d.c;
        tze tzeVarJ = j();
        if (tzeVarJ != null) {
            tzeVarJ.setWriteAheadLoggingEnabled(z);
        }
    }
}
