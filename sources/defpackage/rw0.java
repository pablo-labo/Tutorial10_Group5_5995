package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rw0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ rw0(gu5 gu5Var) {
        this.a = 0;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strI = ak2.I(R.string.messaging_attachment_preview_download, bVar);
                    fv6 fv6Var = fv6.a3;
                    e eVarF = g.f(e.a.b, 1.0f);
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new cr(1, gu5Var);
                        bVar.p(objV);
                    }
                    gt6.m(strI, (gu5) objV, eVarF, null, false, fv6Var, null, bVar, 1573248, 440);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                irb.b(gu5Var, (b) obj, ka2.L(7));
                break;
            default:
                ((Integer) obj2).getClass();
                ugg.a(gu5Var, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ rw0(int i, int i2, gu5 gu5Var) {
        this.a = i2;
        this.b = gu5Var;
    }
}
