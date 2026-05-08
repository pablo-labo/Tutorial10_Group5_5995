package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.bridge.Promise;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lx(int i, gu5 gu5Var, String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                yvb yvbVar = (yvb) obj5;
                ese eseVar = (ese) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.D();
                } else if (((dqb) eseVar.getValue()).c) {
                    bVar.L(-536886761);
                    boolean zX = bVar.x(yvbVar);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new gx(0, yvbVar, g4aVar);
                        bVar.p(objV);
                    }
                    rg0.a((gu5) objV, bVar, 0);
                    bVar.F();
                } else if (((dqb) eseVar.getValue()).b) {
                    bVar.L(-536584170);
                    e.a aVar = e.a.b;
                    e eVarB = a.b(g.d(aVar, 1.0f), da2.b(da2.b, 0.2f), ytc.a);
                    ag9 ag9VarD = hl1.d(c20.a.e, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarB);
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
                    tx6.a(f.a(aVar, "LoadingSpinner"), "", false, null, bVar, 54, 12);
                    bVar.q();
                    bVar.F();
                } else {
                    if (((dqb) eseVar.getValue()).f) {
                        bVar.L(-536008841);
                        x73 x73Var = ((dqb) eseVar.getValue()).a;
                        String str = ((dqb) eseVar.getValue()).d;
                        boolean zX2 = bVar.x(yvbVar);
                        Object objV2 = bVar.v();
                        if (zX2 || objV2 == c0020a) {
                            objV2 = new lr(yvbVar, i2);
                            bVar.p(objV2);
                        }
                        v73.a(x73Var, str, (Function2) objV2, bVar, 0);
                    } else {
                        bVar.L(-554717930);
                    }
                    bVar.F();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                olb.a(ka2.L(1), (gu5) obj3, (b) obj, (String) obj5, (String) obj4);
                return j6g.a;
            case 2:
                return RNTareBridge.createProfilePreferencesOnCompletionPromise$lambda$30((RNTareBridge) obj5, (Promise) obj4, (tsb) obj3, (hs7) obj, obj2);
            default:
                Function1 function1 = (Function1) obj5;
                ig3 ig3Var = (ig3) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zK = bVar2.K(function1);
                    Object objV3 = bVar2.v();
                    if (zK || objV3 == c0020a) {
                        objV3 = new t9(function1, 4);
                        bVar2.p(objV3);
                    }
                    Function1 function12 = (Function1) objV3;
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new uq(5, g4aVar2);
                        bVar2.p(objV4);
                    }
                    qgg.a(function12, ig3Var, (Function1) objV4, bVar2, 3078, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ lx(xh8 xh8Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = xh8Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ lx(Function1 function1, ig3 ig3Var, g4a g4aVar) {
        this.a = 3;
        this.b = function1;
        this.c = ig3Var;
        this.d = g4aVar;
    }
}
