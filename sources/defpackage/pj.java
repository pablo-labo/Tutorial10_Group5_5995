package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.forcedupgrade.ForcedUpgradeFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment;
import defpackage.cd4;
import defpackage.isb;
import defpackage.sp7;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        int i = this.a;
        int i2 = 7;
        b.a.C0020a c0020a = b.a.a;
        int i3 = 3;
        int i4 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((rj) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ((pv) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                ((g4a) obj3).setValue(new tg3(Boolean.FALSE, (s38) obj, (Integer) obj2));
                return j6g.a;
            case 3:
                y91 y91Var = (y91) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dx4 dx4VarG = y91Var.E().g();
                    boolean zX = bVar.x(y91Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new i30(y91Var, i4);
                        bVar.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar.x(y91Var);
                    Object objV2 = bVar.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new j30(y91Var, i4);
                        bVar.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar.x(y91Var);
                    Object objV3 = bVar.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new k30(y91Var, i4);
                        bVar.p(objV3);
                    }
                    ee3.g(dx4VarG, gu5Var, gu5Var2, (gu5) objV3, false, bVar, 24576);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 4:
                ForcedUpgradeFragment forcedUpgradeFragment = (ForcedUpgradeFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(781649555, new js0(forcedUpgradeFragment, i3), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                int i5 = pm6.m0;
                ((pm6) obj3).O(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                dh8.a((Function1) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                ((Integer) obj2).getClass();
                wg2.b((ah2) obj3, (b) obj, ka2.L(7));
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                ((faa) obj3).d(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                int i6 = fma.s0;
                ((fma) obj3).L(ka2.L(1), (b) obj);
                return j6g.a;
            case 10:
                ProfileFormsDebugFragment profileFormsDebugFragment = (ProfileFormsDebugFragment) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ne4 ne4Var2 = p97.a;
                    dd4 dd4Var2 = dd4.a;
                    ad4 ad4Var2 = dd4.n().a;
                    ad4Var2.getClass();
                    ad4Var2.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var2.a(h07.a), bh2.c(-277443008, new he4(profileFormsDebugFragment, 6), bVar3), bVar3, 56);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 11:
                Function2 function2 = (Function2) obj3;
                k38 k38Var = (k38) obj;
                String str = (String) obj2;
                str.getClass();
                int i7 = k38Var == null ? -1 : isb.a.a[k38Var.ordinal()];
                if (i7 == 1) {
                    pair = new Pair(hvb.V, "edit-accounting-license");
                } else if (i7 == 2) {
                    pair = new Pair(hvb.W, "edit-nursing-license");
                } else {
                    if (i7 != 3) {
                        return j6g.a;
                    }
                    pair = new Pair(hvb.X, "edit-driving-license");
                }
                hvb hvbVar = (hvb) pair.a();
                String str2 = (String) pair.b();
                str2.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", str2, null, null, 12));
                function2.invoke(hvbVar, str);
                return j6g.a;
            case 12:
                dbc dbcVar = (dbc) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rm2.a(b4g.a.a(Boolean.TRUE), bh2.c(-157066944, new js0(dbcVar, i2), bVar4), bVar4, 56);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 13:
                hed hedVar = (hed) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strI = ak2.I(R.string.rnmessaging_inbox_header_messages, bVar5);
                    String strI2 = ak2.I(R.string.rnmessaging_logged_out_screen_title, bVar5);
                    String strI3 = ak2.I(R.string.rnmessaging_logged_out_screen_subtitle, bVar5);
                    String strI4 = ak2.I(R.string.rnmessaging_create_account, bVar5);
                    String strI5 = ak2.I(R.string.rnmessaging_sign_in, bVar5);
                    x2b x2bVarA = z2b.a(R.drawable.hero_working_9, 0, bVar5);
                    boolean zX4 = bVar5.x(hedVar);
                    Object objV4 = bVar5.v();
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new k30(hedVar, 21);
                        bVar5.p(objV4);
                    }
                    w39.a(strI, strI2, strI3, strI4, strI5, x2bVarA, (gu5) objV4, bVar5, 0);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                jsd jsdVar = (jsd) obj3;
                u63.Y(jsdVar.Q1(), null, null, new lsd(jsdVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            default:
                String str3 = (String) obj3;
                b bVar6 = (b) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (bVar6.o(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    vq6.b(z2b.a(2131232539, 0, bVar6), str3, g.r(e.a.b, 70.0f), da2.i, bVar6, 3456, 0);
                } else {
                    bVar6.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ pj(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
