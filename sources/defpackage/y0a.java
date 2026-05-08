package defpackage;

import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class y0a implements js9.a {
    public final float a;
    public final float b;

    public y0a(float f, float f2) {
        ka2.k("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0a.class == obj.getClass()) {
            y0a y0aVar = (y0a) obj;
            if (this.a == y0aVar.a && this.b == y0aVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
