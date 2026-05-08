package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdf extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdn zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdn zzdnVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzdnVar;
        this.zzd = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdf zzdfVar = new zzdf(this.zzc, this.zzd, lu2Var);
        zzdfVar.zze = obj;
        return zzdfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.zzb
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L1d
            if (r0 == r1) goto L15
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L12
            goto L7e
        L12:
            r10 = move-exception
            goto L8b
        L15:
            java.lang.Object r0 = r9.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L12
            goto L67
        L1d:
            java.lang.Object r0 = r9.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            java.lang.Object r2 = r9.zze
            com.google.android.recaptcha.internal.zziu r2 = (com.google.android.recaptcha.internal.zziu) r2
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L12
            r8 = r2
            r2 = r0
            r0 = r8
            goto L59
        L2c:
            defpackage.r7d.b(r10)
            java.lang.Object r10 = r9.zze
            r0 = r10
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzdn r10 = r9.zzc
            java.util.HashMap r5 = com.google.android.recaptcha.internal.zzdn.zzt(r10)
            java.lang.Integer r6 = new java.lang.Integer
            r7 = 212(0xd4, float:2.97E-43)
            r6.<init>(r7)
            java.lang.String r7 = r9.zzd
            r5.put(r6, r7)
            r9.zze = r0     // Catch: java.lang.Exception -> L12
            r9.zza = r0     // Catch: java.lang.Exception -> L12
            r9.zzb = r2     // Catch: java.lang.Exception -> L12
            com.google.android.recaptcha.internal.zzdm r2 = new com.google.android.recaptcha.internal.zzdm     // Catch: java.lang.Exception -> L12
            r2.<init>(r10, r3)     // Catch: java.lang.Exception -> L12
            com.google.android.recaptcha.internal.zziq r10 = new com.google.android.recaptcha.internal.zziq     // Catch: java.lang.Exception -> L12
            r10.<init>(r2)     // Catch: java.lang.Exception -> L12
            if (r10 == r4) goto L8a
            r2 = r0
        L59:
            com.google.android.recaptcha.internal.zziq r10 = (com.google.android.recaptcha.internal.zziq) r10     // Catch: java.lang.Exception -> L12
            r9.zze = r0     // Catch: java.lang.Exception -> L12
            r9.zza = r3     // Catch: java.lang.Exception -> L12
            r9.zzb = r1     // Catch: java.lang.Exception -> L12
            java.lang.Object r10 = r10.zza(r2, r9)     // Catch: java.lang.Exception -> L12
            if (r10 == r4) goto L8a
        L67:
            com.google.android.recaptcha.internal.zzde r10 = new com.google.android.recaptcha.internal.zzde     // Catch: java.lang.Exception -> L12
            com.google.android.recaptcha.internal.zzdn r1 = r9.zzc     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = r9.zzd     // Catch: java.lang.Exception -> L12
            r10.<init>(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L12
            r9.zze = r3     // Catch: java.lang.Exception -> L12
            r1 = 3
            r9.zzb = r1     // Catch: java.lang.Exception -> L12
            r1 = 51
            java.lang.Object r10 = r0.zzf(r1, r3, r10, r9)     // Catch: java.lang.Exception -> L12
            if (r10 != r4) goto L7e
            goto L8a
        L7e:
            o7d r10 = (defpackage.o7d) r10     // Catch: java.lang.Exception -> L12
            java.lang.Object r10 = r10.b()     // Catch: java.lang.Exception -> L12
            o7d r0 = new o7d     // Catch: java.lang.Exception -> L12
            r0.<init>(r10)     // Catch: java.lang.Exception -> L12
            return r0
        L8a:
            return r4
        L8b:
            com.google.android.recaptcha.internal.zzdn r9 = r9.zzc
            com.google.android.recaptcha.internal.zzeg r9 = com.google.android.recaptcha.internal.zzdn.zzo(r9, r10)
            o7d$a r9 = defpackage.r7d.a(r9)
            o7d r10 = new o7d
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
