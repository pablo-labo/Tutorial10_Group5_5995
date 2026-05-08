package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;

/* JADX INFO: loaded from: classes.dex */
public final class xga {
    public final int a;
    public final long b;
    public final long c;
    public final hga d;
    public final yne e;
    public final Object f;

    public /* synthetic */ xga(int i, long j, long j2, hga hgaVar, int i2) {
        this((i2 & 1) != 0 ? UiRumDebugListener.DEFAULT_ALPHA : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? hga.b : hgaVar, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xga)) {
            return false;
        }
        xga xgaVar = (xga) obj;
        return this.a == xgaVar.a && this.b == xgaVar.b && this.c == xgaVar.c && wl7.b(this.d, xgaVar.d) && wl7.b(this.e, xgaVar.e) && wl7.b(this.f, xgaVar.f);
    }

    public final int hashCode() {
        int iB = k20.b(this.d.a, ia.d(ia.d(this.a * 31, 31, this.b), 31, this.c), 31);
        yne yneVar = this.e;
        int iHashCode = (iB + (yneVar == null ? 0 : yneVar.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ')';
    }

    public xga(int i, long j, long j2, hga hgaVar, yne yneVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = hgaVar;
        this.e = yneVar;
        this.f = obj;
    }

    public xga() {
        this(0, 0L, 0L, null, 63);
    }
}
