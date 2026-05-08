package defpackage;

import defpackage.c20;

/* JADX INFO: loaded from: classes.dex */
public final class af1 implements c20 {
    public final float a;
    public final float b;

    public static final class a implements c20.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // c20.b
        public final int a(int i, int i2, vl8 vl8Var) {
            float f = (i2 - i) / 2.0f;
            vl8 vl8Var2 = vl8.a;
            float f2 = this.a;
            if (vl8Var != vl8Var2) {
                f2 *= -1.0f;
            }
            return Math.round((1.0f + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return l6.h(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    public static final class b implements c20.c {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // c20.c
        public final int a(int i, int i2) {
            return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return l6.h(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public af1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.c20
    public final long a(long j, long j2, vl8 vl8Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        vl8 vl8Var2 = vl8.a;
        float f3 = this.a;
        if (vl8Var != vl8Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        return Float.compare(this.a, af1Var.a) == 0 && Float.compare(this.b, af1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return l6.h(sb, this.b, ')');
    }
}
