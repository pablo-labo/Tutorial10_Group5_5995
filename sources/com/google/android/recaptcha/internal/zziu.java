package com.google.android.recaptcha.internal;

import defpackage.lu2;
import java.util.UUID;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zziu {
    private final zzia zza;
    private final zzet zzb;
    private final zzir zzc;
    private final String zzd = UUID.randomUUID().toString();

    public zziu(zzia zziaVar, zzet zzetVar, zzir zzirVar) {
        this.zza = zziaVar;
        this.zzb = zzetVar;
        this.zzc = zzirVar;
    }

    public final zzir zza() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(com.google.android.recaptcha.internal.zzip r5, defpackage.lu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzit
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzit r0 = new com.google.android.recaptcha.internal.zzit
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r6)
            r0.zzc = r2     // Catch: java.lang.Exception -> L3d
            java.lang.Object r4 = r5.zza(r4, r0)     // Catch: java.lang.Exception -> L3d
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            j6g r4 = defpackage.j6g.a
            return r4
        L3d:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziu.zzb(com.google.android.recaptcha.internal.zzip, lu2):java.lang.Object");
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzakg zzakgVar, zzajw zzajwVar) {
        this.zza.zzb(zzakgVar, this.zzc.zzc(), zzajwVar);
    }

    public final zzif zze(int i, Integer num) {
        return new zzif(this.zzb, this, i, num);
    }

    public final Object zzf(int i, Integer num, Function2 function2, lu2 lu2Var) {
        return new zzip(i, function2, num).zza(this, lu2Var);
    }
}
