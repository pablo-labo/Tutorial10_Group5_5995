package defpackage;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class luf extends b {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (!vjg.J(aVar.c)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? AudioProcessor.a.e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferJ = j(length);
        int i3 = vjg.i(length, 0, this.n);
        byteBufferJ.put(this.m, 0, i3);
        int i4 = vjg.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferJ.flip();
    }

    @Override // androidx.media3.common.audio.b
    public final void h() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void i() {
        this.m = vjg.b;
    }
}
