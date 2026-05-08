package okhttp3;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.l5;
import defpackage.q6;
import defpackage.r6;
import defpackage.ro1;
import defpackage.t40;
import defpackage.v40;
import defpackage.vr1;
import defpackage.zn1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "Part", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartBody extends RequestBody {
    public static final Companion e = new Companion(0);
    public static final MediaType f;
    public static final MediaType g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final vr1 a;
    public final List<Part> b;
    public final MediaType c;
    public long d;

    static {
        MediaType.e.getClass();
        f = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        g = MediaType.Companion.a("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public MultipartBody(vr1 vr1Var, MediaType mediaType, List<Part> list) {
        vr1Var.getClass();
        mediaType.getClass();
        this.a = vr1Var;
        this.b = list;
        MediaType.Companion companion = MediaType.e;
        String str = mediaType + "; boundary=" + vr1Var.A();
        companion.getClass();
        this.c = MediaType.Companion.a(str);
        this.d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ro1 ro1Var, boolean z) throws EOFException {
        zn1 zn1Var;
        ro1 zn1Var2;
        if (z) {
            zn1Var2 = new zn1();
            zn1Var = zn1Var2;
        } else {
            zn1Var = 0;
            zn1Var2 = ro1Var;
        }
        List<Part> list = this.b;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            vr1 vr1Var = this.a;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                zn1Var2.getClass();
                zn1Var2.write(bArr);
                zn1Var2.v0(vr1Var);
                zn1Var2.write(bArr);
                zn1Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                zn1Var.getClass();
                long j3 = j2 + zn1Var.b;
                zn1Var.h();
                return j3;
            }
            Part part = list.get(i2);
            Headers headers = part.a;
            RequestBody requestBody = part.b;
            zn1Var2.getClass();
            zn1Var2.write(bArr);
            zn1Var2.v0(vr1Var);
            zn1Var2.write(bArr2);
            int size2 = headers.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zn1Var2.Y(headers.b(i3)).write(h).Y(headers.g(i3)).write(bArr2);
            }
            MediaType c = requestBody.getA();
            if (c != null) {
                zn1Var2.Y("Content-Type: ").Y(c.a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                zn1Var2.Y("Content-Length: ").z0(jContentLength).write(bArr2);
            } else if (z) {
                zn1Var.getClass();
                zn1Var.h();
                return -1L;
            }
            zn1Var2.write(bArr2);
            if (z) {
                j2 += jContentLength;
            } else {
                requestBody.writeTo(zn1Var2);
            }
            zn1Var2.write(bArr2);
            i2++;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j2 = this.d;
        if (j2 != -1) {
            return j2;
        }
        long jA = a(null, true);
        this.d = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getA() {
        return this.c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) throws EOFException {
        ro1Var.getClass();
        a(ro1Var, false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part {
        public static final Companion c = new Companion(0);
        public final Headers a;
        public final RequestBody b;

        public Part(Headers headers, RequestBody requestBody) {
            this.a = headers;
            this.b = requestBody;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            public static Part a(Headers headers, RequestBody requestBody) {
                requestBody.getClass();
                if (headers.a(TracingInterceptor.HEADER_CT) != null) {
                    l5.q("Unexpected header: Content-Type");
                    return null;
                }
                if (headers.a("Content-Length") == null) {
                    return new Part(headers, requestBody);
                }
                l5.q("Unexpected header: Content-Length");
                return null;
            }

            public static Part b(String str, String str2, RequestBody requestBody) {
                StringBuilder sbG = q6.g("form-data; name=");
                MultipartBody.e.getClass();
                Companion.a(sbG, str);
                if (str2 != null) {
                    sbG.append("; filename=");
                    Companion.a(sbG, str2);
                }
                String string = sbG.toString();
                Headers.Builder builder = new Headers.Builder();
                builder.d("Content-Disposition", string);
                return a(builder.e(), requestBody);
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static void a(StringBuilder sb, String str) {
            str.getClass();
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final vr1 a;
        public MediaType b;
        public final ArrayList c;

        public Builder(int i) {
            String strH = t40.h();
            vr1 vr1Var = vr1.c;
            this.a = vr1.a.c(strH);
            this.b = MultipartBody.f;
            this.c = new ArrayList();
        }

        public final MultipartBody a() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                r6.g("Multipart body must have at least one part.");
                return null;
            }
            return new MultipartBody(this.a, this.b, Util.x(arrayList));
        }

        public final void b(MediaType mediaType) {
            mediaType.getClass();
            if (mediaType.b.equals("multipart")) {
                this.b = mediaType;
            } else {
                v40.n(mediaType, "multipart != ");
            }
        }

        public Builder() {
            this(0);
        }
    }
}
