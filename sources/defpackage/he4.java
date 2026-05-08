package defpackage;

import android.content.Context;
import androidx.compose.animation.i;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment.a;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class he4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ he4(wj7 wj7Var, int i) {
        this.a = 3;
        this.b = wj7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tg2 tg2Var = (tg2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator<T> it = tg2Var.c.iterator();
                    while (it.hasNext()) {
                        le4.b((tg2) it.next(), null, bVar, 0, 2);
                    }
                } else {
                    bVar.D();
                }
                break;
            case 1:
                GhostwriterDebugFragment ghostwriterDebugFragment = (GhostwriterDebugFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objV = bVar2.v();
                    if (objV == c0020a) {
                        m74 m74Var = to4.a;
                        k kVar = new k(bVar2.l());
                        bVar2.p(kVar);
                        objV = kVar;
                    }
                    e13 e13Var = (e13) objV;
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f("");
                        bVar2.p(objV2);
                    }
                    g4a g4aVar = (g4a) objV2;
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = r.f(Boolean.FALSE);
                        bVar2.p(objV3);
                    }
                    g4a g4aVar2 = (g4a) objV3;
                    Boolean bool = (Boolean) g4aVar2.getValue();
                    bool.booleanValue();
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new GhostwriterDebugFragment.b(g4aVar2, null);
                        bVar2.p(objV4);
                    }
                    to4.d(bVar2, bool, (Function2) objV4);
                    rm2.a(p97.a.a(h07.a), bh2.c(361294122, new v66(ghostwriterDebugFragment, e13Var, g4aVar, g4aVar2, 0), bVar2), bVar2, 56);
                    boolean zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
                    fv6 fv6Var = fv6.C1;
                    String str = (String) g4aVar.getValue();
                    Object objV5 = bVar2.v();
                    if (objV5 == c0020a) {
                        objV5 = new su(1, g4aVar2);
                        bVar2.p(objV5);
                    }
                    tz6.a(12583296, 888, null, (gu5) objV5, fv6Var, bVar2, null, str, null, null, null, zBooleanValue);
                } else {
                    bVar2.D();
                }
                break;
            case 2:
                String str2 = (String) obj;
                ((Boolean) obj2).getClass();
                str2.getClass();
                g3a<jz2<j6g>> g3aVar = kqg.a;
                lr5 lr5VarU = ((IanMainFragment) obj3).requireActivity().u();
                lr5VarU.getClass();
                kqg.a(str2, lr5VarU, true, "relevant-jobs");
                break;
            case 3:
                ((Integer) obj2).getClass();
                vj7.c((wj7) obj3, (b) obj, ka2.L(1));
                break;
            case 4:
                bhd bhdVar = (bhd) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str3 = bhdVar.a;
                    fif.b(new String(new int[]{Character.toUpperCase(str3.charAt(0)) + 61861, Character.toUpperCase(str3.charAt(1)) + 61861}, 0, 2), null, 0L, hh2.t(30), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 3072, 0, 131062);
                } else {
                    bVar3.D();
                }
                break;
            case 5:
                fma fmaVar = (fma) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i2 = fma.s0;
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i.e(((Boolean) ((gme) ((o8c) fmaVar.m0.getValue()).b).getValue()).booleanValue(), null, null, null, null, bh2.c(-422060047, new ema(fmaVar, z ? 1 : 0), bVar4), bVar4, 196608, 30);
                } else {
                    bVar4.D();
                }
                break;
            case 6:
                final ProfileFormsDebugFragment profileFormsDebugFragment = (ProfileFormsDebugFragment) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objV6 = bVar5.v();
                    if (objV6 == c0020a) {
                        objV6 = r.f(null);
                        bVar5.p(objV6);
                    }
                    g4a g4aVar3 = (g4a) objV6;
                    Object objV7 = bVar5.v();
                    if (objV7 == c0020a) {
                        objV7 = r.f(Boolean.TRUE);
                        bVar5.p(objV7);
                    }
                    g4a g4aVar4 = (g4a) objV7;
                    j6g j6gVar = j6g.a;
                    boolean zX = bVar5.x(profileFormsDebugFragment);
                    Object objV8 = bVar5.v();
                    if (zX || objV8 == c0020a) {
                        objV8 = profileFormsDebugFragment.new a(g4aVar3, g4aVar4, null);
                        bVar5.p(objV8);
                    }
                    to4.d(bVar5, j6gVar, (Function2) objV8);
                    List list = (List) g4aVar3.getValue();
                    boolean zBooleanValue2 = ((Boolean) g4aVar4.getValue()).booleanValue();
                    boolean zX2 = bVar5.x(profileFormsDebugFragment);
                    Object objV9 = bVar5.v();
                    if (zX2 || objV9 == c0020a) {
                        objV9 = new ye(profileFormsDebugFragment, 15);
                        bVar5.p(objV9);
                    }
                    gu5 gu5Var = (gu5) objV9;
                    boolean zX3 = bVar5.x(profileFormsDebugFragment);
                    Object objV10 = bVar5.v();
                    if (zX3 || objV10 == c0020a) {
                        objV10 = new xu5() { // from class: pqb
                            @Override // defpackage.xu5
                            public final Object j(Object obj4, Object obj5, Object obj6, Object obj7) {
                                String str4 = (String) obj4;
                                String str5 = (String) obj5;
                                str4.getClass();
                                str5.getClass();
                                profileFormsDebugFragment.E(str4, str5, (String) obj6, (Map) obj7, false);
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV10);
                    }
                    xu5 xu5Var = (xu5) objV10;
                    boolean zX4 = bVar5.x(profileFormsDebugFragment);
                    Object objV11 = bVar5.v();
                    if (zX4 || objV11 == c0020a) {
                        objV11 = new xu5() { // from class: qqb
                            @Override // defpackage.xu5
                            public final Object j(Object obj4, Object obj5, Object obj6, Object obj7) {
                                String str4 = (String) obj4;
                                String str5 = (String) obj5;
                                str4.getClass();
                                str5.getClass();
                                profileFormsDebugFragment.E(str4, str5, (String) obj6, (Map) obj7, true);
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV11);
                    }
                    xu5 xu5Var2 = (xu5) objV11;
                    boolean zX5 = bVar5.x(profileFormsDebugFragment);
                    Object objV12 = bVar5.v();
                    if (zX5 || objV12 == c0020a) {
                        objV12 = new xd(profileFormsDebugFragment, 13);
                        bVar5.p(objV12);
                    }
                    yqb.f(list, zBooleanValue2, gu5Var, xu5Var, xu5Var2, (Function2) objV12, bVar5, 0);
                } else {
                    bVar5.D();
                }
                break;
            case 7:
                ps7 ps7Var = (ps7) obj;
                ps7Var.getClass();
                ((wu5) obj3).q(ps7Var, (yr7) obj2, "Languages");
                break;
            case 8:
                fnf fnfVar = (fnf) obj3;
                b bVar6 = (b) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (bVar6.o(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zmf.a(fnfVar, "ReportSpamScreen", bVar6, 48);
                } else {
                    bVar6.D();
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                mud mudVar = (mud) obj3;
                b bVar7 = (b) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i3 = mud.t0;
                if (bVar7.o(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fv6 fv6Var2 = fv6.C1;
                    String string = mudVar.getString(R.string.auto_apply_started_toast_title);
                    string.getClass();
                    String string2 = mudVar.getString(R.string.auto_apply_started_toast_message);
                    Long lValueOf = Long.valueOf(TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS);
                    boolean zX6 = bVar7.x(mudVar);
                    Object objV13 = bVar7.v();
                    if (zX6 || objV13 == c0020a) {
                        objV13 = new ye(mudVar, 22);
                        bVar7.p(objV13);
                    }
                    tz6.b(string, string2, fv6Var2, lValueOf, (gu5) objV13, bVar7, 221238, 0);
                } else {
                    bVar7.D();
                }
                break;
            case 10:
                j4e j4eVar = (j4e) obj3;
                wcf wcfVar = (wcf) obj;
                Context context = (Context) obj2;
                Pair<le0, kjf> pairE = j4eVar.e();
                kcb.a(wcfVar, context, false, pairE != null ? pairE.d() : null, pairE != null ? pairE.e() : null, j4eVar.x, new gv2(3, j4eVar, context));
                break;
            default:
                final w0g w0gVar = (w0g) obj3;
                b bVar8 = (b) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (bVar8.o(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    final boolean zBooleanValue3 = ((Boolean) ((gme) w0gVar.N().c).getValue()).booleanValue();
                    nde ndeVar = w0gVar.N().b;
                    boolean zX7 = bVar8.x(w0gVar);
                    Object objV14 = bVar8.v();
                    if (zX7 || objV14 == c0020a) {
                        objV14 = new mz(w0gVar);
                        bVar8.p(objV14);
                    }
                    gu5 gu5Var2 = (gu5) objV14;
                    boolean zX8 = bVar8.x(w0gVar);
                    Object objV15 = bVar8.v();
                    if (zX8 || objV15 == c0020a) {
                        objV15 = new la(w0gVar, 27);
                        bVar8.p(objV15);
                    }
                    gu5 gu5Var3 = (gu5) objV15;
                    boolean zX9 = bVar8.x(w0gVar);
                    Object objV16 = bVar8.v();
                    if (zX9 || objV16 == c0020a) {
                        objV16 = new ig(w0gVar, 26);
                        bVar8.p(objV16);
                    }
                    ca3.a(ndeVar, gu5Var2, gu5Var3, (gu5) objV16, bh2.c(-20804464, new Function2() { // from class: v0g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            b bVar9 = (b) obj4;
                            int iIntValue9 = ((Integer) obj5).intValue();
                            if (!bVar9.o(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                bVar9.D();
                            } else if (zBooleanValue3) {
                                bVar9.L(-1310439823);
                                e eVarB = androidx.compose.foundation.a.b(g.d(e.a.b, 1.0f), da2.b(da2.b, 0.2f), ytc.a);
                                ag9 ag9VarD = hl1.d(c20.a.e, false);
                                int iG = bVar9.G();
                                t8b t8bVarM = bVar9.m();
                                e eVarC = c.c(bVar9, eVarB);
                                gl2.j.getClass();
                                pm8.a aVar = gl2.a.b;
                                if (bVar9.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar9.B();
                                if (bVar9.f()) {
                                    bVar9.y(aVar);
                                } else {
                                    bVar9.n();
                                }
                                ygg.y(bVar9, ag9VarD, gl2.a.g);
                                ygg.y(bVar9, t8bVarM, gl2.a.f);
                                gl2.a.C0251a c0251a = gl2.a.j;
                                if (bVar9.f() || !wl7.b(bVar9.v(), Integer.valueOf(iG))) {
                                    uz.g(iG, bVar9, iG, c0251a);
                                }
                                ygg.y(bVar9, eVarC, gl2.a.d);
                                tx6.a(null, ak2.I(R.string.uip_cbsm_loading_a11y_desc, bVar9), false, null, bVar9, 0, 13);
                                bVar9.q();
                                bVar9.F();
                            } else {
                                bVar9.L(-1309969491);
                                w0gVar.M(0, bVar9);
                                bVar9.F();
                            }
                            return j6g.a;
                        }
                    }, bVar8), bVar8, 24576);
                } else {
                    bVar8.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ he4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
