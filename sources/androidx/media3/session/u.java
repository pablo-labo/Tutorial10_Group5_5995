package androidx.media3.session;

import android.os.Handler;
import androidx.media3.session.r;
import defpackage.ij9;
import defpackage.ph1;
import defpackage.uk9;
import defpackage.vjg;
import defpackage.yv5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements yv5<List<ij9>> {
    public final /* synthetic */ r.d a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t c;

    public u(t tVar, r.d dVar, int i) {
        this.c = tVar;
        this.a = dVar;
        this.b = i;
    }

    @Override // defpackage.yv5
    public final void onSuccess(List<ij9> list) {
        List<ij9> list2 = list;
        s sVar = this.c.g;
        Handler handler = sVar.l;
        int i = this.b;
        r.d dVar = this.a;
        vjg.T(handler, new ph1(sVar, dVar, new uk9(i, 0, this, list2, dVar)));
    }

    @Override // defpackage.yv5
    public final void t(Throwable th) {
    }
}
