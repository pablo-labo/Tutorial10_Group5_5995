package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final long a;
    public final float b;
    public final long c;

    public static final class a {
        public long a = -9223372036854775807L;
        public float b = -3.4028235E38f;
        public long c = -9223372036854775807L;
    }

    public g(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
