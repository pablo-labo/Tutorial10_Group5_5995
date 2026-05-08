package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.updatedterms.BlockingToSFragment;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.af1;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.v03;
import defpackage.vs0;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tn0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vn0.b((wn0) obj4, (e) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                m61 m61Var = (m61) obj4;
                o97 o97Var = (o97) obj3;
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
                    vs0.i iVar = new vs0.i(2.0f, true, new us0(z ? 1 : 0));
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
                    String str = m61Var.d;
                    if (str == null) {
                        str = "";
                    }
                    cif.c(v1c.j(str), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, v1c.d(o97Var, true), bVar, 0, 0, 131070);
                    b bVar2 = bVar;
                    String strF = v1c.f(m61Var.b, bVar2);
                    if (strF == null) {
                        bVar2.L(-1468101070);
                    } else {
                        bVar2.L(-1468101069);
                        if (zve.U(strF)) {
                            bVar2.L(1360998851);
                        } else {
                            bVar2.L(1364029442);
                            cif.b(strF, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.c, 0L, null, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777182), bVar2, 0, 0, 65534);
                            bVar2 = bVar2;
                        }
                        bVar2.F();
                        j6g j6gVar = j6g.a;
                    }
                    bVar2.F();
                    String str2 = m61Var.c;
                    if (str2 == null) {
                        bVar2.L(-1467499546);
                    } else {
                        bVar2.L(-1467499545);
                        if (zve.U(str2)) {
                            bVar2.L(1447488154);
                        } else {
                            bVar2.L(1451133723);
                            r35.a(str2, null, "AwardsDataChipDescription", bVar2, 384, 26);
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
                    lvb.a(null, R.drawable.ic_idl_award_24, null, bVar2, 0);
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                BlockingToSFragment blockingToSFragment = (BlockingToSFragment) obj4;
                ComposeView composeView = (ComposeView) obj3;
                b bVar4 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar4.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(502815752, new gh(i2, blockingToSFragment, composeView), bVar4), bVar4, 56);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 3:
                juc jucVar = (juc) obj3;
                v03.a aVar3 = (v03.a) obj2;
                ((j6g) obj).getClass();
                aVar3.getClass();
                int i3 = jucVar.element;
                jucVar.element = i3 + 1;
                ((v03[]) obj4)[i3] = aVar3;
                return j6g.a;
            case 4:
                jo4 jo4Var = (jo4) obj4;
                Locale locale = (Locale) obj3;
                b bVar5 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fo4.a(jo4Var, locale, bVar5, 384);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                vj7.g((gu5) obj4, (e) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$23((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (js7) obj2);
        }
    }

    public /* synthetic */ tn0(Object obj, e eVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = eVar;
    }
}
