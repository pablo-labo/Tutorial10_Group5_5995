package defpackage;

import android.util.LruCache;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.EmptyResponseBodyError;
import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.backendservices.common.api.c;
import com.indeed.android.backendservices.graphql.NotInitializedException;
import com.indeed.android.backendservices.graphql.api.GraphQlErrorsException;
import com.indeed.android.jobsearch.tare.backend.OnegraphRetrofitApiResolver;
import defpackage.bad;
import defpackage.hva;
import defpackage.ksa;
import defpackage.qc6;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class hsa implements gsa {
    public final jsa a;
    public final OkHttpClient b;
    public final he c;
    public final ra8 d;
    public final d2f e;
    public final LruCache<Integer, tc6> f;

    public final class a implements tc6 {
        public final OnegraphRetrofitApiResolver a;
        public final String b;

        public a(hsa hsaVar, OnegraphRetrofitApiResolver onegraphRetrofitApiResolver) {
            onegraphRetrofitApiResolver.getClass();
            this.a = onegraphRetrofitApiResolver;
            this.b = "https://apis.indeed.com/".concat(((ep7) cr8.p(ep7.class)).a() == rp7.b ? "graphql/e2eqa" : "graphql");
        }

        @Override // defpackage.tc6
        public final av1<ResponseBody> post(String str, String str2, String str3, String str4, String str5, String str6, RequestBody requestBody) {
            str.getClass();
            return this.a.post(this.b, str, str2, str3, str4, str5, str6, requestBody);
        }
    }

    public hsa(jsa jsaVar, OkHttpClient okHttpClient, he heVar) {
        okHttpClient.getClass();
        this.a = jsaVar;
        this.b = okHttpClient;
        this.c = heVar;
        this.d = sa8.a(new kd(14));
        this.e = new d2f(new zh(this, 16));
        this.f = new LruCache<>(5);
    }

    @Override // defpackage.ksa
    public final Object A(String str, String str2, boolean z, mu9 mu9Var, ArrayList arrayList, List list, gx0 gx0Var, Function2 function2, List list2, dpb dpbVar) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var == null) {
            throw new NotInitializedException();
        }
        String strH = wg2Var.H();
        qu9 qu9Var = qu9.ANDROID;
        hva cVar = str2 == null ? hva.a.a : new hva.c(str2);
        hva.c cVar2 = new hva.c(list2);
        hva.a aVar = hva.a.a;
        return qc6.a.a(this, strA, strH, new j88(new ou9(str, cVar, z, mu9Var, arrayList, list, aVar, gx0Var == null ? aVar : new hva.c(gx0Var), cVar2)), function2, dpbVar, 4);
    }

    @Override // defpackage.ksa
    public final Object B(ih2 ih2Var, l8d l8dVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new psa(this, ih2Var, null), l8dVar);
    }

    @Override // defpackage.ksa
    public final Object C(wnf wnfVar, cj2 cj2Var, x56 x56Var) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new ynf(wnfVar), cj2Var, x56Var, 4);
        }
        throw new NotInitializedException();
    }

    @Override // defpackage.qc6
    public final Object D(String str, String str2, pua puaVar, Function2 function2, lu2 lu2Var) throws NotInitializedException {
        jjd jjdVar = new jjd(ewa.v(lu2Var), g13.b);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        zn1 zn1Var = new zn1();
        xua.a(puaVar, new so1(zn1Var));
        String strZ1 = zn1Var.z1();
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("application/json");
        companion.getClass();
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(strZ1, mediaTypeA);
        tc6 tc6Var = (tc6) this.e.getValue();
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        av1<ResponseBody> av1VarPost = tc6Var.post("87a0749e1d2ea18f2cfe899d32d63a9a5d417e571991de20daaa66fb7bee8ad6", str, str2, null, null, null, requestBody$Companion$toRequestBody$2A);
        rc6 rc6Var = new rc6(jjdVar, puaVar, this);
        av1VarPost.getClass();
        function2.getClass();
        av1VarPost.N(new c(function2, rc6Var, this));
        return jjdVar.a();
    }

    @Override // defpackage.ksa
    public final Object E(String str, String str2, String str3, b8c b8cVar, String str4, e77 e77Var, js0 js0Var, d97 d97Var) {
        yab yabVar = yab.ANDROID;
        z63 z63Var = z63.FIREBASE;
        return qc6.a.a(this, null, str4, new vxc(new uxc(e77Var, str, str2, str3, b8cVar)), js0Var, d97Var, 5);
    }

    @Override // defpackage.ksa
    public final Object H(zt3 zt3Var, ih2 ih2Var, k8d k8dVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new nsa(this, zt3Var, ih2Var, null), k8dVar);
    }

    @Override // defpackage.ksa
    public final Object J(String str, String str2, fj2 fj2Var, f83 f83Var) {
        return qc6.a.a(this, null, null, new q53(str, str2), fj2Var, f83Var, 7);
    }

    @Override // defpackage.ksa
    public final Object K(pa paVar, sga sgaVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new rsa(this, paVar, null), sgaVar);
    }

    @Override // defpackage.ksa
    public final Object M(ih2 ih2Var, p8d p8dVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new msa(this, ih2Var, null), p8dVar);
    }

    @Override // defpackage.ksa
    public final Object N(List list, dm0 dm0Var, kkb kkbVar) {
        return qc6.a.a(this, null, null, new n1d(new ix3(new hva.c(list))), dm0Var, kkbVar, 7);
    }

    @Override // defpackage.ksa
    public final Object Q(List list, Function2 function2, pu2 pu2Var) throws NotInitializedException {
        p56 p56Var = new p56(new kbf(new hva.c(ebf.b), new fa3(list, hva.a.a)));
        if (ewa.c != null) {
            return qc6.a.a(this, d93.a(), null, p56Var, function2, pu2Var, 6);
        }
        throw new NotInitializedException();
    }

    @Override // defpackage.ksa
    public final Object R(lr lrVar, a2g a2gVar) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new g66(), lrVar, a2gVar, 4);
        }
        throw new NotInitializedException();
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final wg0.a a(Exception exc) {
        if (!(exc instanceof EmptyResponseBodyError)) {
            return new wg0.a(new ApiError(new a.e(), null, null, exc, 6, null));
        }
        return new wg0.a(new ApiError(a.d.d, bg.e(exc, "Missing response: "), null, exc, 4, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.indeed.android.backendservices.common.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wg0.a b(int r10, java.lang.String r11) {
        /*
            r9 = this;
            ra8 r9 = defpackage.sc6.a
            r0 = 0
            if (r11 != 0) goto L6
            goto L5e
        L6:
            sc6$a$b r1 = sc6.a.Companion     // Catch: java.lang.Exception -> L15
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> L15
            i04 r1 = (defpackage.i04) r1     // Catch: java.lang.Exception -> L15
            java.lang.Object r1 = r9.c(r1, r11)     // Catch: java.lang.Exception -> L15
            sc6$a r1 = (sc6.a) r1     // Catch: java.lang.Exception -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            if (r1 == 0) goto L20
            sc6$b r1 = r1.a     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L20
            java.util.List<java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement>> r1 = r1.a     // Catch: java.lang.Exception -> L5e
            if (r1 != 0) goto L36
        L20:
            sc6$b$b r1 = sc6.b.Companion     // Catch: java.lang.Exception -> L2f
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> L2f
            i04 r1 = (defpackage.i04) r1     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.c(r1, r11)     // Catch: java.lang.Exception -> L2f
            sc6$b r9 = (sc6.b) r9     // Catch: java.lang.Exception -> L2f
            goto L30
        L2f:
            r9 = r0
        L30:
            if (r9 == 0) goto L35
            java.util.List<java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement>> r1 = r9.a     // Catch: java.lang.Exception -> L5e
            goto L36
        L35:
            r1 = r0
        L36:
            if (r1 == 0) goto L5e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L5e
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5e
            r2 = 10
            int r2 = defpackage.t92.r0(r1, r2)     // Catch: java.lang.Exception -> L5e
            r9.<init>(r2)     // Catch: java.lang.Exception -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L5e
        L49:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L5e
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L5e
            iw4 r2 = defpackage.sc6.a(r2)     // Catch: java.lang.Exception -> L5e
            r9.add(r2)     // Catch: java.lang.Exception -> L5e
            goto L49
        L5d:
            r0 = r9
        L5e:
            if (r0 != 0) goto L79
            com.indeed.android.backendservices.common.api.ApiError r1 = new com.indeed.android.backendservices.common.api.ApiError
            com.indeed.android.backendservices.common.api.a$b r2 = new com.indeed.android.backendservices.common.api.a$b
            r2.<init>(r10)
            java.lang.String r9 = "Could not parse GraphQL response body: "
            java.lang.String r3 = defpackage.l5.l(r9, r11)
            com.indeed.android.backendservices.common.api.HttpStatusCodeError r5 = new com.indeed.android.backendservices.common.api.HttpStatusCodeError
            r5.<init>(r10)
            r6 = 4
            r7 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L9a
        L79:
            com.indeed.android.backendservices.graphql.api.GraphQlErrorsException r6 = new com.indeed.android.backendservices.graphql.api.GraphQlErrorsException
            r6.<init>(r0)
            com.indeed.android.backendservices.common.api.ApiError r2 = new com.indeed.android.backendservices.common.api.ApiError
            com.indeed.android.backendservices.common.api.a$b r3 = new com.indeed.android.backendservices.common.api.a$b
            r3.<init>(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "GraphQL errors: "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            r7 = 4
            r8 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = r2
        L9a:
            wg0$a r9 = new wg0$a
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsa.b(int, java.lang.String):wg0$a");
    }

    public final a d(int i) {
        if (i <= 0) {
            ArrayList arrayList = lz2.a;
            lz2.b("OnegraphApiImpl", "Invalid \"timeoutSeconds\": value must be a positive integer. Defaulting to 15 seconds.", false, new IllegalArgumentException("\"timeoutSeconds\" must be a positive integer."));
            i = 15;
        }
        bad.b bVar = new bad.b();
        bVar.b = (OkHttpClient) this.c.invoke(Integer.valueOf(i));
        bVar.a("https://apis.indeed.com/");
        MediaType.e.getClass();
        bVar.d.add(ewa.q(this.d, MediaType.Companion.a("application/json")));
        return new a(this, (OnegraphRetrofitApiResolver) bVar.b().b(OnegraphRetrofitApiResolver.class));
    }

    @Override // defpackage.ksa
    public final wg0 f(e45 e45Var) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var == null) {
            throw new NotInitializedException();
        }
        String strH = wg2Var.H();
        sd5 sd5Var = new sd5();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        zn1 zn1Var = new zn1();
        xua.a(sd5Var, new so1(zn1Var));
        String strZ1 = zn1Var.z1();
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("application/json");
        companion.getClass();
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(strZ1, mediaTypeA);
        tc6 tc6Var = (tc6) this.e.getValue();
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        wg0 wg0VarJ = j(tc6Var.post("87a0749e1d2ea18f2cfe899d32d63a9a5d417e571991de20daaa66fb7bee8ad6", strA, strH, "mob", null, null, requestBody$Companion$toRequestBody$2A), e45Var);
        if (!wg0VarJ.d()) {
            p81 p81VarA = wg0VarJ.a();
            if (p81VarA != null) {
                return new wg0.a(p81VarA);
            }
            return new wg0.a(new ApiError(a.d.d, "GraphQL response did not contain exception", null, new GraphQlErrorsException(zr4.a), 4, null));
        }
        ResponseBody responseBody = (ResponseBody) wg0VarJ.b();
        if (responseBody == null) {
            return a(new EmptyResponseBodyError());
        }
        to1 e = responseBody.getE();
        e.getClass();
        return qc6.a.b(xua.b(sd5Var, new uo1(e)));
    }

    @Override // defpackage.ksa
    public final Object h(xd xdVar, pga pgaVar) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new fqb(), xdVar, pgaVar, 4);
        }
        throw new NotInitializedException();
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> wg0<ResponseType> j(av1<ResponseType> av1Var, Function2<? super ApiError, ? super Request, j6g> function2) {
        av1Var.getClass();
        m6d<ResponseType> m6dVarB = av1Var.b();
        m6dVarB.getClass();
        return b.a.b(this, m6dVarB, function2);
    }

    @Override // defpackage.ksa
    public final Object k(ih2 ih2Var, n8d n8dVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new osa(this, ih2Var, null), n8dVar);
    }

    @Override // defpackage.ksa
    public final Object l(lea leaVar, Function2 function2, pig pigVar) {
        return ksa.a.a(this, leaVar, function2, pigVar);
    }

    @Override // defpackage.ksa
    public final Object m(mm mmVar, ih2 ih2Var, p8d p8dVar) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new lsa(this, mmVar, ih2Var, null), p8dVar);
    }

    @Override // defpackage.ksa
    public final Object o(String str, cm0 cm0Var, g83 g83Var) {
        return qc6.a.a(this, null, null, new j1d(str), cm0Var, g83Var, 7);
    }

    @Override // defpackage.ksa
    public final Object q(ArrayList arrayList, dm0 dm0Var, pu2 pu2Var) {
        return qc6.a.a(this, null, null, new ow(new hva.c(new wp(arrayList))), dm0Var, pu2Var, 7);
    }

    @Override // defpackage.ksa
    public final Object t(u58 u58Var, dm0 dm0Var, pu2 pu2Var) {
        eq3 eq3Var = a74.a;
        return u63.q0(no3.c, new qsa(this, u58Var, dm0Var, null), pu2Var);
    }

    @Override // defpackage.ksa
    public final Object u(ov ovVar, el0 el0Var) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new wc7(), ovVar, el0Var, 4);
        }
        throw new NotInitializedException();
    }

    @Override // defpackage.ksa
    public final Object v(us0 us0Var, l36 l36Var) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new vzc(), us0Var, l36Var, 4);
        }
        throw new NotInitializedException();
    }

    @Override // defpackage.qc6
    public final tc6 w(int i) {
        tc6 tc6VarD;
        synchronized (this) {
            tc6VarD = this.f.get(Integer.valueOf(i));
            if (tc6VarD == null) {
                tc6VarD = d(i);
                LruCache<Integer, tc6> lruCache = this.f;
                if (lruCache.size() == 5) {
                    ArrayList arrayList = lz2.a;
                    lz2.b("OnegraphApiImpl", "Maximum RN Onegraph Client Count exceeded. Evicting least-recently used instance.", false, new w05("Maximum RN Onegraph Client Count exceeded. Evicting least-recently used instance."));
                }
                lruCache.put(Integer.valueOf(i), tc6VarD);
            }
        }
        return tc6VarD;
    }

    @Override // defpackage.ksa
    public final Object x(rh2 rh2Var, f16 f16Var) throws NotInitializedException {
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var != null) {
            return qc6.a.a(this, strA, wg2Var.H(), new i08(), rh2Var, f16Var, 4);
        }
        throw new NotInitializedException();
    }
}
