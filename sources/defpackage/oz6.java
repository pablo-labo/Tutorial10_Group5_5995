package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final class oz6 implements wu5<qd0, b, Integer, j6g> {
    public final /* synthetic */ o97 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fv6 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ gu5<j6g> e;

    public oz6(o97 o97Var, String str, fv6 fv6Var, String str2, gu5 gu5Var) {
        this.a = o97Var;
        this.b = str;
        this.c = fv6Var;
        this.d = str2;
        this.e = gu5Var;
    }

    @Override // defpackage.wu5
    public final j6g q(qd0 qd0Var, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        qd0Var.getClass();
        e eVarD = g.d(e.a.b, 1.0f);
        o97.g gVar = this.a.i;
        e eVarF = f.f(eVarD, 4.0f);
        ag9 ag9VarD = hl1.d(c20.a.h, false);
        int iHashCode = Long.hashCode(bVar2.k());
        t8b t8bVarM = bVar2.m();
        e eVarC = c.c(bVar2, eVarF);
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
        tz6.c(0, this.e, this.c, bVar2, this.b, this.d);
        bVar2.q();
        return j6g.a;
    }
}
