package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class s3d {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    public static class a extends RequestBody {
        public final RequestBody a;
        public final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getC() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(ro1 ro1Var) {
            this.a.writeTo(ro1Var);
        }
    }

    public s3d(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.d();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            builder.b(MultipartBody.g);
        }
    }

    public final void a(String str, String str2, boolean z) {
        FormBody.Builder builder = this.j;
        if (z) {
            builder.getClass();
            str.getClass();
            ArrayList arrayList = builder.a;
            HttpUrl.Companion companion = HttpUrl.k;
            arrayList.add(HttpUrl.Companion.a(companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            builder.b.add(HttpUrl.Companion.a(companion, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            return;
        }
        builder.getClass();
        str.getClass();
        ArrayList arrayList2 = builder.a;
        HttpUrl.Companion companion2 = HttpUrl.k;
        arrayList2.add(HttpUrl.Companion.a(companion2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
        builder.b.add(HttpUrl.Companion.a(companion2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
    }

    public final void b(String str, String str2) {
        if (!TracingInterceptor.HEADER_CT.equalsIgnoreCase(str)) {
            this.f.a(str, str2);
            return;
        }
        try {
            MediaType.e.getClass();
            this.g = MediaType.Companion.a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(l5.l("Malformed content type: ", str2), e);
        }
    }

    public final void c(String str, String str2, boolean z) throws EOFException {
        HttpUrl.Builder builder;
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.d(httpUrl, str3);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            this.d = builder;
            if (builder == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                String str4 = this.c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        HttpUrl.Builder builder2 = this.d;
        if (!z) {
            builder2.a(str, str2);
            return;
        }
        builder2.getClass();
        str.getClass();
        if (builder2.g == null) {
            builder2.g = new ArrayList();
        }
        ArrayList arrayList = builder2.g;
        arrayList.getClass();
        HttpUrl.Companion companion = HttpUrl.k;
        arrayList.add(HttpUrl.Companion.a(companion, str, 0, 0, " \"'<>#&=", 211));
        ArrayList arrayList2 = builder2.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? HttpUrl.Companion.a(companion, str2, 0, 0, " \"'<>#&=", 211) : null);
    }
}
