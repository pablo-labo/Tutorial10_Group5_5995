package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdj extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzdn zzd;
    final /* synthetic */ zzalo zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zziu zziuVar, zzdn zzdnVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzdnVar;
        this.zze = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdj(this.zzc, this.zzd, this.zze, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.zzb
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 == r1) goto L12
            defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            goto L87
        L12:
            java.lang.Object r0 = r7.zza
            com.google.android.recaptcha.internal.zzdn r0 = (com.google.android.recaptcha.internal.zzdn) r0
            defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            goto L4c
        L1a:
            defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            goto L36
        L1e:
            defpackage.r7d.b(r8)
            com.google.android.recaptcha.internal.zziu r8 = r7.zzc     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzdi r0 = new com.google.android.recaptcha.internal.zzdi     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzdn r5 = r7.zzd     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzalo r6 = r7.zze     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r0.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r7.zzb = r2     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r2 = 50
            java.lang.Object r8 = r8.zzf(r2, r3, r0, r7)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            if (r8 == r4) goto L93
        L36:
            com.google.android.recaptcha.internal.zzdn r0 = r7.zzd     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzalo r8 = r7.zze     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzalu r8 = r8.zzg()     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzdn.zzy(r0, r8)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r7.zza = r0     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r7.zzb = r1     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzdn.zzr(r0, r7)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            if (r8 != r4) goto L4c
            goto L93
        L4c:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r0.zza = r8     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzdn r8 = r7.zzd     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zziu r0 = r7.zzc     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzir r0 = r0.zza()     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            com.google.android.recaptcha.internal.zzdn.zzx(r8, r0)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.util.List r0 = r8.zzu()     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r2.<init>(r0)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.util.HashMap r0 = com.google.android.recaptcha.internal.zzdn.zzt(r8)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.util.Optional r0 = java.util.Optional.of(r0)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            xr3 r8 = com.google.android.recaptcha.internal.zzdn.zzv(r8, r2, r0)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r7.zza = r3     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            r0 = 3
            r7.zzb = r0     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.lang.Object r8 = r8.n1(r7)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            if (r8 != r4) goto L87
            goto L93
        L87:
            o7d r8 = (defpackage.o7d) r8     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            java.lang.Object r7 = r8.b()     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            j6g r7 = defpackage.j6g.a     // Catch: java.lang.Exception -> L94 com.google.android.recaptcha.internal.zzeg -> Lad
            goto Lb5
        L93:
            return r4
        L94:
            r0 = move-exception
            r7 = r0
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zzaY
            java.lang.String r3 = r7.getMessage()
            r5 = 8
            r6 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            o7d$a r7 = new o7d$a
            r7.<init>(r0)
            goto Lb5
        Lad:
            r0 = move-exception
            r7 = r0
            o7d$a r8 = new o7d$a
            r8.<init>(r7)
            r7 = r8
        Lb5:
            o7d r8 = new o7d
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
