package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class co1 implements wn9, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = System.identityHashCode(this);

    public co1(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    @Override // defpackage.wn9
    public final int a() {
        return this.b;
    }

    @Override // defpackage.wn9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    public final void h(wn9 wn9Var, int i) {
        ByteBuffer byteBuffer;
        if (!(wn9Var instanceof co1)) {
            l5.q("Cannot copy two incompatible MemoryChunks");
            return;
        }
        web.i(!isClosed());
        co1 co1Var = (co1) wn9Var;
        web.i(!co1Var.isClosed());
        this.a.getClass();
        hh1.q(0, co1Var.b, 0, i, this.b);
        this.a.position(0);
        synchronized (co1Var) {
            byteBuffer = co1Var.a;
        }
        byteBuffer.getClass();
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        byteBuffer.put(bArr, 0, i);
    }

    @Override // defpackage.wn9
    public final synchronized int i(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        web.i(!isClosed());
        this.a.getClass();
        iJ = hh1.j(i, i3, this.b);
        hh1.q(i, bArr.length, i2, iJ, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, iJ);
        return iJ;
    }

    @Override // defpackage.wn9
    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.wn9
    public final synchronized byte o(int i) {
        boolean z = true;
        web.i(!isClosed());
        web.e(Boolean.valueOf(i >= 0));
        if (i >= this.b) {
            z = false;
        }
        web.e(Boolean.valueOf(z));
        this.a.getClass();
        return this.a.get(i);
    }

    @Override // defpackage.wn9
    public final long p() {
        return this.c;
    }

    @Override // defpackage.wn9
    public final synchronized int s(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        web.i(!isClosed());
        this.a.getClass();
        iJ = hh1.j(i, i3, this.b);
        hh1.q(i, bArr.length, i2, iJ, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, iJ);
        return iJ;
    }

    @Override // defpackage.wn9
    public final void v(wn9 wn9Var, int i) {
        if (wn9Var.p() == this.c) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.c) + " to BufferMemoryChunk " + Long.toHexString(wn9Var.p()) + " which are the same ");
            web.e(Boolean.FALSE);
        }
        if (wn9Var.p() < this.c) {
            synchronized (wn9Var) {
                synchronized (this) {
                    h(wn9Var, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (wn9Var) {
                    h(wn9Var, i);
                }
            }
        }
    }
}
