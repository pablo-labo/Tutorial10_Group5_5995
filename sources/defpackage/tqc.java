package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class tqc implements ro1 {
    public final fie a;
    public final zn1 b;
    public boolean c;

    public tqc(fie fieVar) {
        fieVar.getClass();
        this.a = fieVar;
        this.b = new zn1();
    }

    @Override // defpackage.ro1
    public final ro1 H() {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        zn1 zn1Var = this.b;
        long j = zn1Var.b;
        if (j > 0) {
            this.a.I1(zn1Var, j);
        }
        return this;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        if (this.c) {
            r6.g("closed");
        } else {
            this.b.I1(zn1Var, j);
            a();
        }
    }

    @Override // defpackage.ro1
    public final ro1 Y(String str) {
        str.getClass();
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.Q0(str);
        a();
        return this;
    }

    public final ro1 a() {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        zn1 zn1Var = this.b;
        long jV = zn1Var.v();
        if (jV > 0) {
            this.a.I1(zn1Var, jV);
        }
        return this;
    }

    @Override // defpackage.ro1
    public final long a1(pne pneVar) {
        pneVar.getClass();
        long j = 0;
        while (true) {
            long jF1 = pneVar.f1(this.b, 8192L);
            if (jF1 == -1) {
                return j;
            }
            j += jF1;
            a();
        }
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        fie fieVar = this.a;
        if (this.c) {
            return;
        }
        try {
            zn1 zn1Var = this.b;
            long j = zn1Var.b;
            if (j > 0) {
                fieVar.I1(zn1Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            fieVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ro1
    public final zn1 f() {
        return this.b;
    }

    @Override // defpackage.ro1, defpackage.fie, java.io.Flushable
    public final void flush() {
        if (this.c) {
            r6.g("closed");
            return;
        }
        zn1 zn1Var = this.b;
        long j = zn1Var.b;
        fie fieVar = this.a;
        if (j > 0) {
            fieVar.I1(zn1Var, j);
        }
        fieVar.flush();
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a.g();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.ro1
    public final ro1 p0(int i, byte[] bArr, int i2) {
        bArr.getClass();
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.write(bArr, i, i2);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final ro1 q1(long j) {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.K0(j);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.ro1
    public final ro1 v0(vr1 vr1Var) {
        vr1Var.getClass();
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.o0(vr1Var);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final OutputStream w() {
        return new a();
    }

    @Override // defpackage.ro1
    public final ro1 write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            r6.g("closed");
            return null;
        }
        zn1 zn1Var = this.b;
        zn1Var.getClass();
        zn1Var.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final ro1 writeByte(int i) {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.r0(i);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final ro1 writeInt(int i) {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.L0(i);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final ro1 writeShort(int i) {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.N0(i);
        a();
        return this;
    }

    @Override // defpackage.ro1
    public final ro1 z0(long j) {
        if (this.c) {
            r6.g("closed");
            return null;
        }
        this.b.B0(j);
        a();
        return this;
    }

    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            tqc.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            tqc tqcVar = tqc.this;
            if (tqcVar.c) {
                return;
            }
            tqcVar.flush();
        }

        public final String toString() {
            return tqc.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            bArr.getClass();
            tqc tqcVar = tqc.this;
            if (tqcVar.c) {
                r40.h("closed");
            } else {
                tqcVar.b.write(bArr, i, i2);
                tqcVar.a();
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            tqc tqcVar = tqc.this;
            if (!tqcVar.c) {
                tqcVar.b.r0((byte) i);
                tqcVar.a();
            } else {
                r40.h("closed");
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int iWrite = this.b.write(byteBuffer);
            a();
            return iWrite;
        }
        r6.g("closed");
        return 0;
    }
}
