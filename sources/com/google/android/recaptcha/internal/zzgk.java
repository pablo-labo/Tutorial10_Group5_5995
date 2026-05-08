package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import defpackage.u63;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgk implements RecaptchaClient, RecaptchaTasksClient {
    private final zzgb zza;
    private final String zzb;
    private final zzir zzc;
    private final zzfa zzd;

    public zzgk(zzgb zzgbVar, String str, zzir zzirVar, zzfa zzfaVar) {
        this.zza = zzgbVar;
        this.zzb = str;
        this.zzc = zzirVar;
        this.zzd = zzfaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(com.google.android.recaptcha.RecaptchaAction r10, long r11, defpackage.lu2 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzgf
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzgf r0 = (com.google.android.recaptcha.internal.zzgf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzgf r0 = new com.google.android.recaptcha.internal.zzgf
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r13)
            goto L45
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.r7d.b(r13)
            com.google.android.recaptcha.internal.zzir r13 = r9.zzc
            com.google.android.recaptcha.internal.zzgh r3 = new com.google.android.recaptcha.internal.zzgh
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8)
            r0.zzc = r2
            java.lang.Object r13 = r3.invoke(r13, r0)
            g13 r9 = defpackage.g13.a
            if (r13 != r9) goto L45
            return r9
        L45:
            o7d r13 = (defpackage.o7d) r13
            java.lang.Object r9 = r13.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgk.zzd(com.google.android.recaptcha.RecaptchaAction, long, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo23execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, defpackage.lu2<? super defpackage.o7d<java.lang.String>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzgd
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzgd r0 = (com.google.android.recaptcha.internal.zzgd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzgd r0 = new com.google.android.recaptcha.internal.zzgd
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            defpackage.r7d.b(r8)
            o7d r8 = (defpackage.o7d) r8
            java.lang.Object r4 = r8.b()
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r8)
            r0.zzc = r2
            java.lang.Object r4 = r4.zzd(r5, r6, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgk.mo23execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo24executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, defpackage.lu2<? super defpackage.o7d<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzge
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzge r0 = (com.google.android.recaptcha.internal.zzge) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzge r0 = new com.google.android.recaptcha.internal.zzge
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            defpackage.r7d.b(r6)
            o7d r6 = (defpackage.o7d) r6
            java.lang.Object r4 = r6.b()
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r6)
            r0.zzc = r2
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = r4.mo23execute0E7RQCE(r5, r1, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L42
            return r5
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgk.mo24executegIAlus(com.google.android.recaptcha.RecaptchaAction, lu2):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzfi.zza(u63.l(this.zzd.zzb(), null, new zzgi(this, recaptchaAction, 10000L, null), 3));
    }

    public final zzgb zza() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzfi.zza(u63.l(this.zzd.zzb(), null, new zzgi(this, recaptchaAction, j, null), 3));
    }
}
