package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public final class gpa extends a91 {
    public final OkHttpClient e;
    public final kt1 f;
    public final String g;
    public final kt1 h;
    public gf3 i;
    public Response j;
    public InputStream k;
    public boolean l;
    public long m;
    public long n;

    public static final class a implements a.InterfaceC0038a {
        public final kt1 a = new kt1(2);
        public final OkHttpClient b;
        public String c;

        public a(OkHttpClient okHttpClient) {
            this.b = okHttpClient;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0038a
        public final androidx.media3.datasource.a a() {
            return new gpa(this.b, this.c, this.a);
        }
    }

    static {
        jj9.a("media3.datasource.okhttp");
    }

    public gpa(OkHttpClient okHttpClient, String str, kt1 kt1Var) {
        super(true);
        this.e = okHttpClient;
        this.g = str;
        this.h = kt1Var;
        this.f = new kt1(2);
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        Response response = this.j;
        if (response != null) {
            return Uri.parse(response.a.a.i);
        }
        gf3 gf3Var = this.i;
        if (gf3Var != null) {
            return gf3Var.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws HttpDataSource$HttpDataSourceException, EOFException {
        HttpUrl httpUrlC;
        byte[] bArrB;
        this.i = gf3Var;
        this.n = 0L;
        this.m = 0L;
        q(gf3Var);
        long j = gf3Var.f;
        int i = gf3Var.c;
        long j2 = gf3Var.g;
        String string = gf3Var.a.toString();
        HttpUrl.k.getClass();
        string.getClass();
        try {
            httpUrlC = HttpUrl.Companion.c(string);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        if (httpUrlC == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", gf3Var, 1004);
        }
        Request.Builder builder = new Request.Builder();
        builder.a = httpUrlC;
        HashMap map = new HashMap();
        kt1 kt1Var = this.h;
        if (kt1Var != null) {
            map.putAll(kt1Var.b());
        }
        map.putAll(this.f.b());
        map.putAll(gf3Var.e);
        for (Map.Entry entry : map.entrySet()) {
            builder.d((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = nm6.a(j, j2);
        if (strA != null) {
            builder.a("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            builder.a(DataOkHttpUploader.HEADER_USER_AGENT, str);
        }
        if ((gf3Var.i & 1) != 1) {
            builder.a("Accept-Encoding", "identity");
        }
        byte[] bArr = gf3Var.d;
        builder.e(gf3.b(i), bArr != null ? RequestBody.create(bArr) : i == 2 ? RequestBody.create(vjg.b) : null);
        Request requestB = builder.b();
        OkHttpClient okHttpClient = this.e;
        okHttpClient.getClass();
        RealCall realCall = new RealCall(okHttpClient, requestB, false);
        try {
            ebe ebeVar = new ebe();
            realCall.R0(new fz1(ebeVar));
            try {
                Response response = (Response) ebeVar.get();
                this.j = response;
                ResponseBody responseBody = response.V;
                responseBody.getClass();
                this.k = responseBody.a();
                int i2 = response.d;
                if (response.h()) {
                    responseBody.getC();
                    long j3 = (i2 != 200 || j == 0) ? 0L : j;
                    if (j2 != -1) {
                        this.m = j2;
                    } else {
                        long d = responseBody.getD();
                        this.m = d != -1 ? d - j3 : -1L;
                    }
                    this.l = true;
                    r(gf3Var);
                    try {
                        t(j3, gf3Var);
                        return this.m;
                    } catch (HttpDataSource$HttpDataSourceException e) {
                        s();
                        throw e;
                    }
                }
                if (i2 == 416 && j == nm6.b(response.f.a("Content-Range"))) {
                    this.l = true;
                    r(gf3Var);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                try {
                    InputStream inputStream = this.k;
                    inputStream.getClass();
                    bArrB = rr1.b(inputStream);
                } catch (IOException unused2) {
                    bArrB = vjg.b;
                }
                byte[] bArr2 = bArrB;
                TreeMap treeMapF = response.f.f();
                s();
                throw new HttpDataSource$InvalidResponseCodeException(i2, response.c, i2 == 416 ? new DataSourceException(2008) : null, treeMapF, gf3Var, bArr2);
            } catch (InterruptedException unused3) {
                realCall.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw HttpDataSource$HttpDataSourceException.a(e3, gf3Var, 1);
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.l) {
            this.l = false;
            p();
            s();
        }
        this.j = null;
        this.i = null;
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        Response response = this.j;
        return response == null ? Collections.EMPTY_MAP : response.f.f();
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
            long r0 = r6.m     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.n     // Catch: java.io.IOException -> L32
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
            long r8 = r6.n     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.n = r8     // Catch: java.io.IOException -> L32
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpa.read(byte[], int, int):int");
    }

    public final void s() {
        Response response = this.j;
        if (response != null) {
            ResponseBody responseBody = response.V;
            responseBody.getClass();
            responseBody.close();
        }
        this.k = null;
    }

    public final void t(long j, gf3 gf3Var) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096L);
                InputStream inputStream = this.k;
                String str = vjg.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource$HttpDataSourceException(gf3Var, 2008);
                }
                j -= (long) i;
                o(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(gf3Var, 2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }
}
