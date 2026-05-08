package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcd extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzcg zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcd(zzcg zzcgVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzcgVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcd zzcdVar = new zzcd(this.zzb, this.zzc, lu2Var);
        zzcdVar.zzd = obj;
        return zzcdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcd) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r8 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r8 != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r2;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.zza
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L13
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r8)
            goto L46
        Ld:
            defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L11
            goto L37
        L11:
            r8 = move-exception
            goto L3a
        L13:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.zzd
            com.google.android.recaptcha.internal.zziu r8 = (com.google.android.recaptcha.internal.zziu) r8
            com.google.android.recaptcha.internal.zzcg r0 = r7.zzb     // Catch: java.lang.Exception -> L11
            int r3 = r0.zza()     // Catch: java.lang.Exception -> L11
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Exception -> L11
            r4.<init>(r3)     // Catch: java.lang.Exception -> L11
            com.google.android.recaptcha.internal.zzcc r3 = new com.google.android.recaptcha.internal.zzcc     // Catch: java.lang.Exception -> L11
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Exception -> L11
            r6 = 0
            r3.<init>(r0, r5, r6)     // Catch: java.lang.Exception -> L11
            r7.zza = r1     // Catch: java.lang.Exception -> L11
            r0 = 37
            java.lang.Object r8 = r8.zzf(r0, r4, r3, r7)     // Catch: java.lang.Exception -> L11
            if (r8 == r2) goto L45
        L37:
            com.google.android.recaptcha.internal.zzci r8 = (com.google.android.recaptcha.internal.zzci) r8     // Catch: java.lang.Exception -> L11
            return r8
        L3a:
            com.google.android.recaptcha.internal.zzcg r0 = r7.zzb
            r1 = 2
            r7.zza = r1
            java.lang.Object r8 = r0.zzg(r8, r7)
            if (r8 != r2) goto L46
        L45:
            return r2
        L46:
            com.google.android.recaptcha.internal.zzci r8 = (com.google.android.recaptcha.internal.zzci) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
