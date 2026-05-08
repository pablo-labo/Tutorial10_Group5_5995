package defpackage;

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
public final class yt6 implements xu5<bd0, Boolean, b, Integer, j6g> {
    public final /* synthetic */ o97 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tjf c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    public yt6(o97 o97Var, String str, tjf tjfVar, String str2, String str3, boolean z) {
        this.a = o97Var;
        this.b = str;
        this.c = tjfVar;
        this.d = str2;
        this.e = str3;
        this.f = z;
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
        o97.a.e eVar = aVar.a;
        ehd ehdVarA = chd.a(new vs0.i(6.0f, true, new us0(0)), c20.a.k, bVar3, 48);
        int iHashCode = Long.hashCode(bVar3.k());
        t8b t8bVarM = bVar3.m();
        e.a aVar2 = e.a.b;
        e eVarC = c.c(bVar3, aVar2);
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
        ygg.y(bVar3, ehdVarA, gl2.a.g);
        ygg.y(bVar3, t8bVarM, gl2.a.f);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
            uz.g(iHashCode, bVar3, iHashCode, c0251a);
        }
        ygg.y(bVar3, eVarC, gl2.a.d);
        zq6 zq6Var = zq6.Sm;
        String str = this.b;
        tjf tjfVar = this.c;
        String str2 = this.d;
        String str3 = this.e;
        if (zBooleanValue) {
            bVar3.L(-1119505275);
            long j = o97Var.a >= 7 ? eVar.c : aVar.b.a;
            ev6.b(fv6.A1, null, null, zq6Var, j, str.concat("_CheckIcon"), bVar3, 3078, 6);
            cif.b(str3, f.a(aVar2, str2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, j, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210), bVar3, 0, 0, 65532);
            bVar2 = bVar3;
            bVar2.F();
        } else {
            if (zBooleanValue) {
                bVar3.L(-1698681787);
                bVar3.F();
                l.g();
                return null;
            }
            bVar3.L(-1118568362);
            bVar3.L(-1698650386);
            if (this.f) {
                ev6.b(fv6.e7, null, null, zq6Var, eVar.c, str.concat("_PlusIcon"), bVar3, 3078, 6);
            }
            bVar3.F();
            cif.b(str3, f.a(aVar2, str2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, eVar.c, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar3, 0, 0, 65532);
            bVar2 = bVar3;
            bVar2.F();
        }
        bVar2.q();
        return j6g.a;
    }
}
