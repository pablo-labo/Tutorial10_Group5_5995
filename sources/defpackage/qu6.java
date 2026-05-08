package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes3.dex */
public final class qu6 implements xu5<bd0, Boolean, b, Integer, j6g> {
    public final /* synthetic */ o97 a;
    public final /* synthetic */ tjf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;

    public qu6(o97 o97Var, tjf tjfVar, String str, String str2, Integer num) {
        this.a = o97Var;
        this.b = tjfVar;
        this.c = str;
        this.d = str2;
        this.e = num;
    }

    @Override // defpackage.xu5
    public final j6g j(bd0 bd0Var, Boolean bool, b bVar, Integer num) {
        b bVar2;
        boolean zBooleanValue = bool.booleanValue();
        b bVar3 = bVar;
        num.intValue();
        bd0Var.getClass();
        o97 o97Var = this.a;
        o97.a aVar = o97Var.c;
        long j = aVar.b.c;
        long j2 = aVar.a.c;
        tjf tjfVar = this.b;
        to5 to5Var = zBooleanValue ? o97Var.f.c : tjfVar.a.c;
        float fA = zq6.Md.a();
        e.a aVar2 = e.a.b;
        e eVarJ = g.j(aVar2, fA, 0.0f, 2);
        ehd ehdVarA = chd.a(new vs0.i(6.0f, true, new us0(0)), c20.a.k, bVar3, 48);
        int iHashCode = Long.hashCode(bVar3.k());
        t8b t8bVarM = bVar3.m();
        e eVarC = c.c(bVar3, eVarJ);
        gl2.j.getClass();
        pm8.a aVar3 = gl2.a.b;
        if (bVar3.j() == null) {
            pg8.B();
            throw null;
        }
        bVar3.B();
        if (bVar3.f()) {
            bVar3.y(aVar3);
        } else {
            bVar3.n();
        }
        gl2.a.d dVar = gl2.a.g;
        ygg.y(bVar3, ehdVarA, dVar);
        gl2.a.f fVar = gl2.a.f;
        ygg.y(bVar3, t8bVarM, fVar);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
            uz.g(iHashCode, bVar3, iHashCode, c0251a);
        }
        gl2.a.e eVar = gl2.a.d;
        ygg.y(bVar3, eVarC, eVar);
        bVar3.L(1811386664);
        bVar3.F();
        String str = this.c;
        to5 to5Var2 = to5Var;
        cif.b(this.d, f.a(aVar2, str.concat("_Title")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar3, 0, 0, 65532);
        bVar3.L(1811400880);
        Integer num2 = this.e;
        if (num2 != null) {
            e eVarH = androidx.compose.foundation.layout.f.h(a.b(g.a(aVar2, 18.0f, 18.0f), j, ggd.a(o97Var.h.c)), 4.0f, 0.0f, 2);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode2 = Long.hashCode(bVar3.k());
            t8b t8bVarM2 = bVar3.m();
            e eVarC2 = c.c(bVar3, eVarH);
            if (bVar3.j() == null) {
                pg8.B();
                throw null;
            }
            bVar3.B();
            if (bVar3.f()) {
                bVar3.y(aVar3);
            } else {
                bVar3.n();
            }
            ygg.y(bVar3, ag9VarD, dVar);
            ygg.y(bVar3, t8bVarM2, fVar);
            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
            }
            ygg.y(bVar3, eVarC2, eVar);
            bVar2 = bVar3;
            cif.b(num2.toString(), f.a(aVar2, str.concat("_Count")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, j2, o97Var.e.h, to5Var2, null, null, 0L, 0, 0L, null, null, 0, 16777208), bVar2, 0, 0, 65532);
            bVar2.q();
        } else {
            bVar2 = bVar3;
        }
        bVar2.F();
        bVar2.q();
        return j6g.a;
    }
}
