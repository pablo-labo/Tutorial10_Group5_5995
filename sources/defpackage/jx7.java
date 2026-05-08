package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.cv8;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.ypb;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jx7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jx7(int i, gu5 gu5Var, e eVar, String str) {
        this.a = 0;
        this.b = eVar;
        this.c = str;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tjf tjfVar;
        String str;
        int i = this.a;
        int i2 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kx7.a(ka2.L(7), (gu5) obj3, (b) obj, (e) obj5, (String) obj4);
                return j6g.a;
            case 1:
                svb svbVar = (svb) obj5;
                Function1 function1 = (Function1) obj4;
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (n5b n5bVar : svbVar.r) {
                        String str2 = n5bVar.d;
                        if (str2 == null || zve.U(str2)) {
                            bVar.L(1543965825);
                        } else {
                            bVar.L(1546147605);
                            boolean zK = bVar.K(function1) | bVar.K(n5bVar);
                            Object objV = bVar.v();
                            if (zK || objV == b.a.a) {
                                objV = new np0(5, function1, n5bVar);
                                bVar.p(objV);
                            }
                            uub.a((gu5) objV, false, null, null, null, bh2.c(332062327, new jd(6, n5bVar, o97Var), bVar), bVar, 196608, 30);
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                zv6[] zv6VarArr = (zv6[]) obj4;
                Function2 function2 = (Function2) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                ypb ypbVar = (ypb) ((List) obj5).get(iIntValue2);
                function2.invoke(ypbVar instanceof ypb.e ? null : zv6VarArr[iIntValue2].a, ypbVar.b);
                return j6g.a;
            default:
                av8 av8Var = (av8) obj5;
                o97 o97Var2 = (o97) obj4;
                Locale locale = (Locale) obj3;
                b bVar2 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.k, bVar2, 54);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar2);
                    } else {
                        bVar2.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar2, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar2, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar2, eVarC, eVar);
                    vs0.i iVar = new vs0.i(2.0f, true, new us0(i2));
                    ghd ghdVar = ghd.a;
                    e eVarA = ghdVar.a(aVar, 3.0f);
                    ob2 ob2VarA = mb2.a(iVar, c20.a.m, bVar2, 6);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarA);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar2);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    String str3 = av8Var.b;
                    cv8.b bVar3 = av8Var.e;
                    tjf tjfVar2 = o97Var2.j.g;
                    o97.a aVar3 = o97Var2.c;
                    o97.c cVar = o97Var2.f;
                    o97.d dVar2 = o97Var2.d;
                    tjf tjfVarA = tjf.a(tjfVar2, 0L, 0L, cVar.c, null, dVar2.a, 0L, 0, 0L, null, null, 0, 16777179);
                    o97.a.e eVar2 = aVar3.a;
                    cif.b(str3, null, eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar2, 0, 0, 65530);
                    b bVar4 = bVar2;
                    if (bVar3 == null || (str = bVar3.i) == null || !v1c.h(str)) {
                        tjfVar = tjfVar2;
                        bVar4.L(1976186184);
                    } else {
                        bVar4.L(2009572688);
                        tjfVar = tjfVar2;
                        cif.b(bVar3.i, null, eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar2, 0L, 0L, cVar.a, null, dVar2.a, 0L, 0, 0L, null, null, 0, 16777179), bVar4, 0, 0, 65530);
                        bVar4 = bVar4;
                    }
                    bVar4.F();
                    ig3 ig3Var = av8Var.g;
                    if (ig3Var == null) {
                        bVar4.L(2010107685);
                    } else {
                        bVar4.L(2010107686);
                        String strE = v1c.e(ig3Var, locale, ak2.I(R.string.does_not_expire, bVar4), bVar4, 0);
                        if (strE == null) {
                            bVar4.L(308587613);
                        } else {
                            bVar4.L(308587614);
                            if (zve.U(strE)) {
                                bVar4.L(-2081850186);
                            } else {
                                bVar4.L(-2047570045);
                                b bVar5 = bVar4;
                                cif.b(strE, androidx.compose.ui.platform.f.a(aVar, "SpecialLicensesDataChipDateRange"), eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar.a, null, dVar2.a, 0L, 0, 0L, null, null, 0, 16777179), bVar5, 48, 0, 65528);
                                bVar4 = bVar5;
                            }
                            bVar4.F();
                            j6g j6gVar = j6g.a;
                        }
                        bVar4.F();
                        j6g j6gVar2 = j6g.a;
                    }
                    bVar4.F();
                    bVar4.q();
                    e eVarA2 = ghdVar.a(aVar, 1.0f);
                    af1.b bVar6 = c20.a.j;
                    e eVarB = ghdVar.b(eVarA2, bVar6);
                    ehd ehdVarA2 = chd.a(vs0.b, bVar6, bVar4, 6);
                    int iHashCode3 = Long.hashCode(bVar4.k());
                    t8b t8bVarM3 = bVar4.m();
                    e eVarC3 = c.c(bVar4, eVarB);
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar2);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA2, dVar);
                    ygg.y(bVar4, t8bVarM3, fVar);
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar4, iHashCode3, c0251a);
                    }
                    ygg.y(bVar4, eVarC3, eVar);
                    lvb.a(null, R.drawable.ic_idl_certification_24, null, bVar4, 0);
                    bVar4.q();
                    bVar4.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ jx7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
