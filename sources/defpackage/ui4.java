package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ui4 implements wu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ui4(gu5 gu5Var, g4a g4aVar) {
        this.b = gu5Var;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        gu5 gu5Var = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new zv2(2, g4aVar);
                        bVar.p(objV);
                    }
                    b9g.a((Function1) objV, (String) g4aVar.getValue(), gu5Var, bVar, 54);
                } else {
                    bVar.D();
                }
                break;
            default:
                hne hneVar = (hne) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fv6 fv6Var = fv6.W1;
                    String strI = ak2.I(R.string.desc_close, bVar2);
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = new yb(9);
                        bVar2.p(objV2);
                    }
                    e eVarB = b5e.b(e.a.b, false, (Function1) objV2);
                    boolean zK = bVar2.K(hneVar) | bVar2.K(gu5Var);
                    Object objV3 = bVar2.v();
                    if (zK || objV3 == c0020a) {
                        objV3 = new jp0(10, hneVar, gu5Var);
                        bVar2.p(objV3);
                    }
                    ev6.a(fv6Var, f.a(androidx.compose.foundation.b.d(eVarB, false, null, null, (gu5) objV3, 15), "CloseButton"), null, null, 0L, strI, null, bVar2, 6, 92);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ui4(hne hneVar, gu5 gu5Var) {
        this.c = hneVar;
        this.b = gu5Var;
    }
}
