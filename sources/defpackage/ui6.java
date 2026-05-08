package defpackage;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.datasource.a;
import defpackage.e47;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ui6 extends lg9 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public vi6 C;
    public bj6 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public e47<Integer> I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final a p;
    public final gf3 q;
    public final vi6 r;
    public final boolean s;
    public final boolean t;
    public final qmf u;
    public final ti6 v;
    public final List<androidx.media3.common.a> w;
    public final DrmInitData x;
    public final fr6 y;
    public final g4b z;

    public ui6(ti6 ti6Var, a aVar, gf3 gf3Var, androidx.media3.common.a aVar2, boolean z, a aVar3, gf3 gf3Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, qmf qmfVar, DrmInitData drmInitData, vi6 vi6Var, fr6 fr6Var, g4b g4bVar, boolean z6, boolean z7, sdb sdbVar) {
        super(aVar, gf3Var, aVar2, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = gf3Var2;
        this.p = aVar3;
        this.F = gf3Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = qmfVar;
        this.t = z4;
        this.v = ti6Var;
        this.w = list;
        this.x = drmInitData;
        this.r = vi6Var;
        this.y = fr6Var;
        this.z = g4bVar;
        this.L = z6;
        this.n = z7;
        e47.b bVar = e47.b;
        this.I = qyc.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (jh2.I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        vi6 vi6Var;
        this.D.getClass();
        if (this.C == null && (vi6Var = this.r) != null) {
            m55 m55VarF = ((eq1) vi6Var).a.f();
            if ((m55VarF instanceof uuf) || (m55VarF instanceof ps5)) {
                this.C = this.r;
                this.F = false;
            }
        }
        gf3 gf3Var = this.q;
        a aVar = this.p;
        if (this.F) {
            aVar.getClass();
            gf3Var.getClass();
            e(aVar, gf3Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            e(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
        this.G = true;
    }

    @Override // defpackage.lg9
    public final boolean d() {
        throw null;
    }

    @RequiresNonNull({"output"})
    public final void e(a aVar, gf3 gf3Var, boolean z, boolean z2) {
        gf3 gf3VarC;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            gf3VarC = gf3Var;
        } else {
            gf3VarC = gf3Var.c(i);
            z3 = false;
        }
        try {
            hn3 hn3VarI = i(aVar, gf3VarC, z2);
            if (z3) {
                hn3VarI.c(this.E, false);
            }
            while (!this.G && ((eq1) this.C).a.b(hn3VarI, eq1.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((eq1) this.C).a.d(0L, 0L);
                        j = hn3VarI.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (hn3VarI.d - gf3Var.f);
                    throw th;
                }
            }
            j = hn3VarI.d;
            this.E = (int) (j - gf3Var.f);
        } finally {
            nn2.i(aVar);
        }
    }

    public final int g(int i) {
        ka2.q(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return this.I.get(i).intValue();
    }

    public final boolean h() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02be  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hn3 i(androidx.media3.datasource.a r34, defpackage.gf3 r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.i(androidx.media3.datasource.a, gf3, boolean):hn3");
    }
}
