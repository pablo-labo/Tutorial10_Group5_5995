package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class mp3 implements sea {
    public final e2b a;

    public mp3(e2b e2bVar) {
        this.a = e2bVar;
    }

    @Override // defpackage.sea
    public final Object T0(long j, long j2, lu2<? super vmg> lu2Var) {
        return new vmg(vmg.a(0.0f, 0.0f, 1, j2));
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        e2b e2bVar = this.a;
        if (Math.abs(e2bVar.l()) <= 1.0E-6d) {
            return 0L;
        }
        float fL = e2bVar.l() * e2bVar.p();
        float fH = ((e2bVar.n().h() + e2bVar.n().f()) * (-Math.signum(e2bVar.l()))) + fL;
        if (e2bVar.l() > 0.0f) {
            fH = fL;
            fL = fH;
        }
        float f = -e2bVar.k.e(-nic.B(Float.intBitsToFloat((int) (j >> 32)), fL, fH));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
