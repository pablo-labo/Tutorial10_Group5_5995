package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import defpackage.bu1;
import defpackage.o85;
import defpackage.vqc;
import defpackage.x54;
import java.io.IOException;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class gm6 implements o85 {
    public static final CacheControl e;
    public static final CacheControl f;
    public final String a;
    public final qva b;
    public final d2f c;
    public final d2f d;

    public static final class a implements o85.a<Uri> {
        public final d2f a;
        public final d2f b;

        public a(d2f d2fVar, d2f d2fVar2) {
            this.a = d2fVar;
            this.b = d2fVar2;
        }

        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            Uri uri = (Uri) obj;
            if (wl7.b(uri.getScheme(), "http") || wl7.b(uri.getScheme(), "https")) {
                return new gm6(uri.toString(), qvaVar, this.a, this.b);
            }
            return null;
        }
    }

    @uh3(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {76, 105}, m = "fetch")
    public static final class b extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gm6.this.a(this);
        }
    }

    static {
        CacheControl.Builder builder = new CacheControl.Builder();
        builder.a = true;
        builder.b = true;
        e = builder.a();
        CacheControl.Builder builder2 = new CacheControl.Builder();
        builder2.a = true;
        builder2.d = true;
        f = builder2.a();
    }

    public gm6(String str, qva qvaVar, d2f d2fVar, d2f d2fVar2) {
        this.a = str;
        this.b = qvaVar;
        this.c = d2fVar;
        this.d = d2fVar2;
    }

    public static String d(String str, MediaType mediaType) {
        String strB;
        String str2 = mediaType != null ? mediaType.a : null;
        if ((str2 == null || wve.K(str2, "text/plain", false)) && (strB = m.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return zve.p0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195 A[Catch: Exception -> 0x01c1, TryCatch #5 {Exception -> 0x01c1, blocks: (B:73:0x018e, B:75:0x0195, B:79:0x01bd, B:83:0x01c4, B:84:0x01c9), top: B:104:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4 A[Catch: Exception -> 0x01c1, TryCatch #5 {Exception -> 0x01c1, blocks: (B:73:0x018e, B:75:0x0195, B:79:0x01bd, B:83:0x01c4, B:84:0x01c9), top: B:104:0x018e }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // defpackage.o85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.lu2<? super defpackage.m85> r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.a(lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(okhttp3.Request r5, defpackage.pu2 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hm6
            if (r0 == 0) goto L13
            r0 = r6
            hm6 r0 = (defpackage.hm6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hm6 r0 = new hm6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L8c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r6)
            android.graphics.Bitmap$Config[] r6 = defpackage.m.a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r6 = defpackage.wl7.b(r6, r1)
            d2f r1 = r4.c
            if (r6 == 0) goto L60
            qva r4 = r4.b
            vt1 r4 = r4.m
            boolean r4 = r4.a()
            if (r4 != 0) goto L5a
            java.lang.Object r4 = r1.getValue()
            okhttp3.Call$Factory r4 = (okhttp3.Call.Factory) r4
            okhttp3.internal.connection.RealCall r4 = r4.c(r5)
            okhttp3.Response r4 = r4.b()
            goto L8f
        L5a:
            android.os.NetworkOnMainThreadException r4 = new android.os.NetworkOnMainThreadException
            r4.<init>()
            throw r4
        L60:
            java.lang.Object r4 = r1.getValue()
            okhttp3.Call$Factory r4 = (okhttp3.Call.Factory) r4
            okhttp3.internal.connection.RealCall r4 = r4.c(r5)
            r0.label = r2
            qw1 r5 = new qw1
            lu2 r6 = defpackage.ewa.v(r0)
            r5.<init>(r2, r6)
            r5.q()
            ou2 r6 = new ou2
            r6.<init>(r4, r5)
            r4.R0(r6)
            r5.t(r6)
            java.lang.Object r6 = r5.p()
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L8c
            return r4
        L8c:
            r4 = r6
            okhttp3.Response r4 = (okhttp3.Response) r4
        L8f:
            boolean r5 = r4.h()
            if (r5 != 0) goto La8
            int r5 = r4.d
            r6 = 304(0x130, float:4.26E-43)
            if (r5 == r6) goto La8
            okhttp3.ResponseBody r5 = r4.V
            if (r5 == 0) goto La2
            defpackage.m.a(r5)
        La2:
            coil.network.HttpException r5 = new coil.network.HttpException
            r5.<init>(r4)
            throw r5
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.b(okhttp3.Request, pu2):java.lang.Object");
    }

    public final pa5 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((x54) value).getFileSystem();
    }

    public final Request e() {
        Request.Builder builder = new Request.Builder();
        builder.g(this.a);
        qva qvaVar = this.b;
        Headers headers = qvaVar.h;
        vt1 vt1Var = qvaVar.l;
        headers.getClass();
        builder.c = headers.d();
        for (Map.Entry<Class<?>, Object> entry : qvaVar.i.a.entrySet()) {
            Class<?> key = entry.getKey();
            key.getClass();
            builder.f(key, entry.getValue());
        }
        boolean zA = vt1Var.a();
        boolean zA2 = qvaVar.m.a();
        if (!zA2 && zA) {
            builder.c(CacheControl.p);
        } else if (!zA2 || zA) {
            if (!zA2 && !zA) {
                builder.c(f);
            }
        } else if (vt1Var.c()) {
            builder.c(CacheControl.o);
        } else {
            builder.c(e);
        }
        return builder.b();
    }

    public final zt1 f(x54.b bVar) throws Throwable {
        zt1 zt1Var;
        try {
            uqc uqcVarK = c0h.k(c().m(bVar.getMetadata()));
            try {
                zt1Var = new zt1(uqcVarK);
                th = null;
            } catch (Throwable th) {
                th = th;
                zt1Var = null;
            }
            try {
                uqcVarK.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    boa.h(th, th2);
                }
            }
            if (th != null) {
                throw th;
            }
            zt1Var.getClass();
            return zt1Var;
        } catch (IOException unused) {
            return null;
        }
    }

    public final r95 g(x54.b bVar) {
        w5b data = bVar.getData();
        pa5 pa5VarC = c();
        this.b.getClass();
        return new r95(data, pa5VarC, this.a, bVar);
    }

    public final x54.b h(x54.b bVar, Request request, Response response, zt1 zt1Var) {
        vqc.a aVarB;
        j6g j6gVar;
        Long lValueOf;
        j6g j6gVar2;
        Headers headers = response.f;
        qva qvaVar = this.b;
        Throwable th = null;
        if (qvaVar.l.c() && !request.a().b && !response.a().b && !wl7.b(headers.a("Vary"), "*")) {
            if (bVar != null) {
                aVarB = bVar.p1();
            } else {
                x54 x54Var = (x54) this.d.getValue();
                if (x54Var != null) {
                    qvaVar.getClass();
                    aVarB = x54Var.b(this.a);
                } else {
                    aVarB = null;
                }
            }
            if (aVarB != null) {
                try {
                    try {
                        if (response.d != 304 || zt1Var == null) {
                            tqc tqcVarJ = c0h.j(c().l(aVarB.b(), false));
                            try {
                                new zt1(response).a(tqcVarJ);
                                j6gVar = j6g.a;
                                th = null;
                            } catch (Throwable th2) {
                                th = th2;
                                j6gVar = null;
                            }
                            try {
                                tqcVarJ.close();
                            } catch (Throwable th3) {
                                if (th == null) {
                                    th = th3;
                                } else {
                                    boa.h(th, th3);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            j6gVar.getClass();
                            tqc tqcVarJ2 = c0h.j(c().l(aVarB.a.b(1), false));
                            try {
                                ResponseBody responseBody = response.V;
                                responseBody.getClass();
                                lValueOf = Long.valueOf(responseBody.getE().k1(tqcVarJ2));
                            } catch (Throwable th4) {
                                th = th4;
                                lValueOf = null;
                            }
                            try {
                                tqcVarJ2.close();
                            } catch (Throwable th5) {
                                if (th == null) {
                                    th = th5;
                                } else {
                                    boa.h(th, th5);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            lValueOf.getClass();
                        } else {
                            Response.Builder builderP = response.p();
                            builderP.f = bu1.a.a(zt1Var.f, headers).d();
                            Response responseA = builderP.a();
                            tqc tqcVarJ3 = c0h.j(c().l(aVarB.b(), false));
                            try {
                                new zt1(responseA).a(tqcVarJ3);
                                j6gVar2 = j6g.a;
                            } catch (Throwable th6) {
                                th = th6;
                                j6gVar2 = null;
                            }
                            try {
                                tqcVarJ3.close();
                            } catch (Throwable th7) {
                                if (th == null) {
                                    th = th7;
                                } else {
                                    boa.h(th, th7);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            j6gVar2.getClass();
                        }
                        vqc.b bVarA = aVarB.a();
                        m.a(response);
                        return bVarA;
                    } catch (Exception e2) {
                        Bitmap.Config[] configArr = m.a;
                        try {
                            aVarB.a.a(false);
                        } catch (Exception unused) {
                        }
                        throw e2;
                    }
                } catch (Throwable th8) {
                    m.a(response);
                    throw th8;
                }
            }
        } else if (bVar != null) {
            m.a(bVar);
        }
        return null;
    }
}
