package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class m8i implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ f8i b;
    public final /* synthetic */ f8i c;
    public final /* synthetic */ long d;
    public final /* synthetic */ c8i e;

    public m8i(c8i c8iVar, Bundle bundle, f8i f8iVar, f8i f8iVar2, long j) {
        this.e = c8iVar;
        this.a = bundle;
        this.b = f8iVar;
        this.c = f8iVar2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.a;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c8i c8iVar = this.e;
        c8iVar.s(this.b, this.c, this.d, true, c8iVar.e().o(null, "screen_view", bundle, null, true, true));
    }
}
