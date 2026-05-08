package defpackage;

import android.content.Context;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class sl0 implements xh8, gp7 {
    public static final d2f V;
    public static final ra8 W;
    public static final sl0 a;
    public static final Lazy b;
    public static final Lazy c;
    public static final Lazy d;
    public static final wg2 e;
    public static final a5a f;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sl0 sl0Var) {
            super(0);
            this.$this_inject = sl0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sl0 sl0Var) {
            super(0);
            this.$this_inject = sl0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<s9e> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sl0 sl0Var) {
            super(0);
            this.$this_inject = sl0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s9e] */
        @Override // defpackage.gu5
        public final s9e invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s9e.class), a9cVar);
        }
    }

    static {
        sl0 sl0Var = new sl0();
        a = sl0Var;
        a aVar = new a(sl0Var);
        qt8 qt8Var = qt8.a;
        b = boa.E(qt8Var, aVar);
        c = boa.E(qt8Var, new b(sl0Var));
        d = boa.E(qt8Var, new c(sl0Var));
        e = new wg2(25);
        f = pnb.i();
        V = new d2f(new pl0(0));
        W = sa8.a(new hu(3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable i(defpackage.sl0 r24, defpackage.pu2 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.i(sl0, pu2):java.io.Serializable");
    }

    public static final String j() {
        return (String) V.getValue();
    }

    public static LinkedHashMap k(ol0 ol0Var, Map map, String str) {
        map.getClass();
        Map mapC = (str == null || str.length() == 0) ? bs4.a : j6.c("afPreloadTransactionId", str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = ol0Var.h;
        if (l != null) {
        }
        Long l2 = ol0Var.i;
        if (l2 != null) {
        }
        Long l3 = ol0Var.j;
        if (l3 != null) {
        }
        Long l4 = ol0Var.k;
        if (l4 != null) {
            linkedHashMap.put("referrerClickTimestampServerSeconds", String.valueOf(l4.longValue()));
        }
        return lc9.c0(lc9.c0(mapC, linkedHashMap), map);
    }

    public static ol0 l() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        String str = (String) bu8.p0.a(bu8.b[26], bu8Var);
        if (str.length() == 0) {
            return null;
        }
        try {
            return (ol0) W.c(ol0.Companion.serializer(), str);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.g("AppLifecycleTracking", "Failed to decode app lifecycle snapshot", false, e2);
            return null;
        }
    }

    public static Context m() {
        return (Context) b.getValue();
    }

    @Override // defpackage.gp7
    public final String a() {
        String str;
        ol0 ol0VarL = l();
        return (ol0VarL == null || (str = ol0VarL.c) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : str;
    }

    @Override // defpackage.gp7
    public final int b() {
        ol0 ol0VarL = l();
        if (ol0VarL != null) {
            return ol0VarL.m;
        }
        return -1;
    }

    @Override // defpackage.gp7
    public final String c() {
        String str;
        ol0 ol0VarL = l();
        return (ol0VarL == null || (str = ol0VarL.c) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : str;
    }

    @Override // defpackage.gp7
    public final String e() {
        String str;
        ol0 ol0VarL = l();
        return (ol0VarL == null || (str = ol0VarL.f) == null) ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : str;
    }

    @Override // defpackage.gp7
    public final int f() {
        ol0 ol0VarL = l();
        if (ol0VarL != null) {
            return ol0VarL.l;
        }
        return -1;
    }

    @Override // defpackage.gp7
    public final int g() {
        ol0 ol0VarL = l();
        if (ol0VarL != null) {
            return ol0VarL.n;
        }
        return -1;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gp7
    public final String h() {
        return ((nl0) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(nl0.class), null)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(boolean r9, java.util.Map r10, defpackage.pu2 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.tl0
            if (r0 == 0) goto L13
            r0 = r11
            tl0 r0 = (defpackage.tl0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            tl0 r0 = new tl0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r8 = r0.result
            int r11 = r0.label
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r11 == 0) goto L50
            if (r11 == r3) goto L3c
            if (r11 != r2) goto L36
            java.lang.Object r9 = r0.L$1
            z4a r9 = (defpackage.z4a) r9
            java.lang.Object r10 = r0.L$0
            java.util.Map r10 = (java.util.Map) r10
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r8 = move-exception
            goto L8d
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r4
        L3c:
            int r9 = r0.I$0
            boolean r10 = r0.Z$0
            java.lang.Object r11 = r0.L$1
            z4a r11 = (defpackage.z4a) r11
            java.lang.Object r3 = r0.L$0
            java.util.Map r3 = (java.util.Map) r3
            defpackage.r7d.b(r8)
            r8 = r10
            r10 = r9
            r9 = r8
            r8 = r11
            goto L68
        L50:
            defpackage.r7d.b(r8)
            r0.L$0 = r10
            a5a r8 = defpackage.sl0.f
            r0.L$1 = r8
            r0.Z$0 = r9
            r0.I$0 = r1
            r0.label = r3
            java.lang.Object r11 = r8.h(r0)
            if (r11 != r5) goto L66
            goto L81
        L66:
            r3 = r10
            r10 = r1
        L68:
            eq3 r11 = defpackage.a74.a     // Catch: java.lang.Throwable -> L89
            ul0 r6 = new ul0     // Catch: java.lang.Throwable -> L89
            r6.<init>(r9, r3, r4)     // Catch: java.lang.Throwable -> L89
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L89
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L89
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L89
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L89
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L89
            r0.label = r2     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = defpackage.u63.q0(r11, r6, r0)     // Catch: java.lang.Throwable -> L89
            if (r9 != r5) goto L82
        L81:
            return r5
        L82:
            r9 = r8
        L83:
            j6g r8 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L34
            r9.p(r4)
            return r8
        L89:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L8d:
            r9.p(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.n(boolean, java.util.Map, pu2):java.lang.Object");
    }
}
