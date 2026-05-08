package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class oah implements Runnable {
    public final /* synthetic */ qah a;

    public oah(qah qahVar) {
        this.a = qahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k.b(new ConnectionResult(4, null, null));
    }
}
