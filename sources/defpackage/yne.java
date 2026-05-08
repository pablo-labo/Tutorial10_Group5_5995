package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class yne implements AutoCloseable {
    public final to1 a;

    public final j6g a(zn1 zn1Var) {
        this.a.k1(zn1Var);
        return j6g.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yne) {
            return this.a.equals(((yne) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ')';
    }
}
