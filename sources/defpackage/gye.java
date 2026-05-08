package defpackage;

import androidx.media3.common.a;
import defpackage.dye;
import defpackage.zpf;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class gye implements zpf {
    public final zpf a;
    public final dye.a b;
    public dye g;
    public a h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = vjg.b;
    public final g4b c = new g4b();

    public gye(zpf zpfVar, dye.a aVar) {
        this.a = zpfVar;
        this.b = aVar;
    }

    @Override // defpackage.zpf
    public final void a(final long j, final int i, int i2, int i3, zpf.a aVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, aVar);
            return;
        }
        ka2.k("DRM on subtitles is not supported", aVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.b(this.f, i4, i2, dye.b.c, new wq2() { // from class: fye
                    @Override // defpackage.wq2
                    public final void accept(Object obj) {
                        s83 s83Var = (s83) obj;
                        gye gyeVar = this.a;
                        ka2.r(gyeVar.h);
                        byte[] bArrA = p83.a(s83Var.a, s83Var.c);
                        g4b g4bVar = gyeVar.c;
                        g4bVar.getClass();
                        g4bVar.H(bArrA.length, bArrA);
                        gyeVar.a.f(bArrA.length, g4bVar);
                        long j2 = s83Var.b;
                        a aVar2 = gyeVar.h;
                        long j3 = j;
                        if (j2 == -9223372036854775807L) {
                            ka2.q(aVar2.s == Long.MAX_VALUE);
                        } else {
                            long j4 = aVar2.s;
                            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                        }
                        gyeVar.a.a(j3, i | 1, bArrA.length, 0, null);
                    }
                });
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                zkd.U("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.zpf
    public final void b(g4b g4bVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(g4bVar, i, i2);
            return;
        }
        g(i);
        g4bVar.h(this.e, this.f, i);
        this.e += i;
    }

    @Override // defpackage.zpf
    public final void d(a aVar) {
        aVar.n.getClass();
        String str = aVar.n;
        ka2.l(st9.i(str) == 3);
        boolean zEquals = aVar.equals(this.h);
        dye.a aVar2 = this.b;
        if (!zEquals) {
            this.h = aVar;
            this.g = aVar2.a(aVar) ? aVar2.c(aVar) : null;
        }
        dye dyeVar = this.g;
        zpf zpfVar = this.a;
        if (dyeVar == null) {
            zpfVar.d(aVar);
            return;
        }
        a.C0036a c0036aA = aVar.a();
        c0036aA.m = st9.p("application/x-media3-cues");
        c0036aA.j = str;
        c0036aA.r = Long.MAX_VALUE;
        c0036aA.K = aVar2.b(aVar);
        t40.n(c0036aA, zpfVar);
    }

    @Override // defpackage.zpf
    public final int e(te3 te3Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.e(te3Var, i, z);
        }
        g(i);
        int i2 = te3Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        k20.n();
        return 0;
    }

    public final void g(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
