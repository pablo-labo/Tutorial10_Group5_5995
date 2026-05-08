package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcy extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzda zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zziu zziuVar, zzda zzdaVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzdaVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcy(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0.zzb((com.google.android.recaptcha.internal.zzip) r6, r5) == r4) goto L14;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.zzb
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L17
            if (r0 == r3) goto Lf
            defpackage.r7d.b(r6)
            goto L3c
        Lf:
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r6)
            goto L2f
        L17:
            defpackage.r7d.b(r6)
            com.google.android.recaptcha.internal.zziu r0 = r5.zzc
            com.google.android.recaptcha.internal.zzda r6 = r5.zzd
            r5.zza = r0
            r5.zzb = r3
            com.google.android.recaptcha.internal.zzct r3 = new com.google.android.recaptcha.internal.zzct
            r3.<init>(r6, r1)
            r6 = 38
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzis.zzb(r6, r2, r3, r5)
            if (r6 == r4) goto L3f
        L2f:
            com.google.android.recaptcha.internal.zzip r6 = (com.google.android.recaptcha.internal.zzip) r6
            r5.zza = r1
            r5.zzb = r2
            java.lang.Object r5 = r0.zzb(r6, r5)
            if (r5 != r4) goto L3c
            goto L3f
        L3c:
            j6g r5 = defpackage.j6g.a
            return r5
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
