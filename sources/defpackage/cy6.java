package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cy6 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ g4a f;

    public cy6(ArrayList arrayList, e eVar, Function1 function1, String str, String str2, g4a g4aVar) {
        this.a = arrayList;
        this.b = eVar;
        this.c = function1;
        this.d = str;
        this.e = str2;
        this.f = g4aVar;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            ux6 ux6Var = (ux6) this.a.get(iIntValue);
            bVar2.L(-1509380822);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(bVar2.k());
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, this.b);
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
            bVar2.L(-1746271574);
            boolean zK = bVar2.K(ux6Var);
            Function1 function1 = this.c;
            boolean zK2 = zK | bVar2.K(function1);
            Object objV = bVar2.v();
            if (zK2 || objV == b.a.a) {
                objV = new by6(0, ux6Var, function1, this.f);
                bVar2.p(objV);
            }
            bVar2.F();
            zx6.a(ux6Var, (gu5) objV, null, this.d, this.e + "_SuggestItem" + iIntValue, bVar2, 0, 4);
            bVar2.q();
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
