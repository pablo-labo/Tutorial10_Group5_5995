package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements pg9 {
    public static final ArrayDeque<b> g = new ArrayDeque<>();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public a c;
    public final AtomicReference<RuntimeException> d;
    public final sn2 e;
    public boolean f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ew0 ew0Var = ew0.this;
            int i = message.what;
            b bVar = null;
            if (i == 1) {
                b bVar2 = (b) message.obj;
                try {
                    ew0Var.a.queueInputBuffer(bVar2.a, 0, bVar2.b, bVar2.d, bVar2.e);
                } catch (RuntimeException e) {
                    AtomicReference<RuntimeException> atomicReference = ew0Var.d;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                }
                bVar = bVar2;
            } else if (i == 2) {
                b bVar3 = (b) message.obj;
                int i2 = bVar3.a;
                MediaCodec.CryptoInfo cryptoInfo = bVar3.c;
                long j = bVar3.d;
                int i3 = bVar3.e;
                try {
                    synchronized (ew0.h) {
                        ew0Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e2) {
                    AtomicReference<RuntimeException> atomicReference2 = ew0Var.d;
                    while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                    }
                }
                bVar = bVar3;
            } else if (i == 3) {
                ew0Var.e.d();
            } else if (i != 4) {
                AtomicReference<RuntimeException> atomicReference3 = ew0Var.d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    ew0Var.a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e3) {
                    AtomicReference<RuntimeException> atomicReference4 = ew0Var.d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
            }
            if (bVar != null) {
                ArrayDeque<b> arrayDeque = ew0.g;
                synchronized (arrayDeque) {
                    arrayDeque.add(bVar);
                }
            }
        }
    }

    public static class b {
        public int a;
        public int b;
        public final MediaCodec.CryptoInfo c = new MediaCodec.CryptoInfo();
        public long d;
        public int e;
    }

    public ew0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        sn2 sn2Var = new sn2();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = sn2Var;
        this.d = new AtomicReference<>();
    }

    public static b d() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pg9
    public final void a(int i, b83 b83Var, long j, int i2) {
        c();
        b bVarD = d();
        bVarD.a = i;
        bVarD.b = 0;
        bVarD.d = j;
        bVarD.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = bVarD.c;
        cryptoInfo.numSubSamples = b83Var.f;
        int[] iArr = b83Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = b83Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = b83Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = b83Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = b83Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(b83Var.g, b83Var.h));
        a aVar = this.c;
        String str = vjg.a;
        aVar.obtainMessage(2, bVarD).sendToTarget();
    }

    @Override // defpackage.pg9
    public final void b(int i, int i2, int i3, long j) {
        c();
        b bVarD = d();
        bVarD.a = i;
        bVarD.b = i2;
        bVarD.d = j;
        bVarD.e = i3;
        a aVar = this.c;
        String str = vjg.a;
        aVar.obtainMessage(1, bVarD).sendToTarget();
    }

    @Override // defpackage.pg9
    public final void c() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // defpackage.pg9
    public final void flush() {
        if (this.f) {
            try {
                a aVar = this.c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                sn2 sn2Var = this.e;
                synchronized (sn2Var) {
                    sn2Var.b = false;
                }
                a aVar2 = this.c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                sn2Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                z3.q(e);
            }
        }
    }

    @Override // defpackage.pg9
    public final void setParameters(Bundle bundle) {
        c();
        a aVar = this.c;
        String str = vjg.a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.pg9
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.pg9
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new a(handlerThread.getLooper());
        this.f = true;
    }
}
