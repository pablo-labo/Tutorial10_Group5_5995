package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ee3;
import defpackage.jfe;
import defpackage.l5;
import defpackage.r59;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final jfe<RecyclerView.b0, a> a = new jfe<>();
    public final r59<RecyclerView.b0> b = new r59<>();

    public static class a {
        public static final Pools$SimplePool d = new Pools$SimplePool(20);
        public int a;
        public RecyclerView.j.b b;
        public RecyclerView.j.b c;

        public static a a() {
            a aVar = (a) d.acquire();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.b0 b0Var, RecyclerView.j.b bVar) {
        jfe<RecyclerView.b0, a> jfeVar = this.a;
        a aVarA = jfeVar.get(b0Var);
        if (aVarA == null) {
            aVarA = a.a();
            jfeVar.put(b0Var, aVarA);
        }
        aVarA.c = bVar;
        aVarA.a |= 8;
    }

    public final RecyclerView.j.b b(RecyclerView.b0 b0Var, int i) {
        a aVarL;
        RecyclerView.j.b bVar;
        jfe<RecyclerView.b0, a> jfeVar = this.a;
        int iF = jfeVar.f(b0Var);
        if (iF >= 0 && (aVarL = jfeVar.l(iF)) != null) {
            int i2 = aVarL.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarL.a = i3;
                if (i == 4) {
                    bVar = aVarL.b;
                } else if (i == 8) {
                    bVar = aVarL.c;
                } else {
                    l5.q("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    jfeVar.j(iF);
                    aVarL.a = 0;
                    aVarL.b = null;
                    aVarL.c = null;
                    a.d.a(aVarL);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.b0 b0Var) {
        a aVar = this.a.get(b0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public final void d(RecyclerView.b0 b0Var) {
        r59<RecyclerView.b0> r59Var = this.b;
        int iJ = r59Var.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (b0Var == r59Var.k(iJ)) {
                Object[] objArr = r59Var.c;
                Object obj = objArr[iJ];
                Object obj2 = ee3.e;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    r59Var.a = true;
                }
            } else {
                iJ--;
            }
        }
        a aVarRemove = this.a.remove(b0Var);
        if (aVarRemove != null) {
            aVarRemove.a = 0;
            aVarRemove.b = null;
            aVarRemove.c = null;
            a.d.a(aVarRemove);
        }
    }
}
