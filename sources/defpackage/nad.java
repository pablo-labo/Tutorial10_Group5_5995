package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class nad extends InputStream {
    public static final ByteBuffer d = ByteBuffer.allocate(0);
    public ByteBuffer a;
    public ByteBuffer b;
    public int c;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = this.b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.remaining() <= 0) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        this.a.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.b.position(this.c);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.b;
        if (j <= 0) {
            return 0L;
        }
        int iRemaining = j > ((long) byteBuffer.remaining()) ? byteBuffer.remaining() : (int) j;
        byteBuffer.position(byteBuffer.position() + iRemaining);
        return iRemaining;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }
}
