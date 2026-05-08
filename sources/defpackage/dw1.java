package defpackage;

import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends b {
    public final DecoderInputBuffer h0;
    public final g4b i0;
    public cw1 j0;
    public long k0;

    public dw1() {
        super(6);
        this.h0 = new DecoderInputBuffer(1);
        this.i0 = new g4b();
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        cw1 cw1Var = this.j0;
        if (cw1Var != null) {
            cw1Var.d();
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.k0 = Long.MIN_VALUE;
        cw1 cw1Var = this.j0;
        if (cw1Var != null) {
            cw1Var.d();
        }
    }

    @Override // androidx.media3.exoplayer.l
    public final int a(a aVar) {
        return "application/x-camera-motion".equals(aVar.n) ? l.f(4, 0, 0, 0) : l.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void i(long j, long j2) {
        float[] fArr;
        while (!j() && this.k0 < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.h0;
            decoderInputBuffer.n();
            ql0 ql0Var = this.c;
            ql0Var.d();
            if (M(ql0Var, decoderInputBuffer, 0) != -4 || decoderInputBuffer.h(4)) {
                return;
            }
            long j3 = decoderInputBuffer.f;
            this.k0 = j3;
            boolean z = j3 < this.a0;
            if (this.j0 != null && !z) {
                decoderInputBuffer.r();
                ByteBuffer byteBuffer = decoderInputBuffer.d;
                String str = vjg.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    g4b g4bVar = this.i0;
                    g4bVar.H(iLimit, bArrArray);
                    g4bVar.J(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(g4bVar.l());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.j0.a(this.k0 - this.Z, fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i == 8) {
            this.j0 = (cw1) obj;
        }
    }
}
