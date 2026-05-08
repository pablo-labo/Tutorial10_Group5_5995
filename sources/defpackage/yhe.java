package defpackage;

import defpackage.xhe;

/* JADX INFO: loaded from: classes.dex */
public final class yhe implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xhe.c.a b;

    public yhe(xhe.c.a aVar, boolean z) {
        this.b = aVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xjg.a();
        xhe.c cVar = xhe.c.this;
        boolean z = cVar.a;
        boolean z2 = this.a;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
