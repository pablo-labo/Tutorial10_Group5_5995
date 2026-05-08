package defpackage;

import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class pke implements js9.a {
    public final float a;
    public final int b;

    public pke(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pke.class == obj.getClass()) {
            pke pkeVar = (pke) obj;
            if (this.a == pkeVar.a && this.b == pkeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
