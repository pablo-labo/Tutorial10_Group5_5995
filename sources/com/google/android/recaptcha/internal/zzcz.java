package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcz extends c1f implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzda zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzda zzdaVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzdaVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcz zzczVar = new zzcz(this.zzd, lu2Var);
        zzczVar.zze = obj;
        return zzczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r10).zza(r0, r9) != r5) goto L26;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.zzc
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L1c
            if (r0 == r2) goto L13
            defpackage.r7d.b(r10)
            goto La3
        L13:
            java.lang.Object r0 = r9.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r10)
            goto L96
        L1c:
            java.lang.Object r0 = r9.zzb
            com.google.android.recaptcha.internal.zzda r0 = (com.google.android.recaptcha.internal.zzda) r0
            java.lang.Object r3 = r9.zza
            z4a r3 = (defpackage.z4a) r3
            java.lang.Object r6 = r9.zze
            com.google.android.recaptcha.internal.zziu r6 = (com.google.android.recaptcha.internal.zziu) r6
            defpackage.r7d.b(r10)
            r10 = r6
            goto L49
        L2d:
            defpackage.r7d.b(r10)
            java.lang.Object r10 = r9.zze
            com.google.android.recaptcha.internal.zziu r10 = (com.google.android.recaptcha.internal.zziu) r10
            com.google.android.recaptcha.internal.zzda r0 = r9.zzd
            z4a r6 = com.google.android.recaptcha.internal.zzda.zzf(r0)
            r9.zze = r10
            r9.zza = r6
            r9.zzb = r0
            r9.zzc = r3
            java.lang.Object r3 = r6.h(r9)
            if (r3 == r5) goto Laa
            r3 = r6
        L49:
            com.google.android.recaptcha.internal.zzdb r6 = com.google.android.recaptcha.internal.zzda.zza(r0)     // Catch: java.lang.Throwable -> L5b
            com.google.android.recaptcha.internal.zzdb r7 = com.google.android.recaptcha.internal.zzdb.zza     // Catch: java.lang.Throwable -> L5b
            boolean r6 = defpackage.wl7.b(r6, r7)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L5d
            j6g r9 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L5b
            r3.p(r4)
            return r9
        L5b:
            r9 = move-exception
            goto La6
        L5d:
            com.google.android.recaptcha.internal.zzdb r6 = com.google.android.recaptcha.internal.zzdb.zzb     // Catch: java.lang.Throwable -> L5b
            com.google.android.recaptcha.internal.zzda.zzh(r0, r6)     // Catch: java.lang.Throwable -> L5b
            yd2 r6 = defpackage.hh1.e()     // Catch: java.lang.Throwable -> L5b
            r0.zza = r6     // Catch: java.lang.Throwable -> L5b
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L5b
            r3.p(r4)
            com.google.android.recaptcha.internal.zzda r0 = r9.zzd
            com.google.android.recaptcha.internal.zzfa r3 = com.google.android.recaptcha.internal.zzda.zzk(r0)
            e13 r3 = r3.zzd()
            com.google.android.recaptcha.internal.zzcy r6 = new com.google.android.recaptcha.internal.zzcy
            r6.<init>(r10, r0, r4)
            defpackage.u63.Y(r3, r4, r4, r6, r1)
            r9.zze = r10
            r9.zza = r4
            r9.zzb = r4
            r9.zzc = r2
            com.google.android.recaptcha.internal.zzcx r2 = new com.google.android.recaptcha.internal.zzcx
            r2.<init>(r0, r4)
            com.google.android.recaptcha.internal.zziq r0 = new com.google.android.recaptcha.internal.zziq
            r0.<init>(r2)
            if (r0 == r5) goto Laa
            r8 = r0
            r0 = r10
            r10 = r8
        L96:
            com.google.android.recaptcha.internal.zziq r10 = (com.google.android.recaptcha.internal.zziq) r10
            r9.zze = r4
            r9.zzc = r1
            java.lang.Object r9 = r10.zza(r0, r9)
            if (r9 != r5) goto La3
            goto Laa
        La3:
            j6g r9 = defpackage.j6g.a
            return r9
        La6:
            r3.p(r4)
            throw r9
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
