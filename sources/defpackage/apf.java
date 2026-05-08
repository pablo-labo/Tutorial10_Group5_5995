package defpackage;

import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.tosupdate.NullProctorPayloadException;
import defpackage.cd4;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapf;", "Lbrg;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class apf extends brg implements xh8 {
    public final g4a b = r.f(Boolean.FALSE);

    public final void g() {
        if (h()) {
            ((gme) this.b).setValue(Boolean.FALSE);
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            Long longValue = ad4Var.b(cd4.a.i0).getLongValue();
            if (longValue != null) {
                bu8 bu8Var = bu8.a;
                bu8Var.getClass();
                bu8.F0.b(bu8.b[43], bu8Var, longValue);
            } else {
                zof.a.a();
                String strConcat = "recordTosUpdateAcknowledged".concat(": null proctor payload");
                ArrayList arrayList = lz2.a;
                lz2.b("TosUpdateBannerLogger", strConcat, false, new NullProctorPayloadException(strConcat));
            }
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final boolean h() {
        return ((Boolean) ((gme) this.b).getValue()).booleanValue();
    }
}
