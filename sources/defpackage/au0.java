package defpackage;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(27)
public final class au0 implements wn9, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public au0(int i) {
        web.e(Boolean.valueOf(i > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = sharedMemoryCreate;
            this.b = sharedMemoryCreate.mapReadWrite();
            this.c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            l6.p("Fail to create AshmemMemory", e);
            throw null;
        }
    }

    @Override // defpackage.wn9
    public final int a() {
        this.a.getClass();
        return this.a.getSize();
    }

    @Override // defpackage.wn9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(wn9 wn9Var, int i) {
        if (!(wn9Var instanceof au0)) {
            l5.q("Cannot copy two incompatible MemoryChunks");
            return;
        }
        web.i(!isClosed());
        au0 au0Var = (au0) wn9Var;
        web.i(!au0Var.isClosed());
        this.b.getClass();
        au0Var.b.getClass();
        hh1.q(0, au0Var.a(), 0, i, a());
        this.b.position(0);
        au0Var.b.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        au0Var.b.put(bArr, 0, i);
    }

    @Override // defpackage.wn9
    public final synchronized int i(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        this.b.getClass();
        iJ = hh1.j(i, i3, a());
        hh1.q(i, bArr.length, i2, iJ, a());
        this.b.position(i);
        this.b.get(bArr, i2, iJ);
        return iJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // defpackage.wn9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.a     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au0.isClosed():boolean");
    }

    @Override // defpackage.wn9
    public final synchronized byte o(int i) {
        boolean z = true;
        web.i(!isClosed());
        web.e(Boolean.valueOf(i >= 0));
        if (i >= a()) {
            z = false;
        }
        web.e(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    @Override // defpackage.wn9
    public final long p() {
        return this.c;
    }

    @Override // defpackage.wn9
    public final synchronized int s(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        this.b.getClass();
        iJ = hh1.j(i, i3, a());
        hh1.q(i, bArr.length, i2, iJ, a());
        this.b.position(i);
        this.b.put(bArr, i2, iJ);
        return iJ;
    }

    @Override // defpackage.wn9
    public final void v(wn9 wn9Var, int i) {
        if (wn9Var.p() == this.c) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.c) + " to AshmemMemoryChunk " + Long.toHexString(wn9Var.p()) + " which are the same ");
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
