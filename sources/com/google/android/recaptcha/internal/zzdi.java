package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdi extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdn zzc;
    final /* synthetic */ zzalo zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdn zzdnVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzdnVar;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdi(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0.zza(r2, r8, r7) == r3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [j6g, java.lang.Object] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r7 = this;
            int r0 = r7.zzb
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            defpackage.r7d.b(r8)     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            goto L49
        L10:
            r0 = move-exception
            r8 = r0
            goto L4c
        L13:
            java.lang.Object r7 = r7.zza
            com.google.android.recaptcha.internal.zzeg r7 = (com.google.android.recaptcha.internal.zzeg) r7
            defpackage.r7d.b(r8)
            goto L66
        L1b:
            defpackage.r7d.b(r8)
            goto L30
        L1f:
            defpackage.r7d.b(r8)
            com.google.android.recaptcha.internal.zzdn r8 = r7.zzc
            com.google.android.recaptcha.internal.zzdw r8 = com.google.android.recaptcha.internal.zzdn.zzC(r8)
            r7.zzb = r2
            java.lang.Object r8 = r8.zzb(r7)
            if (r8 == r3) goto L76
        L30:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L67
            com.google.android.recaptcha.internal.zzdn r0 = r7.zzc     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            com.google.android.recaptcha.internal.zzdx r0 = com.google.android.recaptcha.internal.zzdn.zzn(r0)     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            com.google.android.recaptcha.internal.zzalo r2 = r7.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            com.google.android.recaptcha.internal.zzalu r2 = r2.zzg()     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            r7.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            java.lang.Object r7 = r0.zza(r2, r8, r7)     // Catch: com.google.android.recaptcha.internal.zzeg -> L10
            if (r7 != r3) goto L49
            goto L76
        L49:
            j6g r7 = defpackage.j6g.a
            return r7
        L4c:
            com.google.android.recaptcha.internal.zzdn r0 = r7.zzc
            com.google.android.recaptcha.internal.zzdw r0 = com.google.android.recaptcha.internal.zzdn.zzC(r0)
            r7.zza = r8
            r1 = 3
            r7.zzb = r1
            com.google.android.recaptcha.internal.zzdp r7 = new com.google.android.recaptcha.internal.zzdp
            r1 = 0
            r7.<init>(r0, r1)
            com.google.android.recaptcha.internal.zziq r0 = new com.google.android.recaptcha.internal.zziq
            r0.<init>(r7)
            if (r0 != r3) goto L65
            goto L76
        L65:
            r7 = r8
        L66:
            throw r7
        L67:
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zzbg
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
