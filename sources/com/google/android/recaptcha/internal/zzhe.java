package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhe extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzhj zzd;
    final /* synthetic */ zzalo zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zziu zziuVar, zzhj zzhjVar, zzalo zzaloVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzhjVar;
        this.zze = zzaloVar;
        this.zzf = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhe(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhe) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r10).zza(r0, r9) == r2) goto L14;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.zzb
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L15
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r10)
            goto L40
        Ld:
            java.lang.Object r0 = r9.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r10)
            goto L31
        L15:
            defpackage.r7d.b(r10)
            com.google.android.recaptcha.internal.zziu r0 = r9.zzc
            com.google.android.recaptcha.internal.zzhj r4 = r9.zzd
            com.google.android.recaptcha.internal.zzalo r5 = r9.zze
            long r6 = r9.zzf
            r9.zza = r0
            r9.zzb = r1
            com.google.android.recaptcha.internal.zzhd r3 = new com.google.android.recaptcha.internal.zzhd
            r8 = 0
            r3.<init>(r4, r5, r6, r8)
            com.google.android.recaptcha.internal.zziq r10 = new com.google.android.recaptcha.internal.zziq
            r10.<init>(r3)
            if (r10 == r2) goto L43
        L31:
            com.google.android.recaptcha.internal.zziq r10 = (com.google.android.recaptcha.internal.zziq) r10
            r1 = 0
            r9.zza = r1
            r1 = 2
            r9.zzb = r1
            java.lang.Object r9 = r10.zza(r0, r9)
            if (r9 != r2) goto L40
            goto L43
        L40:
            j6g r9 = defpackage.j6g.a
            return r9
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
