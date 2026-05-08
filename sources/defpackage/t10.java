package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t10 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, j6g> a;
    public final /* synthetic */ Function2<b, Integer, j6g> b;
    public final /* synthetic */ ah2 c;

    public t10(Function2 function2, Function2 function22, ah2 ah2Var) {
        this.a = function2;
        this.b = function22;
        this.c = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        ah2 ah2VarC;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        int i = 0;
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            ah2 ah2VarC2 = null;
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
            ygg.y(bVar2, ob2VarA, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            Function2<b, Integer, j6g> function2 = this.a;
            if (function2 == null) {
                bVar2.L(-97968969);
                bVar2.F();
                ah2VarC = null;
            } else {
                bVar2.L(-97968968);
                ah2VarC = bh2.c(1737550099, new q10(function2, i), bVar2);
                bVar2.F();
            }
            Function2<b, Integer, j6g> function22 = this.b;
            if (function22 == null) {
                bVar2.L(-97547524);
            } else {
                bVar2.L(-97547523);
                ah2VarC2 = bh2.c(1265552690, new s10(function22), bVar2);
            }
            bVar2.F();
            a20.a(ah2VarC, ah2VarC2, bVar2, 6);
            this.c.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
