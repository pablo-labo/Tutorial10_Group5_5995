package com.facebook.yoga;

import defpackage.bg;
import defpackage.r6h;

/* JADX INFO: loaded from: classes2.dex */
public final class YogaValue {
    public static final YogaValue c = new YogaValue(Float.NaN, r6h.UNDEFINED);
    public static final YogaValue d = new YogaValue(Float.NaN, r6h.AUTO);
    public final float a;
    public final r6h b;

    public YogaValue(float f, r6h r6hVar) {
        this.a = f;
        this.b = r6hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        r6h r6hVar = yogaValue.b;
        r6h r6hVar2 = this.b;
        if (r6hVar2 == r6hVar) {
            return r6hVar2 == r6h.UNDEFINED || r6hVar2 == r6h.AUTO || Float.compare(this.a, yogaValue.a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a() + Float.floatToIntBits(this.a);
    }

    public final String toString() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return "undefined";
        }
        float f = this.a;
        if (iOrdinal == 1) {
            return Float.toString(f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return "auto";
            }
            bg.h();
            return null;
        }
        return f + "%";
    }
}
