package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzce extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzcg zzb;
    final /* synthetic */ zzalq zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzce(zzcg zzcgVar, zzalq zzalqVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzcgVar;
        this.zzc = zzalqVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzce zzceVar = new zzce(this.zzb, this.zzc, lu2Var);
        zzceVar.zzd = obj;
        return zzceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r5).zza(r0.zza(), r4) == r2) goto L14;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.zza
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L15
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r5)
            goto L3e
        Ld:
            java.lang.Object r0 = r4.zzd
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r5)
            goto L2b
        L15:
            defpackage.r7d.b(r5)
            java.lang.Object r5 = r4.zzd
            r0 = r5
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            com.google.android.recaptcha.internal.zzcg r5 = r4.zzb
            com.google.android.recaptcha.internal.zzalq r3 = r4.zzc
            r4.zzd = r0
            r4.zza = r1
            java.lang.Object r5 = r5.zzf(r3, r4)
            if (r5 == r2) goto L41
        L2b:
            com.google.android.recaptcha.internal.zziq r5 = (com.google.android.recaptcha.internal.zziq) r5
            r1 = 0
            r4.zzd = r1
            r1 = 2
            r4.zza = r1
            com.google.android.recaptcha.internal.zziu r0 = r0.zza()
            java.lang.Object r4 = r5.zza(r0, r4)
            if (r4 != r2) goto L3e
            goto L41
        L3e:
            j6g r4 = defpackage.j6g.a
            return r4
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzce.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
