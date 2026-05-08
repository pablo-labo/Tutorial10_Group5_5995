package defpackage;

import androidx.compose.animation.i;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jd(String str, g4a g4aVar) {
        this.a = 1;
        this.c = str;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        af1.a aVar = c20.a.m;
        b.a.C0020a c0020a = b.a.a;
        e.a aVar2 = e.a.b;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i3 = 0;
        int i4 = 1;
        switch (i2) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(aVar2, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, aVar, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    tg3 tg3Var = (tg3) g4aVar.getValue();
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        i = 0;
                        objV = new xd(g4aVar, 0);
                        bVar.p(objV);
                    } else {
                        i = 0;
                    }
                    Function2 function2 = (Function2) objV;
                    String strI = ak2.I(w61.b.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new yd(i, g4aVar2);
                        bVar.p(objV2);
                    }
                    gz9.b(tg3Var, function2, strI, false, (Function1) objV2, 0, bVar, 1597488, 168);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                String str = (String) obj3;
                g4a g4aVar3 = (g4a) obj4;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e eVarH2 = f.h(aVar2, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarH2);
                    gl2.j.getClass();
                    pm8.a aVar4 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar4);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar2, eVarC2, gl2.a.d);
                    String str2 = (String) g4aVar3.getValue();
                    String str3 = str2 != null ? str2 : "";
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = new yd(1, g4aVar3);
                        bVar2.p(objV3);
                    }
                    Function1 function1 = (Function1) objV3;
                    String strI2 = ak2.I(v6c.a.a(), bVar2);
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new dw(0, g4aVar3);
                        bVar2.p(objV4);
                    }
                    jyb.a(str3, function1, strI2, true, str, false, null, null, (gu5) objV4, true, null, "AddPublicationTitle", null, null, null, bVar2, 905972784, 48, 29920);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                t00.a((gu5) obj4, (hee) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                go2.a((gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                ComposeView composeView = (ComposeView) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objV5 = bVar3.v();
                    if (objV5 == c0020a) {
                        objV5 = new i4a(Boolean.valueOf(ianMainFragment.H().j()));
                        bVar3.p(objV5);
                    }
                    i4a i4aVar = (i4a) objV5;
                    ((gme) i4aVar.c).setValue(Boolean.valueOf(ianMainFragment.H().j()));
                    if (ianMainFragment.H().j() && composeView.getVisibility() != 0) {
                        composeView.setVisibility(0);
                    } else if (!ianMainFragment.H().j() && composeView.getVisibility() == 0 && wl7.b(((gme) i4aVar.b).getValue(), ((gme) i4aVar.c).getValue()) && !((Boolean) ((gme) i4aVar.a).getValue()).booleanValue()) {
                        composeView.setVisibility(8);
                    }
                    boolean zJ = ianMainFragment.H().j();
                    dr5 dr5Var = ianMainFragment.c0;
                    if (zJ) {
                        dr5Var.getClass();
                        dr5Var.f.setVisibility(8);
                        dr5 dr5Var2 = ianMainFragment.c0;
                        dr5Var2.getClass();
                        dr5Var2.b.setVisibility(8);
                    } else {
                        dr5Var.getClass();
                        dr5Var.f.setVisibility(0);
                        dr5 dr5Var3 = ianMainFragment.c0;
                        dr5Var3.getClass();
                        dr5Var3.b.setVisibility(0);
                    }
                    Object objV6 = bVar3.v();
                    int i5 = 9;
                    if (objV6 == c0020a) {
                        objV6 = new kd(i5);
                        bVar3.p(objV6);
                    }
                    mv4 mv4VarJ = ku4.j((Function1) objV6);
                    Object objV7 = bVar3.v();
                    if (objV7 == c0020a) {
                        objV7 = new kd(i5);
                        bVar3.p(objV7);
                    }
                    i.c(i4aVar, null, mv4VarJ, ku4.l((Function1) objV7), null, bh2.c(-444998455, new hj3(ianMainFragment, i4), bVar3), bVar3, 200064, 18);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                gu5 gu5Var = (gu5) obj4;
                o97 o97Var = (o97) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sq1.c(gu5Var, null, null, null, bh2.c(1830682546, new tk7(o97Var, i4), bVar4), bVar4, 805306368, 510);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 6:
                n5b n5bVar = (n5b) obj4;
                o97 o97Var2 = (o97) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e eVarF = f.f(g.f(aVar2, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.k, bVar5, 54);
                    int iHashCode3 = Long.hashCode(bVar5.k());
                    t8b t8bVarM3 = bVar5.m();
                    e eVarC3 = c.c(bVar5, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar5 = gl2.a.b;
                    if (bVar5.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar5.B();
                    if (bVar5.f()) {
                        bVar5.y(aVar5);
                    } else {
                        bVar5.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar5, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar5, t8bVarM3, fVar);
                    gl2.a.C0251a c0251a3 = gl2.a.j;
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar5, iHashCode3, c0251a3);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar5, eVarC3, eVar);
                    vs0.i iVar = new vs0.i(4.0f, true, new us0(i3));
                    ghd ghdVar = ghd.a;
                    e eVarA = ghdVar.a(aVar2, 3.0f);
                    ob2 ob2VarA2 = mb2.a(iVar, aVar, bVar5, 6);
                    int iHashCode4 = Long.hashCode(bVar5.k());
                    t8b t8bVarM4 = bVar5.m();
                    e eVarC4 = c.c(bVar5, eVarA);
                    if (bVar5.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar5.B();
                    if (bVar5.f()) {
                        bVar5.y(aVar5);
                    } else {
                        bVar5.n();
                    }
                    ygg.y(bVar5, ob2VarA2, dVar);
                    ygg.y(bVar5, t8bVarM4, fVar);
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode4))) {
                        uz.g(iHashCode4, bVar5, iHashCode4, c0251a3);
                    }
                    ygg.y(bVar5, eVarC4, eVar);
                    String str4 = n5bVar.d;
                    cif.c(v1c.j(str4 != null ? str4 : ""), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, v1c.d(o97Var2, true), bVar5, 0, 0, 131070);
                    b bVar6 = bVar5;
                    String str5 = n5bVar.e;
                    if (str5 == null) {
                        bVar6.L(725484547);
                    } else {
                        bVar6.L(725484548);
                        if (zve.U(str5)) {
                            bVar6.L(-658463761);
                        } else {
                            bVar6.L(-655341565);
                            qxb.b(str5, str5, bVar6, 0);
                        }
                        bVar6.F();
                        j6g j6gVar = j6g.a;
                    }
                    bVar6.F();
                    String strF = v1c.f(n5bVar.b, bVar6);
                    if (strF == null) {
                        bVar6.L(725763857);
                    } else {
                        bVar6.L(725763858);
                        if (zve.U(strF)) {
                            bVar6.L(1314134776);
                        } else {
                            bVar6.L(1317538204);
                            cif.b(strF, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var2.j.g, o97Var2.c.a.c, 0L, null, null, o97Var2.d.a, 0L, 0, 0L, null, null, 0, 16777182), bVar6, 0, 0, 65534);
                            bVar6 = bVar6;
                        }
                        bVar6.F();
                        j6g j6gVar2 = j6g.a;
                    }
                    bVar6.F();
                    String str6 = n5bVar.c;
                    if (str6 == null) {
                        bVar6.L(726350501);
                    } else {
                        bVar6.L(726350502);
                        if (zve.U(str6)) {
                            bVar6.L(-1620953513);
                        } else {
                            bVar6.L(-1616949987);
                            r35.a(str6, null, "PatentDataChipDescription", bVar6, 384, 26);
                        }
                        bVar6.F();
                        j6g j6gVar3 = j6g.a;
                    }
                    bVar6.F();
                    bVar6.q();
                    e eVarA2 = ghdVar.a(aVar2, 1.0f);
                    af1.b bVar7 = c20.a.j;
                    e eVarB = ghdVar.b(eVarA2, bVar7);
                    ehd ehdVarA2 = chd.a(vs0.b, bVar7, bVar6, 6);
                    int iHashCode5 = Long.hashCode(bVar6.k());
                    t8b t8bVarM5 = bVar6.m();
                    e eVarC5 = c.c(bVar6, eVarB);
                    if (bVar6.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar6.B();
                    if (bVar6.f()) {
                        bVar6.y(aVar5);
                    } else {
                        bVar6.n();
                    }
                    ygg.y(bVar6, ehdVarA2, dVar);
                    ygg.y(bVar6, t8bVarM5, fVar);
                    if (bVar6.f() || !wl7.b(bVar6.v(), Integer.valueOf(iHashCode5))) {
                        uz.g(iHashCode5, bVar6, iHashCode5, c0251a3);
                    }
                    ygg.y(bVar6, eVarC5, eVar);
                    lvb.a(null, R.drawable.ic_idl_patent_24, null, bVar6, 6);
                    bVar6.q();
                    bVar6.q();
                } else {
                    bVar5.D();
                }
                return j6g.a;
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$13((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (zr7) obj2);
        }
    }

    public /* synthetic */ jd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ jd(int i, int i2, gu5 gu5Var, Object obj) {
        this.a = i2;
        this.b = gu5Var;
        this.c = obj;
    }
}
