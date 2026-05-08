package androidx.compose.runtime;

import androidx.compose.runtime.b;
import defpackage.bz3;
import defpackage.j6g;
import defpackage.jm7;
import defpackage.o3a;
import defpackage.usc;
import defpackage.wsc;
import defpackage.x20;
import defpackage.z3a;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements usc {
    public wsc a;
    public int b;
    public x20 c;
    public Function2<? super b, ? super Integer, j6g> d;
    public int e;
    public o3a<Object> f;
    public z3a<bz3<?>, Object> g;

    public static final class a {
        public static void a(n nVar, List list, wsc wscVar) {
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int iC = nVar.c((x20) list.get(i));
                int iO = nVar.O(nVar.r(iC), nVar.b);
                Object obj = iO < nVar.g(nVar.r(iC + 1), nVar.b) ? nVar.c[nVar.h(iO)] : b.a.a;
                i iVar = obj instanceof i ? (i) obj : null;
                if (iVar != null) {
                    iVar.a = wscVar;
                }
            }
        }
    }

    public i(wsc wscVar) {
        this.a = wscVar;
    }

    public final boolean a() {
        if (this.a != null) {
            x20 x20Var = this.c;
            if (x20Var != null ? x20Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final jm7 b(Object obj) {
        jm7 jm7VarP;
        wsc wscVar = this.a;
        return (wscVar == null || (jm7VarP = wscVar.p(this, obj)) == null) ? jm7.a : jm7VarP;
    }

    public final void c() {
        wsc wscVar = this.a;
        if (wscVar != null) {
            wscVar.d();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(Function2<? super b, ? super Integer, j6g> function2) {
        this.d = function2;
    }

    @Override // defpackage.usc
    public final void invalidate() {
        wsc wscVar = this.a;
        if (wscVar != null) {
            wscVar.p(this, null);
        }
    }
}
