package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcn extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzalq zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzco zzcoVar, zzalq zzalqVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzcoVar;
        this.zzc = zzalqVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcn zzcnVar = new zzcn(this.zzb, this.zzc, lu2Var);
        zzcnVar.zzd = obj;
        return zzcnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcn) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r9).zza(r0, r8) == r2) goto L18;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r8 = this;
            int r0 = r8.zza
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L15
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r9)
            goto L6c
        Ld:
            java.lang.Object r0 = r8.zzd
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r9)
            goto L5d
        L15:
            defpackage.r7d.b(r9)
            java.lang.Object r9 = r8.zzd
            r0 = r9
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzco r9 = r8.zzb
            com.google.android.recaptcha.internal.zzes r3 = com.google.android.recaptcha.internal.zzco.zzo(r9)
            android.app.Application r4 = com.google.android.recaptcha.internal.zzco.zzb(r9)
            boolean r3 = r3.zza(r4)
            if (r3 == 0) goto L70
            com.google.android.recaptcha.internal.zzalq r3 = r8.zzc
            long r4 = r3.zza()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L70
            com.google.android.recaptcha.internal.zzaef r4 = r3.zzb()
            java.lang.String r4 = com.google.android.recaptcha.internal.zzco.zzk(r9, r4)
            com.google.android.recaptcha.internal.zzco.zzm(r9, r4)
            com.google.android.recaptcha.internal.zzda r4 = com.google.android.recaptcha.internal.zzco.zzj(r9)
            long r5 = r3.zza()
            r4.zzi(r5)
            com.google.android.recaptcha.internal.zzda r9 = com.google.android.recaptcha.internal.zzco.zzj(r9)
            r8.zzd = r0
            r8.zza = r1
            java.lang.Object r9 = r9.zzd(r8)
            if (r9 == r2) goto L6f
        L5d:
            com.google.android.recaptcha.internal.zziq r9 = (com.google.android.recaptcha.internal.zziq) r9
            r1 = 0
            r8.zzd = r1
            r1 = 2
            r8.zza = r1
            java.lang.Object r8 = r9.zza(r0, r8)
            if (r8 != r2) goto L6c
            goto L6f
        L6c:
            j6g r8 = defpackage.j6g.a
            return r8
        L6f:
            return r2
        L70:
            r8 = 0
            r9.zzn(r8)
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zzab
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
