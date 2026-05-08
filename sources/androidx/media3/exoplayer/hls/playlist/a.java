package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.c;
import defpackage.e47;
import defpackage.g7;
import defpackage.gf3;
import defpackage.h4;
import defpackage.ka2;
import defpackage.ote;
import defpackage.st9;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.wi6;
import defpackage.xi6;
import defpackage.yb3;
import defpackage.yi6;
import defpackage.yn3;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements HlsPlaylistTracker, Loader.a<androidx.media3.exoplayer.upstream.c<xi6>> {
    public static final g7 d0 = new g7(12);
    public Loader V;
    public Handler W;
    public HlsMediaSource X;
    public c Y;
    public Uri Z;
    public final yn3 a;
    public androidx.media3.exoplayer.hls.playlist.b a0;
    public final yi6 b;
    public boolean b0;
    public final androidx.media3.exoplayer.upstream.b c;
    public i.a f;
    public final CopyOnWriteArrayList<HlsPlaylistTracker.a> e = new CopyOnWriteArrayList<>();
    public final HashMap<Uri, b> d = new HashMap<>();
    public long c0 = -9223372036854775807L;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.a$a, reason: collision with other inner class name */
    public class C0047a implements HlsPlaylistTracker.a {
        public C0047a() {
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final boolean a(Uri uri, b.c cVar, boolean z) {
            b bVar;
            a aVar = a.this;
            HashMap<Uri, b> map = aVar.d;
            if (aVar.a0 == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c cVar2 = aVar.Y;
                String str = vjg.a;
                List<c.b> list = cVar2.e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    b bVar2 = map.get(list.get(i2).a);
                    if (bVar2 != null && jElapsedRealtime < bVar2.W) {
                        i++;
                    }
                }
                b.C0051b c0051bC = aVar.c.c(new b.a(1, 0, aVar.Y.e.size(), i), cVar);
                if (c0051bC != null && c0051bC.a == 2 && (bVar = map.get(uri)) != null) {
                    b.a(bVar, c0051bC.b);
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
        public final void b() {
            a.this.e.remove(this);
        }
    }

    public final class b implements Loader.a<androidx.media3.exoplayer.upstream.c<xi6>> {
        public long V;
        public long W;
        public boolean X;
        public IOException Y;
        public boolean Z;
        public final Uri a;
        public final Loader b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final androidx.media3.datasource.a c;
        public androidx.media3.exoplayer.hls.playlist.b d;
        public long e;
        public long f;

        public b(Uri uri) {
            this.a = uri;
            this.c = a.this.a.a.a();
        }

        public static boolean a(b bVar, long j) {
            bVar.W = SystemClock.elapsedRealtime() + j;
            Uri uri = bVar.a;
            a aVar = a.this;
            if (!uri.equals(aVar.Z)) {
                return false;
            }
            List<c.b> list = aVar.Y.e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < size; i++) {
                b bVar2 = aVar.d.get(list.get(i).a);
                bVar2.getClass();
                if (jElapsedRealtime > bVar2.W) {
                    Uri uri2 = bVar2.a;
                    aVar.Z = uri2;
                    bVar2.e(aVar.m(uri2));
                    return false;
                }
            }
            return true;
        }

        public final Uri b() {
            androidx.media3.exoplayer.hls.playlist.b bVar = this.d;
            Uri uri = this.a;
            if (bVar != null) {
                b.g gVar = bVar.v;
                if (gVar.a != -9223372036854775807L || gVar.e) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    androidx.media3.exoplayer.hls.playlist.b bVar2 = this.d;
                    if (bVar2.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar2.k + ((long) bVar2.r.size())));
                        androidx.media3.exoplayer.hls.playlist.b bVar3 = this.d;
                        if (bVar3.n != -9223372036854775807L) {
                            e47 e47Var = bVar3.s;
                            int size = e47Var.size();
                            if (!e47Var.isEmpty() && ((b.c) h4.l(e47Var)).b0) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    b.g gVar2 = this.d.v;
                    if (gVar2.a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", gVar2.b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return uri;
        }

        public final void c(boolean z) {
            e(z ? b() : this.a);
        }

        public final void d(Uri uri) {
            a aVar = a.this;
            c.a<xi6> aVarB = aVar.b.b(aVar.Y, this.d);
            Map map = Collections.EMPTY_MAP;
            ka2.s(uri, "The uri must be set.");
            androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.c, new gf3(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, aVarB);
            this.b.f(cVar, this, aVar.c.b(cVar.c));
        }

        public final void e(Uri uri) {
            this.W = 0L;
            if (this.X) {
                return;
            }
            Loader loader = this.b;
            if (loader.d() || loader.c()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.V;
            if (jElapsedRealtime >= j) {
                d(uri);
            } else {
                this.X = true;
                a.this.W.postDelayed(new yb3(1, this, uri), j - jElapsedRealtime);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(androidx.media3.exoplayer.hls.playlist.b r71, defpackage.uz8 r72) {
            /*
                Method dump skipped, instruction units count: 641
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.a.b.f(androidx.media3.exoplayer.hls.playlist.b, uz8):void");
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            long j3 = cVar.a;
            int i2 = cVar.c;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            boolean z = uri.getQueryParameter("_HLS_msn") != null;
            boolean z2 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            Loader.b bVar = Loader.e;
            a aVar = a.this;
            if (z || z2) {
                int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z2 || i3 == 400 || i3 == 503) {
                    this.V = SystemClock.elapsedRealtime();
                    c(false);
                    i.a aVar2 = aVar.f;
                    String str = vjg.a;
                    aVar2.f(uz8Var, i2, iOException, true);
                    return bVar;
                }
            }
            b.c cVar2 = new b.c(iOException, i);
            Iterator<HlsPlaylistTracker.a> it = aVar.e.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                z3 |= !it.next().a(this.a, cVar2, false);
            }
            androidx.media3.exoplayer.upstream.b bVar2 = aVar.c;
            if (z3) {
                long jA = bVar2.a(cVar2);
                bVar = jA != -9223372036854775807L ? new Loader.b(0, jA) : Loader.f;
            }
            boolean zA = bVar.a();
            aVar.f.f(uz8Var, i2, iOException, !zA);
            if (!zA) {
                bVar2.getClass();
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void n(Loader.d dVar, long j, long j2, int i) {
            uz8 uz8Var;
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            if (i == 0) {
                long j3 = cVar.a;
                uz8Var = new uz8(cVar.b);
            } else {
                long j4 = cVar.a;
                ote oteVar = cVar.d;
                Uri uri = oteVar.c;
                uz8Var = new uz8(j2, oteVar.d);
            }
            a.this.f.g(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void r(Loader.d dVar, long j, long j2) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            xi6 xi6Var = (xi6) cVar.f;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            if (xi6Var instanceof androidx.media3.exoplayer.hls.playlist.b) {
                f((androidx.media3.exoplayer.hls.playlist.b) xi6Var, uz8Var);
                a.this.f.d(uz8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
                this.Y = parserExceptionB;
                a.this.f.f(uz8Var, 4, parserExceptionB, true);
            }
            a.this.c.getClass();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void v(Loader.d dVar, long j, long j2, boolean z) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            long j3 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            a aVar = a.this;
            aVar.c.getClass();
            aVar.f.c(uz8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public a(yn3 yn3Var, androidx.media3.exoplayer.upstream.a aVar, yi6 yi6Var) {
        this.a = yn3Var;
        this.b = yi6Var;
        this.c = aVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void a(Uri uri) {
        b bVar = this.d.get(uri);
        if (bVar != null) {
            bVar.Z = false;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void b(Uri uri) throws IOException {
        b bVar = this.d.get(uri);
        bVar.b.a();
        IOException iOException = bVar.Y;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void c(wi6 wi6Var) {
        this.e.add(wi6Var);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final long d() {
        return this.c0;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final c e() {
        return this.Y;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void f(Uri uri) {
        this.d.get(uri).c(true);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
        long j3 = cVar.a;
        ote oteVar = cVar.d;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        int i2 = cVar.c;
        long jA = this.c.a(new b.c(iOException, i));
        boolean z = jA == -9223372036854775807L;
        this.f.f(uz8Var, i2, iOException, z);
        return z ? Loader.f : new Loader.b(0, jA);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final androidx.media3.exoplayer.hls.playlist.b h(boolean z, Uri uri) {
        HashMap<Uri, b> map = this.d;
        androidx.media3.exoplayer.hls.playlist.b bVar = map.get(uri).d;
        if (bVar != null && z) {
            if (!uri.equals(this.Z)) {
                List<c.b> list = this.Y.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(list.get(i).a)) {
                        androidx.media3.exoplayer.hls.playlist.b bVar2 = this.a0;
                        if (bVar2 == null || !bVar2.o) {
                            this.Z = uri;
                            b bVar3 = map.get(uri);
                            androidx.media3.exoplayer.hls.playlist.b bVar4 = bVar3.d;
                            if (bVar4 == null || !bVar4.o) {
                                bVar3.e(m(uri));
                            } else {
                                this.a0 = bVar4;
                                this.X.x(bVar4);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            b bVar5 = map.get(uri);
            androidx.media3.exoplayer.hls.playlist.b bVar6 = bVar5.d;
            if (!bVar5.Z) {
                bVar5.Z = true;
                if (bVar6 != null && !bVar6.o) {
                    bVar5.c(true);
                }
            }
        }
        return bVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean i(Uri uri) {
        int i;
        b bVar = this.d.get(uri);
        if (bVar.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, vjg.c0(bVar.d.u));
        androidx.media3.exoplayer.hls.playlist.b bVar2 = bVar.d;
        return bVar2.o || (i = bVar2.d) == 2 || i == 1 || bVar.e + jMax > jElapsedRealtime;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void j(wi6 wi6Var) {
        this.e.remove(wi6Var);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean k() {
        return this.b0;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean l(Uri uri, long j) {
        if (this.d.get(uri) != null) {
            return !b.a(r0, j);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri m(Uri uri) {
        b.d dVar;
        androidx.media3.exoplayer.hls.playlist.b bVar = this.a0;
        if (bVar == null || !bVar.v.e || (dVar = (b.d) bVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.b));
        int i = dVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void n(Loader.d dVar, long j, long j2, int i) {
        uz8 uz8Var;
        androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
        if (i == 0) {
            long j3 = cVar.a;
            uz8Var = new uz8(cVar.b);
        } else {
            long j4 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8Var = new uz8(j2, oteVar.d);
        }
        this.f.g(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void r(Loader.d dVar, long j, long j2) {
        c cVar;
        androidx.media3.exoplayer.upstream.c cVar2 = (androidx.media3.exoplayer.upstream.c) dVar;
        xi6 xi6Var = (xi6) cVar2.f;
        boolean z = xi6Var instanceof androidx.media3.exoplayer.hls.playlist.b;
        if (z) {
            String str = xi6Var.a;
            c cVar3 = c.n;
            Uri uri = Uri.parse(str);
            a.C0036a c0036a = new a.C0036a();
            c0036a.a = "0";
            c0036a.l = st9.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new c.b(uri, new androidx.media3.common.a(c0036a), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            cVar = new c("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            cVar = (c) xi6Var;
        }
        this.Y = cVar;
        this.Z = cVar.e.get(0).a;
        this.e.add(new C0047a());
        List<Uri> list2 = cVar.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = list2.get(i);
            this.d.put(uri2, new b(uri2));
        }
        ote oteVar = cVar2.d;
        Uri uri3 = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        b bVar = this.d.get(this.Z);
        if (z) {
            bVar.f((androidx.media3.exoplayer.hls.playlist.b) xi6Var, uz8Var);
        } else {
            bVar.c(false);
        }
        this.c.getClass();
        this.f.d(uz8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void v(Loader.d dVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
        long j3 = cVar.a;
        ote oteVar = cVar.d;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.c.getClass();
        this.f.c(uz8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
