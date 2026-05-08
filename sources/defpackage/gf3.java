package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gf3 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public static final class a {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        public String h;
        public int i;

        public final gf3 a() {
            ka2.s(this.a, "The uri must be set.");
            return new gf3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    static {
        jj9.a("media3.datasource");
    }

    public gf3(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        ka2.l(j + j2 >= 0);
        ka2.l(j2 >= 0);
        ka2.l(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        bg.h();
        return null;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        return aVar;
    }

    public final gf3 c(long j) {
        long j2 = this.g;
        return d(j, j2 != -1 ? j2 - j : -1L);
    }

    public final gf3 d(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new gf3(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return w20.k(sb, this.i, "]");
    }

    public gf3(Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }
}
