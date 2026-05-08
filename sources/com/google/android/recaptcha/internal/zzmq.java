package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmq extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzmu zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zzmu zzmuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzmuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzmq zzmqVar = new zzmq(this.zzb, lu2Var);
        zzmqVar.zzc = obj;
        return zzmqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmq) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r7.zzc(r0, r6) == r2) goto L19;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zza
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L11
            java.lang.Object r3 = r6.zzc
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            defpackage.r7d.b(r7)
            if (r0 == r1) goto L34
            goto L53
        L11:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.zzc
            com.google.android.recaptcha.internal.zziu r7 = (com.google.android.recaptcha.internal.zziu) r7
            com.google.android.recaptcha.internal.zzmu r0 = r6.zzb
            com.google.android.recaptcha.internal.zzfe r0 = r0.zzn()
            com.google.android.recaptcha.internal.zzmy r3 = com.google.android.recaptcha.internal.zzmy.zzd
            com.google.android.recaptcha.internal.zzmy r4 = com.google.android.recaptcha.internal.zzmy.zzc
            com.google.android.recaptcha.internal.zzmy r5 = com.google.android.recaptcha.internal.zzmy.zzb
            com.google.android.recaptcha.internal.zzmy[] r3 = new com.google.android.recaptcha.internal.zzmy[]{r3, r4, r5}
            r6.zzc = r7
            r6.zza = r1
            java.lang.Object r0 = r0.zzb(r3, r6)
            if (r0 == r2) goto L70
            r3 = r7
            r7 = r0
        L34:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3f
            j6g r6 = defpackage.j6g.a
            return r6
        L3f:
            com.google.android.recaptcha.internal.zzmu r7 = r6.zzb
            com.google.android.recaptcha.internal.zzfe r7 = r7.zzn()
            com.google.android.recaptcha.internal.zzmy r0 = com.google.android.recaptcha.internal.zzmy.zzb
            r6.zzc = r3
            r1 = 2
            r6.zza = r1
            java.lang.Object r7 = r7.zzc(r0, r6)
            if (r7 != r2) goto L53
            goto L70
        L53:
            com.google.android.recaptcha.internal.zzmu r6 = r6.zzb
            yd2 r7 = defpackage.hh1.e()
            r6.zza = r7
            com.google.android.recaptcha.internal.zzfa r7 = com.google.android.recaptcha.internal.zzmu.zzA(r6)
            e13 r7 = r7.zza()
            com.google.android.recaptcha.internal.zzmp r0 = new com.google.android.recaptcha.internal.zzmp
            r1 = 0
            r0.<init>(r3, r6, r1)
            r6 = 3
            defpackage.u63.Y(r7, r1, r1, r0, r6)
            j6g r6 = defpackage.j6g.a
            return r6
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
