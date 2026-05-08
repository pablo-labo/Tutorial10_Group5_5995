package defpackage;

import androidx.media3.common.a;
import defpackage.zpf;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class u54 implements zpf {
    public final byte[] a = new byte[4096];

    @Override // defpackage.zpf
    public final void a(long j, int i, int i2, int i3, zpf.a aVar) {
    }

    @Override // defpackage.zpf
    public final void b(g4b g4bVar, int i, int i2) {
        g4bVar.K(i);
    }

    @Override // defpackage.zpf
    public final void d(a aVar) {
    }

    @Override // defpackage.zpf
    public final int e(te3 te3Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = te3Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        k20.n();
        return 0;
    }
}
