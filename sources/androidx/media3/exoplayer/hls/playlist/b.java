package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import defpackage.e47;
import defpackage.f47;
import defpackage.h4;
import defpackage.ka2;
import defpackage.qyc;
import defpackage.ub1;
import defpackage.xi6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends xi6 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final e47 r;
    public final e47 s;
    public final f47 t;
    public final long u;
    public final g v;
    public final e47<C0048b> w;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.b$b, reason: collision with other inner class name */
    public static final class C0048b {
        public final String a;
        public final Uri b;
        public final Uri c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<String> h;
        public final boolean i;
        public final long j;
        public final long k;
        public final e47<String> l;
        public final e47<String> m;
        public final qyc n;
        public final boolean o;
        public final String p;
        public final String q;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.b$b$a */
        public static final class a {
            public final String a;
            public Uri c;
            public Uri d;
            public boolean j;
            public Boolean o;
            public String p;
            public String q;
            public final HashMap b = new HashMap();
            public long e = -9223372036854775807L;
            public long f = -9223372036854775807L;
            public long g = -9223372036854775807L;
            public long h = -9223372036854775807L;
            public ArrayList i = new ArrayList();
            public long k = -9223372036854775807L;
            public long l = -9223372036854775807L;
            public ArrayList m = new ArrayList();
            public ArrayList n = new ArrayList();

            public a(String str) {
                this.a = str;
            }
        }

        public C0048b(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
            ka2.l((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.a = str;
            this.b = uri;
            this.c = uri2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = arrayList;
            this.i = z;
            this.j = j5;
            this.k = j6;
            this.l = e47.j(arrayList2);
            this.m = e47.j(arrayList3);
            this.n = e47.q(new ub1(1), arrayList4);
            this.o = z2;
            this.p = str2;
            this.q = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0048b)) {
                return false;
            }
            C0048b c0048b = (C0048b) obj;
            return this.d == c0048b.d && this.e == c0048b.e && this.f == c0048b.f && this.g == c0048b.g && this.i == c0048b.i && this.j == c0048b.j && this.k == c0048b.k && this.o == c0048b.o && Objects.equals(this.a, c0048b.a) && Objects.equals(this.b, c0048b.b) && Objects.equals(this.c, c0048b.c) && Objects.equals(this.h, c0048b.h) && Objects.equals(this.l, c0048b.l) && Objects.equals(this.m, c0048b.m) && Objects.equals(this.n, c0048b.n) && Objects.equals(this.p, c0048b.p) && Objects.equals(this.q, c0048b.q);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
        }
    }

    public static final class c extends f {
        public final boolean a0;
        public final boolean b0;

        public c(String str, e eVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, eVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.a0 = z2;
            this.b0 = z3;
        }
    }

    public static final class d {
        public final Uri a;
        public final long b;
        public final int c;

        public d(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    public static class f implements Comparable<Long> {
        public final String V;
        public final String W;
        public final long X;
        public final long Y;
        public final boolean Z;
        public final String a;
        public final e b;
        public final long c;
        public final int d;
        public final long e;
        public final DrmInitData f;

        public f(String str, e eVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.a = str;
            this.b = eVar;
            this.c = j;
            this.d = i;
            this.e = j2;
            this.f = drmInitData;
            this.V = str2;
            this.W = str3;
            this.X = j3;
            this.Y = j4;
            this.Z = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l) {
            Long l2 = l;
            long jLongValue = l2.longValue();
            long j = this.e;
            if (j > jLongValue) {
                return 1;
            }
            return j < l2.longValue() ? -1 : 0;
        }
    }

    public static final class g {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public g(boolean z, long j, long j2, boolean z2, long j3) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public b(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List<e> list2, List<c> list3, g gVar, Map<Uri, d> map, List<C0048b> list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = e47.j(list2);
        this.s = e47.j(list3);
        this.t = f47.a(map);
        this.w = e47.j(list4);
        if (!list3.isEmpty()) {
            c cVar = (c) h4.l(list3);
            this.u = cVar.e + cVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            e eVar = (e) h4.l(list2);
            this.u = eVar.e + eVar.c;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.e = jMin;
        this.f = j >= 0;
        this.v = gVar;
    }

    @Override // defpackage.wb5
    public final xi6 a(List list) {
        return this;
    }

    public static class a {
        public final String a;
        public final int b;
        public final double c;
        public final String d;

        public a(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            ka2.q(z);
            this.a = str;
            this.b = i;
            this.d = str2;
            this.c = 0.0d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Double.compare(this.c, aVar.c) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.d, aVar.d);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
        }

        public a(String str, double d) {
            this.a = str;
            this.b = 2;
            this.c = d;
            this.d = null;
        }
    }

    public static final class e extends f {
        public final String a0;
        public final e47 b0;

        public e(String str, e eVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<c> list) {
            super(str, eVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.a0 = str2;
            this.b0 = e47.j(list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, qyc.e);
            e47.b bVar = e47.b;
        }
    }
}
