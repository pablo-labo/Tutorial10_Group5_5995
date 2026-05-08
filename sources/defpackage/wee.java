package defpackage;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface wee {
    a a(int i, int i2);

    int b(int i);

    int c(int i);

    default wee d() {
        return this;
    }

    int e();

    a f();

    int g();

    int getLength();

    a h(int i, int i2);

    public static class a implements wee {
        public final Random a;
        public final int[] b;
        public final int[] c;

        public a(int[] iArr, Random random) {
            this.b = iArr;
            this.a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        @Override // defpackage.wee
        public final a a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = this.b;
            int[] iArr2 = new int[iArr.length - i3];
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                if (i6 < i || i6 >= i2) {
                    int i7 = i5 - i4;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr2[i7] = i6;
                } else {
                    i4++;
                }
            }
            return new a(iArr2, new Random(this.a.nextLong()));
        }

        @Override // defpackage.wee
        public final int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // defpackage.wee
        public final int c(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // defpackage.wee
        public final int e() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // defpackage.wee
        public final a f() {
            return new a(new Random(this.a.nextLong()));
        }

        @Override // defpackage.wee
        public final int g() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // defpackage.wee
        public final int getLength() {
            return this.b.length;
        }

        @Override // defpackage.wee
        public final a h(int i, int i2) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int i3 = 0;
            while (true) {
                iArr = this.b;
                random = this.a;
                if (i3 >= i2) {
                    break;
                }
                iArr2[i3] = random.nextInt(iArr.length + 1);
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr3[i3] = iArr3[iNextInt];
                iArr3[iNextInt] = i3 + i;
                i3 = i4;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i2];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < iArr.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr2[i5]) {
                    int i8 = i6 + 1;
                    int i9 = iArr[i6];
                    iArr4[i7] = i9;
                    if (i9 >= i) {
                        iArr4[i7] = i9 + i2;
                    }
                    i6 = i8;
                } else {
                    iArr4[i7] = iArr3[i5];
                    i5++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        public a() {
            this(new Random());
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }
}
