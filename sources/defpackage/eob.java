package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eob {
    public final int a;

    public eob(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eob) {
            return this.a == ((eob) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
