package defpackage;

import android.content.Context;
import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.R;
import defpackage.saa;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkt5;", "Ld4g;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kt5 extends d4g implements xh8 {
    public oa V;
    public final g4a d = r.f(Boolean.FALSE);
    public boolean e;
    public vv f;

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        if (!this.e) {
            ((np7) cr8.p(np7.class)).a("FsdvTopNavViewModel", "updateTopNavState() skipped - not yet initialized");
            return;
        }
        List listZ = u63.Z(new raa(saa.a.a, (String) null, (String) null, (Integer) null, this.f, 30));
        ArrayList arrayList = new ArrayList();
        if (((Boolean) ((gme) this.d).getValue()).booleanValue()) {
            dd4 dd4Var = dd4.a;
            if (!dd4.h()) {
                arrayList.add(new raa(new saa.d(R.drawable.ic_idl_home_24), (String) null, ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.a11y_home_button), (Integer) null, this.V, 26));
            }
        } else {
            arrayList.add(new raa(saa.b.a, (String) null, (String) null, (Integer) null, this.V, 30));
        }
        k(new c4g(null, listZ, arrayList, 25));
    }
}
