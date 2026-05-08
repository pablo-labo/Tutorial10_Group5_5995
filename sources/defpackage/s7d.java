package defpackage;

import defpackage.d78;

/* JADX INFO: loaded from: classes3.dex */
public final class s7d<T> extends bz7 {
    public final d78.a e;

    public s7d(d78.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.bz7
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bz7
    public final void j(Throwable th) {
        Object obj = d78.a.get(h());
        boolean z = obj instanceof rf2;
        d78.a aVar = this.e;
        if (z) {
            aVar.resumeWith(r7d.a(((rf2) obj).a));
        } else {
            aVar.resumeWith(pnb.R(obj));
        }
    }
}
