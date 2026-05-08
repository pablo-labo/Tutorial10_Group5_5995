package defpackage;

import defpackage.mq5;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class gv1 {
    public final mq5 a;
    public final n8a b;

    static {
        n8a n8aVar = toe.f;
        mq5 mq5Var = mq5.c;
        mq5.a.a(n8aVar);
    }

    public gv1(mq5 mq5Var, n8a n8aVar) {
        mq5Var.getClass();
        this.a = mq5Var;
        this.b = n8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv1)) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        return wl7.b(this.a, gv1Var.a) && this.b.equals(gv1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return wve.H(this.a.a.a, JwtParser.SEPARATOR_CHAR, '/') + "/" + this.b;
    }
}
