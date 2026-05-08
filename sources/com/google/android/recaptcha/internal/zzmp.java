package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmp extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzmu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmp(zziu zziuVar, zzmu zzmuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzmuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzmp(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmp) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r0.zzb((com.google.android.recaptcha.internal.zzip) r6, r5) == r3) goto L14;
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
            r1 = 1
            r2 = 0
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L16
            if (r0 == r1) goto Le
            defpackage.r7d.b(r6)
            goto L3d
        Le:
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r6)
            goto L2f
        L16:
            defpackage.r7d.b(r6)
            com.google.android.recaptcha.internal.zziu r0 = r5.zzc
            com.google.android.recaptcha.internal.zzmu r6 = r5.zzd
            r5.zza = r0
            r5.zzb = r1
            com.google.android.recaptcha.internal.zzmt r1 = new com.google.android.recaptcha.internal.zzmt
            r1.<init>(r6, r2)
            com.google.android.recaptcha.internal.zzip r6 = new com.google.android.recaptcha.internal.zzip
            r4 = 42
            r6.<init>(r4, r1, r2)
            if (r6 == r3) goto L40
        L2f:
            com.google.android.recaptcha.internal.zzip r6 = (com.google.android.recaptcha.internal.zzip) r6
            r5.zza = r2
            r1 = 2
            r5.zzb = r1
            java.lang.Object r5 = r0.zzb(r6, r5)
            if (r5 != r3) goto L3d
            goto L40
        L3d:
            j6g r5 = defpackage.j6g.a
            return r5
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
