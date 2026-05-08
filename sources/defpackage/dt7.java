package defpackage;

import android.os.Build;
import defpackage.et7;
import defpackage.xh8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dt7 implements at7, xh8 {
    public final boolean a;

    public dt7() {
        List<String> list = w8c.a;
        this.a = w8c.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // defpackage.at7
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ft7 a() {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L35
            boolean r0 = r6 instanceof defpackage.ai8
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r4 = 0
            if (r0 == 0) goto L20
            ai8 r6 = (defpackage.ai8) r6
            qpd r6 = r6.d()
        L15:
            iwc r0 = defpackage.fwc.a
            yd8 r0 = r0.b(r1)
            java.lang.Object r6 = r6.a(r4, r0, r4)
            goto L2b
        L20:
            vh8 r6 = xh8.a.a()
            zpd r6 = r6.a
            java.lang.Object r6 = r6.b
            qpd r6 = (defpackage.qpd) r6
            goto L15
        L2b:
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            int r6 = r6.checkSelfPermission(r0)
            if (r6 != 0) goto L37
        L35:
            r6 = r3
            goto L38
        L37:
            r6 = r2
        L38:
            java.lang.Class<kq7> r0 = defpackage.kq7.class
            java.lang.Object r0 = defpackage.cr8.p(r0)
            kq7 r0 = (defpackage.kq7) r0
            java.lang.String r1 = "PushNotificationDenyCount"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "PushPrimer"
            java.lang.Integer r0 = r0.c(r5, r4, r1)
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            goto L54
        L53:
            r0 = r2
        L54:
            r1 = 2
            if (r0 < r1) goto L58
            r2 = r3
        L58:
            if (r6 == 0) goto L5d
            ft7 r6 = defpackage.ft7.c
            return r6
        L5d:
            if (r2 == 0) goto L62
            ft7 r6 = defpackage.ft7.b
            return r6
        L62:
            ft7 r6 = defpackage.ft7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt7.a():ft7");
    }

    @Override // defpackage.at7
    public final void b() {
        ((kq7) cr8.p(kq7.class)).i(System.currentTimeMillis(), "PushPrimer", "LastPushPrimerTimestamp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void c(Function1<? super et7, j6g> function1) {
        ((np7) cr8.p(np7.class)).a("JSTPushAuthorizationImpl", "openPushNotificationAuthorizationSettings()");
        ((a8c) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(a8c.class), null)).g(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void e(Function1 function1) {
        ((np7) cr8.p(np7.class)).a("JSTPushAuthorizationImpl", "requestImmediateSystemPushAuthorization()");
        ((a8c) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(a8c.class), null)).c(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void f(gt7 gt7Var, ht7 ht7Var, String str, Function1 function1) {
        ht7Var.getClass();
        if (a() != ft7.b) {
            function1.invoke(zs7.a);
        } else if (h()) {
            ((a8c) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(a8c.class), null)).b(gt7Var, ht7Var, str, function1);
        } else {
            function1.invoke(zs7.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void g(gt7 gt7Var, ht7 ht7Var, String str, Function1 function1) {
        ht7Var.getClass();
        ft7 ft7VarA = a();
        if (ft7VarA != ft7.a) {
            function1.invoke(new et7.b(ft7VarA));
        } else if (h()) {
            ((a8c) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(a8c.class), null)).a(gt7Var, ht7Var, str, function1);
        } else {
            function1.invoke(new et7.b(ft7VarA));
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.at7
    public final boolean h() {
        if (this.a) {
            return false;
        }
        long jA = ((z0g) cr8.p(z0g.class)).a(345600000L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lH = ((kq7) cr8.p(kq7.class)).h(0L, "PushPrimer", "LastPushPrimerTimestamp");
        return ((bp7) cr8.p(bp7.class)).e() && Build.VERSION.SDK_INT >= 33 && a() != ft7.c && jCurrentTimeMillis - (lH != null ? lH.longValue() : 0L) >= jA;
    }
}
