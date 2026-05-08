package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import defpackage.js9;
import defpackage.ri6;
import defpackage.wi6;
import defpackage.zpf;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class bj6 implements Loader.a<k42>, Loader.e, p, o55, o.c {
    public static final Set<Integer> N0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A0;
    public boolean B0;
    public boolean[] C0;
    public boolean[] D0;
    public long E0;
    public long F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public long K0;
    public DrmInitData L0;
    public ui6 M0;
    public final androidx.media3.exoplayer.drm.b V;
    public final a.C0043a W;
    public final androidx.media3.exoplayer.upstream.b X;
    public final Loader Y = new Loader("Loader:HlsSampleStreamWrapper");
    public final i.a Z;
    public final String a;
    public final int a0;
    public final int b;
    public final ri6.b b0;
    public final wi6.a c;
    public final ArrayList<ui6> c0;
    public final ri6 d;
    public final List<ui6> d0;
    public final qk3 e;
    public final aj6 e0;
    public final androidx.media3.common.a f;
    public final ob0 f0;
    public final Handler g0;
    public final ArrayList<zi6> h0;
    public final Map<String, DrmInitData> i0;
    public k42 j0;
    public b[] k0;
    public int[] l0;
    public final HashSet m0;
    public final SparseIntArray n0;
    public a o0;
    public int p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public androidx.media3.common.a u0;
    public androidx.media3.common.a v0;
    public boolean w0;
    public xpf x0;
    public Set<wpf> y0;
    public int[] z0;

    public static class a implements zpf {
        public static final androidx.media3.common.a f;
        public static final androidx.media3.common.a g;
        public final zpf a;
        public final androidx.media3.common.a b;
        public androidx.media3.common.a c;
        public byte[] d;
        public int e;

        static {
            a.C0036a c0036a = new a.C0036a();
            c0036a.m = st9.p("application/id3");
            f = new androidx.media3.common.a(c0036a);
            a.C0036a c0036a2 = new a.C0036a();
            c0036a2.m = st9.p("application/x-emsg");
            g = new androidx.media3.common.a(c0036a2);
        }

        public a(zpf zpfVar, int i) {
            this.a = zpfVar;
            if (i == 1) {
                this.b = f;
            } else {
                if (i != 3) {
                    l5.q(p6.c(i, "Unknown metadataType: "));
                    throw null;
                }
                this.b = g;
            }
            this.d = new byte[0];
            this.e = 0;
        }

        @Override // defpackage.zpf
        public final void a(long j, int i, int i2, int i3, zpf.a aVar) {
            this.c.getClass();
            int i4 = this.e - i3;
            g4b g4bVar = new g4b(Arrays.copyOfRange(this.d, i4 - i2, i4));
            byte[] bArr = this.d;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.e = i3;
            String str = this.c.n;
            androidx.media3.common.a aVar2 = this.b;
            String str2 = aVar2.n;
            String str3 = aVar2.n;
            if (!Objects.equals(str, str2)) {
                if (!"application/x-emsg".equals(this.c.n)) {
                    zkd.T("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                    return;
                }
                g05 g05VarJ1 = h05.J1(g4bVar);
                androidx.media3.common.a aVarA = g05VarJ1.a();
                if (aVarA == null || !Objects.equals(str3, aVarA.n)) {
                    zkd.T("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + g05VarJ1.a());
                    return;
                }
                byte[] bArrC = g05VarJ1.c();
                bArrC.getClass();
                g4bVar = new g4b(bArrC);
            }
            int iA = g4bVar.a();
            zpf zpfVar = this.a;
            zpfVar.f(iA, g4bVar);
            zpfVar.a(j, i, iA, 0, aVar);
        }

        @Override // defpackage.zpf
        public final void b(g4b g4bVar, int i, int i2) {
            int i3 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i3) {
                this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
            g4bVar.h(this.e, this.d, i);
            this.e += i;
        }

        @Override // defpackage.zpf
        public final void d(androidx.media3.common.a aVar) {
            this.c = aVar;
            this.a.d(this.b);
        }

        @Override // defpackage.zpf
        public final int e(te3 te3Var, int i, boolean z) throws EOFException {
            int i2 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i2) {
                this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int i3 = te3Var.read(this.d, this.e, i);
            if (i3 != -1) {
                this.e += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            k20.n();
            return 0;
        }
    }

    public static final class b extends o {
        public final Map<String, DrmInitData> H;
        public DrmInitData I;

        public b() {
            throw null;
        }

        public b(qk3 qk3Var, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a, Map map) {
            super(qk3Var, bVar, c0043a);
            this.H = map;
        }

        @Override // androidx.media3.exoplayer.source.o
        public final androidx.media3.common.a o(androidx.media3.common.a aVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = aVar.r;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.c)) != null) {
                drmInitData2 = drmInitData;
            }
            js9 js9Var = aVar.l;
            js9 js9Var2 = null;
            if (js9Var == null) {
                js9Var = js9Var2;
            } else {
                js9.a[] aVarArr = js9Var.a;
                int length = aVarArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    js9.a aVar2 = aVarArr[i2];
                    if ((aVar2 instanceof snb) && "com.apple.streaming.transportStreamTimestamp".equals(((snb) aVar2).b)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length != 1) {
                        js9.a[] aVarArr2 = new js9.a[length - 1];
                        while (i < length) {
                            if (i != i2) {
                                aVarArr2[i < i2 ? i : i - 1] = aVarArr[i];
                            }
                            i++;
                        }
                        js9Var2 = new js9(aVarArr2);
                    }
                    js9Var = js9Var2;
                }
            }
            if (drmInitData2 != aVar.r || js9Var != aVar.l) {
                a.C0036a c0036aA = aVar.a();
                c0036aA.q = drmInitData2;
                c0036aA.k = js9Var;
                aVar = new androidx.media3.common.a(c0036aA);
            }
            return super.o(aVar);
        }
    }

    public bj6(String str, int i, wi6.a aVar, ri6 ri6Var, Map map, qk3 qk3Var, long j, androidx.media3.common.a aVar2, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a, androidx.media3.exoplayer.upstream.b bVar2, i.a aVar3, int i2) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = ri6Var;
        this.i0 = map;
        this.e = qk3Var;
        this.f = aVar2;
        this.V = bVar;
        this.W = c0043a;
        this.X = bVar2;
        this.Z = aVar3;
        this.a0 = i2;
        ri6.b bVar3 = new ri6.b();
        bVar3.a = null;
        bVar3.b = false;
        bVar3.c = null;
        this.b0 = bVar3;
        this.l0 = new int[0];
        Set<Integer> set = N0;
        this.m0 = new HashSet(set.size());
        this.n0 = new SparseIntArray(set.size());
        this.k0 = new b[0];
        this.D0 = new boolean[0];
        this.C0 = new boolean[0];
        ArrayList<ui6> arrayList = new ArrayList<>();
        this.c0 = arrayList;
        this.d0 = Collections.unmodifiableList(arrayList);
        this.h0 = new ArrayList<>();
        this.e0 = new aj6(this, 0);
        this.f0 = new ob0(this, 3);
        this.g0 = vjg.p(null);
        this.E0 = j;
        this.F0 = j;
    }

    public static androidx.media3.common.a A(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z) {
        String strC;
        if (aVar == null) {
            return aVar2;
        }
        String str = aVar.k;
        String strE = aVar2.n;
        int i = st9.i(strE);
        if (vjg.u(i, str) == 1) {
            strC = vjg.v(i, str);
            strE = st9.e(strC);
        } else {
            strC = st9.c(str, strE);
        }
        a.C0036a c0036aA = aVar2.a();
        c0036aA.a = aVar.a;
        c0036aA.b = aVar.b;
        c0036aA.c = e47.j(aVar.c);
        c0036aA.d = aVar.d;
        c0036aA.e = aVar.e;
        c0036aA.f = aVar.f;
        c0036aA.h = z ? aVar.h : -1;
        c0036aA.i = z ? aVar.i : -1;
        c0036aA.j = strC;
        if (i == 2) {
            c0036aA.t = aVar.u;
            c0036aA.u = aVar.v;
            c0036aA.x = aVar.y;
        }
        if (strE != null) {
            c0036aA.m = st9.p(strE);
        }
        int i2 = aVar.F;
        if (i2 != -1 && i == 1) {
            c0036aA.E = i2;
        }
        js9 js9VarB = aVar.l;
        if (js9VarB != null) {
            js9 js9Var = aVar2.l;
            if (js9Var != null) {
                js9VarB = js9Var.b(js9VarB);
            }
            c0036aA.k = js9VarB;
        }
        return new androidx.media3.common.a(c0036aA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static u54 y(int i, int i2) {
        zkd.T("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new u54();
    }

    public final void B(int i) {
        ArrayList<ui6> arrayList;
        ka2.q(!this.Y.d());
        while (true) {
            arrayList = this.c0;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (x(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = C().h;
        ui6 ui6Var = arrayList.get(i);
        vjg.U(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.k0.length; i2++) {
            this.k0[i2].m(ui6Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.F0 = this.E0;
        } else {
            ((ui6) h4.l(arrayList)).J = true;
        }
        this.I0 = false;
        this.Z.h(ui6Var.g, this.p0, j);
    }

    public final ui6 C() {
        return (ui6) ia.k(1, this.c0);
    }

    public final boolean E() {
        return this.F0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.w0 && this.z0 == null && this.r0) {
            int i2 = 0;
            for (b bVar : this.k0) {
                if (bVar.v() == null) {
                    return;
                }
            }
            xpf xpfVar = this.x0;
            if (xpfVar != null) {
                int i3 = xpfVar.a;
                int[] iArr = new int[i3];
                this.z0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        b[] bVarArr = this.k0;
                        if (i5 < bVarArr.length) {
                            androidx.media3.common.a aVarV = bVarArr[i5].v();
                            ka2.r(aVarV);
                            androidx.media3.common.a aVar = this.x0.a(i4).d[0];
                            String str = aVarV.n;
                            String str2 = aVar.n;
                            int i6 = st9.i(str);
                            if (i6 != 3) {
                                if (i6 == st9.i(str2)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || aVarV.K == aVar.K)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.z0[i4] = i5;
                }
                Iterator<zi6> it = this.h0.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                return;
            }
            int length = this.k0.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                androidx.media3.common.a aVarV2 = this.k0[i7].v();
                ka2.r(aVarV2);
                String str3 = aVarV2.n;
                if (st9.o(str3)) {
                    i10 = 2;
                } else if (!st9.k(str3)) {
                    i10 = st9.n(str3) ? 3 : -2;
                }
                if (D(i10) > D(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            wpf wpfVar = this.d.h;
            int i11 = wpfVar.a;
            this.A0 = -1;
            this.z0 = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.z0[i12] = i12;
            }
            wpf[] wpfVarArr = new wpf[length];
            int i13 = 0;
            while (i13 < length) {
                androidx.media3.common.a aVarV3 = this.k0[i13].v();
                ka2.r(aVarV3);
                String str4 = this.a;
                androidx.media3.common.a aVar2 = this.f;
                if (i13 == i8) {
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        androidx.media3.common.a aVarD = wpfVar.d[i14];
                        if (i9 == 1 && aVar2 != null) {
                            aVarD = aVarD.d(aVar2);
                        }
                        aVarArr[i14] = i11 == 1 ? aVarV3.d(aVarD) : A(aVarD, aVarV3, true);
                    }
                    wpfVarArr[i13] = new wpf(str4, aVarArr);
                    this.A0 = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !st9.k(aVarV3.n)) {
                        aVar2 = null;
                    }
                    StringBuilder sbG = h5.g(str4, ":muxed:");
                    sbG.append(i13 < i8 ? i13 : i13 - 1);
                    i = 0;
                    wpfVarArr[i13] = new wpf(sbG.toString(), A(aVar2, aVarV3, false));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.x0 = z(wpfVarArr);
            ka2.q(this.y0 == null ? 1 : i15);
            this.y0 = Collections.EMPTY_SET;
            this.s0 = true;
            this.c.c();
        }
    }

    public final void G() throws IOException {
        this.Y.a();
        ri6 ri6Var = this.d;
        BehindLiveWindowException behindLiveWindowException = ri6Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = ri6Var.o;
        if (uri == null || !uri.equals(ri6Var.p)) {
            return;
        }
        ri6Var.g.b(ri6Var.o);
    }

    public final void H(wpf[] wpfVarArr, int... iArr) {
        this.x0 = z(wpfVarArr);
        this.y0 = new HashSet();
        for (int i : iArr) {
            this.y0.add(this.x0.a(i));
        }
        this.A0 = 0;
        this.g0.post(new qb0(this.c, 4));
        this.s0 = true;
    }

    public final void I() {
        for (b bVar : this.k0) {
            bVar.C(this.G0);
        }
        this.G0 = false;
    }

    public final boolean J(long j, boolean z) {
        ui6 ui6Var;
        boolean z2;
        boolean zE;
        this.E0 = j;
        if (E()) {
            this.F0 = j;
            return true;
        }
        boolean z3 = this.d.q;
        ArrayList<ui6> arrayList = this.c0;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                ui6Var = arrayList.get(i);
                if (ui6Var.g == j) {
                    break;
                }
            }
            ui6Var = null;
        } else {
            ui6Var = null;
        }
        if (this.r0 && !z && !arrayList.isEmpty()) {
            int length = this.k0.length;
            for (int i2 = 0; i2 < length; i2++) {
                b bVar = this.k0[i2];
                if (ui6Var != null) {
                    zE = bVar.D(ui6Var.g(i2));
                } else {
                    long jH = h();
                    zE = bVar.E(j, jH == Long.MIN_VALUE || j < jH);
                }
                if (!zE && (this.D0[i2] || !this.B0)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.F0 = j;
        this.I0 = false;
        arrayList.clear();
        Loader loader = this.Y;
        if (!loader.d()) {
            loader.c = null;
            I();
            return true;
        }
        if (this.r0) {
            for (b bVar2 : this.k0) {
                bVar2.j();
            }
        }
        loader.b();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.o.c
    public final void a() {
        this.g0.post(this.e0);
    }

    @Override // defpackage.o55
    public final void b(zxd zxdVar) {
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.Y.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fd  */
    @Override // androidx.media3.exoplayer.source.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(androidx.media3.exoplayer.g r75) {
        /*
            Method dump skipped, instruction units count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj6.e(androidx.media3.exoplayer.g):boolean");
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
        boolean zG;
        Loader.b bVar;
        int i2;
        k42 k42Var = (k42) dVar;
        boolean z = k42Var instanceof ui6;
        if (z && !((ui6) k42Var).h() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.d;
        }
        long j3 = k42Var.i.b;
        ote oteVar = k42Var.i;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        vjg.c0(k42Var.g);
        vjg.c0(k42Var.h);
        b.c cVar = new b.c(iOException, i);
        ri6 ri6Var = this.d;
        b.a aVarA = eqf.a(ri6Var.r);
        androidx.media3.exoplayer.upstream.b bVar2 = this.X;
        b.C0051b c0051bC = bVar2.c(aVarA, cVar);
        if (c0051bC == null || c0051bC.a != 2) {
            zG = false;
        } else {
            long j4 = c0051bC.b;
            p35 p35Var = ri6Var.r;
            zG = p35Var.g(p35Var.k(ri6Var.h.b(k42Var.d)), j4);
        }
        if (zG) {
            if (z && j3 == 0) {
                ArrayList<ui6> arrayList = this.c0;
                ka2.q(arrayList.remove(arrayList.size() - 1) == k42Var);
                if (arrayList.isEmpty()) {
                    this.F0 = this.E0;
                } else {
                    ((ui6) h4.l(arrayList)).J = true;
                }
            }
            bVar = Loader.e;
        } else {
            long jA = bVar2.a(cVar);
            bVar = jA != -9223372036854775807L ? new Loader.b(0, jA) : Loader.f;
        }
        Loader.b bVar3 = bVar;
        boolean zA = bVar3.a();
        this.Z.e(uz8Var, k42Var.c, this.b, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h, iOException, !zA);
        if (!zA) {
            this.j0 = null;
        }
        if (zG) {
            if (!this.s0) {
                g.a aVar = new g.a();
                aVar.a = this.E0;
                e(new g(aVar));
                return bVar3;
            }
            this.c.b(this);
        }
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        if (E()) {
            return this.F0;
        }
        if (this.I0) {
            return Long.MIN_VALUE;
        }
        return C().h;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void k() {
        for (b bVar : this.k0) {
            bVar.C(true);
            DrmSession drmSession = bVar.h;
            if (drmSession != null) {
                drmSession.f(bVar.e);
                bVar.h = null;
                bVar.g = null;
            }
        }
    }

    @Override // defpackage.o55
    public final void m() {
        this.J0 = true;
        this.g0.post(this.f0);
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
        this.Z.g(uz8Var2, k42Var.c, this.b, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [bj6$b[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bj6$b[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zpf] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.media3.exoplayer.source.o, bj6$b] */
    /* JADX WARN: Type inference failed for: r5v6, types: [u54] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.o55
    public final zpf o(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set<Integer> set = N0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.m0;
        SparseIntArray sparseIntArray = this.n0;
        ?? bVar = 0;
        bVar = 0;
        if (zContains) {
            ka2.l(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.l0[i3] = i;
                }
                bVar = this.l0[i3] == i ? this.k0[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.k0;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.l0[i4] == i) {
                    bVar = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (bVar == 0) {
            if (this.J0) {
                return y(i, i2);
            }
            int length = this.k0.length;
            boolean z = i2 == 1 || i2 == 2;
            bVar = new b(this.e, this.V, this.W, this.i0);
            bVar.t = this.E0;
            if (z) {
                bVar.I = this.L0;
                bVar.z = true;
            }
            long j = this.K0;
            if (bVar.F != j) {
                bVar.F = j;
                bVar.z = true;
            }
            if (this.M0 != null) {
                bVar.C = r6.k;
            }
            bVar.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.l0, i5);
            this.l0 = iArrCopyOf;
            iArrCopyOf[length] = i;
            b[] bVarArr = this.k0;
            String str = vjg.a;
            ?? CopyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
            CopyOf[bVarArr.length] = bVar;
            this.k0 = (b[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.D0, i5);
            this.D0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.B0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.p0)) {
                this.q0 = length;
                this.p0 = i2;
            }
            this.C0 = Arrays.copyOf(this.C0, i5);
        }
        if (i2 != 5) {
            return bVar;
        }
        if (this.o0 == null) {
            this.o0 = new a(bVar, this.a0);
        }
        return this.o0;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void r(Loader.d dVar, long j, long j2) {
        k42 k42Var = (k42) dVar;
        this.j0 = null;
        if (k42Var instanceof ri6.a) {
            ri6.a aVar = (ri6.a) k42Var;
            byte[] bArr = aVar.j;
            ri6 ri6Var = this.d;
            ri6Var.m = bArr;
            au5 au5Var = ri6Var.j;
            Uri uri = aVar.b.a;
            byte[] bArr2 = aVar.l;
            bArr2.getClass();
            zt5 zt5Var = au5Var.a;
            uri.getClass();
            zt5Var.put(uri, bArr2);
        }
        long j3 = k42Var.a;
        ote oteVar = k42Var.i;
        Uri uri2 = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.X.getClass();
        this.Z.d(uz8Var, k42Var.c, this.b, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h);
        if (this.s0) {
            this.c.b(this);
            return;
        }
        g.a aVar2 = new g.a();
        aVar2.a = this.E0;
        e(new g(aVar2));
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        if (this.I0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.F0;
        }
        long jMax = this.E0;
        ui6 ui6VarC = C();
        if (!ui6VarC.H) {
            ArrayList<ui6> arrayList = this.c0;
            ui6VarC = arrayList.size() > 1 ? (ui6) ia.k(2, arrayList) : null;
        }
        if (ui6VarC != null) {
            jMax = Math.max(jMax, ui6VarC.h);
        }
        if (this.r0) {
            for (b bVar : this.k0) {
                jMax = Math.max(jMax, bVar.p());
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        Loader loader = this.Y;
        if (loader.c() || E()) {
            return;
        }
        boolean zD = loader.d();
        ri6 ri6Var = this.d;
        List<ui6> list = this.d0;
        if (zD) {
            this.j0.getClass();
            if (ri6Var.n != null ? false : ri6Var.r.d(j, this.j0, list)) {
                loader.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && ri6Var.b(list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            B(size);
        }
        int size2 = (ri6Var.n != null || ri6Var.r.length() < 2) ? list.size() : ri6Var.r.o(j, list);
        if (size2 < this.c0.size()) {
            B(size2);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void v(Loader.d dVar, long j, long j2, boolean z) {
        k42 k42Var = (k42) dVar;
        this.j0 = null;
        long j3 = k42Var.a;
        ote oteVar = k42Var.i;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.X.getClass();
        this.Z.c(uz8Var, k42Var.c, this.b, k42Var.d, k42Var.e, k42Var.f, k42Var.g, k42Var.h);
        if (z) {
            return;
        }
        if (E() || this.t0 == 0) {
            I();
        }
        if (this.t0 > 0) {
            this.c.b(this);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    public final void w() {
        ka2.q(this.s0);
        this.x0.getClass();
        this.y0.getClass();
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList<ui6> arrayList = this.c0;
            if (i2 >= arrayList.size()) {
                ui6 ui6Var = arrayList.get(i);
                for (int i3 = 0; i3 < this.k0.length; i3++) {
                    if (this.k0[i3].s() > ui6Var.g(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).L) {
                return false;
            }
            i2++;
        }
    }

    public final xpf z(wpf[] wpfVarArr) {
        for (int i = 0; i < wpfVarArr.length; i++) {
            wpf wpfVar = wpfVarArr[i];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[wpfVar.a];
            for (int i2 = 0; i2 < wpfVar.a; i2++) {
                androidx.media3.common.a aVar = wpfVar.d[i2];
                int iC = this.V.c(aVar);
                a.C0036a c0036aA = aVar.a();
                c0036aA.N = iC;
                aVarArr[i2] = new androidx.media3.common.a(c0036aA);
            }
            wpfVarArr[i] = new wpf(wpfVar.b, aVarArr);
        }
        return new xpf(wpfVarArr);
    }
}
