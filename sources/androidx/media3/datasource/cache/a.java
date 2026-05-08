package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.e;
import defpackage.at2;
import defpackage.au1;
import defpackage.bt2;
import defpackage.gf3;
import defpackage.grf;
import defpackage.ka2;
import defpackage.mfe;
import defpackage.nbf;
import defpackage.vjg;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.datasource.a {
    public final Cache a;
    public final androidx.media3.datasource.a b;
    public final nbf c;
    public final androidx.media3.datasource.a d;
    public final boolean e = false;
    public final boolean f;
    public final boolean g;
    public Uri h;
    public gf3 i;
    public gf3 j;
    public androidx.media3.datasource.a k;
    public long l;
    public long m;
    public long n;
    public au1 o;
    public boolean p;
    public boolean q;
    public long r;

    /* JADX INFO: renamed from: androidx.media3.datasource.cache.a$a, reason: collision with other inner class name */
    public static final class C0039a implements a.InterfaceC0038a {
        public c a;
        public FileDataSource.a b;
        public a.InterfaceC0038a c;
        public int d;

        @Override // androidx.media3.datasource.a.InterfaceC0038a
        public final androidx.media3.datasource.a a() {
            a.InterfaceC0038a interfaceC0038a = this.c;
            androidx.media3.datasource.a aVarA = interfaceC0038a != null ? interfaceC0038a.a() : null;
            int i = this.d;
            c cVar = this.a;
            cVar.getClass();
            return new a(cVar, aVarA, this.b.a(), aVarA != null ? new CacheDataSink(cVar) : null, i);
        }
    }

    public a(c cVar, androidx.media3.datasource.a aVar, androidx.media3.datasource.a aVar2, CacheDataSink cacheDataSink, int i) {
        this.a = cVar;
        this.b = aVar2;
        this.f = (i & 2) != 0;
        this.g = false;
        if (aVar != null) {
            this.d = aVar;
            this.c = cacheDataSink != null ? new nbf(aVar, cacheDataSink) : null;
        } else {
            this.d = e.a;
            this.c = null;
        }
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.h;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        long j;
        Cache cache = this.a;
        try {
            String string = gf3Var.h;
            long j2 = gf3Var.f;
            long j3 = gf3Var.g;
            if (string == null) {
                string = gf3Var.a.toString();
            }
            gf3.a aVarA = gf3Var.a();
            aVarA.h = string;
            gf3 gf3VarA = aVarA.a();
            this.i = gf3VarA;
            Uri uri = gf3VarA.a;
            byte[] bArr = cache.a(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.h = uri;
            this.m = j2;
            boolean z = (this.f && this.p) || (this.g && j3 == -1);
            this.q = z;
            if (z) {
                this.n = -1L;
                j = -1;
            } else {
                j = -1;
                long jA = at2.a(cache.a(string));
                this.n = jA;
                if (jA != -1) {
                    long j4 = jA - j2;
                    this.n = j4;
                    if (j4 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j3 != j) {
                long j5 = this.n;
                this.n = j5 == j ? j3 : Math.min(j5, j3);
            }
            long j6 = this.n;
            if (j6 > 0 || j6 == j) {
                p(gf3VarA, false);
            }
            return j3 != j ? j3 : this.n;
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof Cache.CacheException)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.i = null;
        this.h = null;
        this.m = 0L;
        try {
            o();
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof Cache.CacheException)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        return !(this.k == this.b) ? this.d.e() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        this.b.i(grfVar);
        this.d.i(grfVar);
    }

    public final void o() {
        Cache cache = this.a;
        androidx.media3.datasource.a aVar = this.k;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.j = null;
            this.k = null;
            au1 au1Var = this.o;
            if (au1Var != null) {
                cache.b(au1Var);
                this.o = null;
            }
        }
    }

    public final void p(gf3 gf3Var, boolean z) throws InterruptedIOException {
        mfe mfeVarE;
        nbf nbfVar;
        String str;
        long j;
        gf3 gf3VarA;
        androidx.media3.datasource.a aVar;
        String str2 = gf3Var.h;
        String str3 = vjg.a;
        boolean z2 = this.q;
        Cache cache = this.a;
        if (z2) {
            mfeVarE = null;
        } else {
            long j2 = this.m;
            if (this.e) {
                try {
                    mfeVarE = cache.e(j2, str2, this.n);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                mfeVarE = cache.c(j2, str2, this.n);
            }
        }
        nbf nbfVar2 = this.c;
        androidx.media3.datasource.a aVar2 = this.b;
        androidx.media3.datasource.a aVar3 = this.d;
        if (mfeVarE == null) {
            gf3.a aVarA = gf3Var.a();
            aVarA.f = this.m;
            aVarA.g = this.n;
            gf3VarA = aVarA.a();
            nbfVar = nbfVar2;
            str = str2;
            aVar = aVar3;
            j = -1;
        } else {
            long jMin = mfeVarE.c;
            if (mfeVarE.d) {
                Uri uriFromFile = Uri.fromFile(mfeVarE.e);
                long j3 = mfeVarE.b;
                j = -1;
                long j4 = this.m - j3;
                long jMin2 = jMin - j4;
                nbfVar = nbfVar2;
                str = str2;
                long j5 = this.n;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                gf3.a aVarA2 = gf3Var.a();
                aVarA2.a = uriFromFile;
                aVarA2.b = j3;
                aVarA2.f = j4;
                aVarA2.g = jMin2;
                gf3VarA = aVarA2.a();
                aVar = aVar2;
            } else {
                nbfVar = nbfVar2;
                str = str2;
                j = -1;
                long j6 = this.n;
                if (jMin == -1) {
                    jMin = j6;
                } else if (j6 != -1) {
                    jMin = Math.min(jMin, j6);
                }
                gf3.a aVarA3 = gf3Var.a();
                aVarA3.f = this.m;
                aVarA3.g = jMin;
                gf3VarA = aVarA3.a();
                if (nbfVar != null) {
                    aVar = nbfVar;
                } else {
                    cache.b(mfeVarE);
                    aVar = aVar3;
                    mfeVarE = null;
                }
            }
        }
        this.r = (this.q || aVar != aVar3) ? Long.MAX_VALUE : this.m + 102400;
        if (z) {
            ka2.q(this.k == aVar3);
            if (aVar == aVar3) {
                return;
            }
            try {
                o();
            } catch (Throwable th) {
                if (!mfeVarE.d) {
                    cache.b(mfeVarE);
                }
                throw th;
            }
        }
        if (mfeVarE != null && !mfeVarE.d) {
            this.o = mfeVarE;
        }
        this.k = aVar;
        this.j = gf3VarA;
        this.l = 0L;
        long jB = aVar.b(gf3VarA);
        bt2 bt2Var = new bt2();
        if (gf3VarA.g == j && jB != j) {
            this.n = jB;
            bt2Var.a(Long.valueOf(this.m + jB), "exo_len");
        }
        if (!(this.k == aVar2)) {
            Uri uriA = aVar.a();
            this.h = uriA;
            Uri uri = !gf3Var.a.equals(uriA) ? this.h : null;
            if (uri == null) {
                bt2Var.b.add("exo_redir");
                bt2Var.a.remove("exo_redir");
            } else {
                bt2Var.a(uri.toString(), "exo_redir");
            }
        }
        if (this.k == nbfVar) {
            cache.f(str, bt2Var);
        }
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        androidx.media3.datasource.a aVar = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        gf3 gf3Var = this.i;
        gf3Var.getClass();
        gf3 gf3Var2 = this.j;
        gf3Var2.getClass();
        try {
            if (this.m >= this.r) {
                p(gf3Var, true);
            }
            androidx.media3.datasource.a aVar2 = this.k;
            aVar2.getClass();
            int i4 = aVar2.read(bArr, i, i2);
            androidx.media3.datasource.a aVar3 = this.k;
            if (i4 != -1) {
                long j2 = i4;
                this.m += j2;
                this.l += j2;
                long j3 = this.n;
                if (j3 == -1) {
                    return i4;
                }
                this.n = j3 - j2;
                return i4;
            }
            if (!(aVar3 == aVar)) {
                j = -1;
                long j4 = gf3Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.l < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = gf3Var.h;
                String str2 = vjg.a;
                this.n = 0L;
                if (!(aVar3 == this.c)) {
                    return i3;
                }
                bt2 bt2Var = new bt2();
                bt2Var.a(Long.valueOf(this.m), "exo_len");
                this.a.f(str, bt2Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.n;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            o();
            p(gf3Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.k == aVar || (th instanceof Cache.CacheException)) {
                this.p = true;
            }
            throw th;
        }
    }
}
