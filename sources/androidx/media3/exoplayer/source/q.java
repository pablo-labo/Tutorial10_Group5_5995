package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ayd;
import defpackage.gf3;
import defpackage.grf;
import defpackage.nn2;
import defpackage.ote;
import defpackage.p35;
import defpackage.ql0;
import defpackage.rjd;
import defpackage.st9;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.wpf;
import defpackage.xpf;
import defpackage.yyc;
import defpackage.zkd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q implements g, Loader.a<b> {
    public final ArrayList<a> V = new ArrayList<>();
    public final long W;
    public final Loader X;
    public final androidx.media3.common.a Y;
    public final boolean Z;
    public final gf3 a;
    public boolean a0;
    public final a.InterfaceC0038a b;
    public byte[] b0;
    public final grf c;
    public int c0;
    public final androidx.media3.exoplayer.upstream.b d;
    public final i.a e;
    public final xpf f;

    public final class a implements rjd {
        public int a;
        public boolean b;

        public a() {
        }

        @Override // defpackage.rjd
        public final void a() throws IOException {
            q qVar = q.this;
            if (qVar.Z) {
                return;
            }
            qVar.X.a();
        }

        @Override // defpackage.rjd
        public final boolean b() {
            return q.this.a0;
        }

        public final void c() {
            if (this.b) {
                return;
            }
            q qVar = q.this;
            qVar.e.b(st9.i(qVar.Y.n), qVar.Y, 0, null, 0L);
            this.b = true;
        }

        @Override // defpackage.rjd
        public final int m(long j) {
            c();
            if (j <= 0 || this.a == 2) {
                return 0;
            }
            this.a = 2;
            return 1;
        }

        @Override // defpackage.rjd
        public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            c();
            q qVar = q.this;
            boolean z = qVar.a0;
            if (z && qVar.b0 == null) {
                this.a = 2;
            }
            int i2 = this.a;
            if (i2 == 2) {
                decoderInputBuffer.c(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                ql0Var.c = qVar.Y;
                this.a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            qVar.b0.getClass();
            decoderInputBuffer.c(1);
            decoderInputBuffer.f = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.p(qVar.c0);
                decoderInputBuffer.d.put(qVar.b0, 0, qVar.c0);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }
    }

    public static final class b implements Loader.d {
        public final gf3 a;
        public final ote b;
        public byte[] c;

        public b(gf3 gf3Var, androidx.media3.datasource.a aVar) {
            uz8.c.getAndIncrement();
            this.a = gf3Var;
            this.b = new ote(aVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void a() {
            ote oteVar = this.b;
            oteVar.b = 0L;
            try {
                oteVar.b(this.a);
                int i = 0;
                while (i != -1) {
                    int i2 = (int) oteVar.b;
                    byte[] bArr = this.c;
                    if (bArr == null) {
                        this.c = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    } else if (i2 == bArr.length) {
                        this.c = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.c;
                    i = oteVar.read(bArr2, i2, bArr2.length - i2);
                }
                nn2.i(oteVar);
            } catch (Throwable th) {
                nn2.i(oteVar);
                throw th;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void b() {
        }
    }

    public q(gf3 gf3Var, a.InterfaceC0038a interfaceC0038a, grf grfVar, androidx.media3.common.a aVar, long j, androidx.media3.exoplayer.upstream.b bVar, i.a aVar2, boolean z, yyc yycVar) {
        this.a = gf3Var;
        this.b = interfaceC0038a;
        this.c = grfVar;
        this.Y = aVar;
        this.W = j;
        this.d = bVar;
        this.e = aVar2;
        this.Z = z;
        this.f = new xpf(new wpf("", aVar));
        this.X = yycVar != null ? new Loader(yycVar) : new Loader("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.X.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        if (this.a0) {
            return false;
        }
        Loader loader = this.X;
        if (loader.d() || loader.c()) {
            return false;
        }
        androidx.media3.datasource.a aVarA = this.b.a();
        grf grfVar = this.c;
        if (grfVar != null) {
            aVarA.i(grfVar);
        }
        loader.f(new b(this.a, aVarA), this, this.d.b(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < p35VarArr.length; i++) {
            rjd rjdVar = rjdVarArr[i];
            ArrayList<a> arrayList = this.V;
            if (rjdVar != null && (p35VarArr[i] == null || !zArr[i])) {
                arrayList.remove(rjdVar);
                rjdVarArr[i] = null;
            }
            if (rjdVarArr[i] == null && p35VarArr[i] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                rjdVarArr[i] = aVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
        Loader.b bVar;
        ote oteVar = ((b) dVar).b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        vjg.c0(this.W);
        b.c cVar = new b.c(iOException, i);
        androidx.media3.exoplayer.upstream.b bVar2 = this.d;
        long jA = bVar2.a(cVar);
        boolean z = jA == -9223372036854775807L || i >= bVar2.b(1);
        if (this.Z && z) {
            zkd.U("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.a0 = true;
            bVar = Loader.e;
        } else {
            bVar = jA != -9223372036854775807L ? new Loader.b(0, jA) : Loader.f;
        }
        Loader.b bVar3 = bVar;
        this.e.e(uz8Var, 1, -1, this.Y, 0, null, 0L, this.W, iOException, !bVar3.a());
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        return (this.a0 || this.X.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.V;
            if (i >= arrayList.size()) {
                return j;
            }
            a aVar = arrayList.get(i);
            if (aVar.a == 2) {
                aVar.a = 1;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void n(Loader.d dVar, long j, long j2, int i) {
        uz8 uz8Var;
        b bVar = (b) dVar;
        ote oteVar = bVar.b;
        if (i == 0) {
            uz8Var = new uz8(bVar.a);
        } else {
            Uri uri = oteVar.c;
            uz8Var = new uz8(j2, oteVar.d);
        }
        this.e.g(uz8Var, 1, -1, this.Y, 0, null, 0L, this.W, i);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        return this.f;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void r(Loader.d dVar, long j, long j2) {
        b bVar = (b) dVar;
        this.c0 = (int) bVar.b.b;
        byte[] bArr = bVar.c;
        bArr.getClass();
        this.b0 = bArr;
        this.a0 = true;
        ote oteVar = bVar.b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.d.getClass();
        this.e.d(uz8Var, 1, -1, this.Y, 0, null, 0L, this.W);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        return this.a0 ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void v(Loader.d dVar, long j, long j2, boolean z) {
        ote oteVar = ((b) dVar).b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.d.getClass();
        this.e.c(uz8Var, 1, -1, null, 0, null, 0L, this.W);
    }
}
