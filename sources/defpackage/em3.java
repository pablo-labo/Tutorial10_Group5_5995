package defpackage;

import androidx.media3.session.legacy.c;
import androidx.media3.session.n;
import androidx.media3.session.r;
import defpackage.fm3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class em3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ em3(fm3.a.C0234a c0234a, jv1 jv1Var, Throwable th) {
        this.b = c0234a;
        this.c = jv1Var;
        this.d = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fm3.a.C0234a c0234a = (fm3.a.C0234a) this.b;
                ((jv1) this.c).a(fm3.a.this, (Throwable) this.d);
                return;
            default:
                throw null;
        }
    }

    public /* synthetic */ em3(n nVar, r.d dVar, c.h hVar, String str) {
        this.b = nVar;
        this.c = dVar;
        this.d = hVar;
    }
}
