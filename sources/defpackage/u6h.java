package defpackage;

import defpackage.w5b;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class u6h extends pa5 {
    public static final w5b f;
    public final w5b c;
    public final pa5 d;
    public final LinkedHashMap e;

    static {
        String str = w5b.b;
        f = w5b.a.a("/");
    }

    public u6h(w5b w5bVar, pa5 pa5Var, LinkedHashMap linkedHashMap) {
        pa5Var.getClass();
        this.c = w5bVar;
        this.d = pa5Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.pa5
    public final fie a(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pa5
    public final void b(w5b w5bVar, w5b w5bVar2) throws IOException {
        w5bVar.getClass();
        w5bVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pa5
    public final void d(w5b w5bVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pa5
    public final void e(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pa5
    public final List<w5b> h(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        t6h t6hVar = (t6h) this.e.get(i.b(w5bVar2, w5bVar, true));
        if (t6hVar != null) {
            return z92.z1(t6hVar.q);
        }
        z3.p(w5bVar, "not a directory: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    @Override // defpackage.pa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.da5 j(defpackage.w5b r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6h.j(w5b):da5");
    }

    @Override // defpackage.pa5
    public final p95 k(w5b w5bVar) {
        w5bVar.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.pa5
    public final fie l(w5b w5bVar, boolean z) throws IOException {
        w5bVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pa5
    public final pne m(w5b w5bVar) throws Throwable {
        Throwable th;
        uqc uqcVar;
        w5bVar.getClass();
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        t6h t6hVar = (t6h) this.e.get(i.b(w5bVar2, w5bVar, true));
        if (t6hVar == null) {
            n6.b(w5bVar, "no such file: ");
            return null;
        }
        long j = t6hVar.f;
        p95 p95VarK = this.d.k(this.c);
        try {
            uqcVar = new uqc(p95VarK.s(t6hVar.h));
            try {
                p95VarK.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (p95VarK != null) {
                try {
                    p95VarK.close();
                } catch (Throwable th4) {
                    boa.h(th3, th4);
                }
            }
            th = th3;
            uqcVar = null;
        }
        if (th != null) {
            throw th;
        }
        uqcVar.getClass();
        y6h.f(uqcVar, null);
        if (t6hVar.g == 0) {
            return new ng5(uqcVar, j, true);
        }
        return new ng5(new mc7(new uqc(new ng5(uqcVar, t6hVar.e, true)), new Inflater(true)), j, false);
    }
}
