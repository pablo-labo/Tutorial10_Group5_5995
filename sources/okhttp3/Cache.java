package okhttp3;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.c0h;
import defpackage.eq5;
import defpackage.fie;
import defpackage.fq5;
import defpackage.is4;
import defpackage.j6g;
import defpackage.pne;
import defpackage.r40;
import defpackage.to1;
import defpackage.tqc;
import defpackage.uqc;
import defpackage.vr1;
import defpackage.wl7;
import defpackage.ypd;
import defpackage.zn1;
import defpackage.zr4;
import defpackage.zve;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import zn1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cache implements Closeable, Flushable {
    public static final Companion b = new Companion(0);
    public final DiskLruCache a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CacheResponseBody extends ResponseBody {
        public final DiskLruCache.Snapshot c;
        public final String d;
        public final String e;
        public final uqc f;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.c = snapshot;
            this.d = str;
            this.e = str2;
            this.f = new uqc(new fq5((pne) snapshot.c.get(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // defpackage.fq5, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    this.c.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: K1 */
        public final to1 getE() {
            return this.f;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: p */
        public final long getD() {
            String str = this.e;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = Util.a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: s */
        public final MediaType getC() {
            String str = this.d;
            if (str != null) {
                MediaType.e.getClass();
                try {
                    return MediaType.Companion.a(str);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RealCacheRequest implements CacheRequest {
        public final DiskLruCache.Editor a;
        public final fie b;
        public final AnonymousClass1 c;
        public boolean d;

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.Cache$RealCacheRequest$1] */
        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.a = editor;
            fie fieVarD = editor.d(1);
            this.b = fieVarD;
            this.c = new eq5(fieVarD) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // defpackage.eq5, defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (realCacheRequest.d) {
                            return;
                        }
                        realCacheRequest.d = true;
                        super.close();
                        this.a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void a() {
            synchronized (Cache.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                Util.c(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AnonymousClass1 getC() {
            return this.c;
        }
    }

    public Cache(File file, long j) {
        FileSystem fileSystem = FileSystem.a;
        fileSystem.getClass();
        this.a = new DiskLruCache(fileSystem, file, j, TaskRunner.i);
    }

    public static void p(Response response, Response response2) throws Throwable {
        DiskLruCache.Editor editorP;
        response.getClass();
        Entry entry = new Entry(response2);
        ResponseBody responseBody = response.V;
        responseBody.getClass();
        DiskLruCache.Snapshot snapshot = ((CacheResponseBody) responseBody).c;
        try {
            editorP = snapshot.d.p(snapshot.b, snapshot.a);
            if (editorP == null) {
                return;
            }
            try {
                entry.c(editorP);
                editorP.b();
            } catch (IOException unused) {
                if (editorP != null) {
                    try {
                        editorP.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            editorP = null;
        }
    }

    public final Response a(Request request) {
        request.getClass();
        HttpUrl httpUrl = request.a;
        b.getClass();
        try {
            DiskLruCache.Snapshot snapshotS = this.a.s(Companion.a(httpUrl));
            if (snapshotS != null) {
                try {
                    Entry entry = new Entry((pne) snapshotS.c.get(0));
                    Headers headers = entry.b;
                    String str = entry.c;
                    HttpUrl httpUrl2 = entry.a;
                    Headers headers2 = entry.g;
                    String strA = headers2.a(TracingInterceptor.HEADER_CT);
                    String strA2 = headers2.a("Content-Length");
                    Request.Builder builder = new Request.Builder();
                    httpUrl2.getClass();
                    builder.a = httpUrl2;
                    builder.e(str, null);
                    headers.getClass();
                    builder.c = headers.d();
                    Request requestB = builder.b();
                    Response.Builder builder2 = new Response.Builder();
                    builder2.a = requestB;
                    Protocol protocol = entry.d;
                    protocol.getClass();
                    builder2.b = protocol;
                    builder2.c = entry.e;
                    String str2 = entry.f;
                    str2.getClass();
                    builder2.d = str2;
                    builder2.f = headers2.d();
                    builder2.g = new CacheResponseBody(snapshotS, strA, strA2);
                    builder2.e = entry.h;
                    builder2.k = entry.i;
                    builder2.l = entry.j;
                    Response responseA = builder2.a();
                    if (httpUrl2.equals(httpUrl) && str.equals(request.b)) {
                        Set<String> setC = Companion.c(responseA.f);
                        if (!(setC instanceof Collection) || !setC.isEmpty()) {
                            for (String str3 : setC) {
                                if (!headers.i(str3).equals(request.c.i(str3))) {
                                }
                            }
                        }
                        return responseA;
                    }
                    ResponseBody responseBody = responseA.V;
                    if (responseBody != null) {
                        Util.c(responseBody);
                        return null;
                    }
                } catch (IOException unused) {
                    Util.c(snapshotS);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    public final CacheRequest h(Response response) throws Throwable {
        DiskLruCache.Editor editorP;
        Request request = response.a;
        String str = request.b;
        HttpMethod.a.getClass();
        if (!HttpMethod.a(str)) {
            if (str.equals("GET")) {
                b.getClass();
                if (!Companion.c(response.f).contains("*")) {
                    Entry entry = new Entry(response);
                    try {
                        editorP = this.a.p(DiskLruCache.n0, Companion.a(request.a));
                        if (editorP != null) {
                            try {
                                entry.c(editorP);
                                return new RealCacheRequest(editorP);
                            } catch (IOException unused) {
                                if (editorP != null) {
                                    editorP.a();
                                }
                                return null;
                            }
                        }
                    } catch (IOException unused2) {
                        editorP = null;
                    }
                }
            }
            return null;
        }
        DiskLruCache diskLruCache = this.a;
        Companion companion = b;
        HttpUrl httpUrl = request.a;
        companion.getClass();
        String strA = Companion.a(httpUrl);
        synchronized (diskLruCache) {
            strA.getClass();
            diskLruCache.v();
            diskLruCache.a();
            DiskLruCache.f0(strA);
            DiskLruCache.Entry entry2 = diskLruCache.X.get(strA);
            if (entry2 == null) {
                return null;
            }
            diskLruCache.b0(entry2);
            if (diskLruCache.V <= diskLruCache.c) {
                diskLruCache.d0 = false;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Entry {
        public static final String k;
        public static final String l;
        public final HttpUrl a;
        public final Headers b;
        public final String c;
        public final Protocol d;
        public final int e;
        public final String f;
        public final Headers g;
        public final Handshake h;
        public final long i;
        public final long j;

        static {
            new Companion(0);
            Platform.a.getClass();
            Platform.b.getClass();
            k = "OkHttp-Sent-Millis";
            Platform.b.getClass();
            l = "OkHttp-Received-Millis";
        }

        public Entry(pne pneVar) throws IOException {
            HttpUrl httpUrlC;
            TlsVersion tlsVersionA;
            pneVar.getClass();
            try {
                uqc uqcVar = new uqc(pneVar);
                String strS = uqcVar.S(Long.MAX_VALUE);
                HttpUrl.k.getClass();
                try {
                    httpUrlC = HttpUrl.Companion.c(strS);
                } catch (IllegalArgumentException unused) {
                    httpUrlC = null;
                }
                if (httpUrlC == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strS));
                    Platform.a.getClass();
                    Platform.b.getClass();
                    Platform.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.a = httpUrlC;
                this.c = uqcVar.S(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                Cache.b.getClass();
                int iB = Companion.b(uqcVar);
                for (int i = 0; i < iB; i++) {
                    builder.b(uqcVar.S(Long.MAX_VALUE));
                }
                this.b = builder.e();
                StatusLine.Companion companion = StatusLine.d;
                String strS2 = uqcVar.S(Long.MAX_VALUE);
                companion.getClass();
                StatusLine statusLineA = StatusLine.Companion.a(strS2);
                this.d = statusLineA.a;
                this.e = statusLineA.b;
                this.f = statusLineA.c;
                Headers.Builder builder2 = new Headers.Builder();
                Cache.b.getClass();
                int iB2 = Companion.b(uqcVar);
                for (int i2 = 0; i2 < iB2; i2++) {
                    builder2.b(uqcVar.S(Long.MAX_VALUE));
                }
                String str = k;
                String strF = builder2.f(str);
                String str2 = l;
                String strF2 = builder2.f(str2);
                builder2.g(str);
                builder2.g(str2);
                this.i = strF != null ? Long.parseLong(strF) : 0L;
                this.j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.g = builder2.e();
                if (wl7.b(this.a.a, "https")) {
                    String strS3 = uqcVar.S(Long.MAX_VALUE);
                    if (strS3.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strS3 + '\"');
                    }
                    CipherSuite cipherSuiteB = CipherSuite.b.b(uqcVar.S(Long.MAX_VALUE));
                    List listA = a(uqcVar);
                    List listA2 = a(uqcVar);
                    if (uqcVar.W0()) {
                        tlsVersionA = TlsVersion.SSL_3_0;
                    } else {
                        TlsVersion.Companion companion2 = TlsVersion.a;
                        String strS4 = uqcVar.S(Long.MAX_VALUE);
                        companion2.getClass();
                        tlsVersionA = TlsVersion.Companion.a(strS4);
                    }
                    Handshake.e.getClass();
                    this.h = new Handshake(tlsVersionA, cipherSuiteB, Util.x(listA2), new Handshake$Companion$get$1(Util.x(listA)));
                } else {
                    this.h = null;
                }
                j6g j6gVar = j6g.a;
                pneVar.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0h.q(pneVar, th);
                    throw th2;
                }
            }
        }

        public static List a(uqc uqcVar) throws IOException {
            Cache.b.getClass();
            int iB = Companion.b(uqcVar);
            if (iB == -1) {
                return zr4.a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i = 0; i < iB; i++) {
                    String strS = uqcVar.S(Long.MAX_VALUE);
                    zn1 zn1Var = new zn1();
                    vr1 vr1Var = vr1.c;
                    vr1 vr1VarA = vr1.a.a(strS);
                    if (vr1VarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    zn1Var.o0(vr1VarA);
                    arrayList.add(certificateFactory.generateCertificate(zn1Var.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
                r40.h(e.getMessage());
                return null;
            }
        }

        public static void b(tqc tqcVar, List list) throws IOException {
            try {
                tqcVar.z0(list.size());
                tqcVar.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    vr1 vr1Var = vr1.c;
                    encoded.getClass();
                    tqcVar.Y(vr1.a.d(encoded).a());
                    tqcVar.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                r40.h(e.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) throws Throwable {
            HttpUrl httpUrl = this.a;
            Handshake handshake = this.h;
            Headers headers = this.g;
            Headers headers2 = this.b;
            tqc tqcVar = new tqc(editor.d(0));
            try {
                tqcVar.Y(httpUrl.i);
                tqcVar.writeByte(10);
                tqcVar.Y(this.c);
                tqcVar.writeByte(10);
                tqcVar.z0(headers2.size());
                tqcVar.writeByte(10);
                int size = headers2.size();
                for (int i = 0; i < size; i++) {
                    tqcVar.Y(headers2.b(i));
                    tqcVar.Y(": ");
                    tqcVar.Y(headers2.g(i));
                    tqcVar.writeByte(10);
                }
                tqcVar.Y(new StatusLine(this.d, this.e, this.f).toString());
                tqcVar.writeByte(10);
                tqcVar.z0(headers.size() + 2);
                tqcVar.writeByte(10);
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    tqcVar.Y(headers.b(i2));
                    tqcVar.Y(": ");
                    tqcVar.Y(headers.g(i2));
                    tqcVar.writeByte(10);
                }
                tqcVar.Y(k);
                tqcVar.Y(": ");
                tqcVar.z0(this.i);
                tqcVar.writeByte(10);
                tqcVar.Y(l);
                tqcVar.Y(": ");
                tqcVar.z0(this.j);
                tqcVar.writeByte(10);
                if (wl7.b(httpUrl.a, "https")) {
                    tqcVar.writeByte(10);
                    handshake.getClass();
                    tqcVar.Y(handshake.b.a);
                    tqcVar.writeByte(10);
                    b(tqcVar, handshake.a());
                    b(tqcVar, handshake.c);
                    tqcVar.Y(handshake.a.getJavaName());
                    tqcVar.writeByte(10);
                }
                j6g j6gVar = j6g.a;
                tqcVar.close();
            } finally {
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        public Entry(Response response) {
            Headers headersE;
            Request request = response.a;
            this.a = request.a;
            Cache.b.getClass();
            Response response2 = response.W;
            response2.getClass();
            Headers headers = response2.a.c;
            Headers headers2 = response.f;
            Set setC = Companion.c(headers2);
            if (setC.isEmpty()) {
                headersE = Util.b;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strB = headers.b(i);
                    if (setC.contains(strB)) {
                        builder.a(strB, headers.g(i));
                    }
                }
                headersE = builder.e();
            }
            this.b = headersE;
            this.c = request.b;
            this.d = response.b;
            this.e = response.d;
            this.f = response.c;
            this.g = headers2;
            this.h = response.e;
            this.i = response.Z;
            this.j = response.a0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static String a(HttpUrl httpUrl) {
            httpUrl.getClass();
            vr1 vr1Var = vr1.c;
            return vr1.a.c(httpUrl.i).e("MD5").m();
        }

        public static int b(uqc uqcVar) throws IOException {
            byte bP;
            try {
                zn1 zn1Var = uqcVar.b;
                uqcVar.x0(1L);
                long j = 0;
                while (true) {
                    long j2 = j + 1;
                    if (!uqcVar.request(j2)) {
                        break;
                    }
                    bP = zn1Var.P(j);
                    if ((bP < 48 || bP > 57) && (j != 0 || bP != 45)) {
                        break;
                    }
                    j = j2;
                }
                if (j == 0) {
                    ypd.s(16);
                    String string = Integer.toString(bP, 16);
                    string.getClass();
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long jF0 = zn1Var.f0();
                String strS = uqcVar.S(Long.MAX_VALUE);
                if (jF0 >= 0 && jF0 <= 2147483647L && strS.length() <= 0) {
                    return (int) jF0;
                }
                throw new IOException("expected an int but was \"" + jF0 + strS + '\"');
            } catch (NumberFormatException e) {
                r40.h(e.getMessage());
                return 0;
            }
        }

        public static Set c(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(headers.b(i))) {
                    String strG = headers.g(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        comparator.getClass();
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = zve.j0(strG, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(zve.s0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? is4.a : treeSet;
        }

        private Companion() {
        }
    }
}
