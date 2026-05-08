package defpackage;

import defpackage.af1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vs0 {
    public static final j a = new j();
    public static final d b = new d();
    public static final k c = new k();
    public static final b d = new b();
    public static final c e = new c();
    public static final h f = new h();
    public static final g g = new g();
    public static final f h = new f();

    public static final class a {
        public static final C0461a a = new C0461a();
        public static final b b = new b();

        /* JADX INFO: renamed from: vs0$a$a, reason: collision with other inner class name */
        public static final class C0461a implements e {
            @Override // vs0.e
            public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class b implements e {
            @Override // vs0.e
            public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }
    }

    public static final class b implements l {
        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int length = iArr.length;
            int i5 = i - i3;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class c implements e, l {
        @Override // vs0.e, vs0.l
        public final float a() {
            return 0.0f;
        }

        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            if (vl8Var == vl8.a) {
                vs0.a(i, iArr, iArr2, false);
            } else {
                vs0.a(i, iArr, iArr2, true);
            }
        }

        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            vs0.a(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            int i2 = 0;
            if (vl8Var == vl8.a) {
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                return;
            }
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (-1 >= length2) {
                    return;
                }
                int i8 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i8;
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    public interface e {
        default float a() {
            return 0.0f;
        }

        void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2);
    }

    public static final class f implements e, l {
        @Override // vs0.e, vs0.l
        public final float a() {
            return 0.0f;
        }

        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            if (vl8Var == vl8.a) {
                vs0.b(i, iArr, iArr2, false);
            } else {
                vs0.b(i, iArr, iArr2, true);
            }
        }

        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            vs0.b(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class g implements e, l {
        @Override // vs0.e, vs0.l
        public final float a() {
            return 0.0f;
        }

        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            if (vl8Var == vl8.a) {
                vs0.c(i, iArr, iArr2, false);
            } else {
                vs0.c(i, iArr, iArr2, true);
            }
        }

        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            vs0.c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class h implements e, l {
        @Override // vs0.e, vs0.l
        public final float a() {
            return 0.0f;
        }

        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            if (vl8Var == vl8.a) {
                vs0.d(i, iArr, iArr2, false);
            } else {
                vs0.d(i, iArr, iArr2, true);
            }
        }

        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            vs0.d(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class i implements e, l {
        public final float a;
        public final boolean b;
        public final Function2<Integer, vl8, Integer> c;
        public final float d;

        public i(float f, boolean z, Function2 function2) {
            this.a = f;
            this.b = z;
            this.c = function2;
            this.d = f;
        }

        @Override // vs0.e, vs0.l
        public final float a() {
            return this.d;
        }

        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int iX0 = iy3Var.x0(this.a);
            if (this.b && vl8Var == vl8.b) {
                int length = iArr.length - 1;
                i2 = 0;
                i3 = 0;
                while (-1 < length) {
                    int i4 = iArr[length];
                    int iMin = Math.min(i2, i - i4);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iX0, (i - iMin) - i4);
                    int i5 = iArr2[length] + i4 + iMin2;
                    length--;
                    i3 = iMin2;
                    i2 = i5;
                }
            } else {
                int length2 = iArr.length;
                i2 = 0;
                i3 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int iMin3 = Math.min(i2, i - i8);
                    iArr2[i7] = iMin3;
                    int iMin4 = Math.min(iX0, (i - iMin3) - i8);
                    int i9 = iArr2[i7] + i8 + iMin4;
                    i6++;
                    i3 = iMin4;
                    i2 = i9;
                    i7++;
                }
            }
            int i10 = i2 - i3;
            Function2<Integer, vl8, Integer> function2 = this.c;
            if (function2 == null || i10 >= i) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i - i10), vl8Var).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iIntValue;
            }
        }

        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            b(iy3Var, i, iArr, vl8.a, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return j94.c(this.a, iVar.a) && this.b == iVar.b && wl7.b(this.c, iVar.c);
        }

        public final int hashCode() {
            int iF = ia.f(Float.hashCode(this.a) * 31, 31, this.b);
            Function2<Integer, vl8, Integer> function2 = this.c;
            return iF + (function2 == null ? 0 : function2.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) j94.e(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class j implements e {
        @Override // vs0.e
        public final void b(iy3 iy3Var, int i, int[] iArr, vl8 vl8Var, int[] iArr2) {
            int i2 = 0;
            if (vl8Var == vl8.a) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                return;
            }
            int length2 = iArr.length;
            int i6 = 0;
            while (i2 < length2) {
                i6 += iArr[i2];
                i2++;
            }
            int i7 = i - i6;
            int length3 = iArr.length;
            while (true) {
                length3--;
                if (-1 >= length3) {
                    return;
                }
                int i8 = iArr[length3];
                iArr2[length3] = i7;
                i7 += i8;
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class k implements l {
        @Override // vs0.l
        public final void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    public interface l {
        default float a() {
            return 0.0f;
        }

        void c(iy3 iy3Var, int i, int[] iArr, int[] iArr2);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void b(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = iArr.length == 0 ? 0.0f : (i2 - i4) / iArr.length;
        float f2 = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static i e(float f2) {
        return new i(f2, true, new us0(0));
    }

    public static i f(float f2, af1.b bVar) {
        return new i(f2, false, new pa(bVar, 1));
    }
}
