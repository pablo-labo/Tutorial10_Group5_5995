package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.avro.InvalidNumberEncodingException;
import org.apache.avro.SystemLimitException;

/* JADX INFO: loaded from: classes3.dex */
public class pf1 extends ka6 {
    public long d;
    public b e;
    public byte[] f;
    public int g;
    public int h;
    public final rjg i;

    public static class a {
        public final pf1 a;
        public byte[] b;
        public int c;
        public int d;
        public boolean e = false;

        public a(pf1 pf1Var) {
            this.a = pf1Var;
        }

        public final int a() {
            return this.e ? this.d : this.a.h;
        }

        public final int b() {
            return this.e ? this.c : this.a.g;
        }

        public final void c(int i) {
            if (this.e) {
                this.c = i;
            } else {
                this.a.g = i;
            }
        }
    }

    public static class b extends c {
        public byte[] b;
        public int c;
        public int d;
        public boolean e;

        @Override // pf1.c
        public final long a(long j) {
            this.d = this.a.a();
            int iB = this.a.b();
            this.c = iB;
            long j2 = iB;
            long j3 = ((long) this.d) - j2;
            if (j3 >= j) {
                int i = (int) (j2 + j);
                this.c = i;
                this.a.c(i);
                return j;
            }
            int i2 = (int) (j2 + j3);
            this.c = i2;
            this.a.c(i2);
            return j3;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a aVar = this.a;
            aVar.c(aVar.a());
        }

        @Override // java.io.InputStream
        public final int read() {
            this.d = this.a.a();
            int iB = this.a.b();
            this.c = iB;
            if (iB >= this.d) {
                return -1;
            }
            a aVar = this.a;
            byte[] bArr = aVar.e ? aVar.b : aVar.a.f;
            int i = iB + 1;
            this.c = i;
            int i2 = bArr[iB] & 255;
            aVar.c(i);
            return i2;
        }
    }

    public static abstract class c extends InputStream {
        public a a;

        public abstract long a(long j);

        @Override // java.io.InputStream
        public final int available() {
            return this.a.a() - this.a.b();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int iA = this.a.a();
            int iB = this.a.b();
            a aVar = this.a;
            byte[] bArr2 = aVar.e ? aVar.b : aVar.a.f;
            int i3 = iA - iB;
            if (i3 >= i2) {
                System.arraycopy(bArr2, iB, bArr, i, i2);
                this.a.c(iB + i2);
                return i2;
            }
            System.arraycopy(bArr2, iB, bArr, i, i3);
            this.a.c(iB + i3);
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            int iA = this.a.a();
            int iB = this.a.b();
            long j2 = iA - iB;
            a aVar = this.a;
            if (j2 > j) {
                aVar.c((int) (((long) iB) + j));
                return j;
            }
            aVar.c(iA);
            return a(j - j2) + j2;
        }
    }

    public pf1(byte[] bArr, int i) {
        this();
        b bVar = new b();
        bVar.e = false;
        if (i < 16) {
            bVar.b = Arrays.copyOfRange(bArr, 0, 16);
            bVar.c = 0;
            bVar.d = i;
        } else {
            bVar.b = bArr;
            bVar.c = 0;
            bVar.d = i;
        }
        b bVar2 = this.e;
        if (bVar2 != null) {
            a aVar = bVar2.a;
            pf1 pf1Var = aVar.a;
            aVar.b = pf1Var.f;
            aVar.c = pf1Var.g;
            aVar.d = pf1Var.h;
            aVar.e = true;
        }
        this.f = bVar.b;
        this.g = bVar.c;
        this.h = bVar.d;
        bVar.a = new a(this);
        this.e = bVar;
    }

    @Override // defpackage.ka6
    public final long F0() throws InvalidNumberEncodingException, EOFException {
        long jK1 = K1();
        this.d = SystemLimitException.d(this.d, jK1);
        return jK1;
    }

    public void J1(int i, byte[] bArr, int i2) throws EOFException {
        if (i2 < 0) {
            r40.m(p6.c(i2, "Malformed data. Length is negative: "));
            return;
        }
        int i3 = this.h;
        int i4 = this.g;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f;
        if (i2 <= i5) {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.g += i2;
            return;
        }
        System.arraycopy(bArr2, i4, bArr, i, i5);
        int i6 = i2 - i5;
        this.g = this.h;
        this.e.getClass();
        if (i6 <= 0) {
            return;
        }
        k20.n();
    }

    public final long K1() throws InvalidNumberEncodingException, EOFException {
        long jW0 = W0();
        if (jW0 >= 0) {
            return jW0;
        }
        W0();
        return -jW0;
    }

    public void L1(long j) throws EOFException {
        if (j <= 0) {
            return;
        }
        int i = this.h;
        int i2 = this.g;
        long j2 = i - i2;
        if (j <= j2) {
            this.g = (int) (((long) i2) + j);
            return;
        }
        this.g = 0;
        this.h = 0;
        long j3 = j - j2;
        if (this.e.a(j3) >= j3) {
            return;
        }
        k20.n();
    }

    public final void M1(int i) throws EOFException {
        int i2 = this.h;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i4 < i) {
            b bVar = this.e;
            byte[] bArr = this.f;
            if (!bVar.e) {
                byte[] bArr2 = new byte[i4 + 16];
                System.arraycopy(bArr, i3, bArr2, 0, i4);
                a aVar = bVar.a;
                if (aVar.e) {
                    aVar.b = bArr2;
                    aVar.d = i4;
                    aVar.c = 0;
                } else {
                    pf1 pf1Var = aVar.a;
                    pf1Var.f = bArr2;
                    pf1Var.h = i4;
                    pf1Var.g = 0;
                }
                bVar.e = true;
            }
            if (this.g < this.h) {
                return;
            }
            k20.n();
        }
    }

    @Override // defpackage.ka6
    public final long N0() {
        long jD = SystemLimitException.d(0L, K1());
        this.d = jD;
        return jD;
    }

    @Override // defpackage.ka6
    public boolean O0() throws EOFException {
        int i = this.h;
        int i2 = this.g;
        if (i != i2) {
            byte[] bArr = this.f;
            this.g = i2 + 1;
            return (bArr[i2] & 255) == 1;
        }
        b bVar = this.e;
        int length = this.f.length;
        bVar.getClass();
        this.h = 0;
        this.g = 0;
        k20.n();
        return false;
    }

    @Override // defpackage.ka6
    public ByteBuffer P0(ByteBuffer byteBuffer) throws EOFException {
        int iC = SystemLimitException.c(W0());
        if (byteBuffer == null || iC > byteBuffer.capacity()) {
            byteBuffer = ByteBuffer.allocate(iC);
        }
        J1(byteBuffer.position(), byteBuffer.array(), iC);
        return byteBuffer;
    }

    @Override // defpackage.ka6
    public double Q0() throws EOFException {
        M1(8);
        byte[] bArr = this.f;
        int i = this.g;
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        int i3 = ((bArr[i + 7] & 255) << 24) | (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8) | ((bArr[i + 6] & 255) << 16);
        if (i + 8 > this.h) {
            k20.n();
            return 0.0d;
        }
        this.g = i + 8;
        return Double.longBitsToDouble((((long) i3) << 32) | (((long) i2) & 4294967295L));
    }

    @Override // defpackage.ka6
    public final int R0() {
        return V0();
    }

    @Override // defpackage.ka6
    public final long S() throws InvalidNumberEncodingException, EOFException {
        long jK1 = K1();
        this.d = SystemLimitException.d(this.d, jK1);
        return jK1;
    }

    @Override // defpackage.ka6
    public final void S0(int i, byte[] bArr) throws EOFException {
        J1(0, bArr, i);
    }

    @Override // defpackage.ka6
    public float T0() throws EOFException {
        M1(4);
        byte[] bArr = this.f;
        int i = this.g;
        int i2 = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i + 4 <= this.h) {
            this.g = i + 4;
            return Float.intBitsToFloat(i2);
        }
        k20.n();
        return 0.0f;
    }

    @Override // defpackage.ka6
    public final int U0() {
        return V0();
    }

    @Override // defpackage.ka6
    public int V0() throws InvalidNumberEncodingException, EOFException {
        int i = 5;
        M1(5);
        byte[] bArr = this.f;
        int i2 = this.g;
        byte b2 = bArr[i2];
        int i3 = b2 & 255;
        int i4 = b2 & 127;
        if (i3 > 127) {
            byte b3 = bArr[i2 + 1];
            i4 ^= (b3 & 127) << 7;
            if ((b3 & 255) > 127) {
                byte b4 = bArr[i2 + 2];
                i4 ^= (b4 & 127) << 14;
                if ((b4 & 255) > 127) {
                    byte b5 = bArr[i2 + 3];
                    i4 ^= (b5 & 127) << 21;
                    if ((b5 & 255) > 127) {
                        byte b6 = bArr[i2 + 4];
                        i4 ^= (b6 & 127) << 28;
                        if ((b6 & 255) > 127) {
                            throw new InvalidNumberEncodingException("Invalid int encoding");
                        }
                    } else {
                        i = 4;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        int i5 = i2 + i;
        this.g = i5;
        if (i5 <= this.h) {
            return (i4 >>> 1) ^ (-(i4 & 1));
        }
        k20.n();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[PHI: r2
  0x00ad: PHI (r2v9 int) = (r2v8 int), (r2v11 int), (r2v12 int) binds: [B:5:0x0023, B:7:0x0031, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ka6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long W0() throws org.apache.avro.InvalidNumberEncodingException, java.io.EOFException {
        /*
            r13 = this;
            r0 = 10
            r13.M1(r0)
            byte[] r0 = r13.f
            int r1 = r13.g
            int r2 = r1 + 1
            r13.g = r2
            r3 = r0[r1]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            r3 = r3 & r5
            r6 = 1
            if (r4 <= r5) goto Laf
            int r4 = r1 + 2
            r13.g = r4
            r2 = r0[r2]
            r7 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            int r2 = r2 << 7
            r2 = r2 ^ r3
            if (r7 <= r5) goto Lad
            int r3 = r1 + 3
            r13.g = r3
            r4 = r0[r4]
            r7 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            int r4 = r4 << 14
            r2 = r2 ^ r4
            if (r7 <= r5) goto Lad
            int r4 = r1 + 4
            r13.g = r4
            r3 = r0[r3]
            r7 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r7 <= r5) goto Lad
            long r2 = (long) r2
            r7 = r0[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r8 = (long) r7
            r10 = 127(0x7f, double:6.27E-322)
            long r8 = r8 & r10
            r12 = 28
            long r8 = r8 << r12
            long r2 = r2 ^ r8
            if (r7 <= r5) goto La8
            int r7 = r1 + 5
            r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r8 = (long) r7
            long r8 = r8 & r10
            r12 = 35
            long r8 = r8 << r12
            long r2 = r2 ^ r8
            if (r7 <= r5) goto La6
            int r7 = r1 + 6
            r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r8 = (long) r7
            long r8 = r8 & r10
            r12 = 42
            long r8 = r8 << r12
            long r2 = r2 ^ r8
            if (r7 <= r5) goto La4
            int r7 = r1 + 7
            r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r8 = (long) r7
            long r8 = r8 & r10
            r12 = 49
            long r8 = r8 << r12
            long r2 = r2 ^ r8
            if (r7 <= r5) goto La2
            int r7 = r1 + 8
            r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r8 = (long) r7
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            long r2 = r2 ^ r8
            if (r7 <= r5) goto La0
            int r1 = r1 + 9
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r7 = (long) r0
            long r7 = r7 & r10
            r1 = 63
            long r7 = r7 << r1
            long r2 = r2 ^ r7
            if (r0 > r5) goto L98
            r0 = 6
            goto La9
        L98:
            org.apache.avro.InvalidNumberEncodingException r13 = new org.apache.avro.InvalidNumberEncodingException
            java.lang.String r0 = "Invalid long encoding"
            r13.<init>(r0)
            throw r13
        La0:
            r0 = 5
            goto La9
        La2:
            r0 = 4
            goto La9
        La4:
            r0 = 3
            goto La9
        La6:
            r0 = 2
            goto La9
        La8:
            r0 = r6
        La9:
            int r4 = r4 + r0
            r13.g = r4
            goto Lb0
        Lad:
            long r2 = (long) r2
            goto Lb0
        Laf:
            long r2 = (long) r3
        Lb0:
            int r0 = r13.g
            int r13 = r13.h
            if (r0 > r13) goto Lbe
            long r0 = r2 >>> r6
            r4 = 1
            long r2 = r2 & r4
            long r2 = -r2
            long r0 = r0 ^ r2
            return r0
        Lbe:
            defpackage.k20.n()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf1.W0():long");
    }

    @Override // defpackage.ka6
    public final long X0() {
        long jD = SystemLimitException.d(0L, K1());
        this.d = jD;
        return jD;
    }

    @Override // defpackage.ka6
    public final void Y0() {
    }

    @Override // defpackage.ka6
    public final rjg Z0(rjg rjgVar) throws EOFException {
        int iE = SystemLimitException.e(W0());
        if (rjgVar == null) {
            rjgVar = new rjg();
        }
        rjgVar.h(iE);
        if (iE != 0) {
            J1(0, rjgVar.e(), iE);
        }
        return rjgVar;
    }

    @Override // defpackage.ka6
    public final String a1() {
        return Z0(this.i).toString();
    }

    @Override // defpackage.ka6
    public final long e1() throws InvalidNumberEncodingException, EOFException {
        long jW0 = W0();
        while (jW0 < 0) {
            L1(W0());
            jW0 = W0();
        }
        return jW0;
    }

    @Override // defpackage.ka6
    public final void f1() throws EOFException {
        L1(W0());
    }

    @Override // defpackage.ka6
    public final void g1(int i) throws EOFException {
        L1(i);
    }

    @Override // defpackage.ka6
    public final long h1() throws InvalidNumberEncodingException, EOFException {
        long jW0 = W0();
        while (jW0 < 0) {
            L1(W0());
            jW0 = W0();
        }
        return jW0;
    }

    @Override // defpackage.ka6
    public final void i1() throws EOFException {
        L1(W0());
    }

    public pf1() {
        this.d = 0L;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.i = new rjg();
    }
}
