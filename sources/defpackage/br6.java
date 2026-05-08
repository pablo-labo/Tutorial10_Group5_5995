package defpackage;

import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.source.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class br6 implements a {
    public final a a;
    public final int b;
    public final l.a c;
    public final byte[] d;
    public int e;

    public br6(a aVar, int i, l.a aVar2) {
        ka2.l(i > 0);
        this.a = aVar;
        this.b = i;
        this.c = aVar2;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.a.a();
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        this.a.i(grfVar);
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        long jMax;
        int i3 = this.e;
        a aVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (aVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = aVar.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        g4b g4bVar = new g4b(bArr3, i5);
                        l.a aVar2 = this.c;
                        if (aVar2.l) {
                            l lVar = l.this;
                            Map<String, String> map = l.F0;
                            jMax = Math.max(lVar.y(true), aVar2.i);
                        } else {
                            jMax = aVar2.i;
                        }
                        long j = jMax;
                        int iA = g4bVar.a();
                        zpf zpfVar = aVar2.k;
                        zpfVar.getClass();
                        zpfVar.f(iA, g4bVar);
                        zpfVar.a(j, 1, iA, 0, null);
                        aVar2.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = aVar.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
