package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.vw6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        w73 w73Var;
        w73 w73Var2;
        kjf kjfVar;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        af1.a aVar = c20.a.m;
        e.a aVar2 = e.a.b;
        int i2 = 0;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(aVar2, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, aVar, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
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
                    String strI = ak2.I(R.string.label_license_type, bVar);
                    vw6.b bVar2 = new vw6.b((String) g4aVar.getValue());
                    boolean zX = bVar.x(ibaVar);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new ac(ibaVar, i3);
                        bVar.p(objV);
                    }
                    yw6.a(bVar2, (gu5) objV, null, strI, null, true, null, bVar, 100663302, 0, 1768);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                a20.a((Function2) obj4, (Function2) obj3, (b) obj, ka2.L(7));
                return j6g.a;
            case 2:
                Function2 function2 = (Function2) obj4;
                x73 x73Var = (x73) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                a83 a83Var = x73Var.b.b.get(iIntValue2).b;
                String str = (a83Var == null || (w73Var2 = a83Var.a) == null) ? null : w73Var2.a;
                if (str == null) {
                    str = "";
                }
                a83 a83Var2 = x73Var.b.b.get(iIntValue2).b;
                String str2 = (a83Var2 == null || (w73Var = a83Var2.a) == null) ? null : w73Var.b;
                function2.invoke(str, str2 != null ? str2 : "");
                return j6g.a;
            case 3:
                DisplayToastData displayToastData = (DisplayToastData) obj4;
                ut5 ut5Var = (ut5) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fv6 fv6Var = fv6.C1;
                    String str3 = displayToastData.b;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = displayToastData.a;
                    boolean zX2 = bVar3.x(ut5Var);
                    Object objV2 = bVar3.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new oq(ut5Var, 8);
                        bVar3.p(objV2);
                    }
                    tz6.a(390, 872, null, (gu5) objV2, fv6Var, bVar3, null, str4, str5, null, null, true);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                uc7.b((gu5) obj4, (hw9) obj3, (b) obj, ka2.L(65));
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                ym7.b((e8a) obj4, (bn7) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                b88.f((String) obj4, (ox7) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                faa faaVar = (faa) obj4;
                String str6 = (String) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    faaVar.b("Error", str6, bVar4, 6);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 8:
                p6c p6cVar = (p6c) obj4;
                o97 o97Var = (o97) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e eVarF = f.f(g.f(aVar2, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.k, bVar5, 54);
                    int iHashCode2 = Long.hashCode(bVar5.k());
                    t8b t8bVarM2 = bVar5.m();
                    e eVarC2 = c.c(bVar5, eVarF);
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
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar5, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar5, t8bVarM2, fVar);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar5, iHashCode2, c0251a2);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar5, eVarC2, eVar);
                    vs0.i iVar = new vs0.i(4.0f, true, new us0(i2));
                    ghd ghdVar = ghd.a;
                    e eVarA = ghdVar.a(aVar2, 3.0f);
                    ob2 ob2VarA2 = mb2.a(iVar, aVar, bVar5, 6);
                    int iHashCode3 = Long.hashCode(bVar5.k());
                    t8b t8bVarM3 = bVar5.m();
                    e eVarC3 = c.c(bVar5, eVarA);
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
                    ygg.y(bVar5, ob2VarA2, dVar);
                    ygg.y(bVar5, t8bVarM3, fVar);
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar5, iHashCode3, c0251a2);
                    }
                    ygg.y(bVar5, eVarC3, eVar);
                    String str7 = p6cVar.d;
                    cif.c(v1c.j(str7 != null ? str7 : ""), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, v1c.d(o97Var, true), bVar5, 0, 0, 131070);
                    b bVar6 = bVar5;
                    String str8 = p6cVar.e;
                    if (str8 == null) {
                        bVar6.L(-1434205386);
                    } else {
                        bVar6.L(-1434205385);
                        if (zve.U(str8)) {
                            bVar6.L(747975602);
                        } else {
                            bVar6.L(751047888);
                            qxb.b(str8, str8, bVar6, 0);
                        }
                        bVar6.F();
                        j6g j6gVar = j6g.a;
                    }
                    bVar6.F();
                    String strF = v1c.f(p6cVar.b, bVar6);
                    if (strF == null) {
                        bVar6.L(-1433877809);
                    } else {
                        bVar6.L(-1433877808);
                        if (zve.U(strF)) {
                            bVar6.L(-291060631);
                        } else {
                            bVar6.L(-287658846);
                            cif.b(strF, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.c, 0L, null, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777182), bVar6, 0, 0, 65534);
                            bVar6 = bVar6;
                        }
                        bVar6.F();
                        j6g j6gVar2 = j6g.a;
                    }
                    bVar6.F();
                    String str9 = p6cVar.c;
                    if (str9 == null) {
                        bVar6.L(-1433253314);
                    } else {
                        bVar6.L(-1433253313);
                        if (zve.U(str9)) {
                            bVar6.L(-769652758);
                        } else {
                            bVar6.L(-765613024);
                            r35.a(str9, null, "PublicationDataChipDescription", bVar6, 384, 26);
                        }
                        bVar6.F();
                        j6g j6gVar3 = j6g.a;
                    }
                    bVar6.F();
                    bVar6.q();
                    e eVarA2 = ghdVar.a(aVar2, 1.0f);
                    af1.b bVar7 = c20.a.j;
                    e eVarB = ghdVar.b(eVarA2, bVar7);
                    ehd ehdVarA2 = chd.a(vs0.b, bVar7, bVar6, 6);
                    int iHashCode4 = Long.hashCode(bVar6.k());
                    t8b t8bVarM4 = bVar6.m();
                    e eVarC4 = c.c(bVar6, eVarB);
                    if (bVar6.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar6.B();
                    if (bVar6.f()) {
                        bVar6.y(aVar4);
                    } else {
                        bVar6.n();
                    }
                    ygg.y(bVar6, ehdVarA2, dVar);
                    ygg.y(bVar6, t8bVarM4, fVar);
                    if (bVar6.f() || !wl7.b(bVar6.v(), Integer.valueOf(iHashCode4))) {
                        uz.g(iHashCode4, bVar6, iHashCode4, c0251a2);
                    }
                    ygg.y(bVar6, eVarC4, eVar);
                    lvb.a(null, R.drawable.ic_idl_publication_24, null, bVar6, 6);
                    bVar6.q();
                    bVar6.q();
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$27((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (us7) obj2);
            default:
                rgf rgfVar = (rgf) obj4;
                e13 e13Var = (e13) obj3;
                wcf wcfVar = (wcf) obj;
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) ((gme) rgfVar.m).getValue()).booleanValue();
                le0 le0VarL = rgfVar.l();
                String str10 = le0VarL != null ? le0VarL.b : null;
                kjf kjfVar2 = rgfVar.w;
                if (kjfVar2 != null) {
                    long j = kjfVar2.a;
                    roa roaVar = rgfVar.b;
                    kjfVar = new kjf(cr8.c(roaVar.c((int) (j >> 32)), roaVar.c((int) (j & 4294967295L))));
                } else {
                    kjfVar = null;
                }
                kcb.a(wcfVar, context, zBooleanValue, str10, kjfVar, rgfVar.i, new tq3(rgfVar, e13Var, context));
                return j6g.a;
        }
    }

    public /* synthetic */ jh(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
