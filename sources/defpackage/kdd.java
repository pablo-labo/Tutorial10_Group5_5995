package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kdd {
    public final long a = da2.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kdd) {
            return da2.c(this.a, ((kdd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) da2.i(this.a)) + ", rippleAlpha=null)";
    }
}
