package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;

/* JADX INFO: loaded from: classes2.dex */
public final class z21 {
    public static final z21 f = new z21(10485760, UiRumDebugListener.DEFAULT_ALPHA, 10000, 81920, 604800000);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public z21(long j, int i, int i2, int i3, long j2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final int a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return this.a == z21Var.e() && this.b == z21Var.c() && this.c == z21Var.a() && this.d == z21Var.b() && this.e == z21Var.d();
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return w20.k(sb, this.e, "}");
    }
}
