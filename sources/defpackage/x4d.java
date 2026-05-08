package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x4d {
    public final int a;
    public final int b;

    public x4d(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i <= 0) {
            r6.g("Check failed.");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        r6.g("Check failed.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x4d)) {
            return false;
        }
        x4d x4dVar = (x4d) obj;
        return this.a == x4dVar.a && this.b == x4dVar.b;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }
}
