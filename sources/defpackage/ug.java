package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.ig3;
import defpackage.pm8;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ug implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ug(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        e.a aVar = e.a.b;
        byte b = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(aVar, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
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
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    ig3.b bVar2 = ((ig3) g4aVar.getValue()).c;
                    s38 s38Var = bVar2 != null ? bVar2.b : null;
                    ig3.b bVar3 = ((ig3) g4aVar.getValue()).c;
                    tg3 tg3Var = new tg3(Boolean.FALSE, s38Var, bVar3 != null ? bVar3.c : null);
                    String strI = ak2.I(wc4.b.a(), bVar);
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new mh(g4aVar, b == true ? 1 : 0);
                        bVar.p(objV);
                    }
                    Function2 function2 = (Function2) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new nh(0, g4aVar2);
                        bVar.p(objV2);
                    }
                    gz9.b(tg3Var, function2, strI, false, (Function1) objV2, 10, bVar, 14377008, 8);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                q1c.b((String) obj4, (ah2) obj3, (b) obj, ka2.L(55));
                return j6g.a;
            case 2:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$12((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (xr7) obj2);
            case 3:
                i7d i7dVar = (i7d) obj4;
                o97 o97Var = (o97) obj3;
                b bVar4 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!bVar4.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar4.D();
                } else if (i7dVar.b) {
                    bVar4.L(1756777828);
                    ev6.b(fv6.g8, null, null, null, eu6.l0, "ResponsiveBadgeEarned", bVar4, 196614, 14);
                    bVar4.F();
                } else {
                    bVar4.L(1756979483);
                    ev6.b(fv6.h8, null, null, null, o97Var.c.a.b, "ResponsiveBadgeNotEarned", bVar4, 196614, 14);
                    bVar4.F();
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                g3e.a((e) obj4, (ah2) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                z5f.c((p5f) obj4, (e8a) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                Locale locale = (Locale) obj4;
                gu5 gu5Var = (gu5) obj3;
                b bVar5 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e eVarH2 = f.h(aVar, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar5.k());
                    t8b t8bVarM2 = bVar5.m();
                    e eVarC2 = c.c(bVar5, eVarH2);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar5.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar5.B();
                    if (bVar5.f()) {
                        bVar5.y(aVar3);
                    } else {
                        bVar5.n();
                    }
                    ygg.y(bVar5, ag9VarD, gl2.a.g);
                    ygg.y(bVar5, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar5, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar5, eVarC2, gl2.a.d);
                    boolean zK = bVar5.K(gu5Var);
                    Object objV3 = bVar5.v();
                    if (zK || objV3 == c0020a) {
                        objV3 = new eb(6, gu5Var);
                        bVar5.p(objV3);
                    }
                    nzd.a(locale, (gu5) objV3, ak2.I(R.string.label_add_work_exp_job_country, bVar5), false, null, null, bVar5, 3072, 48);
                    bVar5.q();
                } else {
                    bVar5.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ ug(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
