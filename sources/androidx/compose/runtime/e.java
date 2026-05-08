package androidx.compose.runtime;

import defpackage.e13;
import defpackage.f13;
import defpackage.k0d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k0d {
    public final e13 a;

    public e(e13 e13Var) {
        this.a = e13Var;
    }

    @Override // defpackage.k0d
    public final void b() {
    }

    @Override // defpackage.k0d
    public final void d() {
        e13 e13Var = this.a;
        if (e13Var instanceof k) {
            ((k) e13Var).a();
        } else {
            f13.c(e13Var, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.k0d
    public final void e() {
        e13 e13Var = this.a;
        if (e13Var instanceof k) {
            ((k) e13Var).a();
        } else {
            f13.c(e13Var, new LeftCompositionCancellationException());
        }
    }
}
