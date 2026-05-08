package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o13 {
    public long a;

    public final void a(long j) {
        this.a += j;
    }

    public final void b() {
        this.a++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o13) && this.a == ((o13) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a));
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
