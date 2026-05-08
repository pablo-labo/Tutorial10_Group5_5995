package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import defpackage.ka2;
import defpackage.nne;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AudioProcessor {
    public int b;
    public float c;
    public float d;
    public AudioProcessor.a e;
    public AudioProcessor.a f;
    public AudioProcessor.a g;
    public AudioProcessor.a h;
    public boolean i;
    public nne j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean c() {
        if (this.p) {
            nne nneVar = this.j;
            if (nneVar != null) {
                ka2.q(nneVar.m >= 0);
                if (nneVar.m * nneVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer d() {
        nne nneVar = this.j;
        if (nneVar != null) {
            int i = nneVar.b;
            ka2.q(nneVar.m >= 0);
            int i2 = nneVar.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                ka2.q(nneVar.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, nneVar.m);
                int i3 = iMin * i;
                shortBuffer.put(nneVar.l, 0, i3);
                int i4 = nneVar.m - iMin;
                nneVar.m = i4;
                short[] sArr = nneVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += (long) i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            nne nneVar = this.j;
            nneVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = nneVar.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = nneVar.c(nneVar.j, nneVar.k, i2);
            nneVar.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, nneVar.k * i, ((i2 * i) * 2) / 2);
            nneVar.k += i2;
            nneVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f() {
        nne nneVar = this.j;
        if (nneVar != null) {
            int i = nneVar.k;
            float f = nneVar.c;
            float f2 = nneVar.d;
            double d = f / f2;
            double d2 = nneVar.e * f2;
            int i2 = nneVar.r;
            int i3 = nneVar.m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + nneVar.w) + ((double) nneVar.o)) / d2) + 0.5d));
            nneVar.w = 0.0d;
            short[] sArr = nneVar.j;
            int i4 = nneVar.h * 2;
            nneVar.j = nneVar.c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = nneVar.b;
                if (i5 >= i4 * i6) {
                    break;
                }
                nneVar.j[(i6 * i) + i5] = 0;
                i5++;
            }
            nneVar.k = i4 + nneVar.k;
            nneVar.f();
            if (nneVar.m > i3) {
                nneVar.m = Math.max(i3, 0);
            }
            nneVar.k = 0;
            nneVar.r = 0;
            nneVar.o = 0;
        }
        this.p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.e;
            this.g = aVar;
            AudioProcessor.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new nne(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                nne nneVar = this.j;
                if (nneVar != null) {
                    nneVar.k = 0;
                    nneVar.m = 0;
                    nneVar.o = 0;
                    nneVar.p = 0;
                    nneVar.q = 0;
                    nneVar.r = 0;
                    nneVar.s = 0;
                    nneVar.t = 0;
                    nneVar.u = 0;
                    nneVar.v = 0;
                    nneVar.w = 0.0d;
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i = this.b;
        if (i == -1) {
            i = aVar.a;
        }
        this.e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i, aVar.b, 2);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
