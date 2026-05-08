package com.facebook.imagepipeline.memory;

import android.util.Log;
import defpackage.h84;
import defpackage.hh1;
import defpackage.l5;
import defpackage.u9a;
import defpackage.web;
import defpackage.wn9;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class NativeMemoryChunk implements wn9, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        u9a.b("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        web.e(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @h84
    private static native long nativeAllocate(int i);

    @h84
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @h84
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @h84
    private static native void nativeFree(long j);

    @h84
    private static native void nativeMemcpy(long j, long j2, int i);

    @h84
    private static native byte nativeReadByte(long j);

    @Override // defpackage.wn9
    public final int a() {
        return this.b;
    }

    @Override // defpackage.wn9, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final void h(wn9 wn9Var, int i) {
        if (!(wn9Var instanceof NativeMemoryChunk)) {
            l5.q("Cannot copy two incompatible MemoryChunks");
            return;
        }
        web.i(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) wn9Var;
        web.i(!nativeMemoryChunk.isClosed());
        hh1.q(0, nativeMemoryChunk.b, 0, i, this.b);
        nativeMemcpy(nativeMemoryChunk.a, this.a, i);
    }

    @Override // defpackage.wn9
    public final synchronized int i(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        web.i(!isClosed());
        iJ = hh1.j(i, i3, this.b);
        hh1.q(i, bArr.length, i2, iJ, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, iJ);
        return iJ;
    }

    @Override // defpackage.wn9
    public final synchronized boolean isClosed() {
        return this.c;
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
        return nativeReadByte(this.a + ((long) i));
    }

    @Override // defpackage.wn9
    public final long p() {
        return this.a;
    }

    @Override // defpackage.wn9
    public final synchronized int s(int i, int i2, int i3, byte[] bArr) {
        int iJ;
        web.i(!isClosed());
        iJ = hh1.j(i, i3, this.b);
        hh1.q(i, bArr.length, i2, iJ, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, iJ);
        return iJ;
    }

    @Override // defpackage.wn9
    public final void v(wn9 wn9Var, int i) {
        if (wn9Var.p() == this.a) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(wn9Var)) + " which share the same address " + Long.toHexString(this.a));
            web.e(Boolean.FALSE);
        }
        if (wn9Var.p() < this.a) {
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

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0L;
        this.c = true;
    }
}
