package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y02 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ y02(int i, gu5 gu5Var) {
        this.a = 2;
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
                    m12.a(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strI = ak2.I(R.string.messaging_done, bVar2);
                    boolean zK = bVar2.K(gu5Var);
                    Object objV = bVar2.v();
                    if (zK || objV == b.a.a) {
                        objV = new eb(4, gu5Var);
                        bVar2.p(objV);
                    }
                    gt6.h(strI, (gu5) objV, f.a(g.f(e.a.b, 1.0f), "moveToSpamButton"), null, false, false, null, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                } else {
                    bVar2.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nj6.b(gu5Var, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ y02(gu5 gu5Var, int i, byte b) {
        this.a = i;
        this.b = gu5Var;
    }
}
