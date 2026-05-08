package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdp extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzdw zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdw zzdwVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdp zzdpVar = new zzdp(this.zzb, lu2Var);
        zzdpVar.zzc = obj;
        return zzdpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r6).zza(r1, r5) == r0) goto L18;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            g13 r0 = defpackage.g13.a
            int r1 = r5.zza
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.r7d.b(r6)
            goto L49
        Ld:
            java.lang.Object r1 = r5.zzc
            com.google.android.recaptcha.internal.zziu r1 = (com.google.android.recaptcha.internal.zziu) r1
            defpackage.r7d.b(r6)
            goto L3a
        L15:
            defpackage.r7d.b(r6)
            java.lang.Object r6 = r5.zzc
            r1 = r6
            com.google.android.recaptcha.internal.zziu r1 = (com.google.android.recaptcha.internal.zziu) r1
            com.google.android.recaptcha.internal.zzdw r6 = r5.zzb
            com.google.android.recaptcha.internal.zzfn r3 = r6.zza()
            monitor-enter(r3)
            com.google.android.recaptcha.internal.zzfn r6 = r6.zza()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "orcas_verification_key"
            r6.zzd(r4)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            com.google.android.recaptcha.internal.zzdw r6 = r5.zzb
            r5.zzc = r1
            r5.zza = r2
            java.lang.Object r6 = r6.zzc(r5)
            if (r6 == r0) goto L4c
        L3a:
            com.google.android.recaptcha.internal.zziq r6 = (com.google.android.recaptcha.internal.zziq) r6
            r2 = 0
            r5.zzc = r2
            r2 = 2
            r5.zza = r2
            java.lang.Object r5 = r6.zza(r1, r5)
            if (r5 != r0) goto L49
            goto L4c
        L49:
            j6g r5 = defpackage.j6g.a
            return r5
        L4c:
            return r0
        L4d:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
