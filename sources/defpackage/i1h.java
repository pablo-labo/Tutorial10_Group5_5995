package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i1h {
    public static final void a(final boolean z, final String str, b bVar, final int i) {
        int i2;
        str.getClass();
        c cVarH = bVar.h(1624494949);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            p37 p37VarA = f32.a();
            long j = z ? o97Var.c.a.f : da2.h;
            long j2 = z ? o97Var.c.a.c : o97Var.c.b.g.a;
            long j3 = z ? o97Var.c.a.c : o97Var.c.c.f.a;
            o97.g gVar = o97Var.i;
            wq6.a(p37VarA, "WorkAreasCheckbox", f.a(androidx.compose.foundation.layout.f.f(ti1.a(a.b(g.n(e.a.b, 24.0f), j2, ggd.a(8.0f)), 1.0f, j3, ggd.a(8.0f)), 4.0f), str.concat("WorkAreasCheckbox")), j, cVarH, 48, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: h1h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    i1h.a(z, str, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
