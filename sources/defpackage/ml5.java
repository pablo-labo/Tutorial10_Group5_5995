package defpackage;

import androidx.media3.extractor.flv.a;
import androidx.media3.extractor.flv.b;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class ml5 implements m55 {
    public final g4b a = new g4b(4);
    public final g4b b = new g4b(9);
    public final g4b c = new g4b(11);
    public final g4b d = new g4b();
    public final krd e;
    public o55 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public b p;

    public ml5() {
        krd krdVar = new krd(new u54());
        krdVar.b = -9223372036854775807L;
        krdVar.c = new long[0];
        krdVar.d = new long[0];
        this.e = krdVar;
        this.g = 1;
    }

    public final g4b a(n55 n55Var) {
        int i = this.l;
        g4b g4bVar = this.d;
        byte[] bArr = g4bVar.a;
        if (i > bArr.length) {
            g4bVar.H(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            g4bVar.J(0);
        }
        g4bVar.I(this.l);
        n55Var.readFully(g4bVar.a, 0, this.l);
        return g4bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r37, defpackage.dhb r38) throws androidx.media3.extractor.flv.TagPayloadReader.UnsupportedFormatException {
        /*
            Method dump skipped, instruction units count: 1123
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml5.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        g4b g4bVar = this.a;
        hn3 hn3Var = (hn3) n55Var;
        hn3Var.d(g4bVar.a, 0, 3, false);
        g4bVar.J(0);
        if (g4bVar.A() == 4607062) {
            hn3Var.d(g4bVar.a, 0, 2, false);
            g4bVar.J(0);
            if ((g4bVar.D() & 250) == 0) {
                hn3Var.d(g4bVar.a, 0, 4, false);
                g4bVar.J(0);
                int iJ = g4bVar.j();
                hn3Var.f = 0;
                hn3Var.o(iJ, false);
                hn3Var.d(g4bVar.a, 0, 4, false);
                g4bVar.J(0);
                if (g4bVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.f = o55Var;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
