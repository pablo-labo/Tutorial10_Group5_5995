package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ww0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strI = ak2.I(R.string.messaging_attachment_preview_confirm, bVar);
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new yw0(0, gu5Var);
                        bVar.p(objV);
                    }
                    gt6.h(strI, (gu5) objV, g.f(e.a.b, 1.0f), null, false, false, null, null, null, bVar, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                irb.c(gu5Var, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }
}
