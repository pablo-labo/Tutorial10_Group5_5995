package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgg extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgk zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgg(zzgk zzgkVar, long j, RecaptchaAction recaptchaAction, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzgkVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgg zzggVar = new zzgg(this.zzb, this.zzc, this.zzd, lu2Var);
        zzggVar.zze = obj;
        return zzggVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgg) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11 == r3) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.zza
            r1 = 0
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L16
            if (r0 == r2) goto Le
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            goto L4f
        Le:
            java.lang.Object r0 = r10.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r11)     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            goto L37
        L16:
            defpackage.r7d.b(r11)
            java.lang.Object r11 = r10.zze
            r0 = r11
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzgk r5 = r10.zzb     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            long r6 = r10.zzc     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            com.google.android.recaptcha.RecaptchaAction r8 = r10.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r10.zze = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r10.zza = r2     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            com.google.android.recaptcha.internal.zzgj r4 = new com.google.android.recaptcha.internal.zzgj     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r9 = 0
            r4.<init>(r5, r6, r8, r9)     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            com.google.android.recaptcha.internal.zzip r11 = new com.google.android.recaptcha.internal.zzip     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r2 = 9
            r11.<init>(r2, r4, r1)     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            if (r11 == r3) goto L44
        L37:
            com.google.android.recaptcha.internal.zzip r11 = (com.google.android.recaptcha.internal.zzip) r11     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r10.zze = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            r1 = 2
            r10.zza = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            java.lang.Object r11 = r11.zza(r0, r10)     // Catch: com.google.android.recaptcha.internal.zzeg -> L45
            if (r11 != r3) goto L4f
        L44:
            return r3
        L45:
            r0 = move-exception
            r10 = r0
            com.google.android.recaptcha.RecaptchaException r10 = r10.zzc()
            o7d$a r11 = defpackage.r7d.a(r10)
        L4f:
            o7d r10 = new o7d
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
