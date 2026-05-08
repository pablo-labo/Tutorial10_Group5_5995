package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcv extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzda zzc;
    final /* synthetic */ zziu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzda zzdaVar, zziu zziuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzdaVar;
        this.zzd = zziuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcv(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r4).zza(r0, r3) == r2) goto L14;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.zzb
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L15
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r4)
            goto L3a
        Ld:
            java.lang.Object r0 = r3.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r4)
            goto L2b
        L15:
            defpackage.r7d.b(r4)
            com.google.android.recaptcha.internal.zzda r4 = r3.zzc
            com.google.android.recaptcha.internal.zzdb r0 = com.google.android.recaptcha.internal.zzdb.zza
            com.google.android.recaptcha.internal.zzda.zzh(r4, r0)
            com.google.android.recaptcha.internal.zziu r0 = r3.zzd
            r3.zza = r0
            r3.zzb = r1
            java.lang.Object r4 = r4.zzd(r3)
            if (r4 == r2) goto L3d
        L2b:
            com.google.android.recaptcha.internal.zziq r4 = (com.google.android.recaptcha.internal.zziq) r4
            r1 = 0
            r3.zza = r1
            r1 = 2
            r3.zzb = r1
            java.lang.Object r3 = r4.zza(r0, r3)
            if (r3 != r2) goto L3a
            goto L3d
        L3a:
            j6g r3 = defpackage.j6g.a
            return r3
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
