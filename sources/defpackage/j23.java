package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j23 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j23(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 3;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                hne hneVar = (hne) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.W1;
                    boolean zK = bVar.K(hneVar) | bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == c0020a) {
                        objV = new rr(i2, hneVar, gu5Var);
                        bVar.p(objV);
                    }
                    ev6.b(fv6Var, f.a(androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV, 15), "CloseButton"), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e eVarH = androidx.compose.foundation.layout.f.h(e.a.b, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    String strE = null;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    String str = (String) g4aVar.getValue();
                    if (str == null) {
                        str = "";
                    }
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = new ns(3, g4aVar);
                        bVar2.p(objV2);
                    }
                    Function1 function1 = (Function1) objV2;
                    String strI = ak2.I(R.string.url_field_label, bVar2);
                    String strI2 = ak2.I(R.string.url_field_label, bVar2);
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = new fl4(0, g4aVar);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var2 = (gu5) objV3;
                    if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                        strE = l.e(bVar2, -1377617192, R.string.invalid_url_alert_text, bVar2);
                    } else {
                        bVar2.L(-1377497656);
                        bVar2.F();
                    }
                    jyb.a(str, function1, strI, false, strI2, false, null, null, gu5Var2, true, null, "EditPatentUrl", null, null, strE, bVar2, 905972784, 48, 13536);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
