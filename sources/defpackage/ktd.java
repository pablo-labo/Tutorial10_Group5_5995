package defpackage;

import android.os.Bundle;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import androidx.navigation.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.yzd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ktd implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ktd(o97 o97Var, yzd yzdVar, Function1 function1, g4a g4aVar) {
        this.b = o97Var;
        this.c = yzdVar;
        this.d = function1;
        this.e = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar;
        e eVarK;
        int i = this.a;
        e.a aVar = e.a.b;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj3;
                String str2 = (String) obj6;
                zrd zrdVar = (zrd) obj5;
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (str != null) {
                        bVar2.L(-1281539142);
                        cif.b(str, pnb.M(f.a(aVar, str2.concat("_Placeholder")), zrdVar, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjf.a(o97Var.j.f, o97Var.c.a.b, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar2, 0, 3120, 55292);
                        bVar = bVar2;
                    } else {
                        bVar = bVar2;
                        bVar.L(-1297125446);
                    }
                    bVar.F();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                o97 o97Var2 = (o97) obj4;
                yzd yzdVar = (yzd) obj3;
                Function1 function1 = (Function1) obj6;
                g4a g4aVar = (g4a) obj5;
                b bVar3 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.e eVarB = a.b(g.d(aVar, 1.0f), o97Var2.c.b.a, ytc.a);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    androidx.compose.ui.e eVarC = c.c(bVar3, eVarB);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar2);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ag9VarD, gl2.a.g);
                    ygg.y(bVar3, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    ygg.y(bVar3, eVarC, gl2.a.d);
                    String str3 = (String) g4aVar.getValue();
                    Bundle arguments = yzdVar.getArguments();
                    String string = arguments != null ? arguments.getString("initiateToken") : null;
                    Bundle arguments2 = yzdVar.getArguments();
                    boolean z = arguments2 != null ? arguments2.getBoolean("fromDeepLink") : false;
                    Bundle arguments3 = yzdVar.getArguments();
                    String string2 = arguments3 != null ? arguments3.getString("presetDraftText") : null;
                    y1e y1eVar = (y1e) yzdVar.d.getValue();
                    i3d i3dVar = (i3d) yzdVar.e.getValue();
                    fnf fnfVar = (fnf) yzdVar.V.getValue();
                    boolean zX = bVar3.x(yzdVar);
                    Object objV = bVar3.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new a3(yzdVar, 22);
                        bVar3.p(objV);
                    }
                    Function1 function12 = (Function1) objV;
                    kta ktaVar = (kta) yzdVar.f.getValue();
                    boolean zX2 = bVar3.x(yzdVar);
                    Object objV2 = bVar3.v();
                    if (zX2 || objV2 == c0020a) {
                        yzd.a aVar3 = new yzd.a(0, yzdVar, yzd.class, "shouldShowCameraPermissionRationale", "shouldShowCameraPermissionRationale()Z", 0);
                        bVar3.p(aVar3);
                        objV2 = aVar3;
                    }
                    gu5 gu5Var = (gu5) ((ve8) objV2);
                    boolean zX3 = bVar3.x(yzdVar);
                    Object objV3 = bVar3.v();
                    if (zX3 || objV3 == c0020a) {
                        yzd.b bVar4 = new yzd.b(1, yzdVar, yzd.class, "openAppSettings", "openAppSettings(Lkotlinx/coroutines/flow/MutableStateFlow;)V", 0);
                        bVar3.p(bVar4);
                        objV3 = bVar4;
                    }
                    Function1 function13 = (Function1) ((ve8) objV3);
                    androidx.fragment.app.g gVarRequireActivity = yzdVar.requireActivity();
                    lr5 lr5VarU = yzdVar.requireActivity().u();
                    try {
                        eVarK = mh2.k(yzdVar);
                    } catch (IllegalStateException unused) {
                        eVarK = null;
                    }
                    Bundle arguments4 = yzdVar.getArguments();
                    q0e.a(str3, string, z, string2, y1eVar, i3dVar, fnfVar, function12, ktaVar, gu5Var, function13, gVarRequireActivity, lr5VarU, eVarK, function1, arguments4 != null ? arguments4.getString("sessionSource") : null, bVar3, 0);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                h7g.a((androidx.compose.ui.e) obj6, (gu5) obj5, (String) obj3, (gu5) obj4, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                jyg.b((lsc) obj6, (gu5) obj5, (gu5) obj4, (String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ ktd(lsc lscVar, gu5 gu5Var, gu5 gu5Var2, String str, int i) {
        this.d = lscVar;
        this.e = gu5Var;
        this.b = gu5Var2;
        this.c = str;
    }

    public /* synthetic */ ktd(androidx.compose.ui.e eVar, gu5 gu5Var, String str, gu5 gu5Var2, int i) {
        this.d = eVar;
        this.e = gu5Var;
        this.c = str;
        this.b = gu5Var2;
    }

    public /* synthetic */ ktd(String str, String str2, zrd zrdVar, o97 o97Var) {
        this.c = str;
        this.d = str2;
        this.e = zrdVar;
        this.b = o97Var;
    }
}
