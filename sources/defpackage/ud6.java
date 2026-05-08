package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ud6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ud6(lu0 lu0Var, o97 o97Var, Locale locale) {
        this.b = lu0Var;
        this.c = o97Var;
        this.d = locale;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                lu0 lu0Var = (lu0) obj5;
                o97 o97Var = (o97) obj4;
                Locale locale = (Locale) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.k, bVar, 54);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar, eVarC, eVar);
                    vs0.i iVar = new vs0.i(2.0f, true, new us0(0));
                    ghd ghdVar = ghd.a;
                    e eVarA = ghdVar.a(aVar, 3.0f);
                    ob2 ob2VarA = mb2.a(iVar, c20.a.m, bVar, 6);
                    int iHashCode2 = Long.hashCode(bVar.k());
                    t8b t8bVarM2 = bVar.m();
                    e eVarC2 = c.c(bVar, eVarA);
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, dVar);
                    ygg.y(bVar, t8bVarM2, fVar);
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar, iHashCode2, c0251a);
                    }
                    ygg.y(bVar, eVarC2, eVar);
                    String str = lu0Var.b;
                    if (str == null) {
                        str = "";
                    }
                    cif.c(v1c.j(str), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, v1c.d(o97Var, true), bVar, 0, 0, 131070);
                    b bVar2 = bVar;
                    String strE = v1c.e(lu0Var.c, locale, null, bVar2, 4);
                    if (strE == null) {
                        bVar2.L(1736051760);
                    } else {
                        bVar2.L(1736051761);
                        if (zve.U(strE)) {
                            bVar2.L(-929154194);
                        } else {
                            bVar2.L(-925863854);
                            cif.b(strE, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.c, 0L, null, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777182), bVar2, 0, 0, 65534);
                            bVar2 = bVar2;
                        }
                        bVar2.F();
                        j6g j6gVar = j6g.a;
                    }
                    bVar2.F();
                    String str2 = lu0Var.d;
                    if (str2 == null) {
                        bVar2.L(1736644356);
                    } else {
                        bVar2.L(1736644357);
                        if (zve.U(str2)) {
                            bVar2.L(-817098601);
                        } else {
                            bVar2.L(-813202211);
                            r35.a(str2, null, "GroupsDataChipDescription", bVar2, 384, 26);
                        }
                        bVar2.F();
                        j6g j6gVar2 = j6g.a;
                    }
                    bVar2.F();
                    bVar2.q();
                    e eVarA2 = ghdVar.a(aVar, 1.0f);
                    af1.b bVar3 = c20.a.j;
                    e eVarB = ghdVar.b(eVarA2, bVar3);
                    ehd ehdVarA2 = chd.a(vs0.b, bVar3, bVar2, 6);
                    int iHashCode3 = Long.hashCode(bVar2.k());
                    t8b t8bVarM3 = bVar2.m();
                    e eVarC3 = c.c(bVar2, eVarB);
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
                    ygg.y(bVar2, ehdVarA2, dVar);
                    ygg.y(bVar2, t8bVarM3, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                    }
                    ygg.y(bVar2, eVarC3, eVar);
                    lvb.a(null, R.drawable.ic_idl_people_24, null, bVar2, 0);
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ujb.a((String) obj5, (List) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ ud6(String str, List list, gu5 gu5Var, int i) {
        this.b = str;
        this.c = list;
        this.d = gu5Var;
    }
}
