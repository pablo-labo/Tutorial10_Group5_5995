package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class yfd {
    public static final yfd c = new yfd(-1, false);
    public final int a;
    public final boolean b;

    public yfd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yfd)) {
            return false;
        }
        yfd yfdVar = (yfd) obj;
        return this.a == yfdVar.a && this.b == yfdVar.b;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Boolean boolValueOf = Boolean.valueOf(this.b);
        return ((numValueOf.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)}, 2));
    }
}
