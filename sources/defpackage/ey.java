package defpackage;

import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.runtime.b;
import androidx.compose.runtime.d;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.languageselector.LanguageSelectorFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.s87;
import fma.a;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ey implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ey(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List listH1;
        int i = this.a;
        int i2 = 7;
        int i3 = 14;
        int i4 = 12;
        b.a.C0020a c0020a = b.a.a;
        int i5 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((gy) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                tg2 tg2Var = (tg2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    le4.b(tg2Var, null, bVar, 0, 2);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e.a aVar = e.a.b;
                    e eVarC = c.c(bVar2, aVar);
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
                    i.b(qb2.a, ((apf) indeedApplyWebViewFragment.o0.getValue()).h(), null, null, null, null, bh2.c(-789380444, new sw0(indeedApplyWebViewFragment, i5), bVar2), bVar2, 1572870, 30);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, aVar);
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
                    ygg.y(bVar2, ag9VarD, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    boolean zBooleanValue = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().b).getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().c).getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().d).getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().e).getValue()).booleanValue();
                    boolean zX = bVar2.x(indeedApplyWebViewFragment);
                    Object objV = bVar2.v();
                    if (zX || objV == c0020a) {
                        objV = new ye(indeedApplyWebViewFragment, 10);
                        bVar2.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV2 = bVar2.v();
                    int i6 = 13;
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new la(indeedApplyWebViewFragment, i6);
                        bVar2.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV3 = bVar2.v();
                    int i7 = 9;
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new vv(indeedApplyWebViewFragment, i7);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    boolean zX4 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV4 = bVar2.v();
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new oa(indeedApplyWebViewFragment, i6);
                        bVar2.p(objV4);
                    }
                    gu5 gu5Var4 = (gu5) objV4;
                    boolean zX5 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV5 = bVar2.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new hr(indeedApplyWebViewFragment, i2);
                        bVar2.p(objV5);
                    }
                    gu5 gu5Var5 = (gu5) objV5;
                    ModalWebview modalWebviewN = indeedApplyWebViewFragment.N();
                    boolean zBooleanValue5 = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().W).getValue()).booleanValue();
                    boolean zBooleanValue6 = ((Boolean) ((gme) indeedApplyWebViewFragment.Q().X).getValue()).booleanValue();
                    boolean zX6 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV6 = bVar2.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new qa(indeedApplyWebViewFragment, i6);
                        bVar2.p(objV6);
                    }
                    x77.b(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, null, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, modalWebviewN, zBooleanValue5, zBooleanValue6, (gu5) objV6, bVar2, 0, 0, 16);
                    if (((Boolean) ((gme) indeedApplyWebViewFragment.Q().V).getValue()).booleanValue()) {
                        bVar2.L(2056733540);
                        Lazy<s87> lazy = s87.f;
                        s87.a.a(indeedApplyWebViewFragment.P(), tx5.e(indeedApplyWebViewFragment.t0, "discard-dialog", "IndeedApplyWebViewFragment", null, 12));
                        Object objV7 = bVar2.v();
                        if (objV7 == c0020a) {
                            objV7 = new pd1(i7);
                            bVar2.p(objV7);
                        }
                        z60.a((gu5) objV7, null, bh2.c(-562040956, new mh(indeedApplyWebViewFragment, 2), bVar2), bVar2, 390, 2);
                    } else {
                        bVar2.L(2042244016);
                    }
                    bVar2.F();
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ak7.a((String) obj3, (b) obj, ka2.L(7));
                return j6g.a;
            case 4:
                LanguageSelectorFragment languageSelectorFragment = (LanguageSelectorFragment) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = LanguageSelectorFragment.d;
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zX7 = bVar3.x(languageSelectorFragment);
                    Object objV8 = bVar3.v();
                    if (zX7 || objV8 == c0020a) {
                        objV8 = new fy(languageSelectorFragment, i3);
                        bVar3.p(objV8);
                    }
                    gu5 gu5Var6 = (gu5) objV8;
                    boolean zX8 = bVar3.x(languageSelectorFragment);
                    Object objV9 = bVar3.v();
                    if (zX8 || objV9 == c0020a) {
                        objV9 = new j91(languageSelectorFragment, 8);
                        bVar3.p(objV9);
                    }
                    vj8.d(6, gu5Var6, bVar3, (Function1) objV9);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                t39.a((gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                ((o99) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                fma fmaVar = (fma) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i8 = fma.s0;
                if (!bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bVar4.D();
                } else if (fma.d0()) {
                    bVar4.L(1598029765);
                    j6g j6gVar = j6g.a;
                    boolean zX9 = bVar4.x(fmaVar);
                    Object objV10 = bVar4.v();
                    if (zX9 || objV10 == c0020a) {
                        objV10 = fmaVar.new a(null);
                        bVar4.p(objV10);
                    }
                    to4.d(bVar4, j6gVar, (Function2) objV10);
                    g4a g4aVarA = dj5.a(fmaVar.b0().c, bVar4);
                    b4g.p(((c4g) g4aVarA.getValue()).b, ((c4g) g4aVarA.getValue()).c, ((c4g) g4aVarA.getValue()).a, null, false, bVar4, 0, 56);
                    bVar4.F();
                } else {
                    bVar4.L(1598949380);
                    boolean zG = fmaVar.c0().g();
                    boolean zX10 = bVar4.x(fmaVar);
                    Object objV11 = bVar4.v();
                    if (zX10 || objV11 == c0020a) {
                        objV11 = new j30(fmaVar, i4);
                        bVar4.p(objV11);
                    }
                    gu5 gu5Var7 = (gu5) objV11;
                    boolean zX11 = bVar4.x(fmaVar);
                    Object objV12 = bVar4.v();
                    if (zX11 || objV12 == c0020a) {
                        objV12 = new k30(fmaVar, i3);
                        bVar4.p(objV12);
                    }
                    bma.a(0, gu5Var7, (gu5) objV12, bVar4, zG);
                    bVar4.F();
                }
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                ((qlb) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                yzd yzdVar = (yzd) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    o97 o97Var = (o97) bVar5.M(ne4Var);
                    Object objV13 = bVar5.v();
                    if (objV13 == c0020a) {
                        Bundle arguments = yzdVar.getArguments();
                        objV13 = r.f(arguments != null ? arguments.getString("conversationId") : null);
                        bVar5.p(objV13);
                    }
                    g4a g4aVar = (g4a) objV13;
                    Object objV14 = bVar5.v();
                    if (objV14 == c0020a) {
                        objV14 = new ns(6, g4aVar);
                        bVar5.p(objV14);
                    }
                    ((kr7) cr8.p(kr7.class)).e("jsj_ifl7_tst");
                    rm2.a(ne4Var.a(h07.a), bh2.c(1563547511, new ktd(o97Var, yzdVar, (Function1) objV14, g4aVar), bVar5), bVar5, 56);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            default:
                qme qmeVar = (qme) obj3;
                Set set = (Set) obj;
                AtomicReference<Object> atomicReference = qmeVar.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        listH1 = set;
                    } else if (obj4 instanceof Set) {
                        listH1 = u63.a0(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            d.d("Unexpected notification");
                            r40.e();
                            return null;
                        }
                        listH1 = z92.h1((Collection) obj4, u63.Z(set));
                    }
                    while (!atomicReference.compareAndSet(obj4, listH1)) {
                        if (atomicReference.get() != obj4) {
                        }
                        break;
                    }
                    if (qmeVar.c()) {
                        qmeVar.a.invoke(new i30(qmeVar, 16));
                    }
                    return j6g.a;
                }
                break;
        }
    }

    public /* synthetic */ ey(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
