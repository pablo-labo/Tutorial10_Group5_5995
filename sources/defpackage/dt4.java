package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dt4 {
    public final String a;

    public dt4(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ja.k("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt4)) {
            return false;
        }
        return this.a.equals(((dt4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l6.i(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
