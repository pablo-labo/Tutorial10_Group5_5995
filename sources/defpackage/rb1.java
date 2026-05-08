package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rb1 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rb1(o97 o97Var, gu5 gu5Var, gu5 gu5Var2) {
        this.a = 1;
        this.b = o97Var;
        this.c = gu5Var;
        this.d = gu5Var2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        e.a aVar = e.a.b;
        int i2 = 3;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj6;
                hne hneVar = (hne) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x2b x2bVarA = z2b.a(R.drawable.ic_idl_close_24, 0, bVar);
                    String strI = ak2.I(R.string.desc_close, bVar);
                    e eVarA = f.a(g.n(aVar, 24.0f), "ProfileSheetHeaderCloseButton");
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new mc(2);
                        bVar.p(objV);
                    }
                    e eVarB = b5e.b(eVarA, false, (Function1) objV);
                    boolean zK = bVar.K(hneVar) | bVar.K(gu5Var);
                    Object objV2 = bVar.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new qj(3, hneVar, gu5Var);
                        bVar.p(objV2);
                    }
                    e eVarD = androidx.compose.foundation.b.d(eVarB, false, null, null, (gu5) objV2, 15);
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = new bh(1);
                        bVar.p(objV3);
                    }
                    vq6.b(x2bVarA, strI, b5e.b(eVarD, false, (Function1) objV3), o97Var.c.a.c, bVar, 0, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                o97 o97Var2 = (o97) obj6;
                gu5 gu5Var2 = (gu5) obj4;
                gu5 gu5Var3 = (gu5) obj5;
                gza gzaVar = (gza) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gzaVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= bVar2.K(gzaVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e eVarM = pnb.M(androidx.compose.foundation.layout.f.e(g.d(aVar, 1.0f), gzaVar), pnb.L(0, 1, bVar2), true);
                    vs0.c cVar = vs0.e;
                    ob2 ob2VarA = mb2.a(cVar, c20.a.n, bVar2, 54);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarM);
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
                    ygg.y(bVar2, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar2, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar2, eVarC, eVar);
                    f17.a(kl6.d(bVar2), ak2.I(R.string.something_went_wrong, bVar2), g.n(aVar, ((Configuration) bVar2.M(AndroidCompositionLocals_androidKt.a)).screenHeightDp / 3.0f), null, null, 0.0f, null, bVar2, 0, 120);
                    String strI2 = ak2.I(R.string.something_went_wrong, bVar2);
                    tjf tjfVarA = tjf.a(o97Var2.j.f, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                    e eVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1);
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new ju(4);
                        bVar2.p(objV4);
                    }
                    fif.b(strI2, b5e.b(eVarH, false, (Function1) objV4), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar2, 0, 0, 65532);
                    fif.b(ak2.I(R.string.try_refresh, bVar2), androidx.compose.foundation.layout.f.h(aVar, 44.0f, 0.0f, 2), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var2.j.g, bVar2, 0, 0, 65020);
                    e eVarV = g.v(androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1), null, 3);
                    ehd ehdVarA = chd.a(cVar, c20.a.k, bVar2, 54);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarV);
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
                    ygg.y(bVar2, ehdVarA, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    e eVarA2 = f.a(g.t(androidx.compose.foundation.layout.f.g(aVar, 16.0f, 24.0f), 0.0f, 150.0f, 1), "ApiErrorScreenPrimaryButton");
                    fv6 fv6Var = fv6.M7;
                    String strI3 = ak2.I(R.string.refresh, bVar2);
                    boolean zK2 = bVar2.K(gu5Var2);
                    Object objV5 = bVar2.v();
                    if (zK2 || objV5 == c0020a) {
                        objV5 = new xa(4, gu5Var2);
                        bVar2.p(objV5);
                    }
                    gt6.h(strI3, (gu5) objV5, eVarA2, null, false, false, fv6Var, null, null, bVar2, 1572864, 440);
                    e eVarA3 = f.a(aVar, "ApiErrorScreenSecondaryButton");
                    String strI4 = ak2.I(R.string.report_the_issue, bVar2);
                    boolean zK3 = bVar2.K(gu5Var3);
                    Object objV6 = bVar2.v();
                    if (zK3 || objV6 == c0020a) {
                        objV6 = new sg(6, gu5Var3);
                        bVar2.p(objV6);
                    }
                    gt6.m(strI4, (gu5) objV6, eVarA3, null, false, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                String str = (String) obj6;
                List list = (List) obj5;
                gu5 gu5Var4 = (gu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ujb.a(str, list, gu5Var4, bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                androidx.fragment.app.g gVar = (androidx.fragment.app.g) obj6;
                wu5 wu5Var = (wu5) obj5;
                svb svbVar = (svb) obj4;
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zX = bVar4.x(gVar) | bVar4.K(wu5Var) | bVar4.x(svbVar);
                    Object objV7 = bVar4.v();
                    if (zX || objV7 == c0020a) {
                        objV7 = new yq7(i2, gVar, svbVar, wu5Var);
                        bVar4.p(objV7);
                    }
                    q1c.c(48, (gu5) objV7, bVar4, "Edit Single Skill", true);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                o97 o97Var3 = (o97) obj6;
                List<String> list2 = (List) obj5;
                Function1 function1 = (Function1) obj4;
                b bVar5 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                e.a aVar3 = e.a.b;
                e eVarJ = androidx.compose.foundation.layout.f.j(g.f(aVar3, 1.0f), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                ob2 ob2VarA2 = mb2.a(new vs0.i(8.0f, true, new us0(0)), c20.a.m, bVar5, 0);
                int iHashCode3 = Long.hashCode(bVar5.k());
                t8b t8bVarM3 = bVar5.m();
                e eVarC3 = c.c(bVar5, eVarJ);
                gl2.j.getClass();
                pm8.a aVar4 = gl2.a.b;
                if (bVar5.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar5.B();
                if (bVar5.f()) {
                    bVar5.y(aVar4);
                } else {
                    bVar5.n();
                }
                ygg.y(bVar5, ob2VarA2, gl2.a.g);
                ygg.y(bVar5, t8bVarM3, gl2.a.f);
                gl2.a.C0251a c0251a2 = gl2.a.j;
                if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode3))) {
                    uz.g(iHashCode3, bVar5, iHashCode3, c0251a2);
                }
                ygg.y(bVar5, eVarC3, gl2.a.d);
                cif.b(ak2.I(R.string.suggested_skills_body, bVar5), androidx.compose.foundation.layout.f.j(aVar3, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var3.j.g, o97Var3.c.a.a, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar5, 0, 0, 65532);
                bVar5.L(174624115);
                for (String str2 : list2) {
                    boolean zK4 = bVar5.K(function1) | bVar5.K(str2);
                    Object objV8 = bVar5.v();
                    if (zK4 || objV8 == c0020a) {
                        objV8 = new s71(8, function1, str2);
                        bVar5.p(objV8);
                    }
                    yye.a(0, (gu5) objV8, bVar5, null, str2);
                }
                bVar5.F();
                bVar5.q();
                return j6g.a;
        }
    }

    public /* synthetic */ rb1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
