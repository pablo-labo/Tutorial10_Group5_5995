package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.X509TrustManager;
import okhttp3.CookieJar;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes3.dex */
public final class kpa implements rfa {
    public static final String i = String.format("snowplow/%s android/%s", Arrays.copyOf(new Object[]{"andr-6.2.0", Build.VERSION.RELEASE}, 2));
    public final String a = kpa.class.getSimpleName();
    public final MediaType b;
    public final rl6 c;
    public final int d;
    public boolean e;
    public final Map<String, String> f;
    public final OkHttpClient g;
    public final Uri.Builder h;

    public static final class a {
        public final String a;
        public final Context b;
        public rl6 c;
        public EnumSet<o5f> d;
        public int e;
        public OkHttpClient f;
        public CookieJar g;
        public String h;
        public boolean i;
        public Map<String, String> j;

        public a(String str, Context context) {
            str.getClass();
            context.getClass();
            this.a = str;
            this.b = context;
            EnumSet<o5f> enumSet = kq4.a;
            this.c = rl6.b;
            this.d = kq4.a;
            this.e = kq4.g;
            this.i = false;
        }
    }

    public kpa(a aVar) {
        MediaType mediaTypeA;
        String scheme;
        int iHashCode;
        MediaType.e.getClass();
        try {
            mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        this.b = mediaTypeA;
        String strL = aVar.a;
        Uri uri = Uri.parse(strL);
        if (uri.getScheme() == null || (scheme = uri.getScheme()) == null || ((iHashCode = scheme.hashCode()) == 3213448 ? !scheme.equals("http") : !(iHashCode == 99617003 && scheme.equals("https")))) {
            strL = l5.l("https://", strL);
        }
        rl6 rl6Var = aVar.c;
        this.c = rl6Var;
        this.d = aVar.e;
        String str = aVar.h;
        this.e = aVar.i;
        this.f = aVar.j;
        m5f m5fVar = new m5f(aVar.d);
        Uri.Builder builderBuildUpon = Uri.parse(strL).buildUpon();
        builderBuildUpon.getClass();
        this.h = builderBuildUpon;
        if (rl6Var == rl6.a) {
            builderBuildUpon.appendPath("i");
        } else if (str == null) {
            builderBuildUpon.appendEncodedPath("com.snowplowanalytics.snowplow/tp2");
        } else {
            builderBuildUpon.appendEncodedPath(str);
        }
        OkHttpClient okHttpClient = aVar.f;
        if (okHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            n5f n5fVar = m5fVar.c;
            if (n5fVar == null) {
                wl7.g("sslSocketFactory");
                throw null;
            }
            X509TrustManager x509TrustManager = m5fVar.b;
            if (x509TrustManager == null) {
                wl7.g("trustManager");
                throw null;
            }
            if (n5fVar != builder.q || !x509TrustManager.equals(builder.r)) {
                builder.C = null;
            }
            builder.q = n5fVar;
            CertificateChainCleaner.a.getClass();
            Platform.a.getClass();
            builder.w = Platform.b.b(x509TrustManager);
            builder.r = x509TrustManager;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.c(15L, timeUnit);
            builder.z = Util.b(15L, timeUnit);
            CookieJar cookieJar = aVar.g;
            builder.j = cookieJar == null ? new ca2(aVar.b) : cookieJar;
            okHttpClient = new OkHttpClient(builder);
        }
        this.g = okHttpClient;
    }

    @Override // defpackage.rfa
    public final Uri a() {
        Uri uriBuild = this.h.clearQuery().build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.rfa
    public final ArrayList b(ArrayList arrayList) {
        Integer num;
        Request requestB;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o3d o3dVar = (o3d) it.next();
            String str = o3dVar.d;
            y6b y6bVar = o3dVar.a;
            if (str == null) {
                str = i;
            }
            Map<String, String> map = this.f;
            rl6 rl6Var = this.c;
            rl6 rl6Var2 = rl6.a;
            Uri.Builder builder = this.h;
            if (rl6Var == rl6Var2) {
                builder.clearQuery();
                HashMap mapA = y6bVar.a();
                for (String str2 : mapA.keySet()) {
                    Object obj = mapA.get(str2);
                    builder.appendQueryParameter(str2, obj instanceof String ? (String) obj : null);
                }
                String string = builder.build().toString();
                string.getClass();
                Request.Builder builder2 = new Request.Builder();
                builder2.g(string);
                builder2.d(DataOkHttpUploader.HEADER_USER_AGENT, str);
                builder2.e("GET", null);
                if (this.e) {
                    builder2.d("SP-Anonymous", "*");
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        builder2.d(entry.getKey(), entry.getValue());
                    }
                }
                requestB = builder2.b();
            } else {
                String string2 = builder.build().toString();
                string2.getClass();
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String string3 = y6bVar.toString();
                companion.getClass();
                RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(string3, this.b);
                Request.Builder builder3 = new Request.Builder();
                builder3.g(string2);
                builder3.d(DataOkHttpUploader.HEADER_USER_AGENT, str);
                builder3.e("POST", requestBody$Companion$toRequestBody$2A);
                if (this.e) {
                    builder3.d("SP-Anonymous", "*");
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        builder3.d(entry2.getKey(), entry2.getValue());
                    }
                }
                requestB = builder3.b();
            }
            Future<?> futureB = o15.b(new jpa(0, this, requestB));
            if (futureB != null) {
                arrayList2.add(futureB);
            }
        }
        Object[] objArr = {Integer.valueOf(arrayList2.size())};
        String str3 = this.a;
        c49.a(str3, "Request Futures: %s", objArr);
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Object obj2 = ((Future) arrayList2.get(i2)).get(this.d, TimeUnit.SECONDS);
                num = obj2 instanceof Integer ? (Integer) obj2 : null;
            } catch (InterruptedException e) {
                c49.b(str3, "Request Future was interrupted: %s", e.getMessage());
            } catch (ExecutionException e2) {
                c49.b(str3, "Request Future failed: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                c49.b(str3, "Request Future had a timeout: %s", e3.getMessage());
            }
            int iIntValue = num != null ? num.intValue() : -1;
            o3d o3dVar2 = (o3d) arrayList.get(i2);
            ArrayList arrayList4 = o3dVar2.b;
            boolean z = o3dVar2.c;
            arrayList3.add(new p4d(iIntValue, arrayList4, z));
            if (z) {
                c49.d(str3, "Request is oversized for emitter event IDs: %s", arrayList4.toString());
            }
        }
        return arrayList3;
    }

    @Override // defpackage.rfa
    public final rl6 c() {
        return this.c;
    }
}
