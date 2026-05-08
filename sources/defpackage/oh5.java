package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oh5 {
    public final float a;
    public final iy3 b;
    public final float c;

    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(long j, float f, float f2) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + k6.c(Float.hashCode(this.a) * 31, this.b, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public oh5(float f, iy3 iy3Var) {
        this.a = f;
        this.b = iy3Var;
        float density = iy3Var.getDensity();
        float f2 = ph5.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f) {
        double dB = b(f);
        double d = ph5.a;
        double d2 = d - 1.0d;
        return new a((long) (Math.exp(dB / d2) * 1000.0d), f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.c))));
    }

    public final double b(float f) {
        float[] fArr = l70.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.c)));
    }
}
