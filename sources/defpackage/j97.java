package defpackage;

import android.app.Application;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.launch.IndeedRecaptcha$initialize$1$1", f = "IndeedRecaptcha.kt", l = {64, 76}, m = "invokeSuspend")
public final class j97 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Application $app;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j97(Application application, lu2<? super j97> lu2Var) {
        super(2, lu2Var);
        this.$app = application;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j97(this.$app, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j97) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (defpackage.l97.a(r7, r6) == r0) goto L23;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            g13 r0 = defpackage.g13.a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.r7d.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L51
        L11:
            r6 = move-exception
            goto L79
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L19:
            defpackage.r7d.b(r7)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            goto L33
        L1d:
            r6 = move-exception
            goto L5d
        L1f:
            defpackage.r7d.b(r7)
            l97 r7 = defpackage.l97.a     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            com.google.android.recaptcha.Recaptcha r7 = com.google.android.recaptcha.Recaptcha.INSTANCE     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            android.app.Application r1 = r6.$app     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            java.lang.String r5 = "6Lc9vbcsAAAAAPYGk1bmB6ZiuapD4SIj1LeIJEL7"
            r6.label = r3     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            java.lang.Object r7 = r7.fetchClient(r1, r5, r6)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            if (r7 != r0) goto L33
            goto L50
        L33:
            com.google.android.recaptcha.RecaptchaClient r7 = (com.google.android.recaptcha.RecaptchaClient) r7     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            defpackage.l97.b = r7     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            java.lang.Class<np7> r7 = defpackage.np7.class
            java.lang.Object r7 = defpackage.cr8.p(r7)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            np7 r7 = (defpackage.np7) r7     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            java.lang.String r1 = "IndeedRecaptcha"
            java.lang.String r3 = "reCAPTCHA client initialized"
            r7.a(r1, r3)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L1d
            l97 r7 = defpackage.l97.a     // Catch: java.lang.Throwable -> L11
            r6.label = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = defpackage.l97.a(r7, r6)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L51
        L50:
            return r0
        L51:
            java.lang.Object r6 = defpackage.l97.d
            monitor-enter(r6)
            defpackage.l97.e = r4     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)
            j6g r6 = defpackage.j6g.a
            return r6
        L5a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L5d:
            java.lang.Class<np7> r7 = defpackage.np7.class
            java.lang.Object r7 = defpackage.cr8.p(r7)     // Catch: java.lang.Throwable -> L11
            np7 r7 = (defpackage.np7) r7     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "IndeedRecaptcha"
            java.lang.String r1 = "Failed to initialize reCAPTCHA client"
            r2 = 0
            r7.c(r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L11
            j6g r6 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = defpackage.l97.d
            monitor-enter(r7)
            defpackage.l97.e = r4     // Catch: java.lang.Throwable -> L76
            monitor-exit(r7)
            return r6
        L76:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L79:
            java.lang.Object r7 = defpackage.l97.d
            monitor-enter(r7)
            defpackage.l97.e = r4     // Catch: java.lang.Throwable -> L82
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L82
            monitor-exit(r7)
            throw r6
        L82:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j97.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
