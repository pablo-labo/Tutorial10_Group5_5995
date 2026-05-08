package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xb(ude udeVar, Context context, int i) {
        this.a = 2;
        this.c = udeVar;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        e.a aVar = e.a.b;
        int i2 = 2;
        int i3 = 0;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(aVar, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
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
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String str2 = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new nc(0, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    String strI = ak2.I(qu0.a.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new oc(i3, g4aVar);
                        bVar.p(objV2);
                    }
                    jyb.a(str2, function1, strI, true, str, false, null, null, (gu5) objV2, true, null, "AddAssociationTitle", null, null, null, bVar, 905972784, 48, 29920);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g4a g4aVar2 = (g4a) obj3;
                g4a g4aVar3 = (g4a) obj4;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e eVarH2 = f.h(aVar, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarH2);
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
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar2, eVarC2, gl2.a.d);
                    tg3 tg3Var = (tg3) g4aVar2.getValue();
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = new pj(g4aVar2, i2);
                        bVar2.p(objV3);
                    }
                    Function2 function2 = (Function2) objV3;
                    String strI2 = ak2.I(R.string.date_published, bVar2);
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new nc(3, g4aVar3);
                        bVar2.p(objV4);
                    }
                    gz9.b(tg3Var, function2, strI2, false, (Function1) objV4, 0, bVar2, 1597488, 168);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                qq0.h((ude) obj4, (Context) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                gu5 gu5Var = (gu5) obj4;
                gu5 gu5Var2 = (gu5) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xra.b(gu5Var, gu5Var2, bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                o97 o97Var = (o97) obj3;
                String str3 = (String) obj4;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e eVarF = g.f(aVar, 1.0f);
                    o97.g gVar = o97Var.i;
                    e eVarF2 = f.f(eVarF, 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.j, bVar4, 6);
                    int iHashCode3 = Long.hashCode(bVar4.k());
                    t8b t8bVarM3 = bVar4.m();
                    e eVarC3 = c.c(bVar4, eVarF2);
                    gl2.j.getClass();
                    pm8.a aVar4 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar4);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA, gl2.a.g);
                    ygg.y(bVar4, t8bVarM3, gl2.a.f);
                    gl2.a.C0251a c0251a3 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar4, iHashCode3, c0251a3);
                    }
                    ygg.y(bVar4, eVarC3, gl2.a.d);
                    cif.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, v1c.d(o97Var, false), bVar4, 0, 0, 65534);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 5:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$3((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (qs7) obj2);
            default:
                iuc iucVar = (iuc) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f = iucVar.element;
                iucVar.element = ((xrd) obj3).e(fFloatValue - f) + f;
                return j6g.a;
        }
    }

    public /* synthetic */ xb(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xb(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
