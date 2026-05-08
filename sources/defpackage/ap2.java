package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ap2 implements zhd, z4a {
    public final zhd a;
    public final z4a b;
    public v03 c;
    public Throwable d;

    public ap2(zhd zhdVar) {
        a5a a5aVarI = pnb.i();
        zhdVar.getClass();
        this.a = zhdVar;
        this.b = a5aVarI;
    }

    @Override // defpackage.zhd
    public final iid Q1(String str) {
        str.getClass();
        return this.a.Q1(str);
    }

    public final void a(StringBuilder sb) {
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        v03 v03Var = this.c;
        if (v03Var != null) {
            sb.append("\t\tCoroutine: " + v03Var);
            sb.append('\n');
        }
        Throwable th = this.d;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = z92.J0(zve.X(boa.O(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.a.close();
    }

    @Override // defpackage.z4a
    public final Object h(lu2 lu2Var) {
        return this.b.h(lu2Var);
    }

    @Override // defpackage.z4a
    public final void p(Object obj) {
        this.b.p(null);
    }

    public final String toString() {
        return this.a.toString();
    }
}
