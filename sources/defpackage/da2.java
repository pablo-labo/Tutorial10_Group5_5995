package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class da2 {
    public static final long b = pnb.g(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    public static final class a {
        public static long a() {
            return da2.b;
        }
    }

    static {
        pnb.g(4282664004L);
        c = pnb.g(4287137928L);
        d = pnb.g(4291611852L);
        e = pnb.g(4294967295L);
        f = pnb.g(4294901760L);
        pnb.g(4278255360L);
        g = pnb.g(4278190335L);
        pnb.g(4294967040L);
        pnb.g(4278255615L);
        pnb.g(4294902015L);
        h = pnb.d(0);
        i = pnb.b(0.0f, 0.0f, 0.0f, 0.0f, ya2.u);
    }

    public /* synthetic */ da2(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, ta2 ta2Var) {
        ip2 ip2VarD;
        ta2 ta2VarF = f(j2);
        int i2 = ta2VarF.c;
        int i3 = ta2Var.c;
        if ((i2 | i3) < 0) {
            ip2VarD = ua2.d(ta2VarF, ta2Var);
        } else {
            a3a<ip2> a3aVar = jp2.a;
            int i4 = i2 | (i3 << 6);
            ip2 ip2VarB = a3aVar.b(i4);
            if (ip2VarB == null) {
                ip2VarB = ua2.d(ta2VarF, ta2Var);
                a3aVar.h(i4, ip2VarB);
            }
            ip2VarD = ip2VarB;
        }
        return ip2VarD.a(j2);
    }

    public static long b(long j2, float f2) {
        return pnb.b(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float fG;
        float f2;
        if ((63 & j2) == 0) {
            fG = (float) zte.g((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fG = (float) zte.g((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fG / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) zte.g((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - sh5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ta2 f(long j2) {
        float[] fArr = ya2.a;
        return ya2.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) zte.g((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - sh5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) zte.g((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - sh5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return w40.f(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof da2) {
            return this.a == ((da2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
