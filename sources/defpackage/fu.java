package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    String strE = null;
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
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String str = (String) g4aVar.getValue();
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new tu(0, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    u5b u5bVar = u5b.c;
                    String strI = ak2.I(u5bVar.a(), bVar);
                    String strI2 = ak2.I(u5bVar.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new uu(0, g4aVar);
                        bVar.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                        strE = l.e(bVar, -1214912463, R.string.invalid_url_alert_text, bVar);
                    } else {
                        bVar.L(-1214802600);
                        bVar.F();
                    }
                    jyb.a(str2, function1, strI, false, strI2, false, null, null, gu5Var, true, null, "AddPatentUrlTextField", null, null, strE, bVar, 905972784, 48, 13536);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ym7.d((e8a) obj4, (ss8) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$22((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (cs7) obj2);
            default:
                ((Integer) obj2).getClass();
                gxc.a((gu5) obj4, (e) obj3, (b) obj, ka2.L(49));
                return j6g.a;
        }
    }

    public /* synthetic */ fu(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
