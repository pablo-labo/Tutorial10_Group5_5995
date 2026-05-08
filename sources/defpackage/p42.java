package defpackage;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import defpackage.q42;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p42<T extends q42> implements rjd, p, Loader.a<k42>, Loader.e {
    public final i.a V;
    public final androidx.media3.exoplayer.upstream.b W;
    public final Loader X = new Loader("ChunkSampleStream");
    public final m42 Y = new m42();
    public final ArrayList<ea1> Z;
    public final int a;
    public final List<ea1> a0;
    public final int[] b;
    public final o b0;
    public final androidx.media3.common.a[] c;
    public final o[] c0;
    public final boolean[] d;
    public final ga1 d0;
    public final T e;
    public k42 e0;
    public final androidx.media3.exoplayer.dash.b f;
    public androidx.media3.common.a f0;
    public b<T> g0;
    public long h0;
    public long i0;
    public int j0;
    public ea1 k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;

    public final class a implements rjd {
        public final p42<T> a;
        public final o b;
        public final int c;
        public boolean d;

        public a(p42<T> p42Var, o oVar, int i) {
            this.a = p42Var;
            this.b = oVar;
            this.c = i;
        }

        @Override // defpackage.rjd
        public final void a() {
        }

        @Override // defpackage.rjd
        public final boolean b() {
            p42 p42Var = p42.this;
            return !p42Var.z() && this.b.w(p42Var.n0);
        }

        public final void c() {
            if (this.d) {
                return;
            }
            p42 p42Var = p42.this;
            i.a aVar = p42Var.V;
            int[] iArr = p42Var.b;
            int i = this.c;
            aVar.b(iArr[i], p42Var.c[i], 0, null, p42Var.i0);
            this.d = true;
        }

        @Override // defpackage.rjd
        public final int m(long j) throws Throwable {
            p42 p42Var = p42.this;
            if (p42Var.z()) {
                return 0;
            }
            boolean z = p42Var.n0;
            o oVar = this.b;
            int iU = oVar.u(j, z);
            ea1 ea1Var = p42Var.k0;
            if (ea1Var != null) {
                iU = Math.min(iU, ea1Var.e(this.c + 1) - oVar.s());
            }
            oVar.F(iU);
            if (iU > 0) {
                c();
            }
            return iU;
        }

        @Override // defpackage.rjd
        public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            p42 p42Var = p42.this;
            if (p42Var.z()) {
                return -3;
            }
            ea1 ea1Var = p42Var.k0;
            o oVar = this.b;
            if (ea1Var != null && ea1Var.e(this.c + 1) <= oVar.s()) {
                return -3;
            }
            c();
            return oVar.B(ql0Var, decoderInputBuffer, i, p42Var.n0);
        }
    }

    public interface b<T extends q42> {
    }

    public p42(int i, int[] iArr, androidx.media3.common.a[] aVarArr, androidx.media3.exoplayer.dash.a aVar, androidx.media3.exoplayer.dash.b bVar, qk3 qk3Var, long j, androidx.media3.exoplayer.drm.b bVar2, a.C0043a c0043a, androidx.media3.exoplayer.upstream.b bVar3, i.a aVar2, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = aVarArr;
        this.e = aVar;
        this.f = bVar;
        this.V = aVar2;
        this.W = bVar3;
        this.l0 = z;
        ArrayList<ea1> arrayList = new ArrayList<>();
        this.Z = arrayList;
        this.a0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.c0 = new o[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        o[] oVarArr = new o[i2];
        bVar2.getClass();
        o oVar = new o(qk3Var, bVar2, c0043a);
        this.b0 = oVar;
        int i3 = 0;
        iArr2[0] = i;
        oVarArr[0] = oVar;
        while (i3 < length) {
            o oVar2 = new o(qk3Var, null, null);
            this.c0[i3] = oVar2;
            int i4 = i3 + 1;
            oVarArr[i4] = oVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.d0 = new ga1(iArr2, oVarArr);
        this.h0 = j;
        this.i0 = j;
    }

    public final void A() {
        int iB = B(this.b0.s(), this.j0 - 1);
        while (true) {
            int i = this.j0;
            if (i > iB) {
                return;
            }
            this.j0 = i + 1;
            ea1 ea1Var = this.Z.get(i);
            androidx.media3.common.a aVar = ea1Var.d;
            if (!aVar.equals(this.f0)) {
                this.V.b(this.a, aVar, ea1Var.e, ea1Var.f, ea1Var.g);
            }
            this.f0 = aVar;
        }
    }

    public final int B(int i, int i2) {
        ArrayList<ea1> arrayList;
        do {
            i2++;
            arrayList = this.Z;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).e(0) <= i);
        return i2 - 1;
    }

    public final void C(androidx.media3.exoplayer.dash.b bVar) {
        this.g0 = bVar;
        o oVar = this.b0;
        oVar.j();
        DrmSession drmSession = oVar.h;
        if (drmSession != null) {
            drmSession.f(oVar.e);
            oVar.h = null;
            oVar.g = null;
        }
        for (o oVar2 : this.c0) {
            oVar2.j();
            DrmSession drmSession2 = oVar2.h;
            if (drmSession2 != null) {
                drmSession2.f(oVar2.e);
                oVar2.h = null;
                oVar2.g = null;
            }
        }
        this.X.e(this);
    }

    @Override // defpackage.rjd
    public final void a() throws IOException {
        Loader loader = this.X;
        loader.a();
        this.b0.y();
        if (loader.d()) {
            return;
        }
        this.e.a();
    }

    @Override // defpackage.rjd
    public final boolean b() {
        return !z() && this.b0.w(this.n0);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.X.d();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(g gVar) {
        long j;
        List<ea1> list;
        if (!this.n0) {
            Loader loader = this.X;
            if (!loader.d() && !loader.c()) {
                boolean z = z();
                if (z) {
                    list = Collections.EMPTY_LIST;
                    j = this.h0;
                } else {
                    j = x().h;
                    list = this.a0;
                }
                this.e.i(gVar, j, list, this.Y);
                m42 m42Var = this.Y;
                boolean z2 = m42Var.b;
                k42 k42Var = m42Var.a;
                m42Var.a = null;
                m42Var.b = false;
                if (z2) {
                    this.h0 = -9223372036854775807L;
                    this.n0 = true;
                    return true;
                }
                if (k42Var != null) {
                    this.e0 = k42Var;
                    boolean z3 = k42Var instanceof ea1;
                    ga1 ga1Var = this.d0;
                    if (z3) {
                        ea1 ea1Var = (ea1) k42Var;
                        if (z) {
                            long j2 = ea1Var.g;
                            long j3 = this.h0;
                            if (j2 < j3) {
                                this.b0.t = j3;
                                for (o oVar : this.c0) {
                                    oVar.t = this.h0;
                                }
                                if (this.l0) {
                                    androidx.media3.common.a aVar = ea1Var.d;
                                    this.m0 = !st9.a(aVar.n, aVar.k);
                                }
                            }
                            this.l0 = false;
                            this.h0 = -9223372036854775807L;
                        }
                        ea1Var.m = ga1Var;
                        o[] oVarArr = ga1Var.b;
                        int[] iArr = new int[oVarArr.length];
                        for (int i = 0; i < oVarArr.length; i++) {
                            o oVar2 = oVarArr[i];
                            iArr[i] = oVar2.q + oVar2.p;
                        }
                        ea1Var.n = iArr;
                        this.Z.add(ea1Var);
                    } else if (k42Var instanceof ld7) {
                        ((ld7) k42Var).k = ga1Var;
                    }
                    loader.f(k42Var, this, this.W.b(k42Var.c));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
        Loader.b bVar;
        k42 k42Var = (k42) dVar;
        long j3 = k42Var.i.b;
        boolean z = k42Var instanceof ea1;
        ArrayList<ea1> arrayList = this.Z;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && y(size)) ? false : true;
        ote oteVar = k42Var.i;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        vjg.c0(k42Var.g);
        vjg.c0(k42Var.h);
        b.c cVar = new b.c(iOException, i);
        T t = this.e;
        androidx.media3.exoplayer.upstream.b bVar2 = this.W;
        if (!t.f(k42Var, z2, cVar, bVar2)) {
            bVar = null;
        } else if (z2) {
            if (z) {
                ka2.q(w(size) == k42Var);
                if (arrayList.isEmpty()) {
                    this.h0 = this.i0;
                }
            }
            bVar = Loader.e;
        } else {
            zkd.T("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            bVar = null;
        }
        if (bVar == null) {
            long jA = bVar2.a(cVar);
            bVar = jA != -9223372036854775807L ? new Loader.b(0, jA) : Loader.f;
        }
        boolean zA = bVar.a();
        this.V.e(uz8Var, k42Var.c, this.a, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h, iOException, !zA);
        if (!zA) {
            this.e0 = null;
            bVar2.getClass();
            this.f.b(this);
        }
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        if (z()) {
            return this.h0;
        }
        if (this.n0) {
            return Long.MIN_VALUE;
        }
        return x().h;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void k() {
        o oVar = this.b0;
        oVar.C(true);
        DrmSession drmSession = oVar.h;
        if (drmSession != null) {
            drmSession.f(oVar.e);
            oVar.h = null;
            oVar.g = null;
        }
        for (o oVar2 : this.c0) {
            oVar2.C(true);
            DrmSession drmSession2 = oVar2.h;
            if (drmSession2 != null) {
                drmSession2.f(oVar2.e);
                oVar2.h = null;
                oVar2.g = null;
            }
        }
        this.e.release();
        b<T> bVar = this.g0;
        if (bVar != null) {
            androidx.media3.exoplayer.dash.b bVar2 = (androidx.media3.exoplayer.dash.b) bVar;
            synchronized (bVar2) {
                d.c cVarRemove = bVar2.c0.remove(this);
                if (cVarRemove != null) {
                    o oVar3 = cVarRemove.a;
                    oVar3.C(true);
                    DrmSession drmSession3 = oVar3.h;
                    if (drmSession3 != null) {
                        drmSession3.f(oVar3.e);
                        oVar3.h = null;
                        oVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.rjd
    public final int m(long j) throws Throwable {
        if (z()) {
            return 0;
        }
        boolean z = this.n0;
        o oVar = this.b0;
        int iU = oVar.u(j, z);
        ea1 ea1Var = this.k0;
        if (ea1Var != null) {
            iU = Math.min(iU, ea1Var.e(0) - oVar.s());
        }
        oVar.F(iU);
        A();
        return iU;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void n(Loader.d dVar, long j, long j2, int i) {
        uz8 uz8Var;
        k42 k42Var = (k42) dVar;
        if (i == 0) {
            long j3 = k42Var.a;
            uz8Var = new uz8(k42Var.b);
        } else {
            long j4 = k42Var.a;
            ote oteVar = k42Var.i;
            Uri uri = oteVar.c;
            uz8Var = new uz8(j2, oteVar.d);
        }
        uz8 uz8Var2 = uz8Var;
        this.V.g(uz8Var2, k42Var.c, this.a, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h, i);
    }

    @Override // defpackage.rjd
    public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        if (z()) {
            return -3;
        }
        ea1 ea1Var = this.k0;
        o oVar = this.b0;
        if (ea1Var != null && ea1Var.e(0) <= oVar.s()) {
            return -3;
        }
        A();
        return oVar.B(ql0Var, decoderInputBuffer, i, this.n0);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void r(Loader.d dVar, long j, long j2) {
        k42 k42Var = (k42) dVar;
        this.e0 = null;
        this.e.d(k42Var);
        long j3 = k42Var.a;
        ote oteVar = k42Var.i;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.W.getClass();
        this.V.d(uz8Var, k42Var.c, this.a, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h);
        this.f.b(this);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        if (this.n0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.h0;
        }
        long jMax = this.i0;
        ea1 ea1VarX = x();
        if (!ea1VarX.d()) {
            ArrayList<ea1> arrayList = this.Z;
            ea1VarX = arrayList.size() > 1 ? (ea1) ia.k(2, arrayList) : null;
        }
        if (ea1VarX != null) {
            jMax = Math.max(jMax, ea1VarX.h);
        }
        return Math.max(jMax, this.b0.p());
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        Loader loader = this.X;
        if (loader.c() || z()) {
            return;
        }
        boolean zD = loader.d();
        List<ea1> list = this.a0;
        T t = this.e;
        ArrayList<ea1> arrayList = this.Z;
        if (zD) {
            k42 k42Var = this.e0;
            k42Var.getClass();
            boolean z = k42Var instanceof ea1;
            if (!(z && y(arrayList.size() - 1)) && t.e(j, k42Var, list)) {
                loader.b();
                if (z) {
                    this.k0 = (ea1) k42Var;
                    return;
                }
                return;
            }
            return;
        }
        int iH = t.h(j, list);
        if (iH < arrayList.size()) {
            ka2.q(!loader.d());
            int size = arrayList.size();
            while (true) {
                if (iH >= size) {
                    iH = -1;
                    break;
                } else if (!y(iH)) {
                    break;
                } else {
                    iH++;
                }
            }
            if (iH == -1) {
                return;
            }
            long j2 = x().h;
            ea1 ea1VarW = w(iH);
            if (arrayList.isEmpty()) {
                this.h0 = this.i0;
            }
            this.n0 = false;
            this.V.h(ea1VarW.g, this.a, j2);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void v(Loader.d dVar, long j, long j2, boolean z) {
        k42 k42Var = (k42) dVar;
        this.e0 = null;
        this.k0 = null;
        long j3 = k42Var.a;
        ote oteVar = k42Var.i;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.W.getClass();
        this.V.c(uz8Var, k42Var.c, this.a, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h);
        if (z) {
            return;
        }
        if (z()) {
            this.b0.C(false);
            for (o oVar : this.c0) {
                oVar.C(false);
            }
        } else if (k42Var instanceof ea1) {
            ArrayList<ea1> arrayList = this.Z;
            w(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.h0 = this.i0;
            }
        }
        this.f.b(this);
    }

    public final ea1 w(int i) {
        ArrayList<ea1> arrayList = this.Z;
        ea1 ea1Var = arrayList.get(i);
        vjg.U(arrayList, i, arrayList.size());
        this.j0 = Math.max(this.j0, arrayList.size());
        int i2 = 0;
        this.b0.m(ea1Var.e(0));
        while (true) {
            o[] oVarArr = this.c0;
            if (i2 >= oVarArr.length) {
                return ea1Var;
            }
            o oVar = oVarArr[i2];
            i2++;
            oVar.m(ea1Var.e(i2));
        }
    }

    public final ea1 x() {
        return (ea1) ia.k(1, this.Z);
    }

    public final boolean y(int i) {
        int iS;
        ea1 ea1Var = this.Z.get(i);
        if (this.b0.s() > ea1Var.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            o[] oVarArr = this.c0;
            if (i2 >= oVarArr.length) {
                return false;
            }
            iS = oVarArr[i2].s();
            i2++;
        } while (iS <= ea1Var.e(i2));
        return true;
    }

    public final boolean z() {
        return this.h0 != -9223372036854775807L;
    }
}
