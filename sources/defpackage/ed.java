package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.s87;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar;
        Constructor constructor;
        View viewD;
        Constructor constructor2;
        int i = this.a;
        int i2 = 11;
        int i3 = 9;
        e.a aVar = e.a.b;
        b.a.C0020a c0020a = b.a.a;
        int i4 = 16;
        int i5 = 7;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((fd) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                w02 w02Var = (w02) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                j19.b((gz4) w02Var.e.getValue(), h19.COUNTRY_SELECTOR, null, false, str, str2, 6);
                u02.a.a(str, str2);
                x02 x02Var = (x02) w02Var.d.getValue();
                x02Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) x02Var.a.getValue(), tx5.k(x02Var.b, "native-change-country", t40.l("language-button-", str, "-", str2), null, 12));
                return j6g.a;
            case 2:
                ut5 ut5Var = (ut5) obj3;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarF = g.f(k.a(aVar), 1.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
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
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    i.b(qb2.a, ((apf) ut5Var.f0.getValue()).h(), null, null, null, null, bh2.c(2005259570, new qt5(ut5Var, false ? 1 : 0), bVar2), bVar2, 1572870, 30);
                    if (ut5.R()) {
                        bVar2.L(-175001905);
                        j6g j6gVar = j6g.a;
                        boolean zX = bVar2.x(ut5Var);
                        Object objV = bVar2.v();
                        if (zX || objV == c0020a) {
                            objV = new tt5(ut5Var, null);
                            bVar2.p(objV);
                        }
                        to4.d(bVar2, j6gVar, (Function2) objV);
                        g4a g4aVarA = dj5.a(((kt5) ut5Var.h0.getValue()).c, bVar2);
                        b4g.p(((c4g) g4aVarA.getValue()).b, ((c4g) g4aVarA.getValue()).c, null, null, false, bVar2, 0, 60);
                        bVar2.F();
                    } else {
                        bVar2.L(-173726069);
                        boolean zBooleanValue = ((Boolean) ((gme) ((lt5) ut5Var.g0.getValue()).b).getValue()).booleanValue();
                        dd4 dd4Var = dd4.a;
                        boolean z = !dd4.h();
                        boolean zX2 = bVar2.x(ut5Var);
                        Object objV2 = bVar2.v();
                        if (zX2 || objV2 == c0020a) {
                            objV2 = new a1(ut5Var, i2);
                            bVar2.p(objV2);
                        }
                        gu5 gu5Var = (gu5) objV2;
                        boolean zX3 = bVar2.x(ut5Var);
                        Object objV3 = bVar2.v();
                        if (zX3 || objV3 == c0020a) {
                            objV3 = new fk0(ut5Var, i5);
                            bVar2.p(objV3);
                        }
                        gu5 gu5Var2 = (gu5) objV3;
                        boolean zX4 = bVar2.x(ut5Var);
                        Object objV4 = bVar2.v();
                        if (zX4 || objV4 == c0020a) {
                            objV4 = new le(ut5Var, 5);
                            bVar2.p(objV4);
                        }
                        wab.a(zBooleanValue, gu5Var, gu5Var2, (gu5) objV4, z, bVar2, 0);
                        bVar2.F();
                    }
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                h78 h78Var = (h78) obj3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                List list = (List) obj2;
                list.getClass();
                if (zBooleanValue2) {
                    aub aubVarR = h78Var.R();
                    u63.Y(ee3.p(aubVarR), null, null, new qtb(aubVarR, list, new k1(h78Var, 8), null), 3);
                } else {
                    aub aubVarR2 = h78Var.R();
                    u63.Y(ee3.p(aubVarR2), null, null, new itb(aubVarR2, new na0(h78Var, i2), null), 3);
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                int i6 = f98.k0;
                ((f98) obj3).L(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                LaunchFragment launchFragment = (LaunchFragment) obj3;
                b bVar3 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ex4 ex4Var = (ex4) ((gme) launchFragment.E().f).getValue();
                    boolean zBooleanValue3 = ((Boolean) ((gme) launchFragment.E().V).getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) ((gme) launchFragment.E().c0).getValue()).booleanValue();
                    boolean zX5 = bVar3.x(launchFragment);
                    Object objV5 = bVar3.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new a1(launchFragment, i4);
                        bVar3.p(objV5);
                    }
                    gu5 gu5Var3 = (gu5) objV5;
                    boolean zX6 = bVar3.x(launchFragment);
                    Object objV6 = bVar3.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new fk0(launchFragment, 10);
                        bVar3.p(objV6);
                    }
                    gu5 gu5Var4 = (gu5) objV6;
                    boolean zX7 = bVar3.x(launchFragment);
                    Object objV7 = bVar3.v();
                    if (zX7 || objV7 == c0020a) {
                        objV7 = new le(launchFragment, i5);
                        bVar3.p(objV7);
                    }
                    gu5 gu5Var5 = (gu5) objV7;
                    boolean zX8 = bVar3.x(launchFragment);
                    Object objV8 = bVar3.v();
                    if (zX8 || objV8 == c0020a) {
                        objV8 = new qr(launchFragment, i3);
                        bVar3.p(objV8);
                    }
                    el8.a(ex4Var, zBooleanValue3, gu5Var3, gu5Var4, gu5Var5, zBooleanValue4, (gu5) objV8, bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                s7b.b((t7b) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                ah2 ah2Var = (ah2) obj3;
                b bVar4 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ah2Var.invoke(bVar4, 6);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                int i7 = l8c.r0;
                ((l8c) obj3).O(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                xac xacVar = (xac) obj3;
                b bVar5 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objV9 = bVar5.v();
                    if (objV9 == c0020a) {
                        objV9 = r.f(Boolean.FALSE);
                        bVar5.p(objV9);
                    }
                    g4a g4aVar = (g4a) objV9;
                    Object objV10 = bVar5.v();
                    if (objV10 == c0020a) {
                        objV10 = r.f(null);
                        bVar5.p(objV10);
                    }
                    g4a g4aVar2 = (g4a) objV10;
                    j6g j6gVar2 = j6g.a;
                    boolean zX9 = bVar5.x(xacVar);
                    Object objV11 = bVar5.v();
                    if (zX9 || objV11 == c0020a) {
                        objV11 = new yac(xacVar, g4aVar, g4aVar2, null);
                        bVar5.p(objV11);
                    }
                    to4.d(bVar5, j6gVar2, (Function2) objV11);
                    boolean zX10 = bVar5.x(xacVar);
                    Object objV12 = bVar5.v();
                    if (zX10 || objV12 == c0020a) {
                        objV12 = new za(14, xacVar, g4aVar);
                        bVar5.p(objV12);
                    }
                    bVar5.E((gu5) objV12);
                    if (((Boolean) g4aVar.getValue()).booleanValue()) {
                        bVar5.L(-570225130);
                        Integer num = (Integer) g4aVar2.getValue();
                        if (num == null) {
                            bVar5.L(-497076768);
                            bVar5.F();
                            bVar = bVar5;
                        } else {
                            bVar5.L(-497076767);
                            int iIntValue5 = num.intValue();
                            fv6 fv6Var = fv6.q4;
                            String strI = ak2.I(iIntValue5, bVar5);
                            Object objV13 = bVar5.v();
                            if (objV13 == c0020a) {
                                objV13 = new cn0(18);
                                bVar5.p(objV13);
                            }
                            tz6.b(strI, null, fv6Var, null, (gu5) objV13, bVar5, 1597494, 40);
                            bVar = bVar5;
                            bVar.F();
                        }
                    } else {
                        bVar = bVar5;
                        bVar.L(-507465177);
                    }
                    bVar.F();
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case 10:
                izc izcVar = (izc) obj3;
                tzc tzcVar = (tzc) obj;
                List list2 = (List) obj2;
                tzcVar.getClass();
                list2.getClass();
                int iOrdinal = tzcVar.ordinal();
                if (iOrdinal == 0) {
                    aub aubVarR3 = izcVar.R();
                    u63.Y(ee3.p(aubVarR3), null, null, new ktb(aubVarR3, new fk0(izcVar, i4), null), 3);
                } else if (iOrdinal == 1) {
                    aub aubVarR4 = izcVar.R();
                    u63.Y(ee3.p(aubVarR4), null, null, new mtb(aubVarR4, new le(izcVar, i4), null), 3);
                } else {
                    if (iOrdinal != 2) {
                        l.g();
                        return null;
                    }
                    aub aubVarR5 = izcVar.R();
                    u63.Y(ee3.p(aubVarR5), null, null, new ntb(aubVarR5, list2, new np0(i5, izcVar, list2), null), 3);
                }
                return j6g.a;
            case 11:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj3;
                b bVar6 = (b) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (bVar6.o(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var2 = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(-1877641394, new fr2(searchOverlayFragment, i3), bVar6), bVar6, 56);
                } else {
                    bVar6.D();
                }
                return j6g.a;
            case 12:
                ((Integer) obj2).getClass();
                nof.a((gu5) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 13:
                Bitmap bitmap = (Bitmap) obj3;
                b bVar7 = (b) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (bVar7.o(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    f17.b(new v70(bitmap), null, g.n(aVar, 24.0f), null, bVar7, 432, 248);
                } else {
                    bVar7.D();
                }
                return j6g.a;
            default:
                spg spgVar = (spg) obj3;
                yd8<T> yd8Var = spgVar.a;
                Context context = (Context) obj;
                gk0 gk0Var = (gk0) obj2;
                context.getClass();
                gk0Var.getClass();
                try {
                    constructor = jh2.p(yd8Var).getConstructor(Context.class, gk0.class);
                    break;
                } catch (NoSuchMethodException unused) {
                    constructor = null;
                }
                if (constructor == null) {
                    try {
                        constructor2 = jh2.p(yd8Var).getConstructor(Context.class);
                    } catch (NoSuchMethodException unused2) {
                        constructor2 = null;
                    }
                    if (constructor2 == null) {
                        bg.n(yd8Var, "Didn't find a correct constructor for ");
                        return null;
                    }
                    try {
                        Object objNewInstance = constructor2.newInstance(context);
                        objNewInstance.getClass();
                        viewD = (View) objNewInstance;
                    } catch (Throwable th) {
                        viewD = spgVar.d(context, gk0Var, th);
                    }
                    break;
                    break;
                } else {
                    try {
                        Object objNewInstance2 = constructor.newInstance(context, gk0Var);
                        objNewInstance2.getClass();
                        viewD = (View) objNewInstance2;
                    } catch (Throwable th2) {
                        viewD = spgVar.d(context, gk0Var, th2);
                    }
                    break;
                }
                return viewD;
        }
    }

    public /* synthetic */ ed(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
