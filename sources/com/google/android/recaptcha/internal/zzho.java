package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzho extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhu zzb;
    final /* synthetic */ long zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzho(zzhu zzhuVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhuVar;
        this.zzc = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzho zzhoVar = new zzho(this.zzb, this.zzc, lu2Var);
        zzhoVar.zzd = obj;
        return zzhoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzho) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[Catch: Exception -> 0x0011, TRY_ENTER, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:19:0x0055, B:24:0x006a, B:25:0x0078, B:16:0x0042), top: B:42:0x0007 }] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r13 = this;
            int r0 = r13.zza
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 == r1) goto L14
            defpackage.r7d.b(r14)     // Catch: java.lang.Exception -> L11
            goto L55
        L11:
            r0 = move-exception
            r14 = r0
            goto L79
        L14:
            defpackage.r7d.b(r14)
            goto L42
        L18:
            java.lang.Object r0 = r13.zzd
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r14)
            goto L36
        L20:
            defpackage.r7d.b(r14)
            java.lang.Object r14 = r13.zzd
            r0 = r14
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzhu r14 = r13.zzb
            long r5 = r13.zzc
            r13.zzd = r0
            r13.zza = r2
            java.lang.Object r14 = com.google.android.recaptcha.internal.zzhu.zzh(r14, r5, r13)
            if (r14 == r4) goto Lbc
        L36:
            com.google.android.recaptcha.internal.zziq r14 = (com.google.android.recaptcha.internal.zziq) r14
            r13.zzd = r3
            r13.zza = r1
            java.lang.Object r14 = r14.zza(r0, r13)
            if (r14 == r4) goto Lbc
        L42:
            com.google.android.recaptcha.internal.zzhu r14 = r13.zzb     // Catch: java.lang.Exception -> L11
            com.google.android.recaptcha.internal.zzhn r0 = new com.google.android.recaptcha.internal.zzhn     // Catch: java.lang.Exception -> L11
            long r1 = r13.zzc     // Catch: java.lang.Exception -> L11
            r0.<init>(r1, r14, r3)     // Catch: java.lang.Exception -> L11
            r1 = 3
            r13.zza = r1     // Catch: java.lang.Exception -> L11
            java.lang.Object r14 = com.google.android.recaptcha.internal.zzhu.zzg(r14, r0, r13)     // Catch: java.lang.Exception -> L11
            if (r14 != r4) goto L55
            goto Lbc
        L55:
            java.lang.Number r14 = (java.lang.Number) r14     // Catch: java.lang.Exception -> L11
            long r0 = r14.longValue()     // Catch: java.lang.Exception -> L11
            long r4 = r13.zzc     // Catch: java.lang.Exception -> L11
            long r4 = r4 - r0
            r0 = 500(0x1f4, double:2.47E-321)
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 < 0) goto L6a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r4)
            return r13
        L6a:
            com.google.android.recaptcha.internal.zzeg r6 = new com.google.android.recaptcha.internal.zzeg     // Catch: java.lang.Exception -> L11
            com.google.android.recaptcha.internal.zzee r7 = com.google.android.recaptcha.internal.zzee.zzc     // Catch: java.lang.Exception -> L11
            com.google.android.recaptcha.internal.zzed r8 = com.google.android.recaptcha.internal.zzed.zzas     // Catch: java.lang.Exception -> L11
            r11 = 12
            r12 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L11
            throw r6     // Catch: java.lang.Exception -> L11
        L79:
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzeg
            if (r0 == 0) goto L80
            r3 = r14
            com.google.android.recaptcha.internal.zzeg r3 = (com.google.android.recaptcha.internal.zzeg) r3
        L80:
            if (r3 != 0) goto L94
            com.google.android.recaptcha.internal.zzeg r4 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r5 = com.google.android.recaptcha.internal.zzee.zzc
            com.google.android.recaptcha.internal.zzed r6 = com.google.android.recaptcha.internal.zzed.zzas
            java.lang.String r7 = r14.getMessage()
            r9 = 8
            r10 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = r4
        L94:
            com.google.android.recaptcha.internal.zzhu r13 = r13.zzb
            com.google.android.recaptcha.internal.zzga r14 = r13.zzd()
            com.google.android.recaptcha.internal.zzfw r0 = com.google.android.recaptcha.internal.zzga.zza()
            boolean r14 = defpackage.wl7.b(r14, r0)
            if (r14 != 0) goto Lb4
            com.google.android.recaptcha.internal.zzga r14 = r13.zzd()
            com.google.android.recaptcha.internal.zzfy r0 = com.google.android.recaptcha.internal.zzga.zzc()
            boolean r14 = defpackage.wl7.b(r14, r0)
            if (r14 == 0) goto Lb3
            goto Lb4
        Lb3:
            throw r3
        Lb4:
            com.google.android.recaptcha.internal.zzeg r13 = com.google.android.recaptcha.internal.zzhu.zzc(r13)
            if (r13 == 0) goto Lbb
            r3 = r13
        Lbb:
            throw r3
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzho.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
