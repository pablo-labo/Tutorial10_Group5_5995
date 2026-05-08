package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class uqc implements to1 {
    public final pne a;
    public final zn1 b;
    public boolean c;

    public uqc(pne pneVar) {
        pneVar.getClass();
        this.a = pneVar;
        this.b = new zn1();
    }

    @Override // defpackage.to1
    public final boolean B(long j, vr1 vr1Var) {
        vr1Var.getClass();
        int iH = vr1Var.h();
        if (this.c) {
            r6.g("closed");
            return false;
        }
        if (iH >= 0 && vr1Var.h() >= iH) {
            for (int i = 0; i < iH; i++) {
                long j2 = i;
                if (request(1 + j2) && this.b.P(j2) == vr1Var.r(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.to1
    public final void C0(zn1 zn1Var, long j) throws EOFException {
        zn1 zn1Var2 = this.b;
        zn1Var.getClass();
        try {
            x0(j);
            zn1Var2.C0(zn1Var, j);
        } catch (EOFException e) {
            zn1Var.a1(zn1Var2);
            throw e;
        }
    }

    @Override // defpackage.to1
    public final int E0(pva pvaVar) throws EOFException {
        pvaVar.getClass();
        if (this.c) {
            r6.g("closed");
            return 0;
        }
        while (true) {
            zn1 zn1Var = this.b;
            int iC = c.c(zn1Var, pvaVar, true);
            if (iC != -2) {
                if (iC != -1) {
                    zn1Var.skip(pvaVar.a[iC].h());
                    return iC;
                }
            } else if (this.a.f1(zn1Var, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.to1
    public final vr1 J0(long j) throws EOFException {
        x0(j);
        return this.b.J0(j);
    }

    @Override // defpackage.to1
    public final long P1() throws EOFException {
        zn1 zn1Var;
        byte bP;
        x0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            zn1Var = this.b;
            if (!zRequest) {
                break;
            }
            bP = zn1Var.P(i);
            if ((bP < 48 || bP > 57) && ((bP < 97 || bP > 102) && (bP < 65 || bP > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            ypd.s(16);
            String string = Integer.toString(bP, 16);
            string.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return zn1Var.P1();
    }

    @Override // defpackage.to1
    public final String S(long j) throws EOFException {
        if (j < 0) {
            h5.k(r6.c(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        zn1 zn1Var = this.b;
        if (jA != -1) {
            return c.b(zn1Var, jA);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && zn1Var.P(j2 - 1) == 13 && request(j2 + 1) && zn1Var.P(j2) == 10) {
            return c.b(zn1Var, j2);
        }
        zn1 zn1Var2 = new zn1();
        zn1Var.G(zn1Var2, 0L, Math.min(32L, zn1Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(zn1Var.b, j) + " content=" + zn1Var2.J0(zn1Var2.b).m() + (char) 8230);
    }

    @Override // defpackage.to1
    public final byte[] S0() {
        pne pneVar = this.a;
        zn1 zn1Var = this.b;
        zn1Var.a1(pneVar);
        return zn1Var.l0(zn1Var.b);
    }

    @Override // defpackage.to1
    public final boolean W0() {
        if (this.c) {
            r6.g("closed");
            return false;
        }
        zn1 zn1Var = this.b;
        return zn1Var.W0() && this.a.f1(zn1Var, 8192L) == -1;
    }

    @Override // defpackage.to1
    public final long Z(vr1 vr1Var) {
        vr1Var.getClass();
        long jMax = 0;
        if (this.c) {
            r6.g("closed");
            return 0L;
        }
        while (true) {
            zn1 zn1Var = this.b;
            long jB0 = zn1Var.b0(jMax, vr1Var);
            if (jB0 != -1) {
                return jB0;
            }
            long j = zn1Var.b;
            if (this.a.f1(zn1Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public final long a(byte b, long j, long j2) {
        if (this.c) {
            r6.g("closed");
            return 0L;
        }
        if (0 > j2) {
            h5.k(r6.c(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jQ = this.b.Q(b2, jMax, j3);
            if (jQ != -1) {
                return jQ;
            }
            zn1 zn1Var = this.b;
            long j4 = zn1Var.b;
            if (j4 >= j3 || this.a.f1(zn1Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.h();
    }

    @Override // defpackage.to1
    public final zn1 f() {
        return this.b;
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            r6.g("closed");
            return 0L;
        }
        zn1 zn1Var2 = this.b;
        if (zn1Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.f1(zn1Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return zn1Var2.f1(zn1Var, Math.min(j, zn1Var2.b));
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.a.g();
    }

    public final String h(long j) throws EOFException {
        x0(j);
        zn1 zn1Var = this.b;
        zn1Var.getClass();
        return zn1Var.h0(j, a32.b);
    }

    @Override // defpackage.to1
    public final String i0() {
        return S(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.to1
    public final long k1(fie fieVar) {
        zn1 zn1Var;
        long j = 0;
        while (true) {
            pne pneVar = this.a;
            zn1Var = this.b;
            if (pneVar.f1(zn1Var, 8192L) == -1) {
                break;
            }
            long jV = zn1Var.v();
            if (jV > 0) {
                j += jV;
                fieVar.I1(zn1Var, jV);
            }
        }
        long j2 = zn1Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fieVar.I1(zn1Var, j2);
        return j3;
    }

    @Override // defpackage.to1
    public final byte[] l0(long j) throws EOFException {
        x0(j);
        return this.b.l0(j);
    }

    @Override // defpackage.to1
    public final String m1(Charset charset) {
        pne pneVar = this.a;
        zn1 zn1Var = this.b;
        zn1Var.a1(pneVar);
        return zn1Var.h0(zn1Var.b, charset);
    }

    @Override // defpackage.to1
    public final short n0() throws EOFException {
        x0(2L);
        return this.b.n0();
    }

    @Override // defpackage.to1
    public final uqc peek() {
        return new uqc(new o7b(this));
    }

    @Override // defpackage.to1
    public final long q0() throws EOFException {
        x0(8L);
        return this.b.q0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zn1 zn1Var = this.b;
        if (zn1Var.b == 0 && this.a.f1(zn1Var, 8192L) == -1) {
            return -1;
        }
        return zn1Var.read(byteBuffer);
    }

    @Override // defpackage.to1
    public final byte readByte() throws EOFException {
        x0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.to1
    public final void readFully(byte[] bArr) throws EOFException {
        zn1 zn1Var = this.b;
        bArr.getClass();
        try {
            x0(bArr.length);
            zn1Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = zn1Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = zn1Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    b0.t();
                    return;
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.to1
    public final int readInt() throws EOFException {
        x0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.to1
    public final long readLong() throws EOFException {
        x0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.to1
    public final short readShort() throws EOFException {
        x0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.to1
    public final boolean request(long j) {
        zn1 zn1Var;
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            r6.g("closed");
            return false;
        }
        do {
            zn1Var = this.b;
            if (zn1Var.b >= j) {
                return true;
            }
        } while (this.a.f1(zn1Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.to1
    public final void skip(long j) throws EOFException {
        if (this.c) {
            r6.g("closed");
            return;
        }
        while (j > 0) {
            zn1 zn1Var = this.b;
            if (zn1Var.b == 0 && this.a.f1(zn1Var, 8192L) == -1) {
                k20.n();
                return;
            } else {
                long jMin = Math.min(j, zn1Var.b);
                zn1Var.skip(jMin);
                j -= jMin;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.to1
    public final InputStream x() {
        return new a();
    }

    @Override // defpackage.to1
    public final void x0(long j) throws EOFException {
        if (request(j)) {
            return;
        }
        k20.n();
    }

    @Override // defpackage.to1
    public final int x1() throws EOFException {
        x0(4L);
        return this.b.x1();
    }

    @Override // defpackage.to1
    public final String z1() {
        pne pneVar = this.a;
        zn1 zn1Var = this.b;
        zn1Var.a1(pneVar);
        return zn1Var.z1();
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            uqc uqcVar = uqc.this;
            if (!uqcVar.c) {
                return (int) Math.min(uqcVar.b.b, 2147483647L);
            }
            r40.h("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            uqc.this.close();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            bArr.getClass();
            uqc uqcVar = uqc.this;
            zn1 zn1Var = uqcVar.b;
            if (uqcVar.c) {
                r40.h("closed");
                return 0;
            }
            k.b(bArr.length, i, i2);
            if (zn1Var.b == 0 && uqcVar.a.f1(zn1Var, 8192L) == -1) {
                return -1;
            }
            return zn1Var.read(bArr, i, i2);
        }

        public final String toString() {
            return uqc.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            uqc uqcVar = uqc.this;
            zn1 zn1Var = uqcVar.b;
            if (uqcVar.c) {
                r40.h("closed");
                return 0;
            }
            if (zn1Var.b == 0 && uqcVar.a.f1(zn1Var, 8192L) == -1) {
                return -1;
            }
            return zn1Var.readByte() & 255;
        }
    }
}
