package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xs4 {
    public final dt4 a;
    public final byte[] b;

    public xs4(dt4 dt4Var, byte[] bArr) {
        if (dt4Var == null) {
            ja.k("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ja.k("bytes is null");
            throw null;
        }
        this.a = dt4Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs4)) {
            return false;
        }
        xs4 xs4Var = (xs4) obj;
        if (this.a.equals(xs4Var.a)) {
            return Arrays.equals(this.b, xs4Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
