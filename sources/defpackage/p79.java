package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p79<V> {
    public final s69 a;
    public final Throwable b;

    public p79(s69 s69Var) {
        this.a = s69Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p79)) {
            return false;
        }
        p79 p79Var = (p79) obj;
        s69 s69Var = this.a;
        if (s69Var != null && s69Var == p79Var.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || p79Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public p79(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
