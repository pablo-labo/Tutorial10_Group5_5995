package defpackage;

import android.util.Log;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.fetch.FetchUnknownException;
import expo.modules.fetch.NativeRequest;
import expo.modules.fetch.NativeRequestCredentials;
import expo.modules.fetch.NativeRequestInit;
import expo.modules.fetch.NativeRequestRedirect;
import expo.modules.fetch.NativeResponse;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import expo.modules.kotlin.exception.UnexpectedException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz35;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z35 extends sx9 {
    public static final /* synthetic */ int g = 0;
    public final d2f c = new d2f(new la(this, 8));
    public final d2f d = new d2f(new ig(this, 6));
    public final d2f e = new d2f(new vv(this, 6));
    public final d2f f = new d2f(new oa(this, 9));

    public static final class a implements Function1<q6d, j6g> {
        public final /* synthetic */ NativeResponse a;
        public final /* synthetic */ p3c b;

        public a(NativeResponse nativeResponse, p3c p3cVar) {
            this.a = nativeResponse;
            this.b = p3cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(q6d q6dVar) {
            q6dVar.getClass();
            this.b.resolve(this.a.d.a());
            return j6g.a;
        }
    }

    public static final class a0 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((NativeRequest) objArr2[0]).Q();
            return j6g.a;
        }
    }

    public static final class b implements Function1<q6d, j6g> {
        public final /* synthetic */ NativeResponse a;
        public final /* synthetic */ p3c b;

        public b(NativeResponse nativeResponse, p3c p3cVar) {
            this.a = nativeResponse;
            this.b = p3cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(q6d q6dVar) {
            q6dVar.getClass();
            this.b.resolve(new String(this.a.d.a(), a32.b));
            return j6g.a;
        }
    }

    public static final class b0 implements gu5<zf8> {
        public static final b0 a = new b0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeRequest.class);
        }
    }

    public static final class c implements Function1<q6d, j6g> {
        public final /* synthetic */ p3c a;
        public final /* synthetic */ NativeRequest b;

        public c(p3c p3cVar, NativeRequest nativeRequest) {
            this.a = p3cVar;
            this.b = nativeRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(q6d q6dVar) {
            CodedException fetchUnknownException;
            CodedException unexpectedException;
            q6d q6dVar2 = q6dVar;
            q6dVar2.getClass();
            q6d q6dVar3 = q6d.RESPONSE_RECEIVED;
            p3c p3cVar = this.a;
            if (q6dVar2 == q6dVar3) {
                p3cVar.e();
            } else if (q6dVar2 == q6d.ERROR_RECEIVED) {
                Exception exc = this.b.c.W;
                if (exc == null) {
                    fetchUnknownException = new FetchUnknownException();
                } else if (exc instanceof CodedException) {
                    fetchUnknownException = (CodedException) exc;
                } else {
                    if (exc instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) exc;
                        unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(exc);
                    }
                    fetchUnknownException = unexpectedException;
                }
                p3cVar.g(fetchUnknownException);
            }
            return j6g.a;
        }
    }

    public static final class c0 implements gu5<zf8> {
        public static final c0 a = new c0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(URL.class);
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class d0 implements gu5<zf8> {
        public static final d0 a = new d0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeRequestInit.class);
        }
    }

    public static final class e implements gu5<zf8> {
        public static final e a = new e();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeRequest.class);
        }
    }

    public static final class e0 implements gu5<zf8> {
        public static final e0 a = new e0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(byte[].class);
        }
    }

    public static final class f implements gu5<j6g> {
        public f() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            z35 z35Var = z35.this;
            ((dz2) z35Var.e.getValue()).c(new JavaNetCookieJar((tp5) z35Var.d.getValue()));
            return j6g.a;
        }
    }

    public static final class f0 implements Function2<Object[], p3c, j6g> {
        public f0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            MediaType mediaTypeA;
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            byte[] bArr = (byte[]) objArr2[3];
            NativeRequestInit nativeRequestInit = (NativeRequestInit) obj3;
            URL url = (URL) obj2;
            NativeRequest nativeRequest = (NativeRequest) obj;
            OkHttpClient okHttpClient = (OkHttpClient) z35.this.c.getValue();
            NativeResponse nativeResponse = nativeRequest.c;
            okHttpClient.getClass();
            url.getClass();
            nativeRequestInit.getClass();
            OkHttpClient.Builder builderE = okHttpClient.e();
            if (nativeRequestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
                CookieJar cookieJar = CookieJar.a;
                cookieJar.getClass();
                builderE.j = cookieJar;
            }
            if (nativeRequestInit.getRedirect() != NativeRequestRedirect.FOLLOW) {
                builderE.h = false;
                builderE.i = false;
            }
            OkHttpClient okHttpClient2 = new OkHttpClient(builderE);
            nativeResponse.X = nativeRequestInit.getRedirect();
            List<Pair<String, String>> headers = nativeRequestInit.getHeaders();
            headers.getClass();
            Headers.Builder builder = new Headers.Builder();
            for (Pair<String, String> pair : headers) {
                builder.a(pair.d(), pair.e());
            }
            Headers headersE = builder.e();
            String strA = headersE.a(TracingInterceptor.HEADER_CT);
            if (strA != null) {
                MediaType.e.getClass();
                try {
                    mediaTypeA = MediaType.Companion.a(strA);
                } catch (IllegalArgumentException unused) {
                    mediaTypeA = null;
                }
            } else {
                mediaTypeA = null;
            }
            RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2D = bArr != null ? RequestBody.Companion.d(RequestBody.INSTANCE, bArr, mediaTypeA, 0, 6) : ut0.f0(nativeRequestInit.getMethod(), zkd.e) ? RequestBody.Companion.d(RequestBody.INSTANCE, new byte[]{0}, mediaTypeA, 0, 6) : null;
            Request.Builder builder2 = new Request.Builder();
            builder2.c = headersE.d();
            builder2.e(nativeRequestInit.getMethod(), requestBody$Companion$toRequestBody$2D);
            if (wl7.b(url.getProtocol(), "file")) {
                url = new URL(l5.l("http://filesystem.local", url.getPath()));
            }
            HttpUrl.Companion companion = HttpUrl.k;
            String string = url.toString();
            string.getClass();
            companion.getClass();
            builder2.a = HttpUrl.Companion.c(string);
            Request requestB = builder2.b();
            nativeRequest.d.a = requestB;
            RealCall realCall = new RealCall(okHttpClient2, requestB, false);
            nativeRequest.e = realCall;
            realCall.R0(nativeResponse);
            if (!nativeResponse.W(q6d.INITIALIZED)) {
                nativeResponse.b0(q6d.STARTED);
            }
            nativeRequest.c.f0(u63.a0(q6d.RESPONSE_RECEIVED, q6d.ERROR_RECEIVED), new c(p3cVar2, nativeRequest));
            return j6g.a;
        }
    }

    public static final class g implements gu5<j6g> {
        public g() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            z35 z35Var = z35.this;
            ((tp5) z35Var.d.getValue()).getClass();
            ((dz2) z35Var.e.getValue()).a();
            try {
                f13.c((e13) z35Var.f.getValue(), new ModuleDestroyedException());
            } catch (IllegalStateException unused) {
                Log.e("z35", "The scope does not have a job in it");
            }
            return j6g.a;
        }
    }

    public static final class g0 implements gu5<zf8> {
        public static final g0 a = new g0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class h implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ((NativeResponse) p3cVar2).d0();
            return j6g.a;
        }
    }

    public static final class h0 implements Function1<Object[], Object> {
        public h0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new NativeRequest(z35.this.b(), (NativeResponse) objArr2[0]);
        }
    }

    public static final class i implements gu5<zf8> {
        public static final i a = new i();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class j implements Function1<Object[], byte[]> {
        @Override // kotlin.jvm.functions.Function1
        public final byte[] invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((NativeResponse) objArr2[0]).d0();
        }
    }

    public static final class k implements gu5<zf8> {
        public static final k a = new k();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class l implements gu5<zf8> {
        public static final l a = new l();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class m implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            NativeResponse nativeResponse = (NativeResponse) obj;
            nativeResponse.getClass();
            if (!nativeResponse.W(q6d.BODY_STREAMING_STARTED)) {
                nativeResponse.b0(q6d.BODY_STREAMING_CANCELED);
            }
            return j6g.a;
        }
    }

    public static final class n implements gu5<zf8> {
        public static final n a = new n();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class o implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            NativeResponse nativeResponse = (NativeResponse) objArr2[0];
            nativeResponse.f0(u63.Z(q6d.BODY_COMPLETED), new a(nativeResponse, p3cVar2));
            return j6g.a;
        }
    }

    public static final class p implements gu5<zf8> {
        public static final p a = new p();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeResponse.class);
        }
    }

    public static final class q implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            NativeResponse nativeResponse = (NativeResponse) objArr2[0];
            nativeResponse.f0(u63.Z(q6d.BODY_COMPLETED), new b(nativeResponse, p3cVar2));
            return j6g.a;
        }
    }

    public static final class r implements Function1<Object[], Object> {
        public r() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            z35 z35Var = z35.this;
            return new NativeResponse(z35Var.b(), (e13) z35Var.f.getValue());
        }
    }

    public static final class s implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((NativeResponse) objArr2[0]).d.a);
        }
    }

    public static final class t implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            aaa aaaVar = ((NativeResponse) objArr2[0]).V;
            return aaaVar != null ? aaaVar.a : zr4.a;
        }
    }

    public static final class u implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            aaa aaaVar = ((NativeResponse) objArr2[0]).V;
            return Integer.valueOf(aaaVar != null ? aaaVar.b : -1);
        }
    }

    public static final class v implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            String str;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            aaa aaaVar = ((NativeResponse) objArr2[0]).V;
            return (aaaVar == null || (str = aaaVar.c) == null) ? "" : str;
        }
    }

    public static final class w implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            aaa aaaVar = ((NativeResponse) objArr2[0]).V;
            return aaaVar != null ? aaaVar.d : "";
        }
    }

    public static final class x implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            aaa aaaVar = ((NativeResponse) objArr2[0]).V;
            return Boolean.valueOf(aaaVar != null ? aaaVar.e : false);
        }
    }

    public static final class y implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ((NativeRequest) p3cVar2).Q();
            return j6g.a;
        }
    }

    public static final class z implements gu5<zf8> {
        public static final z a = new z();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(NativeRequest.class);
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Class cls;
        Class cls2;
        Class cls3;
        rf0 rf0Var;
        Class cls4;
        l52 l52Var;
        Class cls5;
        qf0 o7gVar;
        String str;
        Class cls6;
        l52 l52Var2;
        Class cls7;
        Object obj;
        qf0 ch7Var;
        jpf.b("[ExpoModulesCore] ".concat(z35.class + ".ModuleDefinition"));
        try {
            vx9 vx9Var = new vx9(this);
            vx9Var.i("ExpoFetchModule");
            LinkedHashMap linkedHashMapM = vx9Var.m();
            i05 i05Var = i05.a;
            linkedHashMapM.put(i05Var, new nc1(i05Var, new f()));
            LinkedHashMap linkedHashMapM2 = vx9Var.m();
            i05 i05Var2 = i05.b;
            linkedHashMapM2.put(i05Var2, new nc1(i05Var2, new g()));
            yd8 yd8VarA = fwc.a(NativeResponse.class);
            sx9 sx9VarN = vx9Var.n();
            if (sx9VarN == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gk0 gk0VarB = sx9VarN.b();
            String simpleName = jh2.p(yd8VarA).getSimpleName();
            hb9 hb9Var = tf0.a;
            yd8 yd8VarA2 = fwc.a(NativeResponse.class);
            Boolean bool = Boolean.FALSE;
            rf0 rf0Var2 = (rf0) tf0.a().get(new Pair(yd8VarA2, bool));
            if (rf0Var2 == null) {
                cls = Integer.class;
                cls2 = List.class;
                cls3 = Boolean.class;
                rf0Var = new rf0(new xp8(fwc.a(NativeResponse.class), false, d.a), null);
            } else {
                cls = Integer.class;
                cls2 = List.class;
                cls3 = Boolean.class;
                rf0Var = rf0Var2;
            }
            l52 l52Var3 = new l52(gk0VarB, simpleName, yd8VarA, rf0Var, vx9Var.f());
            rf0[] rf0VarArr = new rf0[0];
            gad gadVar = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar == null) {
                gadVar = new gad(fwc.a(Object.class));
                cls4 = Object.class;
                had.a().put(fwc.a(cls4), gadVar);
            } else {
                cls4 = Object.class;
            }
            l52Var3.l(new a2f("constructor", rf0VarArr, gadVar, new r()));
            if (wl7.b(NativeResponse.class, p3c.class)) {
                o7gVar = new ev0("startStreaming", new rf0[0], new h());
                l52Var = l52Var3;
                cls5 = NativeResponse.class;
            } else {
                pwf pwfVarF = l52Var3.f();
                rf0 rf0Var3 = (rf0) tf0.a().get(new Pair(fwc.a(NativeResponse.class), bool));
                if (rf0Var3 == null) {
                    l52Var = l52Var3;
                    cls5 = NativeResponse.class;
                    rf0Var3 = new rf0(new xp8(fwc.a(NativeResponse.class), false, i.a), pwfVarF);
                } else {
                    l52Var = l52Var3;
                    cls5 = NativeResponse.class;
                }
                o7gVar = new o7g("startStreaming", new rf0[]{rf0Var3}, new j());
            }
            l52Var.d().put("startStreaming", o7gVar);
            pwf pwfVarF2 = l52Var.f();
            rf0 rf0Var4 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool));
            if (rf0Var4 == null) {
                rf0Var4 = new rf0(new xp8(fwc.a(cls5), false, k.a), pwfVarF2);
            }
            rf0 rf0Var5 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool));
            if (rf0Var5 == null) {
                str = "Required value was null.";
                rf0Var5 = new rf0(new xp8(fwc.a(String.class), false, l.a), pwfVarF2);
            } else {
                str = "Required value was null.";
            }
            rf0[] rf0VarArr2 = {rf0Var4, rf0Var5};
            m mVar = new m();
            Class cls8 = Integer.TYPE;
            boolean zB = wl7.b(j6g.class, cls8);
            Class cls9 = Float.TYPE;
            Class cls10 = Double.TYPE;
            Class cls11 = Boolean.TYPE;
            l52Var.d().put("cancelStreaming", zB ? new ch7("cancelStreaming", rf0VarArr2, mVar) : wl7.b(j6g.class, cls11) ? new hi1("cancelStreaming", rf0VarArr2, mVar) : wl7.b(j6g.class, cls10) ? new s84("cancelStreaming", rf0VarArr2, mVar) : wl7.b(j6g.class, cls9) ? new ci5("cancelStreaming", rf0VarArr2, mVar) : wl7.b(j6g.class, String.class) ? new zue("cancelStreaming", rf0VarArr2, mVar) : new o7g("cancelStreaming", rf0VarArr2, mVar));
            c4c c4cVar = new c4c(l52Var.k().a(), "bodyUsed");
            rf0[] rf0VarArr3 = {new rf0(c4cVar.c())};
            gad gadVar2 = (gad) had.a().get(fwc.a(cls3));
            if (gadVar2 == null) {
                gadVar2 = new gad(fwc.a(cls3));
                cls6 = cls10;
                had.a().put(fwc.a(cls3), gadVar2);
            } else {
                cls6 = cls10;
            }
            a2f a2fVar = new a2f("get", rf0VarArr3, gadVar2, new s());
            a2fVar.f(c4cVar.c());
            a2fVar.e();
            c4cVar.a(a2fVar);
            l52Var.g().put("bodyUsed", c4cVar);
            c4c c4cVar2 = new c4c(l52Var.k().a(), "_rawHeaders");
            rf0[] rf0VarArr4 = {new rf0(c4cVar2.c())};
            gad gadVar3 = (gad) had.a().get(fwc.a(cls2));
            if (gadVar3 == null) {
                gadVar3 = new gad(fwc.a(cls2));
                had.a().put(fwc.a(cls2), gadVar3);
            }
            a2f a2fVar2 = new a2f("get", rf0VarArr4, gadVar3, new t());
            a2fVar2.f(c4cVar2.c());
            a2fVar2.e();
            c4cVar2.a(a2fVar2);
            l52Var.g().put("_rawHeaders", c4cVar2);
            c4c c4cVar3 = new c4c(l52Var.k().a(), "status");
            rf0[] rf0VarArr5 = {new rf0(c4cVar3.c())};
            gad gadVar4 = (gad) had.a().get(fwc.a(cls));
            if (gadVar4 == null) {
                gadVar4 = new gad(fwc.a(cls));
                had.a().put(fwc.a(cls), gadVar4);
            }
            a2f a2fVar3 = new a2f("get", rf0VarArr5, gadVar4, new u());
            a2fVar3.f(c4cVar3.c());
            a2fVar3.e();
            c4cVar3.a(a2fVar3);
            l52Var.g().put("status", c4cVar3);
            c4c c4cVar4 = new c4c(l52Var.k().a(), "statusText");
            rf0[] rf0VarArr6 = {new rf0(c4cVar4.c())};
            gad gadVar5 = (gad) had.a().get(fwc.a(String.class));
            if (gadVar5 == null) {
                gadVar5 = new gad(fwc.a(String.class));
                had.a().put(fwc.a(String.class), gadVar5);
            }
            a2f a2fVar4 = new a2f("get", rf0VarArr6, gadVar5, new v());
            a2fVar4.f(c4cVar4.c());
            a2fVar4.e();
            c4cVar4.a(a2fVar4);
            l52Var.g().put("statusText", c4cVar4);
            c4c c4cVar5 = new c4c(l52Var.k().a(), "url");
            rf0[] rf0VarArr7 = {new rf0(c4cVar5.c())};
            gad gadVar6 = (gad) had.a().get(fwc.a(String.class));
            if (gadVar6 == null) {
                gadVar6 = new gad(fwc.a(String.class));
                had.a().put(fwc.a(String.class), gadVar6);
            }
            a2f a2fVar5 = new a2f("get", rf0VarArr7, gadVar6, new w());
            a2fVar5.f(c4cVar5.c());
            a2fVar5.e();
            c4cVar5.a(a2fVar5);
            l52Var.g().put("url", c4cVar5);
            c4c c4cVar6 = new c4c(l52Var.k().a(), "redirected");
            rf0[] rf0VarArr8 = {new rf0(c4cVar6.c())};
            gad gadVar7 = (gad) had.a().get(fwc.a(cls3));
            if (gadVar7 == null) {
                gadVar7 = new gad(fwc.a(cls3));
                had.a().put(fwc.a(cls3), gadVar7);
            }
            a2f a2fVar6 = new a2f("get", rf0VarArr8, gadVar7, new x());
            a2fVar6.f(c4cVar6.c());
            a2fVar6.e();
            c4cVar6.a(a2fVar6);
            l52Var.g().put("redirected", c4cVar6);
            pwf pwfVarF3 = l52Var.f();
            rf0 rf0Var6 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(fwc.a(cls5), false, n.a), pwfVarF3);
            }
            l52Var.d().put("arrayBuffer", new ev0("arrayBuffer", new rf0[]{rf0Var6}, new o()));
            pwf pwfVarF4 = l52Var.f();
            rf0 rf0Var7 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool));
            if (rf0Var7 == null) {
                rf0Var7 = new rf0(new xp8(fwc.a(cls5), false, p.a), pwfVarF4);
            }
            l52Var.d().put("text", new ev0("text", new rf0[]{rf0Var7}, new q()));
            vx9Var.l().add(l52Var.j());
            yd8 yd8VarA3 = fwc.a(NativeRequest.class);
            sx9 sx9VarN2 = vx9Var.n();
            if (sx9VarN2 == null) {
                throw new IllegalArgumentException(str);
            }
            gk0 gk0VarB2 = sx9VarN2.b();
            String simpleName2 = jh2.p(yd8VarA3).getSimpleName();
            rf0 rf0Var8 = (rf0) tf0.a().get(new Pair(fwc.a(NativeRequest.class), bool));
            l52 l52Var4 = new l52(gk0VarB2, simpleName2, yd8VarA3, rf0Var8 == null ? new rf0(new xp8(fwc.a(NativeRequest.class), false, e.a), null) : rf0Var8, vx9Var.f());
            pwf pwfVarF5 = l52Var4.f();
            rf0 rf0Var9 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool));
            if (rf0Var9 == null) {
                rf0Var9 = new rf0(new xp8(fwc.a(cls5), false, g0.a), pwfVarF5);
            }
            rf0[] rf0VarArr9 = {rf0Var9};
            gad gadVar8 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar8 == null) {
                gadVar8 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar8);
            }
            l52Var4.l(new a2f("constructor", rf0VarArr9, gadVar8, new h0()));
            pwf pwfVarF6 = l52Var4.f();
            rf0 rf0Var10 = (rf0) tf0.a().get(new Pair(fwc.a(NativeRequest.class), bool));
            if (rf0Var10 == null) {
                rf0Var10 = new rf0(new xp8(fwc.a(NativeRequest.class), false, b0.a), pwfVarF6);
            }
            rf0 rf0Var11 = (rf0) tf0.a().get(new Pair(fwc.a(URL.class), bool));
            if (rf0Var11 == null) {
                l52Var2 = l52Var4;
                rf0Var11 = new rf0(new xp8(fwc.a(URL.class), false, c0.a), pwfVarF6);
            } else {
                l52Var2 = l52Var4;
            }
            rf0 rf0Var12 = (rf0) tf0.a().get(new Pair(fwc.a(NativeRequestInit.class), bool));
            if (rf0Var12 == null) {
                cls7 = cls11;
                rf0Var12 = new rf0(new xp8(fwc.a(NativeRequestInit.class), false, d0.a), pwfVarF6);
            } else {
                cls7 = cls11;
            }
            rf0 rf0Var13 = (rf0) tf0.a().get(new Pair(fwc.a(byte[].class), Boolean.TRUE));
            if (rf0Var13 == null) {
                obj = j6g.class;
                rf0Var13 = new rf0(new xp8(fwc.a(byte[].class), true, e0.a), pwfVarF6);
            } else {
                obj = j6g.class;
            }
            l52Var2.d().put("start", new ev0("start", new rf0[]{rf0Var10, rf0Var11, rf0Var12, rf0Var13}, new f0()));
            if (wl7.b(NativeRequest.class, p3c.class)) {
                ch7Var = new ev0("cancel", new rf0[0], new y());
            } else {
                pwf pwfVarF7 = l52Var2.f();
                rf0 rf0Var14 = (rf0) tf0.a().get(new Pair(fwc.a(NativeRequest.class), bool));
                if (rf0Var14 == null) {
                    rf0Var14 = new rf0(new xp8(fwc.a(NativeRequest.class), false, z.a), pwfVarF7);
                }
                rf0[] rf0VarArr10 = {rf0Var14};
                a0 a0Var = new a0();
                Object obj2 = obj;
                ch7Var = wl7.b(obj2, cls8) ? new ch7("cancel", rf0VarArr10, a0Var) : wl7.b(obj2, cls7) ? new hi1("cancel", rf0VarArr10, a0Var) : wl7.b(obj2, cls6) ? new s84("cancel", rf0VarArr10, a0Var) : wl7.b(obj2, cls9) ? new ci5("cancel", rf0VarArr10, a0Var) : wl7.b(obj2, String.class) ? new zue("cancel", rf0VarArr10, a0Var) : new o7g("cancel", rf0VarArr10, a0Var);
            }
            l52Var2.d().put("cancel", ch7Var);
            vx9Var.l().add(l52Var2.j());
            return vx9Var.k();
        } finally {
            jpf.d();
        }
    }

    public final ReactContext e() {
        ReactApplicationContext reactApplicationContextD = b().d();
        if (reactApplicationContextD == null) {
            reactApplicationContextD = null;
        }
        if (reactApplicationContextD != null) {
            return reactApplicationContextD;
        }
        throw new Exceptions$ReactContextLost();
    }
}
