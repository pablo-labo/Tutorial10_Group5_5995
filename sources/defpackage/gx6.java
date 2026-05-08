package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gx6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String V;
    public final /* synthetic */ String W;
    public final /* synthetic */ wu5<fhd, b, Integer, j6g> a;
    public final /* synthetic */ wu5<fhd, b, Integer, j6g> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ o97 e;
    public final /* synthetic */ long f;

    public gx6(wu5 wu5Var, wu5 wu5Var2, boolean z, String str, o97 o97Var, long j, String str2, String str3) {
        this.a = wu5Var;
        this.b = wu5Var2;
        this.c = z;
        this.d = str;
        this.e = o97Var;
        this.f = j;
        this.V = str2;
        this.W = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        ghd ghdVar;
        Integer num2;
        e.a aVar;
        o97.h hVar;
        long j;
        b bVar2;
        gx6 gx6Var;
        b bVar3;
        b bVar4 = bVar;
        if ((num.intValue() & 3) == 2 && bVar4.i()) {
            bVar4.D();
        } else {
            bVar4.L(517221360);
            ghd ghdVar2 = ghd.a;
            wu5<fhd, b, Integer, j6g> wu5Var = this.a;
            if (wu5Var != null) {
                wu5Var.q(ghdVar2, bVar4, 0);
                j6g j6gVar = j6g.a;
            }
            bVar4.F();
            e.a aVar2 = e.a.b;
            e eVarA = ghdVar2.a(aVar2, 1.0f);
            o97 o97Var = this.e;
            o97.h hVar2 = o97Var.j;
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar4, 0);
            int iHashCode = Long.hashCode(bVar4.k());
            t8b t8bVarM = bVar4.m();
            e eVarC = c.c(bVar4, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            if (bVar4.j() == null) {
                pg8.B();
                throw null;
            }
            bVar4.B();
            if (bVar4.f()) {
                bVar4.y(aVar3);
            } else {
                bVar4.n();
            }
            ygg.y(bVar4, ob2VarA, gl2.a.g);
            ygg.y(bVar4, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar4, iHashCode, c0251a);
            }
            ygg.y(bVar4, eVarC, gl2.a.d);
            boolean z = this.c;
            String str = this.d;
            long j2 = this.f;
            if (z) {
                bVar4.L(-1595036545);
                j = j2;
                num2 = 0;
                aVar = aVar2;
                hVar = hVar2;
                ghdVar = ghdVar2;
                cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(hVar2.f, j2, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210), bVar4, 0, 0, 65534);
                bVar2 = bVar4;
                bVar2.F();
            } else {
                ghdVar = ghdVar2;
                num2 = 0;
                aVar = aVar2;
                hVar = hVar2;
                j = j2;
                bVar4.L(2093833794);
                cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjf.a(hVar.f, j2, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar4, 0, 3120, 55294);
                bVar2 = bVar4;
                bVar2.F();
            }
            bVar2.L(-1595015255);
            b bVar5 = bVar2;
            String str2 = this.V;
            if (str2 != null) {
                tjf tjfVarA = tjf.a(hVar.g, j, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
                gx6Var = this;
                cif.b(str2, f.a(aVar, this.W.concat("_Description")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar5, 0, 0, 65532);
                bVar3 = bVar5;
            } else {
                gx6Var = this;
                bVar3 = bVar5;
            }
            bVar3.F();
            bVar3.q();
            wu5<fhd, b, Integer, j6g> wu5Var2 = gx6Var.b;
            if (wu5Var2 != null) {
                wu5Var2.q(ghdVar, bVar3, num2);
            }
        }
        return j6g.a;
    }
}
