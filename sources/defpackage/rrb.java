package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;

/* JADX INFO: loaded from: classes3.dex */
public final class rrb {
    public static final void a(String str, b bVar, int i) {
        c cVar;
        str.getClass();
        c cVarH = bVar.h(-439527235);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.c, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777179), cVar, i2 & 14, 0, 65534);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new kp0(str, i, 2);
        }
    }
}
