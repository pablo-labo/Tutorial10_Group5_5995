package defpackage;

import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o05 implements rjd {
    public int V;
    public final a a;
    public long[] c;
    public boolean d;
    public u05 e;
    public boolean f;
    public final d73 b = new d73();
    public long W = -9223372036854775807L;

    public o05(u05 u05Var, a aVar, boolean z) {
        this.a = aVar;
        this.e = u05Var;
        this.c = u05Var.b;
        c(u05Var, z);
    }

    @Override // defpackage.rjd
    public final void a() {
    }

    @Override // defpackage.rjd
    public final boolean b() {
        return true;
    }

    public final void c(u05 u05Var, boolean z) {
        int i = this.V;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = u05Var;
        long[] jArr = u05Var.b;
        this.c = jArr;
        long j3 = this.W;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.V = vjg.a(jArr, j2, false);
            }
        } else {
            int iA = vjg.a(jArr, j3, true);
            this.V = iA;
            if (this.d && iA == this.c.length) {
                j = j3;
            }
            this.W = j;
        }
    }

    @Override // defpackage.rjd
    public final int m(long j) {
        int iMax = Math.max(this.V, vjg.a(this.c, j, true));
        int i = iMax - this.V;
        this.V = iMax;
        return i;
    }

    @Override // defpackage.rjd
    public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.V;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            decoderInputBuffer.a = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            ql0Var.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.V = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrA = this.b.a(this.e.a[i2]);
            decoderInputBuffer.p(bArrA.length);
            decoderInputBuffer.d.put(bArrA);
        }
        decoderInputBuffer.f = this.c[i2];
        decoderInputBuffer.a = 1;
        return -4;
    }
}
