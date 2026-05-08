package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjr extends c1f implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzkb zzd;
    final /* synthetic */ zzjs zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjr(zzkb zzkbVar, zzjs zzjsVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzkbVar;
        this.zze = zzjsVar;
        this.zzf = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzjr(this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjr) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r0.zzh(r7, r1, r6) != r2) goto L20;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzc
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r7)
            goto L7d
        Ld:
            java.lang.Object r0 = r6.zzb
            com.google.android.recaptcha.internal.zznb r0 = (com.google.android.recaptcha.internal.zznb) r0
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzanr r1 = (com.google.android.recaptcha.internal.zzanr) r1
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L19
            goto L58
        L19:
            r7 = move-exception
            goto L6a
        L1b:
            defpackage.r7d.b(r7)
            com.google.android.recaptcha.internal.zzkb r7 = r6.zzd
            com.google.android.recaptcha.internal.zzel r0 = new com.google.android.recaptcha.internal.zzel
            r0.<init>()
            r7.zza = r0
            java.lang.String r0 = r6.zzf     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzqg r3 = com.google.android.recaptcha.internal.zzqg.zzh()     // Catch: java.lang.Exception -> L19
            byte[] r0 = r3.zzj(r0)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzanr r0 = com.google.android.recaptcha.internal.zzanr.zzc(r0)     // Catch: java.lang.Exception -> L19
            r0.zza()     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzjs r3 = r6.zze     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzlw r4 = com.google.android.recaptcha.internal.zzjs.zzb(r3)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzanp r4 = r4.zza(r0)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zznb r5 = com.google.android.recaptcha.internal.zznb.zzb()     // Catch: java.lang.Exception -> L19
            java.util.List r4 = r4.zzc()     // Catch: java.lang.Exception -> L19
            r6.zza = r0     // Catch: java.lang.Exception -> L19
            r6.zzb = r5     // Catch: java.lang.Exception -> L19
            r6.zzc = r1     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzjs.zzc(r3, r4, r7, r6)     // Catch: java.lang.Exception -> L19
            if (r7 == r2) goto L7c
            r1 = r0
            r0 = r5
        L58:
            r0.zzf()     // Catch: java.lang.Exception -> L19
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L19
            long r3 = r0.zza(r7)     // Catch: java.lang.Exception -> L19
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L19
            r7.<init>(r3)     // Catch: java.lang.Exception -> L19
            r1.zza()     // Catch: java.lang.Exception -> L19
            goto L7d
        L6a:
            com.google.android.recaptcha.internal.zzjs r0 = r6.zze
            com.google.android.recaptcha.internal.zzkb r1 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzjs.zzd(r0, r7, r1, r6)
            if (r6 != r2) goto L7d
        L7c:
            return r2
        L7d:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
