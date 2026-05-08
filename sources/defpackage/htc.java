package defpackage;

import defpackage.la7;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class htc<T extends la7> {
    public final g a;
    public final g.f[] b;
    public final boolean[] c;
    public final ax5 d;

    public htc(g gVar, ax5 ax5Var) {
        this.a = gVar;
        this.d = ax5Var;
        g.f[] fVarArr = (g.f[]) gVar.C().toArray(new g.f[0]);
        this.b = fVarArr;
        this.c = new boolean[fVarArr.length];
    }

    public static void b(g.f fVar, Object obj) {
        g gVar;
        g.u uVarK;
        if (obj == null && (uVarK = (gVar = fVar.d).K()) != g.u.NULL) {
            if (uVarK == g.u.UNION) {
                Iterator<g> it = gVar.L().iterator();
                while (it.hasNext()) {
                    if (it.next().K() == g.u.NULL) {
                        return;
                    }
                }
            }
            if (tt7.b(fVar.f, fVar.d) != null) {
                return;
            }
            r40.m(l5.m("Field ", String.valueOf(fVar), " does not accept null values"));
        }
    }

    public final Object a(g.f fVar) {
        g gVar = fVar.d;
        ax5 ax5Var = this.d;
        return ax5Var.g(ax5Var.j(fVar), gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        htc htcVar = (htc) obj;
        if (!Arrays.equals(this.c, htcVar.c)) {
            return false;
        }
        g gVar = htcVar.a;
        g gVar2 = this.a;
        return gVar2 == null ? gVar == null : gVar2.equals(gVar);
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.c) + 31) * 31;
        g gVar = this.a;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
