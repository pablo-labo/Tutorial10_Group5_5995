package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ xw0(int i, gu5 gu5Var) {
        this.a = 2;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        byte b = 0;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strI = ak2.I(R.string.messaging_attachment_preview_decline, bVar);
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new ta(2, gu5Var);
                        bVar.p(objV);
                    }
                    gt6.j(strI, (gu5) objV, g.f(e.a.b, 1.0f), null, false, false, null, null, null, bVar, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qi0.a(wg2.W, null, null, bh2.c(2092532005, new vqb(b == true ? 1 : 0, gu5Var), bVar2), 0.0f, null, null, bVar2, 3078, 246);
                } else {
                    bVar2.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                irb.e(gu5Var, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ xw0(gu5 gu5Var, int i, byte b) {
        this.a = i;
        this.b = gu5Var;
    }
}
