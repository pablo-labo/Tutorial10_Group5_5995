package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzgn;
import defpackage.lu2;
import defpackage.sy3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", "", "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lo7d;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLlu2;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String siteKey) {
        return zzgn.zzd(application, siteKey);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m21getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, lu2 lu2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m22getClientBWLJW6A(application, str, j, lu2Var);
    }

    @sy3
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        return zzgn.zze(application, siteKey, 10000L);
    }

    public final Object fetchClient(Application application, String str, lu2<? super RecaptchaClient> lu2Var) {
        return zzgn.zza.zzb(application, str, lu2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @defpackage.sy3
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, defpackage.lu2<? super defpackage.o7d<? extends com.google.android.recaptcha.RecaptchaClient>> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L14
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zzc = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r4 = r9.zza
            int r0 = r9.zzc
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.r7d.b(r4)     // Catch: java.lang.Throwable -> L41
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.r7d.b(r4)
            com.google.android.recaptcha.internal.zzgn r4 = com.google.android.recaptcha.internal.zzgn.zza     // Catch: java.lang.Throwable -> L41
            r9.zzc = r1     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r4.zzc(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L41
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L3e
            return r5
        L3e:
            com.google.android.recaptcha.internal.zzgk r4 = (com.google.android.recaptcha.internal.zzgk) r4     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r0 = move-exception
            r4 = r0
            o7d$a r5 = new o7d$a
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m22getClientBWLJW6A(android.app.Application, java.lang.String, long, lu2):java.lang.Object");
    }

    @sy3
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        return zzgn.zze(application, siteKey, timeout);
    }
}
