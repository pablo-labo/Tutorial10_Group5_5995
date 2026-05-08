package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.xd2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhq extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzhu zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ xd2 zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhq(zziu zziuVar, zzhu zzhuVar, long j, xd2 xd2Var, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzhuVar;
        this.zze = j;
        this.zzf = xd2Var;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhq zzhqVar = new zzhq(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
        zzhqVar.zzg = obj;
        return zzhqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: zzeg -> 0x0015, PHI: r0 r11
  0x007b: PHI (r0v5 com.google.android.recaptcha.internal.zzif) = (r0v4 com.google.android.recaptcha.internal.zzif), (r0v14 com.google.android.recaptcha.internal.zzif) binds: [B:29:0x0079, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v0 java.lang.Object) binds: [B:29:0x0079, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzeg -> 0x0015, blocks: (B:7:0x0010, B:33:0x008d, B:12:0x001c, B:30:0x007b, B:15:0x0024, B:28:0x0064, B:18:0x0030, B:25:0x0055, B:21:0x003b), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r10 = this;
            int r0 = r10.zzb
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L34
            if (r0 == r4) goto L28
            if (r0 == r3) goto L20
            if (r0 == r2) goto L18
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            goto L8d
        L15:
            r11 = move-exception
            goto La4
        L18:
            java.lang.Object r0 = r10.zzg
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            goto L7b
        L20:
            java.lang.Object r0 = r10.zzg
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            goto L64
        L28:
            java.lang.Object r0 = r10.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            java.lang.Object r4 = r10.zzg
            com.google.android.recaptcha.internal.zzif r4 = (com.google.android.recaptcha.internal.zzif) r4
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            goto L55
        L34:
            defpackage.r7d.b(r11)
            java.lang.Object r11 = r10.zzg
            com.google.android.recaptcha.internal.zzif r11 = (com.google.android.recaptcha.internal.zzif) r11
            com.google.android.recaptcha.internal.zziu r0 = r10.zzc     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhu r6 = r10.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhj r6 = com.google.android.recaptcha.internal.zzhu.zze(r6)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            long r7 = r10.zze     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzg = r11     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zza = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzb = r4     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            java.lang.Object r4 = r6.zzl(r7, r10)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            if (r4 != r5) goto L52
            goto La3
        L52:
            r9 = r4
            r4 = r11
            r11 = r9
        L55:
            com.google.android.recaptcha.internal.zzip r11 = (com.google.android.recaptcha.internal.zzip) r11     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzg = r4     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zza = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzb = r3     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            java.lang.Object r11 = r11.zza(r0, r10)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            if (r11 == r5) goto La3
            r0 = r4
        L64:
            com.google.android.recaptcha.internal.zzalo r11 = (com.google.android.recaptcha.internal.zzalo) r11     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhu r3 = r10.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhu.zzk(r3, r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhj r3 = com.google.android.recaptcha.internal.zzhu.zze(r3)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            long r6 = r10.zze     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzg = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzb = r2     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            java.lang.Object r11 = r3.zzj(r11, r6, r10)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            if (r11 == r5) goto La3
        L7b:
            com.google.android.recaptcha.internal.zziq r11 = (com.google.android.recaptcha.internal.zziq) r11     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r10.zzg = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            r1 = 4
            r10.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zziu r0 = r0.zza()     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            java.lang.Object r11 = r11.zza(r0, r10)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            if (r11 != r5) goto L8d
            goto La3
        L8d:
            com.google.android.recaptcha.internal.zzhu r11 = r10.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzfx r0 = com.google.android.recaptcha.internal.zzga.zzb()     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            com.google.android.recaptcha.internal.zzhu.zzm(r11, r0)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            xd2 r11 = r10.zzf     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            j6g r0 = defpackage.j6g.a     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            boolean r10 = r11.j0(r0)     // Catch: com.google.android.recaptcha.internal.zzeg -> L15
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        La3:
            return r5
        La4:
            com.google.android.recaptcha.internal.zzhu r10 = r10.zzd
            com.google.android.recaptcha.internal.zzhu.zzl(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
