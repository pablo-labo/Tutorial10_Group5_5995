package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzms extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzmu zzc;
    final /* synthetic */ zzif zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzms(zzmu zzmuVar, zzif zzifVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzmuVar;
        this.zzd = zzifVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzms(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzms) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (defpackage.ewa.O(20000, r12, r11) == r3) goto L23;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r11 = this;
            int r0 = r11.zzb
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L10
            goto L41
        L10:
            r0 = move-exception
            r12 = r0
            goto L44
        L13:
            java.lang.Object r11 = r11.zza
            com.google.android.recaptcha.internal.zzeg r11 = (com.google.android.recaptcha.internal.zzeg) r11
            defpackage.r7d.b(r12)
            goto L71
        L1b:
            defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L10
            goto L2c
        L1f:
            defpackage.r7d.b(r12)
            com.google.android.recaptcha.internal.zzmu r12 = r11.zzc     // Catch: java.lang.Exception -> L10
            r11.zzb = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r12 = r12.zzv(r11)     // Catch: java.lang.Exception -> L10
            if (r12 == r3) goto L6f
        L2c:
            com.google.android.recaptcha.internal.zzmr r12 = new com.google.android.recaptcha.internal.zzmr     // Catch: java.lang.Exception -> L10
            com.google.android.recaptcha.internal.zzmu r0 = r11.zzc     // Catch: java.lang.Exception -> L10
            com.google.android.recaptcha.internal.zzif r2 = r11.zzd     // Catch: java.lang.Exception -> L10
            r4 = 0
            r12.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> L10
            r11.zzb = r1     // Catch: java.lang.Exception -> L10
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r11 = defpackage.ewa.O(r0, r12, r11)     // Catch: java.lang.Exception -> L10
            if (r11 != r3) goto L41
            goto L6f
        L41:
            j6g r11 = defpackage.j6g.a
            return r11
        L44:
            r12.getMessage()
            com.google.android.recaptcha.internal.zzeg r4 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r5 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r6 = com.google.android.recaptcha.internal.zzed.zzV
            java.lang.String r7 = r12.getMessage()
            r9 = 8
            r10 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.android.recaptcha.internal.zzeg r12 = com.google.android.recaptcha.internal.zzay.zza(r12, r4)
            com.google.android.recaptcha.internal.zzmu r0 = r11.zzc
            com.google.android.recaptcha.internal.zzfe r0 = r0.zzn()
            com.google.android.recaptcha.internal.zzmy r1 = com.google.android.recaptcha.internal.zzmy.zza
            r11.zza = r12
            r2 = 3
            r11.zzb = r2
            java.lang.Object r11 = r0.zzc(r1, r11)
            if (r11 != r3) goto L70
        L6f:
            return r3
        L70:
            r11 = r12
        L71:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzms.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
