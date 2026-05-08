package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdg extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdn zzc;
    final /* synthetic */ zzalo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdn zzdnVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzdnVar;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdg zzdgVar = new zzdg(this.zzc, this.zzd, lu2Var);
        zzdgVar.zze = obj;
        return zzdgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[Catch: zzeg -> 0x0084, PHI: r0 r7
  0x006d: PHI (r0v6 com.google.android.recaptcha.internal.zziu) = (r0v5 com.google.android.recaptcha.internal.zziu), (r0v12 com.google.android.recaptcha.internal.zziu) binds: [B:26:0x006b, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r7v10 java.lang.Object) = (r7v9 java.lang.Object), (r7v0 java.lang.Object) binds: [B:26:0x006b, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzeg -> 0x0084, blocks: (B:7:0x0010, B:30:0x007b, B:10:0x0018, B:27:0x006d, B:13:0x0020, B:25:0x005c, B:16:0x002c, B:22:0x004d, B:19:0x0038), top: B:37:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzb
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L30
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1c
            if (r0 == r1) goto L14
            defpackage.r7d.b(r7)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            goto L7b
        L14:
            java.lang.Object r0 = r6.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r7)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            goto L6d
        L1c:
            java.lang.Object r0 = r6.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r7)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            goto L5c
        L24:
            java.lang.Object r0 = r6.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            java.lang.Object r3 = r6.zze
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            defpackage.r7d.b(r7)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            goto L4d
        L30:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.zze
            r0 = r7
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzalo r7 = r6.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zze = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zza = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zzb = r3     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            com.google.android.recaptcha.internal.zzdl r3 = new com.google.android.recaptcha.internal.zzdl     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r3.<init>(r7, r4)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            com.google.android.recaptcha.internal.zziq r7 = new com.google.android.recaptcha.internal.zziq     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r7.<init>(r3)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            if (r7 == r5) goto L83
            r3 = r0
        L4d:
            com.google.android.recaptcha.internal.zziq r7 = (com.google.android.recaptcha.internal.zziq) r7     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zze = r3     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zza = r4     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zzb = r2     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            java.lang.Object r7 = r7.zza(r0, r6)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            if (r7 == r5) goto L83
            r0 = r3
        L5c:
            com.google.android.recaptcha.internal.zzdn r7 = r6.zzc     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            com.google.android.recaptcha.internal.zzalo r2 = r6.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            com.google.android.recaptcha.internal.zzdn.zzA(r7, r2)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zze = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzdn.zzs(r7, r2, r6)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            if (r7 == r5) goto L83
        L6d:
            com.google.android.recaptcha.internal.zziq r7 = (com.google.android.recaptcha.internal.zziq) r7     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r6.zze = r4     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            r1 = 4
            r6.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            java.lang.Object r6 = r7.zza(r0, r6)     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            if (r6 != r5) goto L7b
            goto L83
        L7b:
            j6g r6 = defpackage.j6g.a     // Catch: com.google.android.recaptcha.internal.zzeg -> L84
            o7d r7 = new o7d
            r7.<init>(r6)
            return r7
        L83:
            return r5
        L84:
            r6 = move-exception
            o7d$a r7 = new o7d$a
            r7.<init>(r6)
            o7d r6 = new o7d
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
