package defpackage;

import android.content.Context;
import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.R;
import defpackage.saa;
import defpackage.xh8;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcma;", "Ld4g;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cma extends d4g implements xh8 {
    public vv V;
    public final g4a d = r.f(Boolean.FALSE);
    public boolean e;
    public ig f;

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        if (!this.e) {
            ((np7) cr8.p(np7.class)).a("NotificationsTopNavViewModel", "updateTopNavState() skipped - not yet initialized");
            return;
        }
        List listZ = u63.Z(new raa(saa.a.a, (String) null, (String) null, (Integer) null, this.f, 30));
        g4a g4aVar = this.d;
        sof sofVar = null;
        if (!((Boolean) ((gme) g4aVar).getValue()).booleanValue()) {
            sofVar = new sof(((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.bottom_nav_top_bar_title_notifications), null, null, null, 30);
        }
        k(new c4g(sofVar, listZ, ((Boolean) ((gme) g4aVar).getValue()).booleanValue() ? u63.Z(new raa(saa.b.a, (String) null, (String) null, (Integer) null, this.V, 30)) : zr4.a, 24));
    }
}
