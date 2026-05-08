package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sqe {
    public final HashMap a = new HashMap();

    public final void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
            this.a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            vs4 vs4Var = (vs4) arrayList.get(i);
            if (vs4Var != null) {
                vs4Var.close();
            }
        }
    }

    public final synchronized vs4 b(ot1 ot1Var) {
        ot1Var.getClass();
        vs4 vs4VarA = (vs4) this.a.get(ot1Var);
        if (vs4VarA != null) {
            synchronized (vs4VarA) {
                if (!vs4.W(vs4VarA)) {
                    this.a.remove(ot1Var);
                    s55.l(sqe.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(vs4VarA)), ot1Var.a(), Integer.valueOf(System.identityHashCode(ot1Var)));
                    return null;
                }
                vs4VarA = vs4.a(vs4VarA);
            }
        }
        return vs4VarA;
    }

    public final synchronized void c() {
        s55.i(sqe.class, Integer.valueOf(this.a.size()), "Count = %d");
    }

    public final void d(ot1 ot1Var) {
        vs4 vs4Var;
        ot1Var.getClass();
        synchronized (this) {
            vs4Var = (vs4) this.a.remove(ot1Var);
        }
        if (vs4Var == null) {
            return;
        }
        try {
            vs4Var.Q();
        } finally {
            vs4Var.close();
        }
    }

    public final synchronized void e(ot1 ot1Var, vs4 vs4Var) {
        ot1Var.getClass();
        vs4Var.getClass();
        web.e(Boolean.valueOf(vs4.W(vs4Var)));
        vs4 vs4Var2 = (vs4) this.a.get(ot1Var);
        if (vs4Var2 == null) {
            return;
        }
        n82 n82VarV = n82.v(vs4Var2.a);
        n82 n82VarV2 = n82.v(vs4Var.a);
        if (n82VarV != null && n82VarV2 != null) {
            try {
                if (n82VarV.P() == n82VarV2.P()) {
                    this.a.remove(ot1Var);
                    n82VarV2.close();
                    n82VarV.close();
                    vs4Var2.close();
                    c();
                    return;
                }
            } catch (Throwable th) {
                n82VarV2.close();
                n82VarV.close();
                vs4Var2.close();
                throw th;
            }
        }
        n82.G(n82VarV2);
        n82.G(n82VarV);
        vs4Var2.close();
    }
}
