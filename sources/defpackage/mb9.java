package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mb9<T> implements pa4<T> {
    public final Map<T, Float> a;

    public mb9(Map<T, Float> map) {
        this.a = map;
    }

    @Override // defpackage.pa4
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.pa4
    public final T b(float f, boolean z) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // defpackage.pa4
    public final T c(float f) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // defpackage.pa4
    public final boolean d(T t) {
        return this.a.containsKey(t);
    }

    @Override // defpackage.pa4
    public final float e() {
        Float fC1 = z92.c1(this.a.values());
        if (fC1 != null) {
            return fC1.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb9)) {
            return false;
        }
        return wl7.b(this.a, ((mb9) obj).a);
    }

    @Override // defpackage.pa4
    public final float f(T t) {
        Float f = this.a.get(t);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // defpackage.pa4
    public final float g() {
        Float fB1 = z92.b1(this.a.values());
        if (fB1 != null) {
            return fB1.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
