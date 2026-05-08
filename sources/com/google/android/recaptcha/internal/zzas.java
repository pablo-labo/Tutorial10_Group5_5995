package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzas extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzax zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzax zzaxVar, String str, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzaxVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzas zzasVar = new zzas(this.zzb, this.zzc, this.zzd, lu2Var);
        zzasVar.zze = obj;
        return zzasVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzas) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r12 != r4) goto L23;
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
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L15
            if (r0 == r1) goto L11
            defpackage.r7d.b(r12)
            goto L60
        L11:
            defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L50
            goto L4d
        L15:
            java.lang.Object r0 = r11.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L50
            goto L41
        L1d:
            defpackage.r7d.b(r12)
            java.lang.Object r12 = r11.zze
            r0 = r12
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzax r8 = r11.zzb     // Catch: java.lang.Exception -> L50
            java.lang.String r9 = r11.zzc     // Catch: java.lang.Exception -> L50
            long r6 = r11.zzd     // Catch: java.lang.Exception -> L50
            r11.zze = r0     // Catch: java.lang.Exception -> L50
            r11.zza = r2     // Catch: java.lang.Exception -> L50
            int r12 = r8.zzk()     // Catch: java.lang.Exception -> L50
            com.google.android.recaptcha.internal.zzaw r5 = new com.google.android.recaptcha.internal.zzaw     // Catch: java.lang.Exception -> L50
            r10 = 0
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Exception -> L50
            com.google.android.recaptcha.internal.zzip r2 = new com.google.android.recaptcha.internal.zzip     // Catch: java.lang.Exception -> L50
            r2.<init>(r12, r5, r3)     // Catch: java.lang.Exception -> L50
            if (r2 == r4) goto L5f
            r12 = r2
        L41:
            com.google.android.recaptcha.internal.zzip r12 = (com.google.android.recaptcha.internal.zzip) r12     // Catch: java.lang.Exception -> L50
            r11.zze = r3     // Catch: java.lang.Exception -> L50
            r11.zza = r1     // Catch: java.lang.Exception -> L50
            java.lang.Object r12 = r12.zza(r0, r11)     // Catch: java.lang.Exception -> L50
            if (r12 == r4) goto L5f
        L4d:
            com.google.android.recaptcha.internal.zzaly r12 = (com.google.android.recaptcha.internal.zzaly) r12     // Catch: java.lang.Exception -> L50
            goto L60
        L50:
            com.google.android.recaptcha.internal.zzax r12 = r11.zzb
            java.lang.String r0 = r11.zzc
            r11.zze = r3
            r1 = 3
            r11.zza = r1
            java.lang.Object r12 = r12.zzb(r0, r11)
            if (r12 != r4) goto L60
        L5f:
            return r4
        L60:
            o7d r11 = new o7d
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzas.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
