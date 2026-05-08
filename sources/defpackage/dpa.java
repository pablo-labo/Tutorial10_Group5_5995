package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.s3d;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes3.dex */
public final class dpa<T> implements av1<T> {
    public Throwable V;
    public boolean W;
    public final c4d a;
    public final Object[] b;
    public final Call.Factory c;
    public final az2<ResponseBody, T> d;
    public volatile boolean e;
    public Call f;

    public class a implements Callback {
        public final /* synthetic */ jv1 a;

        public a(jv1 jv1Var) {
            this.a = jv1Var;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            try {
                this.a.a(dpa.this, iOException);
            } catch (Throwable th) {
                fkg.m(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            jv1 jv1Var = this.a;
            dpa dpaVar = dpa.this;
            try {
                try {
                    jv1Var.b(dpaVar, dpaVar.e(response));
                } catch (Throwable th) {
                    fkg.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                fkg.m(th2);
                try {
                    jv1Var.a(dpaVar, th2);
                } catch (Throwable th3) {
                    fkg.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class b extends ResponseBody {
        public final ResponseBody c;
        public final uqc d;
        public IOException e;

        public class a extends fq5 {
            public a(to1 to1Var) {
                super(to1Var);
            }

            @Override // defpackage.fq5, defpackage.pne
            public final long f1(zn1 zn1Var, long j) throws IOException {
                try {
                    return super.f1(zn1Var, j);
                } catch (IOException e) {
                    b.this.e = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.c = responseBody;
            this.d = new uqc(new a(responseBody.getE()));
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: K1 */
        public final to1 getE() {
            return this.d;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.c.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: p */
        public final long getD() {
            return this.c.getD();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: s */
        public final MediaType getC() {
            return this.c.getC();
        }
    }

    public static final class c extends ResponseBody {
        public final MediaType c;
        public final long d;

        public c(MediaType mediaType, long j) {
            this.c = mediaType;
            this.d = j;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: K1 */
        public final to1 getE() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: p */
        public final long getD() {
            return this.d;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: s */
        public final MediaType getC() {
            return this.c;
        }
    }

    public dpa(c4d c4dVar, Object[] objArr, Call.Factory factory, az2<ResponseBody, T> az2Var) {
        this.a = c4dVar;
        this.b = objArr;
        this.c = factory;
        this.d = az2Var;
    }

    @Override // defpackage.av1
    public final void N(jv1<T> jv1Var) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.W) {
                    throw new IllegalStateException("Already executed.");
                }
                this.W = true;
                call = this.f;
                th = this.V;
                if (call == null && th == null) {
                    try {
                        Call callC = c();
                        this.f = callC;
                        call = callC;
                    } catch (Throwable th2) {
                        th = th2;
                        fkg.m(th);
                        this.V = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            jv1Var.a(this, th);
            return;
        }
        if (this.e) {
            call.cancel();
        }
        call.R0(new a(jv1Var));
    }

    @Override // defpackage.av1
    public final synchronized Request a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().getB();
    }

    @Override // defpackage.av1
    public final m6d<T> b() {
        Call callD;
        synchronized (this) {
            if (this.W) {
                throw new IllegalStateException("Already executed.");
            }
            this.W = true;
            callD = d();
        }
        if (this.e) {
            callD.cancel();
        }
        return e(callD.b());
    }

    public final Call c() throws EOFException {
        HttpUrl httpUrlH;
        c4d c4dVar = this.a;
        r3b<?>[] r3bVarArr = c4dVar.j;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length != r3bVarArr.length) {
            l5.q(w20.k(o6.g(length, "Argument count (", ") doesn't match expected count ("), r3bVarArr.length, ")"));
            return null;
        }
        s3d s3dVar = new s3d(c4dVar.c, c4dVar.b, c4dVar.d, c4dVar.e, c4dVar.f, c4dVar.g, c4dVar.h, c4dVar.i);
        if (c4dVar.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            r3bVarArr[i].a(s3dVar, objArr[i]);
        }
        HttpUrl.Builder builder = s3dVar.d;
        if (builder != null) {
            httpUrlH = builder.b();
        } else {
            String str = s3dVar.c;
            HttpUrl httpUrl = s3dVar.b;
            httpUrlH = httpUrl.h(str);
            if (httpUrlH == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                String str2 = s3dVar.c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        RequestBody aVar = s3dVar.k;
        if (aVar == null) {
            FormBody.Builder builder2 = s3dVar.j;
            if (builder2 != null) {
                aVar = new FormBody(builder2.a, builder2.b);
            } else {
                MultipartBody.Builder builder3 = s3dVar.i;
                if (builder3 != null) {
                    aVar = builder3.a();
                } else if (s3dVar.h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = s3dVar.g;
        Headers.Builder builder4 = s3dVar.f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new s3d.a(aVar, mediaType);
            } else {
                builder4.a(TracingInterceptor.HEADER_CT, mediaType.a);
            }
        }
        Request.Builder builder5 = s3dVar.e;
        builder5.getClass();
        builder5.a = httpUrlH;
        builder5.c = builder4.e().d();
        builder5.e(s3dVar.a, aVar);
        builder5.f(ao7.class, new ao7(c4dVar.a, arrayList));
        return this.c.c(builder5.b());
    }

    @Override // defpackage.av1
    public final void cancel() {
        Call call;
        this.e = true;
        synchronized (this) {
            call = this.f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.av1
    public final av1 clone() {
        return new dpa(this.a, this.b, this.c, this.d);
    }

    public final Call d() throws IOException {
        Call call = this.f;
        if (call != null) {
            return call;
        }
        Throwable th = this.V;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callC = c();
            this.f = callC;
            return callC;
        } catch (IOException | Error | RuntimeException e) {
            fkg.m(e);
            this.V = e;
            throw e;
        }
    }

    public final m6d<T> e(Response response) throws IOException {
        ResponseBody responseBody = response.V;
        Response.Builder builderP = response.p();
        builderP.g = new c(responseBody.getC(), responseBody.getD());
        Response responseA = builderP.a();
        int i = responseA.d;
        if (i < 200 || i >= 300) {
            try {
                zn1 zn1Var = new zn1();
                responseBody.getE().k1(zn1Var);
                MediaType c2 = responseBody.getC();
                long d = responseBody.getD();
                ResponseBody.b.getClass();
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = new ResponseBody$Companion$asResponseBody$1(c2, d, zn1Var);
                if (responseA.h()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new m6d<>(responseA, null, responseBody$Companion$asResponseBody$1);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            if (responseA.h()) {
                return new m6d<>(responseA, null, null);
            }
            l5.q("rawResponse must be successful response");
            return null;
        }
        b bVar = new b(responseBody);
        try {
            T tConvert = this.d.convert(bVar);
            if (responseA.h()) {
                return new m6d<>(responseA, tConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = bVar.e;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.av1
    public final boolean s() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f;
                if (call == null || !call.getE0()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m32clone() {
        return new dpa(this.a, this.b, this.c, this.d);
    }
}
