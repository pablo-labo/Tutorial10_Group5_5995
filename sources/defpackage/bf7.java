package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class bf7 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof bf7) {
            return this.a == ((bf7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
