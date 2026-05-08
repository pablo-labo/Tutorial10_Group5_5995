package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import defpackage.o7d;
import defpackage.q16;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class o8d implements xh8 {
    public final Lazy a;
    public final Lazy b;
    public final String c;
    public final ih2 d;

    public static final class a extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o8d o8dVar) {
            super(0);
            this.$this_inject = o8dVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<chg> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o8d o8dVar) {
            super(0);
            this.$this_inject = o8dVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [chg, java.lang.Object] */
        @Override // defpackage.gu5
        public final chg invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(chg.class), a9cVar);
        }
    }

    public o8d() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = boa.E(qt8Var, new b(this));
        this.c = "JobSeeker Resume";
        this.d = new ih2(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.e8d a(java.lang.String r11, java.lang.String r12, defpackage.u18 r13, java.lang.Object r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            s9d$b r2 = new s9d$b
            r0 = r20
            r2.<init>(r0)
            boolean r0 = r14 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L10
            r0 = r14
            java.lang.Number r0 = (java.lang.Number) r0
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L1d
            long r3 = r0.longValue()
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
        L1b:
            r5 = r14
            goto L2d
        L1d:
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto L24
            java.lang.String r14 = (java.lang.String) r14
            goto L25
        L24:
            r14 = r1
        L25:
            if (r14 == 0) goto L2c
            java.lang.Long r14 = defpackage.vve.C(r14)
            goto L1b
        L2c:
            r5 = r1
        L2d:
            if (r17 != 0) goto L41
            if (r12 == 0) goto L3f
            r14 = 46
            java.lang.String r14 = defpackage.zve.o0(r14, r12, r12)
            int r0 = r14.length()
            if (r0 <= 0) goto L3f
            r8 = r14
            goto L43
        L3f:
            r8 = r1
            goto L43
        L41:
            r8 = r17
        L43:
            e8d r0 = new e8d
            r1 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.a(java.lang.String, java.lang.String, u18, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):e8d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e8d b(q16.g gVar) {
        String strA;
        Object aVar;
        String strA2;
        Object aVar2;
        String str = gVar.a;
        q16.f fVar = gVar.b;
        if (fVar != null) {
            q16.d dVar = fVar.b;
            t18 t18Var = dVar.d;
            if (t18Var != null && (strA2 = t18Var.a()) != null) {
                try {
                    aVar2 = u18.valueOf(strA2);
                } catch (Throwable th) {
                    aVar2 = new o7d.a(th);
                }
                obj = (u18) (aVar2 instanceof o7d.a ? null : aVar2);
            }
            return a(dVar.a, dVar.c, obj, dVar.i, dVar.e, dVar.f, dVar.g, dVar.h, dVar.b, str);
        }
        q16.e eVar = gVar.c;
        if (eVar == null) {
            return null;
        }
        q16.c cVar = eVar.b;
        t18 t18Var2 = cVar.d;
        if (t18Var2 != null && (strA = t18Var2.a()) != null) {
            try {
                aVar = u18.valueOf(strA);
            } catch (Throwable th2) {
                aVar = new o7d.a(th2);
            }
            obj = (u18) (aVar instanceof o7d.a ? null : aVar);
        }
        return a(cVar.a, cVar.c, obj, cVar.i, cVar.e, cVar.f, cVar.g, cVar.h, cVar.b, str);
    }

    public static lh0 i() {
        return ((fq7) cr8.p(fq7.class)).a();
    }

    public static Uri k(Context context, Long l) {
        context.getClass();
        if (l == null) {
            ArrayList arrayList = lz2.a;
            Log.d("ResumeFileService", "Encountered null download ID", null);
            return null;
        }
        LinkedHashMap linkedHashMap = e94.a;
        long jLongValue = l.longValue();
        Object systemService = context.getSystemService("download");
        systemService.getClass();
        DownloadManager.Query filterById = new DownloadManager.Query().setFilterById(jLongValue);
        filterById.getClass();
        Cursor cursorQuery = ((DownloadManager) systemService).query(filterById);
        if (cursorQuery.moveToFirst()) {
            cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
            ArrayList arrayList2 = lz2.a;
            Log.d("DownloadUtils", "Status: " + cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status")), null);
        }
        long jLongValue2 = l.longValue();
        Object systemService2 = context.getSystemService("download");
        systemService2.getClass();
        Uri uriForDownloadedFile = ((DownloadManager) systemService2).getUriForDownloadedFile(jLongValue2);
        ArrayList arrayList3 = lz2.a;
        Log.d("ResumeFileService", "downloadId: " + l, null);
        Log.d("ResumeFileService", "File URI: " + uriForDownloadedFile, null);
        return uriForDownloadedFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.h8d
            if (r0 == 0) goto L13
            r0 = r6
            h8d r0 = (defpackage.h8d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            h8d r0 = new h8d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.result
            int r6 = r0.label
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L2f
            if (r6 != r3) goto L29
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L58
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L2f:
            defpackage.r7d.b(r5)
            lh0 r5 = i()     // Catch: java.lang.Exception -> L27
            g16 r6 = new g16     // Catch: java.lang.Exception -> L27
            r6.<init>()     // Catch: java.lang.Exception -> L27
            kh0 r4 = new kh0     // Catch: java.lang.Exception -> L27
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L27
            r0.label = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.b(r0)     // Catch: java.lang.Exception -> L27
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L4b
            return r6
        L4b:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L27
            D extends pua$a r5 = r5.c     // Catch: java.lang.Exception -> L27
            g16$a r5 = (g16.a) r5     // Catch: java.lang.Exception -> L27
            if (r5 == 0) goto L6f
            g16$b r5 = r5.a     // Catch: java.lang.Exception -> L27
            boolean r2 = r5.a     // Catch: java.lang.Exception -> L27
            goto L6f
        L58:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to check dual resumes enabled flag, defaulting to false: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 12
            java.lang.String r0 = "ResumeFileService"
            defpackage.lz2.h(r0, r5, r1, r6)
        L6f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.c(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.i8d
            if (r0 == 0) goto L13
            r0 = r7
            i8d r0 = (defpackage.i8d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            i8d r0 = new i8d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L33
            if (r7 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2b
            goto L56
        L2b:
            r5 = move-exception
            goto L68
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L33:
            defpackage.r7d.b(r5)
            lh0 r5 = i()     // Catch: java.lang.Exception -> L2b
            nx3 r7 = new nx3     // Catch: java.lang.Exception -> L2b
            mx3 r4 = new mx3     // Catch: java.lang.Exception -> L2b
            r4.<init>(r6)     // Catch: java.lang.Exception -> L2b
            r7.<init>(r4)     // Catch: java.lang.Exception -> L2b
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2b
            r0.L$0 = r1     // Catch: java.lang.Exception -> L2b
            r0.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2b
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L56
            return r6
        L56:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2b
            D extends pua$a r5 = r5.c     // Catch: java.lang.Exception -> L2b
            nx3$a r5 = (nx3.a) r5     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L64
            nx3$b r5 = r5.a     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L64
            java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L2b
        L64:
            if (r1 == 0) goto L71
            r2 = r3
            goto L71
        L68:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "ResumeFileService"
            java.lang.String r7 = "Error deleting resume bundle: "
            defpackage.o6.l(r7, r5, r6, r2, r5)
        L71:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.e(java.lang.String, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.j8d
            if (r0 == 0) goto L13
            r0 = r6
            j8d r0 = (defpackage.j8d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            j8d r0 = new j8d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            defpackage.r7d.b(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r6)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r4.g(r5, r0)
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L40
            return r4
        L40:
            boolean r4 = r6 instanceof wx3.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.f(java.lang.String, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.k8d
            if (r0 == 0) goto L13
            r0 = r7
            k8d r0 = (defpackage.k8d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k8d r0 = new k8d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r0.L$0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r7)
            goto L50
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L31:
            defpackage.r7d.b(r7)
            kotlin.Lazy r7 = r5.a
            java.lang.Object r7 = r7.getValue()
            gsa r7 = (defpackage.gsa) r7
            zt3 r1 = new zt3
            r1.<init>(r6)
            r0.L$0 = r6
            r0.label = r2
            ih2 r5 = r5.d
            java.lang.Object r7 = r7.H(r1, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r7 != r5) goto L50
            return r5
        L50:
            wg0 r7 = (defpackage.wg0) r7
            boolean r5 = r7.d()
            r0 = 0
            java.lang.String r1 = "ResumeFileService"
            if (r5 != 0) goto L80
            p81 r5 = r7.a()
            if (r5 == 0) goto L66
            java.lang.String r5 = r5.toString()
            goto L67
        L66:
            r5 = r3
        L67:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Delete job seeker profile resume file failed: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            defpackage.lz2.b(r1, r6, r0, r3)
            wx3$a r6 = new wx3$a
            r6.<init>(r5)
            return r6
        L80:
            java.lang.Object r5 = r7.b()
            au3$a r5 = (au3.a) r5
            if (r5 == 0) goto L8f
            au3$b r5 = r5.a
            if (r5 == 0) goto L8f
            java.lang.String r5 = r5.a
            goto L90
        L8f:
            r5 = r3
        L90:
            if (r5 == 0) goto L9b
            boolean r7 = r5.equalsIgnoreCase(r6)
            if (r7 != r2) goto L9b
            wx3$b r5 = wx3.b.a
            return r5
        L9b:
            java.lang.String r7 = ", got "
            java.lang.String r2 = ")"
            java.lang.String r4 = "delete response id mismatch or missing (expected "
            java.lang.String r5 = defpackage.akb.k(r4, r6, r7, r5, r2)
            java.util.ArrayList r6 = defpackage.lz2.a
            defpackage.lz2.b(r1, r5, r0, r3)
            wx3$a r6 = new wx3$a
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.g(java.lang.String, pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r10 == r8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:16:0x0038, B:29:0x006d, B:31:0x0075, B:34:0x0083, B:36:0x0087, B:39:0x008c, B:41:0x0090, B:26:0x0056), top: B:75:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.pu2 r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.h(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(android.content.Context r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, defpackage.pu2 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.m8d
            if (r0 == 0) goto L13
            r0 = r8
            m8d r0 = (defpackage.m8d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m8d r0 = new m8d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 != r3) goto L35
            java.lang.Object r4 = r0.L$2
            r7 = r4
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r4 = r0.L$1
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.L$0
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5
            defpackage.r7d.b(r8)
            goto L4f
        L35:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L3b:
            defpackage.r7d.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r4.h(r0)
            g13 r4 = defpackage.g13.a
            if (r8 != r4) goto L4f
            return r4
        L4f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r4 = "ResumeFileService"
            if (r8 == 0) goto L76
            r0 = 0
            long r5 = defpackage.e94.a(r5, r8, r6, r0)
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "new DownloadId: "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8, r2)
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r5)
            r7.invoke(r4)
            goto L7f
        L76:
            java.util.ArrayList r5 = defpackage.lz2.a
            java.lang.String r5 = "No resume file present on profile, skipping download"
            r6 = 12
            defpackage.lz2.h(r4, r5, r2, r6)
        L7f:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.j(android.content.Context, java.lang.String, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r1 == r10) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.l(pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0204, code lost:
    
        if (r2 != r15) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0298 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:18:0x0066, B:83:0x0207, B:85:0x020f, B:87:0x0215, B:89:0x021b, B:91:0x0230, B:93:0x0237, B:95:0x023d, B:97:0x0243, B:99:0x024b, B:102:0x0251, B:105:0x0257, B:107:0x0268, B:25:0x0094, B:80:0x01af, B:109:0x026e, B:30:0x00b4, B:56:0x014a, B:58:0x0154, B:61:0x015a, B:63:0x0164, B:69:0x0172, B:73:0x017e, B:76:0x0186, B:111:0x0292, B:113:0x0298, B:115:0x029e, B:123:0x02b5, B:117:0x02a5, B:33:0x00ca, B:42:0x00f1, B:44:0x00f9, B:46:0x00fd, B:48:0x011f, B:49:0x0124, B:52:0x012f, B:38:0x00d5), top: B:132:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a5 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:18:0x0066, B:83:0x0207, B:85:0x020f, B:87:0x0215, B:89:0x021b, B:91:0x0230, B:93:0x0237, B:95:0x023d, B:97:0x0243, B:99:0x024b, B:102:0x0251, B:105:0x0257, B:107:0x0268, B:25:0x0094, B:80:0x01af, B:109:0x026e, B:30:0x00b4, B:56:0x014a, B:58:0x0154, B:61:0x015a, B:63:0x0164, B:69:0x0172, B:73:0x017e, B:76:0x0186, B:111:0x0292, B:113:0x0298, B:115:0x029e, B:123:0x02b5, B:117:0x02a5, B:33:0x00ca, B:42:0x00f1, B:44:0x00f9, B:46:0x00fd, B:48:0x011f, B:49:0x0124, B:52:0x012f, B:38:0x00d5), top: B:132:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:18:0x0066, B:83:0x0207, B:85:0x020f, B:87:0x0215, B:89:0x021b, B:91:0x0230, B:93:0x0237, B:95:0x023d, B:97:0x0243, B:99:0x024b, B:102:0x0251, B:105:0x0257, B:107:0x0268, B:25:0x0094, B:80:0x01af, B:109:0x026e, B:30:0x00b4, B:56:0x014a, B:58:0x0154, B:61:0x015a, B:63:0x0164, B:69:0x0172, B:73:0x017e, B:76:0x0186, B:111:0x0292, B:113:0x0298, B:115:0x029e, B:123:0x02b5, B:117:0x02a5, B:33:0x00ca, B:42:0x00f1, B:44:0x00f9, B:46:0x00fd, B:48:0x011f, B:49:0x0124, B:52:0x012f, B:38:0x00d5), top: B:132:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:18:0x0066, B:83:0x0207, B:85:0x020f, B:87:0x0215, B:89:0x021b, B:91:0x0230, B:93:0x0237, B:95:0x023d, B:97:0x0243, B:99:0x024b, B:102:0x0251, B:105:0x0257, B:107:0x0268, B:25:0x0094, B:80:0x01af, B:109:0x026e, B:30:0x00b4, B:56:0x014a, B:58:0x0154, B:61:0x015a, B:63:0x0164, B:69:0x0172, B:73:0x017e, B:76:0x0186, B:111:0x0292, B:113:0x0298, B:115:0x029e, B:123:0x02b5, B:117:0x02a5, B:33:0x00ca, B:42:0x00f1, B:44:0x00f9, B:46:0x00fd, B:48:0x011f, B:49:0x0124, B:52:0x012f, B:38:0x00d5), top: B:132:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:18:0x0066, B:83:0x0207, B:85:0x020f, B:87:0x0215, B:89:0x021b, B:91:0x0230, B:93:0x0237, B:95:0x023d, B:97:0x0243, B:99:0x024b, B:102:0x0251, B:105:0x0257, B:107:0x0268, B:25:0x0094, B:80:0x01af, B:109:0x026e, B:30:0x00b4, B:56:0x014a, B:58:0x0154, B:61:0x015a, B:63:0x0164, B:69:0x0172, B:73:0x017e, B:76:0x0186, B:111:0x0292, B:113:0x0298, B:115:0x029e, B:123:0x02b5, B:117:0x02a5, B:33:0x00ca, B:42:0x00f1, B:44:0x00f9, B:46:0x00fd, B:48:0x011f, B:49:0x0124, B:52:0x012f, B:38:0x00d5), top: B:132:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [hva$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r28, java.lang.String r29, okhttp3.RequestBody r30, java.lang.String r31, defpackage.pu2 r32) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.m(java.lang.String, java.lang.String, okhttp3.RequestBody, java.lang.String, pu2):java.lang.Object");
    }
}
