package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.datasource.a;
import defpackage.a91;
import defpackage.abe;
import defpackage.bo3;
import defpackage.co3;
import defpackage.gf3;
import defpackage.jc9;
import defpackage.kt1;
import defpackage.nm6;
import defpackage.ryc;
import defpackage.s92;
import defpackage.vjg;
import defpackage.zkd;
import defpackage.zp5;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a91 {
    public final int e;
    public final int f;
    public final kt1 g;
    public final kt1 h;
    public gf3 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    public static final class a implements a.InterfaceC0038a {
        public final kt1 a = new kt1(2);
        public final int b = 8000;
        public final int c = 8000;

        @Override // androidx.media3.datasource.a.InterfaceC0038a
        public final androidx.media3.datasource.a a() {
            return new d(this.b, this.c, this.a);
        }
    }

    public static class b extends zp5<String, List<String>> {
        public final Map<String, List<String>> b;

        public b(Map<String, List<String>> map) {
            super(2);
            this.b = map;
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && this.b.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = ((s92) entrySet()).iterator();
            it.getClass();
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.zp5, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return abe.b(super.entrySet(), new bo3());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && jc9.b(obj, this);
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return this.b.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return abe.c(entrySet());
        }

        @Override // defpackage.zp5, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && this.b.containsKey(null));
        }

        @Override // defpackage.zp5, java.util.Map
        public final Set<String> keySet() {
            return abe.b(super.keySet(), new co3());
        }

        @Override // defpackage.zp5, java.util.Map
        public final int size() {
            return super.size() - (this.b.containsKey(null) ? 1 : 0);
        }

        @Override // defpackage.h91
        public final Object t() {
            return this.b;
        }
    }

    public d(int i, int i2, kt1 kt1Var) {
        super(true);
        this.e = i;
        this.f = i2;
        this.g = kt1Var;
        this.h = new kt1(2);
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        gf3 gf3Var = this.i;
        if (gf3Var != null) {
            return gf3Var.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @Override // androidx.media3.datasource.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.gf3 r29) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.d.b(gf3):long");
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    gf3 gf3Var = this.i;
                    String str = vjg.a;
                    throw new HttpDataSource$HttpDataSourceException(e, gf3Var, 2000, 3);
                }
            }
        } finally {
            this.k = null;
            s();
            if (this.l) {
                this.l = false;
                p();
            }
            this.j = null;
            this.i = null;
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? ryc.V : new b(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.te3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r6.n     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.o     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.k     // Catch: java.io.IOException -> L32
            java.lang.String r1 = defpackage.vjg.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.o     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.o = r8     // Catch: java.io.IOException -> L32
            r6.o(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            gf3 r6 = r6.i
            java.lang.String r8 = defpackage.vjg.a
            r8 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r6 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r7, r6, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.d.read(byte[], int, int):int");
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zkd.x("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection t(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        kt1 kt1Var = this.g;
        if (kt1Var != null) {
            map2.putAll(kt1Var.b());
        }
        map2.putAll(this.h.b());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = nm6.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(gf3.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void u(long j, gf3 gf3Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.k;
            String str = vjg.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gf3Var, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(gf3Var, 2008);
            }
            j -= (long) i;
            o(i);
        }
    }
}
