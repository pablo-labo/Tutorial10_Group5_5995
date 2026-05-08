package defpackage;

import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class z0a implements js9.a {
    public final long a;
    public final long b;
    public final long c;

    public z0a(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0a)) {
            return false;
        }
        z0a z0aVar = (z0a) obj;
        return this.a == z0aVar.a && this.b == z0aVar.b && this.c == z0aVar.c;
    }

    public final int hashCode() {
        return u59.b(this.c) + ((u59.b(this.b) + ((u59.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
