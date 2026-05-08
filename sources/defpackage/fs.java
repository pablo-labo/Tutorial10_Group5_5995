package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fs implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fs(g4a g4aVar, g4a g4aVar2) {
        this.a = 1;
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String strE = null;
        b.a.C0020a c0020a = b.a.a;
        e.a aVar = e.a.b;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        int length = str.length();
                        objV = r.f(new jhf(str, cr8.c(length, length), 4));
                        bVar.p(objV);
                    }
                    g4a g4aVar2 = (g4a) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(lcf.c);
                        bVar.p(objV2);
                    }
                    g4a g4aVar3 = (g4a) objV2;
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = r.f(Boolean.FALSE);
                        bVar.p(objV3);
                    }
                    g4a g4aVar4 = (g4a) objV3;
                    e eVarA = nub.a(nub.b(f.h(aVar, v1c.e, 0.0f, 2)), b5gVar == b5g.c, "Add military service failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
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
                    ue7.a(ak2.I(qt9.MilitaryDescription.a(), bVar), false, ak2.I(R.string.military_description_subtext, bVar), 0L, 0.0f, null, bVar, 48, 56);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        objV4 = new ks(g4aVar2, g4aVar, 0);
                        bVar.p(objV4);
                    }
                    Function1 function1 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new ls(0, g4aVar3);
                        bVar.p(objV5);
                    }
                    Function1 function12 = (Function1) objV5;
                    lcf lcfVar = (lcf) g4aVar3.getValue();
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new ns(0, g4aVar4);
                        bVar.p(objV6);
                    }
                    pcf.a(jhfVar, function1, function12, lcfVar, (Function1) objV6, ((Boolean) g4aVar4.getValue()).booleanValue(), null, null, bVar, 25008);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g4a g4aVar5 = (g4a) obj3;
                g4a g4aVar6 = (g4a) obj4;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e eVarH = f.h(aVar, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar3);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar2, eVarC2, gl2.a.d);
                    String str2 = (String) g4aVar5.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    Object objV7 = bVar2.v();
                    if (objV7 == c0020a) {
                        objV7 = new ve(2, g4aVar5);
                        bVar2.p(objV7);
                    }
                    Function1 function13 = (Function1) objV7;
                    String strI = ak2.I(v6c.b.a(), bVar2);
                    String strI2 = ak2.I(R.string.url_field_label, bVar2);
                    Object objV8 = bVar2.v();
                    if (objV8 == c0020a) {
                        objV8 = new bw(0, g4aVar5);
                        bVar2.p(objV8);
                    }
                    gu5 gu5Var = (gu5) objV8;
                    if (((Boolean) g4aVar6.getValue()).booleanValue()) {
                        strE = l.e(bVar2, 1481507683, R.string.invalid_url_alert_text, bVar2);
                    } else {
                        bVar2.L(1481614478);
                        bVar2.F();
                    }
                    jyb.a(str3, function13, strI, false, strI2, false, null, null, gu5Var, true, null, "AddPublicationUrlTextField", null, null, strE, bVar2, 905972784, 48, 13536);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                gu5 gu5Var2 = (gu5) obj4;
                o97 o97Var = (o97) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x2b x2bVarA = z2b.a(R.drawable.cross_icon, 0, bVar3);
                    boolean zK = bVar3.K(gu5Var2);
                    Object objV9 = bVar3.v();
                    if (zK || objV9 == c0020a) {
                        objV9 = new ld(6, gu5Var2);
                        bVar3.p(objV9);
                    }
                    wq6.b(x2bVarA, ak2.I(R.string.close_icon, bVar3), androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV9, 15), o97Var.c.a.c, bVar3, 0, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ap9.a((x1e) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                s8c s8cVar = (s8c) obj4;
                x2b x2bVar = (x2b) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    f17.a(x2bVar, null, androidx.compose.ui.platform.f.a(g.f(aVar, 1.0f), "Image_" + s8cVar.a()), null, ft2.a.g, 0.0f, null, bVar4, 24624, 104);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$9((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (tr7) obj2);
        }
    }

    public /* synthetic */ fs(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ fs(x1e x1eVar, gu5 gu5Var, int i) {
        this.a = 3;
        this.c = x1eVar;
        this.b = gu5Var;
    }
}
