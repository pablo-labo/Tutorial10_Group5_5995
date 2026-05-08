package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cdb {
    public static final cdb d = new cdb(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = vjg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public cdb(float f2, float f3) {
        ka2.l(f2 > 0.0f);
        ka2.l(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cdb.class == obj.getClass()) {
            cdb cdbVar = (cdb) obj;
            if (this.a == cdbVar.a && this.b == cdbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = vjg.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public cdb(float f2) {
        this(f2, 1.0f);
    }
}
