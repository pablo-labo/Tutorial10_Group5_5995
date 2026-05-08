package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qa3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa3(gu5 gu5Var, gu5 gu5Var2, int i) {
        this.a = 3;
        this.c = gu5Var;
        this.b = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = null;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ra3.a(ka2.L(1), (gu5) obj4, (b) obj, (String) obj5);
                return j6g.a;
            case 1:
                o97 o97Var = (o97) obj5;
                kr4 kr4Var = (kr4) obj4;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    o97.a.e eVar = o97Var.c.a;
                    tjf tjfVar = o97Var.j.g;
                    e eVarF2 = f.f(eVarF, 16.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF2);
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
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    gl2.a.e eVar2 = gl2.a.d;
                    ygg.y(bVar, eVarC, eVar2);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar, 48);
                    int iHashCode2 = Long.hashCode(bVar.k());
                    t8b t8bVarM2 = bVar.m();
                    e eVarC2 = c.c(bVar, aVar);
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
                    ygg.y(bVar, ehdVarA, dVar);
                    ygg.y(bVar, t8bVarM2, fVar);
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar, iHashCode2, c0251a);
                    }
                    ygg.y(bVar, eVarC2, eVar2);
                    ev6.b(fv6.y1, g.n(aVar, 16.0f), null, null, 0L, null, bVar, 6, 60);
                    jh2.f(bVar, g.r(aVar, 8.0f));
                    cif.b(kr4Var.i, null, eVar.c, 0L, null, o97Var.f.b, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar, 0, 0, 65498);
                    bVar.q();
                    jh2.f(bVar, g.h(aVar, 8.0f));
                    cif.b(kr4Var.j, null, eVar.c, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, tjfVar, bVar, 0, 3120, 55290);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                vnd vndVar = (vnd) obj2;
                vndVar.getClass();
                u63.Y((e13) obj5, null, null, new o76((xu5) obj4, vndVar, (ljg) obj, sa8.a(new iq0(6)), null), 3);
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                f6a.a((gu5) obj4, (gu5) obj5, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                crb crbVar = (crb) obj5;
                zrd zrdVar = (zrd) obj4;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1c x1cVarQ = crbVar.Q();
                    yvb yvbVarP = crbVar.P();
                    aub aubVarO = crbVar.O();
                    p9d p9dVarR = crbVar.R();
                    j7d j7dVar = (j7d) crbVar.Z.getValue();
                    t41 t41Var = crbVar.f;
                    ArrayList arrayList = crbVar.c;
                    boolean zE = c0h.E();
                    lr5 lr5VarG = t40.g(crbVar);
                    boolean zBooleanValue = ((Boolean) ((gme) crbVar.e0).getValue()).booleanValue();
                    boolean zX = bVar2.x(crbVar);
                    Object objV = bVar2.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new ye(crbVar, 16);
                        bVar2.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar2.x(crbVar);
                    Object objV2 = bVar2.v();
                    int i2 = 18;
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new qa(crbVar, i2);
                        bVar2.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar2.x(crbVar);
                    Object objV3 = bVar2.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new wm1(crbVar, 14);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    boolean zX4 = bVar2.x(crbVar);
                    Object objV4 = bVar2.v();
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new cq0(crbVar, 11);
                        bVar2.p(objV4);
                    }
                    gu5 gu5Var4 = (gu5) objV4;
                    boolean zX5 = bVar2.x(crbVar);
                    Object objV5 = bVar2.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new o91(crbVar, 15);
                        bVar2.p(objV5);
                    }
                    gu5 gu5Var5 = (gu5) objV5;
                    boolean zX6 = bVar2.x(crbVar);
                    Object objV6 = bVar2.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new oq(crbVar, 19);
                        bVar2.p(objV6);
                    }
                    gu5 gu5Var6 = (gu5) objV6;
                    boolean zX7 = bVar2.x(crbVar);
                    Object objV7 = bVar2.v();
                    if (zX7 || objV7 == c0020a) {
                        objV7 = new dd(crbVar, 16);
                        bVar2.p(objV7);
                    }
                    gu5 gu5Var7 = (gu5) objV7;
                    boolean zX8 = bVar2.x(crbVar);
                    Object objV8 = bVar2.v();
                    int i3 = 20;
                    if (zX8 || objV8 == c0020a) {
                        objV8 = new qq(crbVar, 20);
                        bVar2.p(objV8);
                    }
                    gu5 gu5Var8 = (gu5) objV8;
                    boolean zX9 = bVar2.x(crbVar);
                    Object objV9 = bVar2.v();
                    if (zX9 || objV9 == c0020a) {
                        objV9 = new pe0(crbVar, 9);
                        bVar2.p(objV9);
                    }
                    Function1 function1 = (Function1) objV9;
                    boolean zX10 = bVar2.x(crbVar);
                    Object objV10 = bVar2.v();
                    if (zX10 || objV10 == c0020a) {
                        objV10 = new ok4(crbVar, 4);
                        bVar2.p(objV10);
                    }
                    Function2 function2 = (Function2) objV10;
                    boolean zX11 = bVar2.x(crbVar);
                    Object objV11 = bVar2.v();
                    if (zX11 || objV11 == c0020a) {
                        objV11 = new hg(crbVar, 5);
                        bVar2.p(objV11);
                    }
                    Function1 function12 = (Function1) objV11;
                    boolean zX12 = bVar2.x(crbVar);
                    Object objV12 = bVar2.v();
                    if (zX12 || objV12 == c0020a) {
                        objV12 = new vv(crbVar, 18);
                        bVar2.p(objV12);
                    }
                    gu5 gu5Var9 = (gu5) objV12;
                    boolean zX13 = bVar2.x(crbVar);
                    Object objV13 = bVar2.v();
                    if (zX13 || objV13 == c0020a) {
                        objV13 = new oa(crbVar, i3);
                        bVar2.p(objV13);
                    }
                    gu5 gu5Var10 = (gu5) objV13;
                    boolean zX14 = bVar2.x(crbVar);
                    Object objV14 = bVar2.v();
                    if (zX14 || objV14 == c0020a) {
                        objV14 = new hr(crbVar, 12);
                        bVar2.p(objV14);
                    }
                    isb.a(x1cVarQ, yvbVarP, aubVarO, p9dVarR, j7dVar, t41Var, arrayList, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, gu5Var8, function1, function2, function12, gu5Var9, gu5Var10, (gu5) objV14, zrdVar, zE, lr5VarG, zBooleanValue, bVar2, 36864);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 5:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$1((Promise) obj5, (RNProfileFormsModule) obj4, (ps7) obj, (ss7) obj2);
            case 6:
                g4a g4aVar = (g4a) obj4;
                String str = (String) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                str.getClass();
                Iterator it = ((List) obj5).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((sjb) next).a.equals(str)) {
                            obj3 = next;
                        }
                    }
                }
                sjb sjbVar = (sjb) obj3;
                List list = (List) g4aVar.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list) {
                    if (!wl7.b((sjb) obj6, sjbVar)) {
                        arrayList2.add(obj6);
                    }
                }
                g4aVar.setValue(arrayList2);
                if (zBooleanValue2 && sjbVar != null) {
                    g4aVar.setValue(z92.g1(sjbVar, (List) g4aVar.getValue()));
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                x9f.b((d4g) obj5, (gu5) obj4, (b) obj, ka2.L(9));
                return j6g.a;
        }
    }

    public /* synthetic */ qa3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ qa3(int i, int i2, gu5 gu5Var, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = gu5Var;
    }
}
