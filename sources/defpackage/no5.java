package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class no5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof no5) {
            return this.a == ((no5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
