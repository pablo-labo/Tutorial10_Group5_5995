package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jvf implements Function2<b, Integer, j6g> {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function2<b, Integer, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jvf(float f, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = f;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            e eVarJ = f.j(g.j(e.a.b, this.a, 0.0f, 2), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarJ);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            this.b.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
