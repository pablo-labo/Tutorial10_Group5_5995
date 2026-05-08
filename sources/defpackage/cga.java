package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import defpackage.hga;
import defpackage.p85;
import defpackage.q55;
import defpackage.y54;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cga implements p85 {
    public final String a;
    public final nva b;
    public final Lazy<ofa> c;
    public final d2f d;
    public final Lazy<cu1> e;
    public final cp2 f;

    public static final class a implements p85.a<lhg> {
        public final d2f a;
        public final d2f b;
        public final ko2 c;

        public a(zr0 zr0Var) {
            o7 o7Var = new o7(11);
            bga bgaVar = bga.a;
            this.a = new d2f(zr0Var);
            this.b = boa.D(o7Var);
            ko2 ko2Var = new ko2();
            ko2Var.a = bgaVar;
            ko2Var.b = pyd.d0;
            this.c = ko2Var;
        }

        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            lhg lhgVar = (lhg) obj;
            if (!wl7.b(lhgVar.c, "http") && !wl7.b(lhgVar.c, "https")) {
                return null;
            }
            String str = lhgVar.a;
            d2f d2fVar = this.a;
            d2f d2fVar2 = new d2f(new i30(xqcVar, 11));
            d2f d2fVar3 = this.b;
            ko2 ko2Var = this.c;
            Context context = nvaVar.a;
            Object obj2 = ko2Var.b;
            pyd pydVar = pyd.d0;
            if (obj2 == pydVar) {
                synchronized (ko2Var) {
                    obj2 = ko2Var.b;
                    if (obj2 == pydVar) {
                        Function1 function1 = (Function1) ko2Var.a;
                        function1.getClass();
                        Object objInvoke = function1.invoke(context);
                        ko2Var.b = objInvoke;
                        ko2Var.a = null;
                        obj2 = objInvoke;
                    }
                }
            }
            return new cga(str, nvaVar, d2fVar, d2fVar2, d2fVar3, (cp2) obj2);
        }
    }

    @uh3(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
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
            return cga.this.a(this);
        }
    }

    @uh3(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<xga, lu2<? super rne>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = cga.this.new c(lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xga xgaVar, lu2<? super rne> lu2Var) {
            return ((c) create(xgaVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            xga xgaVar;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                xgaVar = (xga) this.L$0;
                cga cgaVar = cga.this;
                yne yneVar = xgaVar.e;
                if (yneVar == null) {
                    r6.g("body == null");
                    return null;
                }
                this.L$0 = xgaVar;
                this.label = 1;
                obj = cga.b(cgaVar, yneVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xgaVar = (xga) this.L$0;
                r7d.b(obj);
            }
            return new rne((g37) obj, cga.f(cga.this.a, xgaVar.d.a()), we3.d);
        }
    }

    @uh3(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<xga, lu2<? super rne>, Object> {
        final /* synthetic */ luc<xga> $cacheResponse;
        final /* synthetic */ uga $networkRequest;
        final /* synthetic */ luc<y54.c> $snapshot;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ cga this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(luc<y54.c> lucVar, cga cgaVar, luc<xga> lucVar2, uga ugaVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$snapshot = lucVar;
            this.this$0 = cgaVar;
            this.$cacheResponse = lucVar2;
            this.$networkRequest = ugaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            d dVar = new d(this.$snapshot, this.this$0, this.$cacheResponse, this.$networkRequest, lu2Var);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xga xgaVar, lu2<? super rne> lu2Var) {
            return ((d) create(xgaVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[RETURN] */
        /* JADX WARN: Type inference failed for: r12v6, types: [T, xga] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cga.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public cga(String str, nva nvaVar, d2f d2fVar, d2f d2fVar2, d2f d2fVar3, cp2 cp2Var) {
        this.a = str;
        this.b = nvaVar;
        this.c = d2fVar;
        this.d = d2fVar2;
        this.e = d2fVar3;
        this.f = cp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.cga r4, defpackage.yne r5, defpackage.pu2 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.ega
            if (r0 == 0) goto L16
            r0 = r6
            ega r0 = (defpackage.ega) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            ega r0 = new ega
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            zn1 r4 = (defpackage.zn1) r4
            java.lang.Object r5 = r0.L$0
            cga r5 = (defpackage.cga) r5
            defpackage.r7d.b(r6)
            r6 = r4
            r4 = r5
            goto L50
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L39:
            defpackage.r7d.b(r6)
            zn1 r6 = new zn1
            r6.<init>()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            j6g r5 = r5.a(r6)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L50
            return r0
        L50:
            pa5 r4 = r4.e()
            une r5 = new une
            r5.<init>(r6, r4, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cga.b(cga, yne, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.cga r6, y54.c r7, defpackage.xga r8, defpackage.uga r9, defpackage.xga r10, defpackage.pu2 r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cga.c(cga, y54$c, xga, uga, xga, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = defpackage.wve.K(r4, r1, r2)
            if (r1 == 0) goto L53
        Lc:
            boolean r1 = defpackage.zve.U(r3)
            if (r1 == 0) goto L14
        L12:
            r1 = r0
            goto L50
        L14:
            r1 = 35
            java.lang.String r3 = defpackage.zve.r0(r3, r1)
            r1 = 63
            java.lang.String r3 = defpackage.zve.r0(r3, r1)
            r1 = 47
            java.lang.String r3 = defpackage.zve.o0(r1, r3, r3)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r3 = defpackage.zve.o0(r1, r3, r2)
            boolean r1 = defpackage.zve.U(r3)
            if (r1 == 0) goto L35
            goto L12
        L35:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            hb9 r1 = defpackage.tt9.a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L50
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
        L50:
            if (r1 == 0) goto L53
            return r1
        L53:
            if (r4 == 0) goto L5c
            r3 = 59
            java.lang.String r3 = defpackage.zve.p0(r4, r3)
            return r3
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cga.f(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|93|(1:(1:(1:(5:13|86|14|74|75)(2:18|19))(7:20|21|68|(3:70|(3:73|74|75)|72)(1:97)|78|(2:95|80)|84))(3:25|26|27))(12:28|(1:36)(3:32|(1:34)|35)|37|92|38|(4:40|(2:45|46)|49|(3:51|(1:54)|72))|63|62|88|64|(6:67|68|(0)(0)|78|(0)|84)|72)|90|55|(2:57|58)(6:61|62|88|64|(0)|72)|78|(0)|84|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0129, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #6 {Exception -> 0x0053, blocks: (B:21:0x004e, B:68:0x014d, B:70:0x0151, B:26:0x0063), top: B:93:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, xga] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [luc] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [luc] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T] */
    @Override // defpackage.p85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.lu2<? super defpackage.l85> r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cga.a(lu2):java.lang.Object");
    }

    public final Object d(uga ugaVar, Function2 function2, b bVar) {
        if (this.b.i.a() && wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        return this.c.getValue().a(ugaVar, new dga(function2, null), bVar);
    }

    public final pa5 e() {
        pa5 fileSystem;
        y54 y54Var = (y54) this.d.getValue();
        return (y54Var == null || (fileSystem = y54Var.getFileSystem()) == null) ? this.b.f : fileSystem;
    }

    public final uga g() {
        q55.b<hga> bVar = y27.b;
        nva nvaVar = this.b;
        hga hgaVar = (hga) r55.b(nvaVar, bVar);
        hgaVar.getClass();
        hga.a aVar = new hga.a(hgaVar);
        ut1 ut1Var = nvaVar.h;
        boolean zA = ut1Var.a();
        boolean z = nvaVar.i.a() && this.f.a();
        if (!z && zA) {
            aVar.b("only-if-cached, max-stale=2147483647");
        } else if (!z || zA) {
            if (!z && !zA) {
                aVar.b("no-cache, only-if-cached");
            }
        } else if (ut1Var.c()) {
            aVar.b("no-cache");
        } else {
            aVar.b("no-cache, no-store");
        }
        return new uga(this.a, (String) r55.b(nvaVar, y27.a), new hga(lc9.g0(aVar.a)), (vga) r55.b(nvaVar, y27.c));
    }

    public final q95 h(y54.c cVar) {
        w5b data = cVar.getData();
        pa5 pa5VarE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return i37.a(data, pa5VarE, str, cVar, 16);
    }

    public final xga i(y54.c cVar) throws Throwable {
        Throwable th;
        xga xgaVarA;
        try {
            uqc uqcVarK = c0h.k(e().m(cVar.getMetadata()));
            try {
                xgaVarA = tt1.a(uqcVarK);
                try {
                    uqcVarK.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    uqcVarK.close();
                } catch (Throwable th4) {
                    boa.h(th3, th4);
                }
                th = th3;
                xgaVarA = null;
            }
            if (th == null) {
                return xgaVarA;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
