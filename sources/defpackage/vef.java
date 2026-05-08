package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vef implements wu5<e, b, Integer, j6g> {
    public final /* synthetic */ float a;
    public final /* synthetic */ ar3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2<b, Integer, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public vef(float f, ar3 ar3Var, boolean z, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = f;
        this.b = ar3Var;
        this.c = z;
        this.d = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final j6g q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(eVar2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            e eVarG = ygg.g(eVar2, this.a);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarG);
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
            bVar2.L(264799724);
            ar3 ar3Var = this.b;
            g4a g4aVarG = r.g(new da2(this.c ? ar3Var.t : ar3Var.u), bVar2);
            bVar2.F();
            nff.b(((da2) g4aVarG.getValue()).a, ((nzf) bVar2.M(rzf.b)).g, this.d, bVar2, 0, 4);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
