package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p31 extends zre {
    public final long a;
    public final long b;
    public final long c;

    public p31(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.zre
    public final long a() {
        return this.b;
    }

    @Override // defpackage.zre
    public final long b() {
        return this.a;
    }

    @Override // defpackage.zre
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zre)) {
            return false;
        }
        zre zreVar = (zre) obj;
        return this.a == zreVar.b() && this.b == zreVar.a() && this.c == zreVar.c();
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return r6.d(this.c, "}", sb);
    }
}
