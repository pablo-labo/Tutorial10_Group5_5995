package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hr4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hr4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        gl2.a.e eVar;
        gl2.a.C0251a c0251a;
        pm8.a aVar;
        gl2.a.d dVar;
        gl2.a.f fVar;
        vs0.k kVar;
        af1.a aVar2;
        o97.a.e eVar2;
        o97.a.b bVar;
        o97.h hVar;
        o97.a.C0340a c0340a;
        o97 o97Var;
        float f;
        o97 o97Var2;
        float f2;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                o97 o97Var3 = (o97) obj5;
                kr4 kr4Var = (kr4) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e.a aVar3 = e.a.b;
                    e eVarF = g.f(aVar3, 1.0f);
                    o97.h hVar2 = o97Var3.j;
                    o97.a aVar4 = o97Var3.c;
                    o97.a.b bVar3 = aVar4.c;
                    o97.a.C0340a c0340a2 = aVar4.b;
                    o97.a.e eVar3 = aVar4.a;
                    e eVarF2 = f.f(eVarF, 16.0f);
                    vs0.k kVar2 = vs0.c;
                    af1.a aVar5 = c20.a.m;
                    ob2 ob2VarA = mb2.a(kVar2, aVar5, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarF2);
                    gl2.j.getClass();
                    pm8.a aVar6 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar6);
                    } else {
                        bVar2.n();
                    }
                    gl2.a.d dVar2 = gl2.a.g;
                    ygg.y(bVar2, ob2VarA, dVar2);
                    gl2.a.f fVar2 = gl2.a.f;
                    ygg.y(bVar2, t8bVarM, fVar2);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a2);
                    }
                    gl2.a.e eVar4 = gl2.a.d;
                    ygg.y(bVar2, eVarC, eVar4);
                    e eVarF3 = g.f(aVar3, 1.0f);
                    vs0.g gVar = vs0.g;
                    af1.b bVar4 = c20.a.k;
                    ehd ehdVarA = chd.a(gVar, bVar4, bVar2, 54);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarF3);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar6);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ehdVarA, dVar2);
                    ygg.y(bVar2, t8bVarM2, fVar2);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar2, eVarC2, eVar4);
                    ehd ehdVarA2 = chd.a(vs0.a, bVar4, bVar2, 48);
                    int iHashCode3 = Long.hashCode(bVar2.k());
                    t8b t8bVarM3 = bVar2.m();
                    e eVarC3 = c.c(bVar2, aVar3);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar6);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ehdVarA2, dVar2);
                    ygg.y(bVar2, t8bVarM3, fVar2);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar2, iHashCode3, c0251a2);
                    }
                    ygg.y(bVar2, eVarC3, eVar4);
                    if (kr4Var.t) {
                        bVar2.L(763063064);
                        eVar = eVar4;
                        aVar2 = aVar5;
                        c0251a = c0251a2;
                        eVar2 = eVar3;
                        bVar = bVar3;
                        dVar = dVar2;
                        hVar = hVar2;
                        c0340a = c0340a2;
                        aVar = aVar6;
                        fVar = fVar2;
                        kVar = kVar2;
                        f17.a(z2b.a(R.drawable.badge_dot, 0, bVar2), ak2.I(R.string.more_icon, bVar2), null, null, null, 0.0f, null, bVar2, 0, 124);
                    } else {
                        eVar = eVar4;
                        c0251a = c0251a2;
                        aVar = aVar6;
                        dVar = dVar2;
                        fVar = fVar2;
                        kVar = kVar2;
                        aVar2 = aVar5;
                        eVar2 = eVar3;
                        bVar = bVar3;
                        hVar = hVar2;
                        c0340a = c0340a2;
                        bVar2.L(758161716);
                    }
                    bVar2.F();
                    ny6.a(kr4Var.a, f.g(aVar3, 0.0f, 6.0f), null, kr4Var.b, null, null, null, bVar2, 0, 244);
                    bVar2.q();
                    ny6.a(kr4Var.c, null, null, c8f.e, null, null, null, bVar2, 3072, 246);
                    bVar2.q();
                    jh2.f(bVar2, g.h(aVar3, 8.0f));
                    if (zve.U(kr4Var.d)) {
                        o97Var = o97Var3;
                        f = 8.0f;
                        bVar2.L(1234748988);
                    } else {
                        bVar2.L(1240466132);
                        String str = kr4Var.d;
                        tjf tjfVar = hVar.f;
                        long j = eVar2.c;
                        to5 to5Var = o97Var3.f.c;
                        o97Var = o97Var3;
                        f = 8.0f;
                        cif.b(str, null, j, 0L, null, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar2, 0, 0, 65498);
                        bVar2 = bVar2;
                        jh2.f(bVar2, g.h(aVar3, 8.0f));
                    }
                    bVar2.F();
                    if (zve.U(kr4Var.e)) {
                        bVar2.L(1234748988);
                    } else {
                        bVar2.L(1240892010);
                        b bVar5 = bVar2;
                        cif.b(kr4Var.e, null, eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.g, bVar5, 0, 0, 65530);
                        bVar2 = bVar5;
                        jh2.f(bVar2, g.h(aVar3, f));
                    }
                    bVar2.F();
                    jh2.f(bVar2, g.h(aVar3, f));
                    if (zve.U(kr4Var.f) && zve.U(kr4Var.h) && zve.U(kr4Var.g)) {
                        bVar2.L(1234748988);
                        bVar2.F();
                        o97Var2 = o97Var;
                    } else {
                        bVar2.L(1241526797);
                        b bVar6 = bVar2;
                        o97Var2 = o97Var;
                        l0f.a(null, ggd.a(24.0f), c0340a.a, 0L, 0.0f, 0.0f, ee3.f(bVar.b, 1.0f), bh2.c(581027412, new ir4(0, o97Var, kr4Var), bVar2), bVar6, 12582912, 57);
                        bVar2 = bVar6;
                        bVar2.F();
                    }
                    if (zve.U(kr4Var.j)) {
                        f2 = 16.0f;
                        bVar2.L(1234748988);
                    } else {
                        bVar2.L(1244920491);
                        jh2.f(bVar2, g.h(aVar3, 16.0f));
                        long j2 = c0340a.a;
                        b bVar7 = bVar2;
                        f2 = 16.0f;
                        l0f.a(null, ggd.a(24.0f), j2, 0L, 0.0f, 0.0f, ee3.f(bVar.b, 1.0f), bh2.c(186623573, new qa3(1, o97Var2, kr4Var), bVar2), bVar7, 12582912, 57);
                        bVar2 = bVar7;
                    }
                    bVar2.F();
                    jh2.f(bVar2, g.h(aVar3, f2));
                    e eVarF4 = g.f(aVar3, 1.0f);
                    ob2 ob2VarA2 = mb2.a(kVar, aVar2, bVar2, 0);
                    int iHashCode4 = Long.hashCode(bVar2.k());
                    t8b t8bVarM4 = bVar2.m();
                    e eVarC4 = c.c(bVar2, eVarF4);
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
                    ygg.y(bVar2, ob2VarA2, dVar);
                    ygg.y(bVar2, t8bVarM4, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode4))) {
                        uz.g(iHashCode4, bVar2, iHashCode4, c0251a);
                    }
                    ygg.y(bVar2, eVarC4, eVar);
                    if (kr4Var.k) {
                        bVar2.L(346429080);
                        b bVar8 = bVar2;
                        gt6.h(ak2.I(R.string.share_contact_info_button, bVar2), kr4Var.q, g.f(aVar3, 1.0f), null, false, kr4Var.m, fv6.z1, null, null, bVar8, 1573248, DataOkHttpUploader.HTTP_CLIENT_TIMEOUT);
                        bVar2 = bVar8;
                        jh2.f(bVar2, g.h(aVar3, f));
                        gt6.k(ak2.I(R.string.decline_button, bVar2), kr4Var.p, g.f(aVar3, 1.0f), null, kr4Var.n, null, null, bVar2, 384, 472);
                    } else {
                        bVar2.L(334290534);
                    }
                    bVar2.F();
                    if (kr4Var.l) {
                        bVar2.L(347301513);
                        b bVar9 = bVar2;
                        gt6.h(ak2.I(R.string.message_employer_button, bVar2), kr4Var.o, g.f(aVar3, 1.0f), null, false, false, fv6.z1, null, null, bVar9, 1573248, 440);
                        bVar2 = bVar9;
                    } else {
                        bVar2.L(334290534);
                    }
                    bVar2.F();
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                gu5 gu5Var = (gu5) obj5;
                String str2 = (String) obj4;
                b bVar10 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar10.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nof.c(gu5Var, R.drawable.ic_idl_close_24, fv6.W1, str2, "CloseButton", null, bVar10, 24960, 96);
                } else {
                    bVar10.D();
                }
                return j6g.a;
            case 2:
                String str3 = (String) obj5;
                mhg mhgVar = (mhg) obj4;
                b bVar11 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar11.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    str3.getClass();
                    String strJ = ak2.J(R.string.fraud_flagged_profile_guidelines_url, new Object[]{str3}, bVar11);
                    String strI = ak2.I(R.string.fraud_flagged_profile_our_guidelines, bVar11);
                    boolean zX = bVar11.x(mhgVar) | bVar11.K(strJ);
                    Object objV = bVar11.v();
                    if (zX || objV == c0020a) {
                        objV = new yi(12, mhgVar, strJ);
                        bVar11.p(objV);
                    }
                    gt6.m(strI, (gu5) objV, null, null, false, null, null, bVar11, 0, 508);
                    String strJ2 = ak2.J(R.string.fraud_flagged_profile_submit_appeal_url, new Object[]{str3}, bVar11);
                    String strI2 = ak2.I(R.string.fraud_flagged_profile_submit_an_appeal, bVar11);
                    boolean zX2 = bVar11.x(mhgVar) | bVar11.K(strJ2);
                    Object objV2 = bVar11.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new as(16, mhgVar, strJ2);
                        bVar11.p(objV2);
                    }
                    gt6.m(strI2, (gu5) objV2, null, null, false, null, null, bVar11, 0, 508);
                } else {
                    bVar11.D();
                }
                return j6g.a;
            default:
                androidx.fragment.app.g gVar2 = (androidx.fragment.app.g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar12 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar12.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zX3 = bVar12.x(gVar2) | bVar12.K(wu5Var);
                    Object objV3 = bVar12.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new zyb(gVar2, wu5Var, 1);
                        bVar12.p(objV3);
                    }
                    q1c.c(48, (gu5) objV3, bVar12, "Review Education Suggestion", true);
                } else {
                    bVar12.D();
                }
                return j6g.a;
        }
    }
}
