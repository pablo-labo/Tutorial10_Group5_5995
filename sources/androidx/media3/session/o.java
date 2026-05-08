package androidx.media3.session;

import androidx.media3.session.r;
import androidx.media3.session.s;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {
    @Override // androidx.media3.session.s
    public final void d(s.e eVar) {
        super.d(eVar);
        synchronized (this.a) {
        }
    }

    @Override // androidx.media3.session.s
    public final boolean i(r.d dVar) {
        if (super.i(dVar)) {
            return true;
        }
        synchronized (this.a) {
        }
        return false;
    }

    @Override // androidx.media3.session.s
    public final void p(r.d dVar) {
        dVar.e.getClass();
        throw null;
    }
}
