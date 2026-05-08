package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ e a;
    public final /* synthetic */ g4a<sl8> b;
    public final /* synthetic */ ah2 c;

    public ya0(e eVar, g4a g4aVar, ah2 ah2Var) {
        this.a = eVar;
        this.b = g4aVar;
        this.c = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objV = bVar2.v();
            if (objV == b.a.a) {
                objV = new tu(1, this.b);
                bVar2.p(objV);
            }
            e eVarA = s.a(this.a, (Function1) objV);
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iHashCode = Long.hashCode(bVar2.k());
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarA);
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
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar2, iHashCode, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            this.c.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
