package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class fo1 extends qf1 {
    public byte[] a;
    public int b;
    public b c;
    public int d;

    public static abstract class a {
    }

    public static class b extends a {
        public final ByteArrayOutputStream a;
        public final WritableByteChannel b;

        public b(ByteArrayOutputStream byteArrayOutputStream) {
            this.a = byteArrayOutputStream;
            this.b = Channels.newChannel(byteArrayOutputStream);
        }
    }

    @Override // defpackage.qf1
    public final void b(int i, byte[] bArr, int i2) throws IOException {
        if (i2 > this.d) {
            k();
            this.c.a.write(bArr, i, i2);
        } else {
            j(i2);
            System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b += i2;
        }
    }

    @Override // defpackage.qf1
    public final void c(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBuffer.hasArray() || byteBuffer.remaining() <= this.d) {
            super.c(byteBufferAsReadOnlyBuffer);
        } else {
            k();
            this.c.b.write(byteBufferAsReadOnlyBuffer);
        }
    }

    @Override // defpackage.qf1
    public final void d(int i) {
        j(5);
        int i2 = this.b;
        this.b = of1.d(i, this.a, i2) + i2;
    }

    @Override // defpackage.qf1
    public final void e(long j) {
        j(10);
        int i = this.b;
        this.b = of1.e(j, this.a, i) + i;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        k();
        this.c.a.flush();
    }

    @Override // defpackage.qf1
    public final void i() {
        if (this.b == this.a.length) {
            k();
        }
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = 0;
    }

    public final void j(int i) {
        if (this.a.length - this.b < i) {
            k();
        }
    }

    public final void k() {
        int i = this.b;
        if (i > 0) {
            try {
                b bVar = this.c;
                bVar.a.write(this.a, 0, i);
            } finally {
                this.b = 0;
            }
        }
    }
}
