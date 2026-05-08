package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.updatedterms.BlockingToSFragment;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        af1.a aVar = c20.a.m;
        vs0.k kVar = vs0.c;
        e.a aVar2 = e.a.b;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 0;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o97 o97Var = (o97) bVar.M(p97.a);
                    e.a aVar3 = e.a.b;
                    e eVarF = g.f(aVar3, 1.0f);
                    o97.g gVar = o97Var.i;
                    e eVarA = nub.a(nub.b(f.h(eVarF, 16.0f, 0.0f, 2)), b5gVar == b5g.c, "Add driving license failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(kVar, aVar, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
                    gl2.j.getClass();
                    pm8.a aVar4 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar4);
                    } else {
                        bVar.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar, eVarC, eVar);
                    fif.b(ak2.I(R.string.label_endorsements, bVar), f.j(aVar3, 0.0f, 24.0f, 0.0f, 8.0f, 5), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar, 0, 0, 65532);
                    ob2 ob2VarA2 = mb2.a(new vs0.i(16.0f, true, new us0(i2)), aVar, bVar, 0);
                    int iHashCode2 = Long.hashCode(bVar.k());
                    t8b t8bVarM2 = bVar.m();
                    e eVarC2 = c.c(bVar, aVar3);
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar4);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA2, dVar);
                    ygg.y(bVar, t8bVarM2, fVar);
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar, iHashCode2, c0251a);
                    }
                    ygg.y(bVar, eVarC2, eVar);
                    bVar.L(-898355683);
                    wv4<c8h> wv4Var = c8h.b;
                    ArrayList arrayList = new ArrayList(t92.r0(wv4Var, 10));
                    for (c8h c8hVar : wv4Var) {
                        List list = (List) g4aVar.getValue();
                        boolean zContains = list != null ? list.contains(c8hVar.name()) : false;
                        String strName = c8hVar.name();
                        String strA = c8hVar.a();
                        Object objV = bVar.v();
                        if (objV == c0020a) {
                            objV = new kh(g4aVar, i2);
                            bVar.p(objV);
                        }
                        o32.b(zContains, (Function2) objV, strA, strName, null, null, null, bVar, 48, 496);
                        arrayList.add(j6g.a);
                    }
                    bVar.F();
                    bVar.q();
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                nn2.c((gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                BlockingToSFragment blockingToSFragment = (BlockingToSFragment) obj4;
                ComposeView composeView = (ComposeView) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zX = bVar2.x(blockingToSFragment);
                    Object objV2 = bVar2.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new vv(blockingToSFragment, i3);
                        bVar2.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    boolean zX2 = bVar2.x(blockingToSFragment) | bVar2.x(composeView);
                    Object objV3 = bVar2.v();
                    if (zX2 || objV3 == c0020a) {
                        objV3 = new as(4, blockingToSFragment, composeView);
                        bVar2.p(objV3);
                    }
                    ugg.b(0, gu5Var, (gu5) objV3, bVar2, ((vgg) ((gme) ((xgg) blockingToSFragment.a.getValue()).b).getValue()).b);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                w74.a((e) obj4, (Function1) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                vj7.b((e) obj4, (rte) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                vj8.d(ka2.L(7), (gu5) obj4, (b) obj, (Function1) obj3);
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                qxb.b((String) obj4, (String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                o97 o97Var2 = (o97) obj4;
                svb svbVar = (svb) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e eVarF2 = f.f(g.f(aVar2, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.j, bVar3, 6);
                    int iHashCode3 = Long.hashCode(bVar3.k());
                    t8b t8bVarM3 = bVar3.m();
                    e eVarC3 = c.c(bVar3, eVarF2);
                    gl2.j.getClass();
                    pm8.a aVar5 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar5);
                    } else {
                        bVar3.n();
                    }
                    gl2.a.d dVar2 = gl2.a.g;
                    ygg.y(bVar3, ehdVarA, dVar2);
                    gl2.a.f fVar2 = gl2.a.f;
                    ygg.y(bVar3, t8bVarM3, fVar2);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar3, iHashCode3, c0251a2);
                    }
                    gl2.a.e eVar2 = gl2.a.d;
                    ygg.y(bVar3, eVarC3, eVar2);
                    ob2 ob2VarA3 = mb2.a(kVar, aVar, bVar3, 0);
                    int iHashCode4 = Long.hashCode(bVar3.k());
                    t8b t8bVarM4 = bVar3.m();
                    e eVarC4 = c.c(bVar3, aVar2);
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar5);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ob2VarA3, dVar2);
                    ygg.y(bVar3, t8bVarM4, fVar2);
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode4))) {
                        uz.g(iHashCode4, bVar3, iHashCode4, c0251a2);
                    }
                    ygg.y(bVar3, eVarC4, eVar2);
                    String strE = svbVar.b;
                    if (strE == null) {
                        strE = l.e(bVar3, 124856012, R.string.default_summary_placeholder, bVar3);
                    } else {
                        bVar3.L(124853656);
                        bVar3.F();
                    }
                    cif.c(v1c.j(strE), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tjf.a(o97Var2.j.g, o97Var2.c.a.c, 0L, null, null, o97Var2.d.a, 0L, 0, 0L, null, null, 0, 16777182), bVar3, 0, 0, 131070);
                    bVar3.q();
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 8:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$24((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (ls7) obj2);
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                mld.c((e8a) obj4, (pld) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                Locale locale = (Locale) obj4;
                gu5 gu5Var2 = (gu5) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e eVarH = f.h(aVar2, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode5 = Long.hashCode(bVar4.k());
                    t8b t8bVarM5 = bVar4.m();
                    e eVarC5 = c.c(bVar4, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar6 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar6);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ag9VarD, gl2.a.g);
                    ygg.y(bVar4, t8bVarM5, gl2.a.f);
                    gl2.a.C0251a c0251a3 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode5))) {
                        uz.g(iHashCode5, bVar4, iHashCode5, c0251a3);
                    }
                    ygg.y(bVar4, eVarC5, gl2.a.d);
                    boolean zK = bVar4.K(gu5Var2);
                    Object objV4 = bVar4.v();
                    if (zK || objV4 == c0020a) {
                        objV4 = new qy(3, gu5Var2);
                        bVar4.p(objV4);
                    }
                    nzd.a(locale, (gu5) objV4, ak2.I(R.string.label_add_work_exp_job_country, bVar4), false, null, null, bVar4, 3072, 48);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ gh(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
