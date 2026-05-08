package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class wge extends v1 {
    public final kx9<?> b;
    public final g4a c = r.f(null);

    public wge(kx9<?> kx9Var) {
        this.b = kx9Var;
    }

    @Override // defpackage.v1
    public final boolean O(kx9<?> kx9Var) {
        return kx9Var == this.b;
    }

    @Override // defpackage.v1
    public final <T> T V(kx9<T> kx9Var) {
        if (!(kx9Var == this.b)) {
            ae7.b("Check failed.");
        }
        T t = (T) ((gme) this.c).getValue();
        if (t == null) {
            return null;
        }
        return t;
    }
}
