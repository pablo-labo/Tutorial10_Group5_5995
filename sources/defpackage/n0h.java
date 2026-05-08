package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class n0h extends ContentObserver {
    public final /* synthetic */ go1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0h(go1 go1Var, Handler handler) {
        super(handler);
        this.a = go1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.f(j6g.a);
    }
}
