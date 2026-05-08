package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hy3 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy3) && this.a == ((hy3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return k6.h(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
