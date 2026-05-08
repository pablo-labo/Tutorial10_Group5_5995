package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class agb extends InputStream {
    public final PooledByteBuffer a;
    public int b;
    public int c;

    public agb(PooledByteBuffer pooledByteBuffer) {
        web.e(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.a = pooledByteBuffer;
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.size() - this.b;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.c = this.b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            uz.i(sb, bArr.length, "; regionStart=", i, "; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i2);
        this.a.i(this.b, i, iMin, bArr);
        this.b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.b = this.c;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        web.e(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.b;
        this.b = i + 1;
        return this.a.o(i) & 255;
    }
}
