package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzip {
    private final Function2 zza;
    private final Integer zzb;
    private final int zzc;

    public zzip(int i, Function2 function2, Integer num) {
        this.zzc = i;
        this.zza = function2;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(com.google.android.recaptcha.internal.zziu r9, defpackage.lu2 r10) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            com.google.android.recaptcha.internal.zzif r8 = r0.zzd
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L2a com.google.android.recaptcha.internal.zzeg -> L2d
            goto L52
        L27:
            r0 = move-exception
            r9 = r0
            goto L63
        L2a:
            r0 = move-exception
            r9 = r0
            goto L7b
        L2d:
            r0 = move-exception
            r9 = r0
            goto L93
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L38:
            defpackage.r7d.b(r10)
            int r10 = r8.zzc
            java.lang.Integer r1 = r8.zzb
            com.google.android.recaptcha.internal.zzif r9 = r9.zze(r10, r1)
            kotlin.jvm.functions.Function2 r8 = r8.zza     // Catch: java.lang.Exception -> L57 kotlinx.coroutines.TimeoutCancellationException -> L5a com.google.android.recaptcha.internal.zzeg -> L5d
            r0.zzd = r9     // Catch: java.lang.Exception -> L57 kotlinx.coroutines.TimeoutCancellationException -> L5a com.google.android.recaptcha.internal.zzeg -> L5d
            r0.zzc = r2     // Catch: java.lang.Exception -> L57 kotlinx.coroutines.TimeoutCancellationException -> L5a com.google.android.recaptcha.internal.zzeg -> L5d
            java.lang.Object r10 = r8.invoke(r9, r0)     // Catch: java.lang.Exception -> L57 kotlinx.coroutines.TimeoutCancellationException -> L5a com.google.android.recaptcha.internal.zzeg -> L5d
            g13 r8 = defpackage.g13.a
            if (r10 == r8) goto L56
            r8 = r9
        L52:
            r8.zzb()     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L2a com.google.android.recaptcha.internal.zzeg -> L2d
            return r10
        L56:
            return r8
        L57:
            r0 = move-exception
            r8 = r0
            goto L60
        L5a:
            r0 = move-exception
            r8 = r0
            goto L78
        L5d:
            r0 = move-exception
            r8 = r0
            goto L90
        L60:
            r7 = r9
            r9 = r8
            r8 = r7
        L63:
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zza
            java.lang.String r3 = r9.getMessage()
            r5 = 8
            r6 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.zzc(r0)
            throw r0
        L78:
            r7 = r9
            r9 = r8
            r8 = r7
        L7b:
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zzb
            java.lang.String r3 = r9.getMessage()
            r5 = 8
            r6 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.zzc(r0)
            throw r0
        L90:
            r7 = r9
            r9 = r8
            r8 = r7
        L93:
            r8.zzc(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzip.zza(com.google.android.recaptcha.internal.zziu, lu2):java.lang.Object");
    }
}
