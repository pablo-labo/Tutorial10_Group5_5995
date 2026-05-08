package defpackage;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class xn9 implements PooledByteBuffer {
    public final int a;
    public n82<wn9> b;

    public xn9(im3 im3Var, int i) {
        im3Var.getClass();
        web.e(Boolean.valueOf(i >= 0 && i <= ((wn9) im3Var.P()).a()));
        this.b = im3Var.clone();
        this.a = i;
    }

    public final synchronized void a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        n82.G(this.b);
        this.b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int i(int i, int i2, int i3, byte[] bArr) {
        a();
        web.e(Boolean.valueOf(i + i3 <= this.a));
        this.b.getClass();
        return this.b.P().i(i, i2, i3, bArr);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized boolean isClosed() {
        return !n82.W(this.b);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized byte o(int i) {
        a();
        web.e(Boolean.valueOf(i >= 0));
        web.e(Boolean.valueOf(i < this.a));
        this.b.getClass();
        return this.b.P().o(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int size() {
        a();
        return this.a;
    }
}
