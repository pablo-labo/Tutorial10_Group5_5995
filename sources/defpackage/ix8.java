package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ix8 implements io5 {
    public final float a;

    public ix8(float f) {
        this.a = f;
    }

    @Override // defpackage.io5
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.io5
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix8) && Float.compare(this.a, ((ix8) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return l6.h(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
