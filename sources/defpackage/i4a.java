package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class i4a<S> extends rsf<S> {
    public final g4a b;
    public final g4a c;

    public i4a(S s) {
        this.b = r.f(s);
        this.c = r.f(s);
    }

    @Override // defpackage.rsf
    public final S a() {
        return (S) ((gme) this.b).getValue();
    }

    @Override // defpackage.rsf
    public final S b() {
        return (S) ((gme) this.c).getValue();
    }

    @Override // defpackage.rsf
    public final void c(S s) {
        ((gme) this.b).setValue(s);
    }

    @Override // defpackage.rsf
    public final void d(csf<S> csfVar) {
    }

    @Override // defpackage.rsf
    public final void e() {
    }
}
