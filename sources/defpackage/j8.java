package defpackage;

import defpackage.m8;

/* JADX INFO: loaded from: classes.dex */
public final class j8 implements Runnable {
    public final /* synthetic */ m8.a a;
    public final /* synthetic */ Object b;

    public j8(m8.a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
