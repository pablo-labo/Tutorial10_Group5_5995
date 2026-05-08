package defpackage;

import defpackage.hod;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n31 extends hod.a {
    public final long a;
    public final long b;
    public final Set<hod.b> c;

    public n31(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // hod.a
    public final long a() {
        return this.a;
    }

    @Override // hod.a
    public final Set<hod.b> b() {
        return this.c;
    }

    @Override // hod.a
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hod.a)) {
            return false;
        }
        hod.a aVar = (hod.a) obj;
        return this.a == aVar.a() && this.b == aVar.c() && this.c.equals(aVar.b());
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
