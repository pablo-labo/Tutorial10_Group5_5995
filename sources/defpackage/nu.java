package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.facebook.react.bridge.Promise;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i2 = 2;
        int i3 = 1;
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
                    e eVarA = nub.a(nub.b(f.h(e.a.b, v1c.e, 0.0f, 2)), b5gVar == b5g.c, "Add patent failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
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
                    ue7.a(ak2.I(u5b.e.a(), bVar), false, null, 0L, 0.0f, null, bVar, 48, 60);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        objV4 = new pu(0, g4aVar2, g4aVar);
                        bVar.p(objV4);
                    }
                    Function1 function1 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new ns(1, g4aVar3);
                        bVar.p(objV5);
                    }
                    Function1 function12 = (Function1) objV5;
                    lcf lcfVar = (lcf) g4aVar3.getValue();
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new nc(2, g4aVar4);
                        bVar.p(objV6);
                    }
                    pcf.a(jhfVar, function1, function12, lcfVar, (Function1) objV6, ((Boolean) g4aVar4.getValue()).booleanValue(), null, null, bVar, 25008);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                pm0 pm0Var = (pm0) obj4;
                g gVar = (g) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zX = bVar2.x(pm0Var) | bVar2.x(gVar);
                    Object objV7 = bVar2.v();
                    if (zX || objV7 == c0020a) {
                        objV7 = new pa0(i3, pm0Var, gVar);
                        bVar2.p(objV7);
                    }
                    gu5 gu5Var = (gu5) objV7;
                    boolean zX2 = bVar2.x(pm0Var);
                    Object objV8 = bVar2.v();
                    if (zX2 || objV8 == c0020a) {
                        objV8 = new nj(pm0Var, 5);
                        bVar2.p(objV8);
                    }
                    gu5 gu5Var2 = (gu5) objV8;
                    boolean zX3 = bVar2.x(pm0Var);
                    Object objV9 = bVar2.v();
                    if (zX3 || objV9 == c0020a) {
                        objV9 = new nv(pm0Var, i2);
                        bVar2.p(objV9);
                    }
                    gu5 gu5Var3 = (gu5) objV9;
                    boolean zX4 = bVar2.x(pm0Var);
                    Object objV10 = bVar2.v();
                    if (zX4 || objV10 == c0020a) {
                        objV10 = new oj(pm0Var, 2);
                        bVar2.p(objV10);
                    }
                    gu5 gu5Var4 = (gu5) objV10;
                    boolean zX5 = bVar2.x(pm0Var);
                    Object objV11 = bVar2.v();
                    if (zX5 || objV11 == c0020a) {
                        objV11 = new fy(pm0Var, 1);
                        bVar2.p(objV11);
                    }
                    gu5 gu5Var5 = (gu5) objV11;
                    boolean zX6 = bVar2.x(pm0Var);
                    Object objV12 = bVar2.v();
                    if (zX6 || objV12 == c0020a) {
                        objV12 = new i30(pm0Var, i3);
                        bVar2.p(objV12);
                    }
                    hh2.b(gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, (gu5) objV12, bVar2, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                gu5 gu5Var6 = (gu5) obj4;
                o97 o97Var = (o97) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sq1.c(gu5Var6, null, null, null, bh2.c(1000028912, new sw0(o97Var, 3), bVar3), bVar3, 805306368, 510);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                e8a e8aVar = (e8a) obj4;
                Map map = (Map) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mld.f(e8aVar, v7a.c(map, j7f.a, bVar4), bVar4, 0);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 4:
                yvb yvbVar = (yvb) obj4;
                String str2 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean z = ((x1c) obj3).o().k;
                yvbVar.getClass();
                if (str2 != null && zBooleanValue && !yvbVar.v().c0.contains(str2) && z) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$14((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (bs7) obj2);
        }
    }
}
