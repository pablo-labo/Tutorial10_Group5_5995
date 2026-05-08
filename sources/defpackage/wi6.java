package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import defpackage.e47;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wi6 implements g, HlsPlaylistTracker.a {
    public final b V;
    public final i.a W;
    public final qk3 X;
    public final IdentityHashMap<rjd, Integer> Y;
    public final aza Z;
    public final ti6 a;
    public final ee3 a0;
    public final HlsPlaylistTracker b;
    public final boolean b0;
    public final si6 c;
    public final int c0;
    public final grf d;
    public final sdb d0;
    public final androidx.media3.exoplayer.drm.b e;
    public final a e0 = new a();
    public final a.C0043a f;
    public g.a f0;
    public int g0;
    public xpf h0;
    public bj6[] i0;
    public bj6[] j0;
    public int k0;
    public bm2 l0;

    public class a implements p.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.source.p.a
        public final void b(p pVar) {
            wi6 wi6Var = wi6.this;
            wi6Var.f0.b(wi6Var);
        }

        public final void c() {
            wi6 wi6Var = wi6.this;
            int i = wi6Var.g0 - 1;
            wi6Var.g0 = i;
            if (i > 0) {
                return;
            }
            int i2 = 0;
            for (bj6 bj6Var : wi6Var.i0) {
                bj6Var.w();
                i2 += bj6Var.x0.a;
            }
            wpf[] wpfVarArr = new wpf[i2];
            int i3 = 0;
            for (bj6 bj6Var2 : wi6Var.i0) {
                bj6Var2.w();
                int i4 = bj6Var2.x0.a;
                int i5 = 0;
                while (i5 < i4) {
                    bj6Var2.w();
                    wpfVarArr[i3] = bj6Var2.x0.a(i5);
                    i5++;
                    i3++;
                }
            }
            wi6Var.h0 = new xpf(wpfVarArr);
            wi6Var.f0.a(wi6Var);
        }
    }

    public wi6(ti6 ti6Var, androidx.media3.exoplayer.hls.playlist.a aVar, yn3 yn3Var, grf grfVar, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a, b bVar2, i.a aVar2, qk3 qk3Var, ee3 ee3Var, boolean z, int i, sdb sdbVar) {
        this.a = ti6Var;
        this.b = aVar;
        this.c = yn3Var;
        this.d = grfVar;
        this.e = bVar;
        this.f = c0043a;
        this.V = bVar2;
        this.W = aVar2;
        this.X = qk3Var;
        this.a0 = ee3Var;
        this.b0 = z;
        this.c0 = i;
        this.d0 = sdbVar;
        ee3Var.getClass();
        e47.b bVar3 = e47.b;
        qyc qycVar = qyc.e;
        this.l0 = new bm2(qycVar, qycVar);
        this.Y = new IdentityHashMap<>();
        this.Z = new aza();
        this.i0 = new bj6[0];
        this.j0 = new bj6[0];
    }

    public static androidx.media3.common.a k(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z) {
        js9 js9Var;
        int i;
        String str;
        String str2;
        e47 e47Var;
        int i2;
        int i3;
        String str3;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        if (aVar2 != null) {
            str2 = aVar2.k;
            js9Var = aVar2.l;
            i2 = aVar2.F;
            i = aVar2.e;
            i3 = aVar2.f;
            str = aVar2.d;
            str3 = aVar2.b;
            e47Var = aVar2.c;
        } else {
            String strV = vjg.v(1, aVar.k);
            js9Var = aVar.l;
            if (z) {
                i2 = aVar.F;
                i = aVar.e;
                i3 = aVar.f;
                str = aVar.d;
                str3 = aVar.b;
                str2 = strV;
                e47Var = aVar.c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                e47Var = qycVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strE = st9.e(str2);
        int i4 = z ? aVar.h : -1;
        int i5 = z ? aVar.i : -1;
        a.C0036a c0036a = new a.C0036a();
        c0036a.a = aVar.a;
        c0036a.b = str3;
        c0036a.c = e47.j(e47Var);
        c0036a.l = st9.p(aVar.m);
        c0036a.m = st9.p(strE);
        c0036a.j = str2;
        c0036a.k = js9Var;
        c0036a.h = i4;
        c0036a.i = i5;
        c0036a.E = i2;
        c0036a.e = i;
        c0036a.f = i3;
        c0036a.d = str;
        return new androidx.media3.common.a(c0036a);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public final boolean a(Uri uri, b.c cVar, boolean z) {
        int iK;
        b.C0051b c0051bC;
        boolean z2;
        boolean z3 = true;
        for (bj6 bj6Var : this.i0) {
            ri6 ri6Var = bj6Var.d;
            Uri[] uriArr = ri6Var.e;
            if (vjg.l(uri, uriArr)) {
                long j = (z || (c0051bC = bj6Var.X.c(eqf.a(ri6Var.r), cVar)) == null || c0051bC.a != 2) ? -9223372036854775807L : c0051bC.b;
                int i = 0;
                while (true) {
                    if (i >= uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && (iK = ri6Var.r.k(i)) != -1) {
                    ri6Var.o = uri;
                    z2 = j != -9223372036854775807L && ri6Var.r.g(iK, j) && ri6Var.g.l(uri, j);
                }
                z3 &= z2;
            }
            z3 &= z2;
        }
        this.f0.b(this);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public final void b() {
        for (bj6 bj6Var : this.i0) {
            Loader loader = bj6Var.Y;
            ri6 ri6Var = bj6Var.d;
            ArrayList<ui6> arrayList = bj6Var.c0;
            if (!arrayList.isEmpty()) {
                ui6 ui6Var = (ui6) h4.l(arrayList);
                int iB = ri6Var.b(ui6Var);
                int i = ui6Var.o;
                boolean z = true;
                if (iB == 1) {
                    if (!ui6Var.h()) {
                        ka2.q(i != -1);
                        androidx.media3.exoplayer.hls.playlist.b bVarH = ri6Var.g.h(false, ri6Var.e[ri6Var.h.b(ui6Var.d)]);
                        bVarH.getClass();
                        e47 e47Var = bVarH.r;
                        int i2 = (int) (ui6Var.j - bVarH.k);
                        ui6Var.K = i2 < 0 ? 0L : ((b.c) (i2 < e47Var.size() ? ((b.e) e47Var.get(i2)).b0 : bVarH.s).get(i)).c;
                    }
                } else if (iB == 0) {
                    bj6Var.g0.post(new yc4(z ? 1 : 0, bj6Var, ui6Var));
                } else if (iB == 2 && !bj6Var.I0 && loader.d()) {
                    loader.b();
                }
            }
        }
        this.f0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        bj6[] bj6VarArr = this.j0;
        int length = bj6VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            bj6 bj6Var = bj6VarArr[i];
            if (bj6Var.p0 == 2) {
                ri6 ri6Var = bj6Var.d;
                HlsPlaylistTracker hlsPlaylistTracker = ri6Var.g;
                int iC = ri6Var.r.c();
                Uri[] uriArr = ri6Var.e;
                androidx.media3.exoplayer.hls.playlist.b bVarH = (iC >= uriArr.length || iC == -1) ? null : hlsPlaylistTracker.h(true, uriArr[ri6Var.r.p()]);
                if (bVarH != null) {
                    e47 e47Var = bVarH.r;
                    if (!e47Var.isEmpty()) {
                        long jD = bVarH.h - hlsPlaylistTracker.d();
                        long j2 = j - jD;
                        int iC2 = vjg.c(e47Var, Long.valueOf(j2), true);
                        long j3 = ((b.e) e47Var.get(iC2)).e;
                        return aydVar.a(j2, j3, (!bVarH.c || iC2 == e47Var.size() - 1) ? j3 : ((b.e) e47Var.get(iC2 + 1)).e) + jD;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.l0.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        if (this.h0 != null) {
            return this.l0.e(gVar);
        }
        for (bj6 bj6Var : this.i0) {
            if (!bj6Var.s0) {
                g.a aVar = new g.a();
                aVar.a = bj6Var.E0;
                bj6Var.e(new androidx.media3.exoplayer.g(aVar));
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    @Override // androidx.media3.exoplayer.source.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(defpackage.p35[] r40, boolean[] r41, defpackage.rjd[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi6.f(p35[], boolean[], rjd[], boolean[], long):long");
    }

    public final bj6 g(String str, int i, Uri[] uriArr, androidx.media3.common.a[] aVarArr, androidx.media3.common.a aVar, List<androidx.media3.common.a> list, Map<String, DrmInitData> map, long j) {
        return new bj6(str, i, this.e0, new ri6(this.a, this.b, uriArr, aVarArr, this.c, this.d, this.Z, list, this.d0), map, this.X, j, aVar, this.e, this.f, this.V, this.W, this.c0);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        return this.l0.h();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        bj6[] bj6VarArr = this.j0;
        if (bj6VarArr.length > 0) {
            boolean zJ = bj6VarArr[0].J(j, false);
            int i = 1;
            while (true) {
                bj6[] bj6VarArr2 = this.j0;
                if (i >= bj6VarArr2.length) {
                    break;
                }
                bj6VarArr2[i].J(j, zJ);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.Z.a).clear();
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() throws IOException {
        for (bj6 bj6Var : this.i0) {
            bj6Var.G();
            if (bj6Var.I0 && !bj6Var.s0) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        ti6 ti6Var;
        boolean z;
        List<c.a> list;
        List<c.a> list2;
        bj6[] bj6VarArr;
        int i;
        int i2;
        boolean z2;
        ti6 ti6Var2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.f0 = aVar;
        HlsPlaylistTracker hlsPlaylistTracker = this.b;
        hlsPlaylistTracker.c(this);
        c cVarE = hlsPlaylistTracker.e();
        cVarE.getClass();
        List<c.a> list3 = cVarE.g;
        List<c.b> list4 = cVarE.e;
        Map<String, DrmInitData> map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List<c.a> list5 = cVarE.h;
        int i4 = 0;
        this.g0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ti6 ti6Var3 = this.a;
        boolean z4 = this.b0;
        if (zIsEmpty) {
            ti6Var = ti6Var3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            androidx.media3.common.a aVar2 = cVarE.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                androidx.media3.common.a aVar3 = list4.get(i5).b;
                int i7 = aVar3.v;
                String str = aVar3.k;
                if (i7 > 0 || vjg.v(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (vjg.v(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                ti6Var2 = ti6Var3;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                ti6Var2 = ti6Var3;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                ti6Var2 = ti6Var3;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    c.b bVar = list4.get(i8);
                    uriArr[i9] = bVar.a;
                    aVarArr[i9] = bVar.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = aVarArr[0].k;
            int iU = vjg.u(2, str2);
            int iU2 = vjg.u(1, str2);
            boolean z5 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            ti6Var = ti6Var2;
            list = list3;
            z = z4;
            bj6 bj6VarG = g("main", (z2 || iU2 <= 0) ? 0 : 1, uriArr3, aVarArr, cVarE.j, cVarE.k, map, j);
            arrayList.add(bj6VarG);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        androidx.media3.common.a aVar4 = aVarArr[i10];
                        String strV = vjg.v(2, aVar4.k);
                        String strE = st9.e(strV);
                        a.C0036a c0036a = new a.C0036a();
                        c0036a.a = aVar4.a;
                        c0036a.b = aVar4.b;
                        c0036a.c = e47.j(aVar4.c);
                        c0036a.l = st9.p(aVar4.m);
                        c0036a.m = st9.p(strE);
                        c0036a.j = strV;
                        c0036a.k = aVar4.l;
                        c0036a.h = aVar4.h;
                        c0036a.i = aVar4.i;
                        c0036a.t = aVar4.u;
                        c0036a.u = aVar4.v;
                        c0036a.x = aVar4.y;
                        c0036a.e = aVar4.e;
                        c0036a.f = aVar4.f;
                        aVarArr2[i10] = new androidx.media3.common.a(c0036a);
                        i10++;
                        aVarArr = aVarArr;
                    }
                    androidx.media3.common.a[] aVarArr3 = aVarArr;
                    arrayList3.add(new wpf("main", aVarArr2));
                    if (iU2 > 0 && (aVar2 != null || list.isEmpty())) {
                        arrayList3.add(new wpf("main:audio", k(aVarArr3[0], aVar2, false)));
                    }
                    List<androidx.media3.common.a> list6 = cVarE.k;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new wpf(p6.c(i11, "main:cc:"), ((zn3) ti6Var).b(list6.get(i11))));
                        }
                    }
                } else {
                    androidx.media3.common.a[] aVarArr4 = new androidx.media3.common.a[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        aVarArr4[i12] = k(aVarArr[i12], aVar2, true);
                    }
                    arrayList3.add(new wpf("main", aVarArr4));
                }
                a.C0036a c0036a2 = new a.C0036a();
                c0036a2.a = "ID3";
                c0036a2.m = st9.p("application/id3");
                wpf wpfVar = new wpf("main:id3", new androidx.media3.common.a(c0036a2));
                arrayList3.add(wpfVar);
                bj6VarG.H((wpf[]) arrayList3.toArray(new wpf[0]), arrayList3.indexOf(wpfVar));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List<c.a> list7 = list;
            String str3 = list7.get(i13).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(list7.get(i14).c)) {
                        c.a aVar5 = list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = aVar5.a;
                        androidx.media3.common.a aVar6 = aVar5.b;
                        arrayList4.add(uri);
                        arrayList5.add(aVar6);
                        z6 &= vjg.u(1, aVar6.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = vjg.a;
                list = list7;
                i2 = i13;
                bj6 bj6VarG2 = g(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(bm7.P1(arrayList6));
                arrayList.add(bj6VarG2);
                if (z && z6) {
                    bj6VarG2.H(new wpf[]{new wpf(strConcat, (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]))}, new int[0]);
                }
            } else {
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
        }
        this.k0 = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List<c.a> list8 = list2;
            String str5 = list8.get(i15).c;
            if (hashSet2.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list8.size(); i16++) {
                    if (str5.equals(list8.get(i16).c)) {
                        c.a aVar7 = list8.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(aVar7.a);
                        arrayList8.add(aVar7.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                androidx.media3.common.a[] aVarArr5 = (androidx.media3.common.a[]) arrayList8.toArray(new androidx.media3.common.a[0]);
                String str6 = vjg.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                e47.b bVar2 = e47.b;
                list2 = list8;
                i = i15;
                bj6 bj6VarG3 = g(strConcat2, 3, uriArr4, aVarArr5, null, qyc.e, map, j);
                arrayList2.add(bm7.P1(arrayList9));
                arrayList.add(bj6VarG3);
                int length = aVarArr5.length;
                androidx.media3.common.a[] aVarArr6 = new androidx.media3.common.a[length];
                for (int i17 = 0; i17 < length; i17++) {
                    aVarArr6[i17] = ((zn3) ti6Var).b(aVarArr5[i17]);
                }
                bj6VarG3.H(new wpf[]{new wpf(strConcat2, aVarArr6)}, new int[0]);
            } else {
                i = i15;
                list2 = list8;
            }
            i15 = i + 1;
        }
        this.i0 = (bj6[]) arrayList.toArray(new bj6[0]);
        this.g0 = this.i0.length;
        int i18 = 0;
        while (true) {
            int i19 = this.k0;
            bj6VarArr = this.i0;
            if (i18 >= i19) {
                break;
            }
            bj6VarArr[i18].d.l = true;
            i18++;
        }
        for (bj6 bj6Var : bj6VarArr) {
            if (!bj6Var.s0) {
                g.a aVar8 = new g.a();
                aVar8.a = bj6Var.E0;
                bj6Var.e(new androidx.media3.exoplayer.g(aVar8));
            }
        }
        this.j0 = this.i0;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        xpf xpfVar = this.h0;
        xpfVar.getClass();
        return xpfVar;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        return this.l0.s();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        for (bj6 bj6Var : this.j0) {
            if (bj6Var.r0 && !bj6Var.E()) {
                int length = bj6Var.k0.length;
                for (int i = 0; i < length; i++) {
                    bj6Var.k0[i].i(j, z, bj6Var.C0[i]);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        this.l0.u(j);
    }
}
