package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgp extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgu zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzfv zzf;
    final /* synthetic */ zzir zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgp(zzgu zzguVar, zziu zziuVar, String str, long j, zzfv zzfvVar, zzir zzirVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzguVar;
        this.zzc = zziuVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfvVar;
        this.zzg = zzirVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgp zzgpVar = new zzgp(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, lu2Var);
        zzgpVar.zzh = obj;
        return zzgpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgp) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r15 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r15 != r5) goto L24;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r14 = this;
            int r0 = r14.zza
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L29
            if (r0 == r3) goto L21
            if (r0 == r2) goto L1d
            if (r0 == r1) goto L15
            defpackage.r7d.b(r15)
            goto L89
        L15:
            java.lang.Object r0 = r14.zzh
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r15)
            goto L77
        L1d:
            defpackage.r7d.b(r15)
            goto L5b
        L21:
            java.lang.Object r0 = r14.zzh
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r15)
            goto L4f
        L29:
            defpackage.r7d.b(r15)
            java.lang.Object r15 = r14.zzh
            r0 = r15
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            com.google.android.recaptcha.internal.zzgu r7 = r14.zzb
            com.google.android.recaptcha.internal.zzgk r15 = com.google.android.recaptcha.internal.zzgu.zza(r7)
            if (r15 == 0) goto L5e
            com.google.android.recaptcha.internal.zziu r0 = r14.zzc
            java.lang.String r1 = r14.zzd
            r14.zzh = r0
            r14.zza = r3
            com.google.android.recaptcha.internal.zzgt r3 = new com.google.android.recaptcha.internal.zzgt
            r3.<init>(r15, r1, r4)
            com.google.android.recaptcha.internal.zzip r15 = new com.google.android.recaptcha.internal.zzip
            r1 = 45
            r15.<init>(r1, r3, r4)
            if (r15 == r5) goto L8c
        L4f:
            com.google.android.recaptcha.internal.zzip r15 = (com.google.android.recaptcha.internal.zzip) r15
            r14.zzh = r4
            r14.zza = r2
            java.lang.Object r15 = r15.zza(r0, r14)
            if (r15 == r5) goto L8c
        L5b:
            com.google.android.recaptcha.internal.zzgk r15 = (com.google.android.recaptcha.internal.zzgk) r15
            return r15
        L5e:
            java.lang.String r10 = r14.zzd
            long r8 = r14.zze
            com.google.android.recaptcha.internal.zzfv r11 = r14.zzf
            com.google.android.recaptcha.internal.zzir r12 = r14.zzg
            r14.zzh = r0
            r14.zza = r1
            com.google.android.recaptcha.internal.zzgs r6 = new com.google.android.recaptcha.internal.zzgs
            r13 = 0
            r6.<init>(r7, r8, r10, r11, r12, r13)
            com.google.android.recaptcha.internal.zziq r15 = new com.google.android.recaptcha.internal.zziq
            r15.<init>(r6)
            if (r15 == r5) goto L8c
        L77:
            com.google.android.recaptcha.internal.zziq r15 = (com.google.android.recaptcha.internal.zziq) r15
            r14.zzh = r4
            r1 = 4
            r14.zza = r1
            com.google.android.recaptcha.internal.zziu r0 = r0.zza()
            java.lang.Object r15 = r15.zza(r0, r14)
            if (r15 != r5) goto L89
            goto L8c
        L89:
            com.google.android.recaptcha.internal.zzgk r15 = (com.google.android.recaptcha.internal.zzgk) r15
            return r15
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
