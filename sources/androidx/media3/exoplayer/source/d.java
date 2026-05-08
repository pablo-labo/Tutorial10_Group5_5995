package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.m;
import defpackage.an3;
import defpackage.dhb;
import defpackage.dp3;
import defpackage.e47;
import defpackage.fze;
import defpackage.g9;
import defpackage.ij9;
import defpackage.in3;
import defpackage.ka2;
import defpackage.l5;
import defpackage.m55;
import defpackage.n55;
import defpackage.o55;
import defpackage.oj9;
import defpackage.p6;
import defpackage.qq3;
import defpackage.qyc;
import defpackage.st9;
import defpackage.t40;
import defpackage.vjg;
import defpackage.z3;
import defpackage.zkd;
import defpackage.zpf;
import defpackage.zxd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h.a {
    public final a a;
    public a.InterfaceC0038a b;
    public qq3 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public static final class a {
        public final in3 a;
        public a.InterfaceC0038a d;
        public qq3 f;
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();
        public boolean e = true;

        public a(in3 in3Var, qq3 qq3Var) {
            this.a = in3Var;
            this.f = qq3Var;
        }

        public final fze<h.a> a(int i) {
            fze<h.a> fzeVar;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map = this.b;
            fze<h.a> fzeVar2 = (fze) map.get(numValueOf);
            if (fzeVar2 != null) {
                return fzeVar2;
            }
            final a.InterfaceC0038a interfaceC0038a = this.d;
            interfaceC0038a.getClass();
            if (i == 0) {
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(h.a.class);
                fzeVar = new fze() { // from class: ep3
                    @Override // defpackage.fze
                    public final Object get() {
                        return d.e(clsAsSubclass, interfaceC0038a);
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(h.a.class);
                fzeVar = new fze() { // from class: fp3
                    @Override // defpackage.fze
                    public final Object get() {
                        return d.e(clsAsSubclass2, interfaceC0038a);
                    }
                };
            } else if (i == 2) {
                final Class clsAsSubclass3 = HlsMediaSource.Factory.class.asSubclass(h.a.class);
                fzeVar = new fze() { // from class: gp3
                    @Override // defpackage.fze
                    public final Object get() {
                        return d.e(clsAsSubclass3, interfaceC0038a);
                    }
                };
            } else if (i == 3) {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(h.a.class);
                fzeVar = new fze() { // from class: hp3
                    @Override // defpackage.fze
                    public final Object get() {
                        try {
                            return (h.a) clsAsSubclass4.getConstructor(null).newInstance(null);
                        } catch (Exception e) {
                            z3.q(e);
                            return null;
                        }
                    }
                };
            } else {
                if (i != 4) {
                    l5.q(p6.c(i, "Unrecognized contentType: "));
                    return null;
                }
                fzeVar = new fze() { // from class: ip3
                    @Override // defpackage.fze
                    public final Object get() {
                        return new m.b(interfaceC0038a, this.a.a);
                    }
                };
            }
            map.put(Integer.valueOf(i), fzeVar);
            return fzeVar;
        }
    }

    public static final class b implements m55 {
        public final androidx.media3.common.a a;

        public b(androidx.media3.common.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.m55
        public final int b(n55 n55Var, dhb dhbVar) {
            return n55Var.m(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // defpackage.m55
        public final boolean c(n55 n55Var) {
            return true;
        }

        @Override // defpackage.m55
        public final void d(long j, long j2) {
        }

        @Override // defpackage.m55
        public final void l(o55 o55Var) {
            zpf zpfVarO = o55Var.o(0, 3);
            o55Var.b(new zxd.b(-9223372036854775807L));
            o55Var.m();
            androidx.media3.common.a aVar = this.a;
            a.C0036a c0036aA = aVar.a();
            c0036aA.m = st9.p("text/x-unknown");
            c0036aA.j = aVar.n;
            t40.n(c0036aA, zpfVarO);
        }

        @Override // defpackage.m55
        public final void release() {
        }
    }

    public d(c.a aVar, in3 in3Var) {
        this.b = aVar;
        qq3 qq3Var = new qq3();
        this.c = qq3Var;
        a aVar2 = new a(in3Var, qq3Var);
        this.a = aVar2;
        if (aVar != aVar2.d) {
            aVar2.d = aVar;
            aVar2.b.clear();
            aVar2.c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static h.a e(Class cls, a.InterfaceC0038a interfaceC0038a) {
        try {
            return (h.a) cls.getConstructor(a.InterfaceC0038a.class).newInstance(interfaceC0038a);
        } catch (Exception e) {
            z3.q(e);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final h a(ij9 ij9Var) {
        boolean z;
        boolean z2;
        DefaultDrmSessionManager defaultDrmSessionManagerA;
        androidx.media3.exoplayer.drm.b bVar;
        ij9.e eVar;
        long j;
        Uri uri;
        String str;
        ij9.a aVar;
        String str2;
        ij9 ij9Var2 = ij9Var;
        ij9Var2.b.getClass();
        String scheme = ij9Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(ij9Var2.b.b, "application/x-image-uri");
        ij9.f fVar = ij9Var2.b;
        if (zEquals) {
            long j2 = fVar.h;
            String str3 = vjg.a;
            throw null;
        }
        int iH = vjg.H(fVar.a, fVar.b);
        if (ij9Var2.b.h != -9223372036854775807L) {
            in3 in3Var = this.a.a;
            synchronized (in3Var) {
                in3Var.d = 1;
            }
        }
        try {
            a aVar2 = this.a;
            HashMap map = aVar2.c;
            h.a aVar3 = (h.a) map.get(Integer.valueOf(iH));
            if (aVar3 == null) {
                aVar3 = aVar2.a(iH).get();
                aVar3.b(aVar2.f);
                aVar3.c(aVar2.e);
                aVar3.d();
                map.put(Integer.valueOf(iH), aVar3);
            }
            ij9.e.a aVarA = ij9Var2.c.a();
            ij9.e eVar2 = ij9Var2.c;
            if (eVar2.a == -9223372036854775807L) {
                aVarA.a = this.d;
            }
            if (eVar2.d == -3.4028235E38f) {
                aVarA.d = this.g;
            }
            if (eVar2.e == -3.4028235E38f) {
                aVarA.e = this.h;
            }
            if (eVar2.b == -9223372036854775807L) {
                aVarA.b = this.e;
            }
            if (eVar2.c == -9223372036854775807L) {
                aVarA.c = this.f;
            }
            ij9.e eVar3 = new ij9.e(aVarA);
            if (eVar3.equals(ij9Var2.c)) {
                z = true;
                z2 = false;
            } else {
                ij9.d.a aVar4 = new ij9.d.a();
                List<StreamKey> list = Collections.EMPTY_LIST;
                e47 e47Var = qyc.e;
                ij9.g gVar = ij9.g.d;
                ij9.c cVar = ij9Var2.e;
                ij9.b.a aVar5 = new ij9.b.a();
                aVar5.a = cVar.b;
                aVar5.b = cVar.d;
                aVar5.c = cVar.e;
                aVar5.d = cVar.f;
                aVar5.e = cVar.g;
                aVar5.f = cVar.h;
                String str4 = ij9Var2.a;
                oj9 oj9Var = ij9Var2.d;
                ij9Var2.c.a();
                ij9.g gVar2 = ij9Var2.f;
                ij9.f fVar2 = ij9Var2.b;
                if (fVar2 != null) {
                    String str5 = fVar2.f;
                    String str6 = fVar2.b;
                    Uri uri2 = fVar2.a;
                    list = fVar2.e;
                    e47Var = fVar2.g;
                    z2 = false;
                    ij9.d dVar = fVar2.c;
                    ij9.d.a aVarA2 = dVar != null ? dVar.a() : new ij9.d.a();
                    z = true;
                    ij9.a aVar6 = fVar2.d;
                    eVar = eVar3;
                    str2 = str5;
                    j = fVar2.h;
                    aVar = aVar6;
                    str = str6;
                    uri = uri2;
                    aVar4 = aVarA2;
                } else {
                    eVar = eVar3;
                    z = true;
                    z2 = false;
                    j = -9223372036854775807L;
                    uri = null;
                    str = null;
                    aVar = null;
                    str2 = null;
                }
                List<StreamKey> list2 = list;
                e47 e47Var2 = e47Var;
                ij9.e.a aVarA3 = eVar.a();
                ka2.q((aVar4.b == null || aVar4.a != null) ? z : z2 ? 1 : 0);
                ij9.f fVar3 = uri != null ? new ij9.f(uri, str, aVar4.a != null ? new ij9.d(aVar4) : null, aVar, list2, str2, e47Var2, j) : null;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                ij9.c cVar2 = new ij9.c(aVar5);
                ij9.e eVar4 = new ij9.e(aVarA3);
                if (oj9Var == null) {
                    oj9Var = oj9.K;
                }
                ij9Var2 = new ij9(str7, cVar2, fVar3, eVar4, oj9Var, gVar2);
            }
            h hVarA = aVar3.a(ij9Var2);
            e47<ij9.i> e47Var3 = ij9Var2.b.g;
            if (!e47Var3.isEmpty()) {
                h[] hVarArr = new h[e47Var3.size() + 1];
                hVarArr[z2 ? 1 : 0] = hVarA;
                for (int i = z2 ? 1 : 0; i < e47Var3.size(); i++) {
                    if (this.i) {
                        a.C0036a c0036a = new a.C0036a();
                        c0036a.m = st9.p(e47Var3.get(i).b);
                        c0036a.d = e47Var3.get(i).c;
                        c0036a.e = e47Var3.get(i).d;
                        c0036a.f = e47Var3.get(i).e;
                        c0036a.b = e47Var3.get(i).f;
                        c0036a.a = e47Var3.get(i).g;
                        androidx.media3.common.a aVar7 = new androidx.media3.common.a(c0036a);
                        dp3 dp3Var = new dp3(this, aVar7);
                        a.InterfaceC0038a interfaceC0038a = this.b;
                        g9 g9Var = new g9(dp3Var, 10);
                        Object obj = new Object();
                        androidx.media3.exoplayer.upstream.a aVar8 = new androidx.media3.exoplayer.upstream.a();
                        if (this.c.a(aVar7)) {
                            a.C0036a c0036aA = aVar7.a();
                            c0036aA.m = st9.p("application/x-media3-cues");
                            c0036aA.j = aVar7.n;
                            c0036aA.K = this.c.b(aVar7);
                            aVar7 = new androidx.media3.common.a(c0036aA);
                        }
                        androidx.media3.common.a aVar9 = aVar7;
                        int i2 = i + 1;
                        String string = e47Var3.get(i).a.toString();
                        ij9.b.a aVar10 = new ij9.b.a();
                        ij9.d.a aVar11 = new ij9.d.a();
                        List list3 = Collections.EMPTY_LIST;
                        qyc qycVar = qyc.e;
                        ij9.e.a aVar12 = new ij9.e.a();
                        ij9.g gVar3 = ij9.g.d;
                        Uri uri3 = string == null ? null : Uri.parse(string);
                        ka2.q((aVar11.b == null || aVar11.a != null) ? z : z2 ? 1 : 0);
                        ij9.f fVar4 = uri3 != null ? new ij9.f(uri3, null, aVar11.a != null ? new ij9.d(aVar11) : null, null, list3, null, qycVar, -9223372036854775807L) : null;
                        ij9 ij9Var3 = new ij9("", new ij9.c(aVar10), fVar4, new ij9.e(aVar12), oj9.K, gVar3);
                        fVar4.getClass();
                        ij9Var3.b.getClass();
                        ij9.d dVar2 = ij9Var3.b.c;
                        if (dVar2 == null) {
                            bVar = androidx.media3.exoplayer.drm.b.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    defaultDrmSessionManagerA = !dVar2.equals(null) ? an3.a(dVar2) : null;
                                    defaultDrmSessionManagerA.getClass();
                                } finally {
                                }
                            }
                            bVar = defaultDrmSessionManagerA;
                        }
                        hVarArr[i2] = new m(ij9Var3, interfaceC0038a, g9Var, bVar, aVar8, 1048576, aVar9);
                    } else {
                        a.InterfaceC0038a interfaceC0038a2 = this.b;
                        interfaceC0038a2.getClass();
                        hVarArr[i + 1] = new r(e47Var3.get(i), interfaceC0038a2, new androidx.media3.exoplayer.upstream.a());
                    }
                }
                hVarA = new MergingMediaSource(hVarArr);
            }
            ij9.c cVar3 = ij9Var2.e;
            if (cVar3.b != 0 || cVar3.d != Long.MIN_VALUE || cVar3.f) {
                ClippingMediaSource.a aVar13 = new ClippingMediaSource.a(hVarA);
                long j3 = cVar3.b;
                if (j3 >= 0) {
                    z2 = z;
                }
                ka2.l(z2);
                ka2.q(!aVar13.h);
                aVar13.b = j3;
                long j4 = cVar3.d;
                ka2.q(!aVar13.h);
                aVar13.c = j4;
                boolean z3 = !cVar3.g;
                ka2.q(!aVar13.h);
                aVar13.d = z3;
                boolean z4 = cVar3.e;
                ka2.q(!aVar13.h);
                aVar13.e = z4;
                boolean z5 = cVar3.f;
                ka2.q(!aVar13.h);
                aVar13.f = z5;
                boolean z6 = cVar3.h;
                ka2.q(!aVar13.h);
                aVar13.g = z6;
                aVar13.h = z;
                hVarA = new ClippingMediaSource(aVar13);
            }
            ij9Var2.b.getClass();
            if (ij9Var2.b.d == null) {
                return hVarA;
            }
            zkd.T("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return hVarA;
        } catch (ClassNotFoundException e) {
            z3.q(e);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(qq3 qq3Var) {
        this.c = qq3Var;
        a aVar = this.a;
        aVar.f = qq3Var;
        in3 in3Var = aVar.a;
        synchronized (in3Var) {
            in3Var.c = qq3Var;
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).b(qq3Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    @Deprecated
    public final void c(boolean z) {
        this.i = z;
        a aVar = this.a;
        aVar.e = z;
        in3 in3Var = aVar.a;
        synchronized (in3Var) {
            in3Var.b = z;
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).c(z);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void d() {
        a aVar = this.a;
        aVar.getClass();
        synchronized (aVar.a) {
        }
    }
}
