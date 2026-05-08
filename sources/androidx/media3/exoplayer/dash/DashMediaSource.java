package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.c;
import defpackage.an3;
import defpackage.ba;
import defpackage.bc5;
import defpackage.cq1;
import defpackage.d09;
import defpackage.d8b;
import defpackage.df3;
import defpackage.ea;
import defpackage.ee3;
import defpackage.emf;
import defpackage.gf3;
import defpackage.grf;
import defpackage.ij9;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.od3;
import defpackage.ote;
import defpackage.p42;
import defpackage.pd3;
import defpackage.qk3;
import defpackage.ql0;
import defpackage.qq3;
import defpackage.qx0;
import defpackage.rx0;
import defpackage.sdb;
import defpackage.u82;
import defpackage.uz8;
import defpackage.vb1;
import defpackage.vjg;
import defpackage.wme;
import defpackage.zkd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends androidx.media3.exoplayer.source.a {
    public Loader A;
    public grf B;
    public DashManifestStaleException C;
    public Handler D;
    public ij9.e E;
    public Uri F;
    public final Uri G;
    public od3 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public ij9 P;
    public final boolean h;
    public final a.InterfaceC0038a i;
    public final a.InterfaceC0041a j;
    public final ee3 k;
    public final androidx.media3.exoplayer.drm.b l;
    public final androidx.media3.exoplayer.upstream.b m;
    public final vb1 n;
    public final long o;
    public final long p;
    public final i.a q;
    public final c.a<? extends od3> r;
    public final e s;
    public final Object t;
    public final SparseArray<androidx.media3.exoplayer.dash.b> u;
    public final qx0 v;
    public final rx0 w;
    public final c x;
    public final d09 y;
    public androidx.media3.datasource.a z;

    public static final class Factory implements h.a {
        public final c.a a;
        public final a.InterfaceC0038a b;
        public final an3 c;
        public final ee3 d;
        public final androidx.media3.exoplayer.upstream.a e;
        public final long f;
        public final long g;

        public Factory(a.InterfaceC0038a interfaceC0038a) {
            c.a aVar = new c.a(interfaceC0038a);
            this.a = aVar;
            this.b = interfaceC0038a;
            this.c = new an3();
            this.e = new androidx.media3.exoplayer.upstream.a();
            this.f = 30000L;
            this.g = 5000000L;
            this.d = new ee3(16);
            aVar.c.b = true;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final androidx.media3.exoplayer.source.h a(ij9 ij9Var) {
            ij9Var.b.getClass();
            pd3 pd3Var = new pd3();
            List<StreamKey> list = ij9Var.b.e;
            return new DashMediaSource(ij9Var, this.b, !list.isEmpty() ? new bc5(pd3Var, list) : pd3Var, this.a, this.d, this.c.b(ij9Var), this.e, this.f, this.g);
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void b(qq3 qq3Var) {
            cq1.b bVar = this.a.c;
            bVar.getClass();
            bVar.a = qq3Var;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        @Deprecated
        public final void c(boolean z) {
            this.a.c.b = z;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void d() {
            this.a.c.getClass();
        }
    }

    public class a {
        public a() {
        }

        public final void a() {
            long j;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (wme.b) {
                try {
                    j = wme.c ? wme.d : -9223372036854775807L;
                } catch (Throwable th) {
                    throw th;
                }
            }
            dashMediaSource.L = j;
            dashMediaSource.A(true);
        }
    }

    public static final class b extends emf {
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final long i;
        public final long j;
        public final long k;
        public final od3 l;
        public final ij9 m;
        public final ij9.e n;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, od3 od3Var, ij9 ij9Var, ij9.e eVar) {
            ka2.q(od3Var.d == (eVar != null));
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = i;
            this.i = j4;
            this.j = j5;
            this.k = j6;
            this.l = od3Var;
            this.m = ij9Var;
            this.n = eVar;
        }

        @Override // defpackage.emf
        public final int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < h()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            ka2.m(i, h());
            od3 od3Var = this.l;
            String str = z ? od3Var.b(i).a : null;
            Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
            long jD = od3Var.d(i);
            long jO = vjg.O(od3Var.b(i).b - od3Var.b(0).b) - this.i;
            bVar.getClass();
            bVar.i(str, numValueOf, 0, jD, jO, ba.f, false);
            return bVar;
        }

        @Override // defpackage.emf
        public final int h() {
            return this.l.m.size();
        }

        @Override // defpackage.emf
        public final Object l(int i) {
            ka2.m(i, h());
            return Integer.valueOf(this.h + i);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
        @Override // defpackage.emf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final emf.d m(int r24, emf.d r25, long r26) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.b.m(int, emf$d, long):emf$d");
        }

        @Override // defpackage.emf
        public final int o() {
            return 1;
        }
    }

    public final class c implements d.b {
        public c() {
        }
    }

    public static final class d implements c.a<Long> {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // androidx.media3.exoplayer.upstream.c.a
        public final Object a(Uri uri, df3 df3Var) throws IOException {
            String line = new BufferedReader(new InputStreamReader(df3Var, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.b(null, "Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.b(e, null);
            }
        }
    }

    public final class e implements Loader.a<androidx.media3.exoplayer.upstream.c<od3>> {
        public e() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            long j3 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            int i2 = cVar.c;
            b.c cVar2 = new b.c(iOException, i);
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long jA = dashMediaSource.m.a(cVar2);
            Loader.b bVar = jA == -9223372036854775807L ? Loader.f : new Loader.b(0, jA);
            dashMediaSource.q.f(uz8Var, i2, iOException, !bVar.a());
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
            DashMediaSource.this.q.g(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void r(Loader.d dVar, long j, long j2) {
            long j3;
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j4 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            dashMediaSource.m.getClass();
            dashMediaSource.q.d(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            od3 od3Var = (od3) cVar.f;
            od3 od3Var2 = dashMediaSource.H;
            int size = od3Var2 == null ? 0 : od3Var2.m.size();
            long j5 = od3Var.b(0).b;
            int i = 0;
            while (i < size && dashMediaSource.H.b(i).b < j5) {
                i++;
            }
            if (od3Var.d) {
                if (size - i > od3Var.m.size()) {
                    zkd.T("DashMediaSource", "Loaded out of sync manifest");
                } else {
                    long j6 = dashMediaSource.N;
                    j3 = -9223372036854775807L;
                    if (j6 == -9223372036854775807L || od3Var.h * 1000 > j6) {
                        dashMediaSource.M = 0;
                    } else {
                        zkd.T("DashMediaSource", "Loaded stale dynamic manifest: " + od3Var.h + ", " + dashMediaSource.N);
                    }
                }
                int i2 = dashMediaSource.M;
                dashMediaSource.M = i2 + 1;
                if (i2 < dashMediaSource.m.b(cVar.c)) {
                    dashMediaSource.D.postDelayed(dashMediaSource.v, Math.min((dashMediaSource.M - 1) * 1000, 5000));
                    return;
                } else {
                    dashMediaSource.C = new DashManifestStaleException();
                    return;
                }
            }
            j3 = -9223372036854775807L;
            dashMediaSource.H = od3Var;
            dashMediaSource.I = od3Var.d & dashMediaSource.I;
            dashMediaSource.J = j - j2;
            dashMediaSource.K = j;
            dashMediaSource.O += i;
            synchronized (dashMediaSource.t) {
                if (cVar.b.a.equals(dashMediaSource.F)) {
                    Uri uriA = dashMediaSource.H.k;
                    if (uriA == null) {
                        uriA = u82.a(cVar.d.c);
                    }
                    dashMediaSource.F = uriA;
                }
            }
            od3 od3Var3 = dashMediaSource.H;
            if (!od3Var3.d || dashMediaSource.L != j3) {
                dashMediaSource.A(true);
                return;
            }
            ql0 ql0Var = od3Var3.i;
            if (ql0Var == null) {
                dashMediaSource.x();
                return;
            }
            String str = (String) ql0Var.b;
            if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    dashMediaSource.L = vjg.R((String) ql0Var.c) - dashMediaSource.K;
                    dashMediaSource.A(true);
                    return;
                } catch (ParserException e) {
                    dashMediaSource.z(e);
                    return;
                }
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                dashMediaSource.B(ql0Var, new d());
                return;
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                dashMediaSource.B(ql0Var, new h());
            } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                dashMediaSource.x();
            } else {
                dashMediaSource.z(new IOException("Unsupported UTC timing scheme"));
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void v(Loader.d dVar, long j, long j2, boolean z) {
            DashMediaSource.this.y((androidx.media3.exoplayer.upstream.c) dVar, j2);
        }
    }

    public final class f implements d09 {
        public f() {
        }

        @Override // defpackage.d09
        public final void a() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.A.a();
            DashManifestStaleException dashManifestStaleException = dashMediaSource.C;
            if (dashManifestStaleException != null) {
                throw dashManifestStaleException;
            }
        }
    }

    public final class g implements Loader.a<androidx.media3.exoplayer.upstream.c<Long>> {
        public g() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            i.a aVar = dashMediaSource.q;
            long j3 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            aVar.f(new uz8(j2, oteVar.d), cVar.c, iOException, true);
            dashMediaSource.m.getClass();
            dashMediaSource.z(iOException);
            return Loader.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void r(Loader.d dVar, long j, long j2) {
            androidx.media3.exoplayer.upstream.c cVar = (androidx.media3.exoplayer.upstream.c) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j3 = cVar.a;
            ote oteVar = cVar.d;
            Uri uri = oteVar.c;
            uz8 uz8Var = new uz8(j2, oteVar.d);
            dashMediaSource.m.getClass();
            dashMediaSource.q.d(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            dashMediaSource.L = ((Long) cVar.f).longValue() - j;
            dashMediaSource.A(true);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void v(Loader.d dVar, long j, long j2, boolean z) {
            DashMediaSource.this.y((androidx.media3.exoplayer.upstream.c) dVar, j2);
        }
    }

    public static final class h implements c.a<Long> {
        @Override // androidx.media3.exoplayer.upstream.c.a
        public final Object a(Uri uri, df3 df3Var) {
            return Long.valueOf(vjg.R(new BufferedReader(new InputStreamReader(df3Var)).readLine()));
        }
    }

    static {
        jj9.a("media3.exoplayer.dash");
    }

    public DashMediaSource(ij9 ij9Var, a.InterfaceC0038a interfaceC0038a, c.a aVar, c.a aVar2, ee3 ee3Var, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.upstream.a aVar3, long j, long j2) {
        this.P = ij9Var;
        this.E = ij9Var.c;
        ij9.f fVar = ij9Var.b;
        fVar.getClass();
        Uri uri = fVar.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = interfaceC0038a;
        this.r = aVar;
        this.j = aVar2;
        this.l = bVar;
        this.m = aVar3;
        this.o = j;
        this.p = j2;
        this.k = ee3Var;
        this.n = new vb1();
        this.h = false;
        this.q = q(null);
        this.t = new Object();
        this.u = new SparseArray<>();
        this.x = new c();
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new e();
        this.y = new f();
        this.v = new qx0(this, 2);
        this.w = new rx0(this, 2);
    }

    public static boolean w(d8b d8bVar) {
        List<ea> list = d8bVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = list.get(i).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r42) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.A(boolean):void");
    }

    public final void B(ql0 ql0Var, c.a<Long> aVar) {
        androidx.media3.datasource.a aVar2 = this.z;
        Uri uri = Uri.parse((String) ql0Var.c);
        Map map = Collections.EMPTY_MAP;
        ka2.s(uri, "The uri must be set.");
        this.A.f(new androidx.media3.exoplayer.upstream.c(aVar2, new gf3(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, aVar), new g(), 1);
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        ka2.s(uri, "The uri must be set.");
        this.A.f(new androidx.media3.exoplayer.upstream.c(this.z, new gf3(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.r), this.s, this.m.b(4));
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        ij9 ij9VarD = d();
        ij9.f fVar = ij9VarD.b;
        fVar.getClass();
        ij9.f fVar2 = ij9Var.b;
        return fVar2 != null && fVar2.a.equals(fVar.a) && fVar2.e.equals(fVar.e) && Objects.equals(fVar2.c, fVar.c) && ij9VarD.c.equals(ij9Var.c);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized ij9 d() {
        return this.P;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized void f(ij9 ij9Var) {
        this.P = ij9Var;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(androidx.media3.exoplayer.source.g gVar) {
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) gVar;
        androidx.media3.exoplayer.dash.d dVar = bVar.b0;
        dVar.X = true;
        dVar.d.removeCallbacksAndMessages(null);
        for (p42<androidx.media3.exoplayer.dash.a> p42Var : bVar.h0) {
            p42Var.C(bVar);
        }
        bVar.g0 = null;
        this.u.remove(bVar.a);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void m() {
        this.y.a();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final androidx.media3.exoplayer.source.g o(h.b bVar, qk3 qk3Var, long j) {
        int iIntValue = ((Integer) bVar.a).intValue() - this.O;
        i.a aVarQ = q(bVar);
        a.C0043a c0043a = new a.C0043a(this.d.c, 0, bVar);
        int i = this.O + iIntValue;
        od3 od3Var = this.H;
        grf grfVar = this.B;
        long j2 = this.L;
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        androidx.media3.exoplayer.dash.b bVar2 = new androidx.media3.exoplayer.dash.b(i, od3Var, this.n, iIntValue, this.j, grfVar, this.l, c0043a, this.m, aVarQ, j2, this.y, qk3Var, this.k, this.x, sdbVar);
        this.u.put(i, bVar2);
        return bVar2;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.B = grfVar;
        Looper looperMyLooper = Looper.myLooper();
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        androidx.media3.exoplayer.drm.b bVar = this.l;
        bVar.a(looperMyLooper, sdbVar);
        bVar.f();
        if (this.h) {
            A(false);
            return;
        }
        this.z = this.i.a();
        this.A = new Loader("DashMediaSource");
        this.D = vjg.p(null);
        C();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void v() {
        this.I = false;
        this.z = null;
        Loader loader = this.A;
        if (loader != null) {
            loader.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        vb1 vb1Var = this.n;
        vb1Var.a.clear();
        vb1Var.b.clear();
        vb1Var.c.clear();
        this.l.release();
    }

    public final void x() {
        boolean z;
        Loader loader = this.A;
        a aVar = new a();
        synchronized (wme.b) {
            z = wme.c;
        }
        if (z) {
            aVar.a();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.f(new wme.b(), new wme.a(aVar), 1);
    }

    public final void y(androidx.media3.exoplayer.upstream.c cVar, long j) {
        long j2 = cVar.a;
        ote oteVar = cVar.d;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j, oteVar.d);
        this.m.getClass();
        this.q.c(uz8Var, cVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        zkd.x("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}
