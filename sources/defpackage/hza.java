package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hza implements gza {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public hza(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            yd7.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.gza
    public final float a() {
        return this.d;
    }

    @Override // defpackage.gza
    public final float b(vl8 vl8Var) {
        return vl8Var == vl8.a ? this.a : this.c;
    }

    @Override // defpackage.gza
    public final float c(vl8 vl8Var) {
        return vl8Var == vl8.a ? this.c : this.a;
    }

    @Override // defpackage.gza
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hza)) {
            return false;
        }
        hza hzaVar = (hza) obj;
        return j94.c(this.a, hzaVar.a) && j94.c(this.b, hzaVar.b) && j94.c(this.c, hzaVar.c) && j94.c(this.d, hzaVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) j94.e(this.a)) + ", top=" + ((Object) j94.e(this.b)) + ", end=" + ((Object) j94.e(this.c)) + ", bottom=" + ((Object) j94.e(this.d)) + ')';
    }
}
