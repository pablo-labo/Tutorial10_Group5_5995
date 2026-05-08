package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements pne {
    public final ByteBuffer a;
    public final int b;

    public jr1(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.a = byteBufferSlice;
        this.b = byteBufferSlice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) {
        ByteBuffer byteBuffer = this.a;
        int iPosition = byteBuffer.position();
        int i = this.b;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return zn1Var.write(byteBuffer);
    }

    @Override // defpackage.pne
    public final kmf g() {
        return kmf.d;
    }
}
