package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import defpackage.e47;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ri6 {
    public final ti6 a;
    public final androidx.media3.datasource.a b;
    public final androidx.media3.datasource.a c;
    public final aza d;
    public final Uri[] e;
    public final androidx.media3.common.a[] f;
    public final HlsPlaylistTracker g;
    public final wpf h;
    public final List<androidx.media3.common.a> i;
    public final sdb k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public p35 r;
    public final au5 j = new au5();
    public byte[] m = vjg.b;
    public long s = -9223372036854775807L;

    public static final class a extends ae3 {
        public byte[] l;
    }

    public static final class b {
        public k42 a;
        public boolean b;
        public Uri c;
    }

    public static final class c extends fa1 {
        public final List<b.f> e;
        public final long f;

        public c(long j, List list) {
            super(0L, list.size() - 1);
            this.f = j;
            this.e = list;
        }

        @Override // defpackage.mg9
        public final long a() {
            c();
            return this.f + this.e.get((int) this.d).e;
        }

        @Override // defpackage.mg9
        public final long b() {
            c();
            b.f fVar = this.e.get((int) this.d);
            return this.f + fVar.e + fVar.c;
        }
    }

    public static final class d extends cb1 {
        public int g;

        @Override // defpackage.p35
        public final int c() {
            return this.g;
        }

        @Override // defpackage.p35
        public final Object i() {
            return null;
        }

        @Override // defpackage.p35
        public final void l(long j, long j2, long j3, List<? extends lg9> list, mg9[] mg9VarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.g, jElapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!a(i, jElapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                bg.h();
            }
        }

        @Override // defpackage.p35
        public final int r() {
            return 0;
        }
    }

    public static final class e {
        public final b.f a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(b.f fVar, long j, int i) {
            this.a = fVar;
            this.b = j;
            this.c = i;
            this.d = (fVar instanceof b.c) && ((b.c) fVar).b0;
        }
    }

    public ri6(ti6 ti6Var, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, androidx.media3.common.a[] aVarArr, si6 si6Var, grf grfVar, aza azaVar, List list, sdb sdbVar) {
        this.a = ti6Var;
        this.g = hlsPlaylistTracker;
        this.e = uriArr;
        this.f = aVarArr;
        this.d = azaVar;
        this.i = list;
        this.k = sdbVar;
        androidx.media3.datasource.a aVarA = si6Var.a();
        this.b = aVarA;
        if (grfVar != null) {
            aVarA.i(grfVar);
        }
        this.c = si6Var.a();
        this.h = new wpf("", aVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((aVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        wpf wpfVar = this.h;
        int[] iArrP1 = bm7.P1(arrayList);
        d dVar = new d(wpfVar, iArrP1);
        dVar.g = dVar.b(wpfVar.d[iArrP1[0]]);
        this.r = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e d(androidx.media3.exoplayer.hls.playlist.b bVar, long j, int i) {
        long j2 = bVar.k;
        e47 e47Var = bVar.s;
        int i2 = (int) (j - j2);
        e47 e47Var2 = bVar.r;
        if (i2 == e47Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < e47Var.size()) {
                return new e((b.f) e47Var.get(i), j, i);
            }
            return null;
        }
        b.e eVar = (b.e) e47Var2.get(i2);
        if (i == -1) {
            return new e(eVar, j, -1);
        }
        if (i < eVar.b0.size()) {
            return new e((b.f) eVar.b0.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < e47Var2.size()) {
            return new e((b.f) e47Var2.get(i3), j + 1, -1);
        }
        if (e47Var.isEmpty()) {
            return null;
        }
        return new e((b.f) e47Var.get(0), j + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mg9[] a(ui6 ui6Var, long j) {
        List listUnmodifiableList;
        ri6 ri6Var = this;
        ui6 ui6Var2 = ui6Var;
        int iB = ui6Var2 == null ? -1 : ri6Var.h.b(ui6Var2.d);
        int length = ri6Var.r.length();
        mg9[] mg9VarArr = new mg9[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iF = ri6Var.r.f(i);
            Uri uri = ri6Var.e[iF];
            HlsPlaylistTracker hlsPlaylistTracker = ri6Var.g;
            if (hlsPlaylistTracker.i(uri)) {
                androidx.media3.exoplayer.hls.playlist.b bVarH = hlsPlaylistTracker.h(z, uri);
                bVarH.getClass();
                long jD = bVarH.h - hlsPlaylistTracker.d();
                Pair<Long, Integer> pairC = ri6Var.c(ui6Var2, iF != iB ? true : z, bVarH, jD, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j2 = bVarH.k;
                e47 e47Var = bVarH.s;
                e47 e47Var2 = bVarH.r;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || e47Var2.size() < i2) {
                    e47.b bVar = e47.b;
                    listUnmodifiableList = qyc.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < e47Var2.size()) {
                        if (iIntValue != -1) {
                            b.e eVar = (b.e) e47Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(eVar);
                            } else if (iIntValue < eVar.b0.size()) {
                                e47 e47Var3 = eVar.b0;
                                arrayList.addAll(e47Var3.subList(iIntValue, e47Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(e47Var2.subList(i2, e47Var2.size()));
                        iIntValue = 0;
                    }
                    if (bVarH.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < e47Var.size()) {
                            arrayList.addAll(e47Var.subList(iIntValue, e47Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mg9VarArr[i] = new c(jD, listUnmodifiableList);
            } else {
                mg9VarArr[i] = mg9.a;
            }
            i++;
            ri6Var = this;
            ui6Var2 = ui6Var;
            z = false;
        }
        return mg9VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(ui6 ui6Var) {
        int i = ui6Var.o;
        if (i == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.b bVarH = this.g.h(false, this.e[this.h.b(ui6Var.d)]);
        bVarH.getClass();
        e47 e47Var = bVarH.r;
        int i2 = (int) (ui6Var.j - bVarH.k);
        if (i2 < 0) {
            return 1;
        }
        e47 e47Var2 = i2 < e47Var.size() ? ((b.e) e47Var.get(i2)).b0 : bVarH.s;
        if (i >= e47Var2.size()) {
            return 2;
        }
        b.c cVar = (b.c) e47Var2.get(i);
        if (cVar.b0) {
            return 0;
        }
        return Objects.equals(Uri.parse(shg.c(bVarH.a, cVar.a)), ui6Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> c(ui6 ui6Var, boolean z, androidx.media3.exoplayer.hls.playlist.b bVar, long j, long j2) {
        boolean z2 = true;
        if (ui6Var != null) {
            long jC = ui6Var.j;
            int i = ui6Var.o;
            if (!z) {
                if (!ui6Var.H) {
                    return new Pair<>(Long.valueOf(jC), Integer.valueOf(i));
                }
                if (i == -1) {
                    jC = ui6Var.c();
                }
                return new Pair<>(Long.valueOf(jC), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j3 = bVar.u;
        e47 e47Var = bVar.s;
        long j4 = bVar.k;
        e47 e47Var2 = bVar.r;
        long j5 = j3 + j;
        if (ui6Var != null && !this.q) {
            j2 = ui6Var.g;
        }
        if (!bVar.o && j2 >= j5) {
            return new Pair<>(Long.valueOf(j4 + ((long) e47Var2.size())), -1);
        }
        long j6 = j2 - j;
        Long lValueOf = Long.valueOf(j6);
        int i2 = 0;
        if (this.g.k() && ui6Var != null) {
            z2 = false;
        }
        int iC = vjg.c(e47Var2, lValueOf, z2);
        long j7 = ((long) iC) + j4;
        if (iC >= 0) {
            b.e eVar = (b.e) e47Var2.get(iC);
            e47 e47Var3 = j6 < eVar.e + eVar.c ? eVar.b0 : e47Var;
            while (true) {
                if (i2 >= e47Var3.size()) {
                    break;
                }
                b.c cVar = (b.c) e47Var3.get(i2);
                if (j6 >= cVar.e + cVar.c) {
                    i2++;
                } else if (cVar.a0) {
                    j7 += e47Var3 == e47Var ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair<>(Long.valueOf(j7), Integer.valueOf(i));
    }

    public final a e(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        au5 au5Var = this.j;
        byte[] bArrRemove = au5Var.a.remove(uri);
        if (bArrRemove != null) {
            au5Var.a.put(uri, bArrRemove);
            return null;
        }
        gf3 gf3Var = new gf3(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        androidx.media3.common.a aVar = this.f[i];
        int iR = this.r.r();
        Object objI = this.r.i();
        byte[] bArr = this.m;
        a aVar2 = new a(this.c, gf3Var, 3, aVar, iR, objI, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr = vjg.b;
        }
        aVar2.j = bArr;
        return aVar2;
    }
}
