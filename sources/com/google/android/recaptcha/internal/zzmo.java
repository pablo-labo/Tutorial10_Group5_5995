package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmo extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzalo zzb;
    final /* synthetic */ zzmu zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmo(zzalo zzaloVar, zzmu zzmuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzaloVar;
        this.zzc = zzmuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzmo zzmoVar = new zzmo(this.zzb, this.zzc, lu2Var);
        zzmoVar.zzd = obj;
        return zzmoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmo) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (((com.google.android.recaptcha.internal.zziq) r12).zza(r0, r11) != r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r12.zzc(r0, r11) != r3) goto L24;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.zza
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 == r1) goto L10
            defpackage.r7d.b(r12)
            goto L57
        L10:
            java.lang.Object r0 = r11.zzd
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r12)
            goto L48
        L18:
            defpackage.r7d.b(r12)
            goto L6a
        L1c:
            defpackage.r7d.b(r12)
            java.lang.Object r12 = r11.zzd
            r0 = r12
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzalo r12 = r11.zzb
            boolean r4 = r12.zzt()
            if (r4 == 0) goto L5a
            boolean r4 = r12.zzp()
            if (r4 == 0) goto L5a
            boolean r4 = r12.zzo()
            if (r4 != 0) goto L39
            goto L5a
        L39:
            com.google.android.recaptcha.internal.zzmu r2 = r11.zzc
            com.google.android.recaptcha.internal.zzmu.zzz(r2, r12)
            r11.zzd = r0
            r11.zza = r1
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzmu.zzt(r2, r11)
            if (r12 == r3) goto L83
        L48:
            com.google.android.recaptcha.internal.zziq r12 = (com.google.android.recaptcha.internal.zziq) r12
            r1 = 0
            r11.zzd = r1
            r1 = 3
            r11.zza = r1
            java.lang.Object r11 = r12.zza(r0, r11)
            if (r11 != r3) goto L57
            goto L83
        L57:
            j6g r11 = defpackage.j6g.a
            goto L7d
        L5a:
            com.google.android.recaptcha.internal.zzmu r12 = r11.zzc
            com.google.android.recaptcha.internal.zzfe r12 = r12.zzn()
            com.google.android.recaptcha.internal.zzmy r0 = com.google.android.recaptcha.internal.zzmy.zzd
            r11.zza = r2
            java.lang.Object r11 = r12.zzc(r0, r11)
            if (r11 == r3) goto L83
        L6a:
            com.google.android.recaptcha.internal.zzeg r4 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r5 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r6 = com.google.android.recaptcha.internal.zzed.zzay
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            o7d$a r11 = new o7d$a
            r11.<init>(r4)
        L7d:
            o7d r12 = new o7d
            r12.<init>(r11)
            return r12
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
