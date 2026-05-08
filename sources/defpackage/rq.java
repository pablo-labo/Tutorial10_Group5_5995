package defpackage;

import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.rnmyjobs.a;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e.a aVar = e.a.b;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((sq) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((f51) ((sr) obj3).k0.getValue()).z(str, str2);
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                ((gi4) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 3:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarF = g.f(k.a(aVar), 1.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
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
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    i.b(qb2.a, ((apf) ianMainFragment.n0.getValue()).h(), null, null, null, null, bh2.c(1731411144, new ld0(ianMainFragment, i2), bVar), bVar, 1572870, 30);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                ix7.a((c88) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = LaunchActivity.e1;
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objV = bVar2.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = r.f(Boolean.FALSE);
                        bVar2.p(objV);
                    }
                    g4a g4aVar = (g4a) objV;
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(null);
                        bVar2.p(objV2);
                    }
                    g4a g4aVar2 = (g4a) objV2;
                    j6g j6gVar = j6g.a;
                    boolean zX = bVar2.x(launchActivity);
                    Object objV3 = bVar2.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new wk8(launchActivity, g4aVar, g4aVar2, null);
                        bVar2.p(objV3);
                    }
                    to4.d(bVar2, j6gVar, (Function2) objV3);
                    Integer num = (Integer) g4aVar2.getValue();
                    if (num == null) {
                        bVar2.L(782096391);
                    } else {
                        bVar2.L(782096392);
                        int iIntValue3 = num.intValue();
                        fv6 fv6Var = fv6.q4;
                        String strI = ak2.I(iIntValue3, bVar2);
                        Object objV4 = bVar2.v();
                        if (objV4 == c0020a) {
                            objV4 = new lz(13);
                            bVar2.p(objV4);
                        }
                        tz6.b(strI, null, fv6Var, null, (gu5) objV4, bVar2, 1597494, 40);
                    }
                    bVar2.F();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 6:
                zie zieVar = (zie) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                zieVar.getClass();
                ((Function2) obj3).invoke(zieVar, bool);
                return j6g.a;
            case 7:
                o97 o97Var = (o97) obj3;
                b bVar3 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    cif.b(ak2.I(R.string.share_profile_ir_resume_migration_body, bVar3), f.a(g.f(aVar, 1.0f), "ConfirmationIdlDialog_Subtitle"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.a, 0L, null, null, null, 0L, 5, 0L, null, null, 0, 16744446), bVar3, 48, 0, 65532);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                qxb.a((gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                int i4 = m8c.r0;
                ((m8c) obj3).O(ka2.L(1), (b) obj);
                return j6g.a;
            case 10:
                ((Integer) obj2).getClass();
                ((a) obj3).O(ka2.L(1), (b) obj);
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                ((f8d) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 12:
                ah2 ah2Var = (ah2) obj3;
                b bVar4 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ah2Var.invoke(bVar4, 0);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 13:
                ese eseVar = (ese) obj3;
                b bVar5 = (b) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b4g.p(((c4g) eseVar.getValue()).b, ((c4g) eseVar.getValue()).c, ((c4g) eseVar.getValue()).a, ((c4g) eseVar.getValue()).d, ((c4g) eseVar.getValue()).e, bVar5, 0, 32);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ((j3h) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ rq(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
