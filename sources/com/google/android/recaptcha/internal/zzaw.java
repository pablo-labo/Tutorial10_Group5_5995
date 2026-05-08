package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends c1f implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzax zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(long j, zzax zzaxVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = j;
        this.zzc = zzaxVar;
        this.zzd = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzaw zzawVar = new zzaw(this.zzb, this.zzc, this.zzd, lu2Var);
        zzawVar.zze = obj;
        return zzawVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 != r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r6;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r14 = this;
            int r0 = r14.zza
            r1 = 1
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            defpackage.r7d.b(r15)     // Catch: java.lang.Exception -> Le
            r0 = r15
            goto L34
        Le:
            r0 = move-exception
            r4 = r0
            goto L40
        L11:
            java.lang.Object r0 = r14.zze
            com.google.android.recaptcha.internal.zzeg r0 = (com.google.android.recaptcha.internal.zzeg) r0
            defpackage.r7d.b(r15)
            goto L69
        L19:
            defpackage.r7d.b(r15)
            java.lang.Object r0 = r14.zze
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            long r2 = r14.zzb     // Catch: java.lang.Exception -> Le
            com.google.android.recaptcha.internal.zzav r4 = new com.google.android.recaptcha.internal.zzav     // Catch: java.lang.Exception -> Le
            com.google.android.recaptcha.internal.zzax r7 = r14.zzc     // Catch: java.lang.Exception -> Le
            java.lang.String r8 = r14.zzd     // Catch: java.lang.Exception -> Le
            r9 = 0
            r4.<init>(r0, r7, r8, r9)     // Catch: java.lang.Exception -> Le
            r14.zza = r1     // Catch: java.lang.Exception -> Le
            java.lang.Object r0 = defpackage.ewa.O(r2, r4, r14)     // Catch: java.lang.Exception -> Le
            if (r0 == r6) goto L67
        L34:
            o7d r0 = (defpackage.o7d) r0     // Catch: java.lang.Exception -> Le
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> Le
            defpackage.r7d.b(r0)     // Catch: java.lang.Exception -> Le
            com.google.android.recaptcha.internal.zzaly r0 = (com.google.android.recaptcha.internal.zzaly) r0     // Catch: java.lang.Exception -> Le
            return r0
        L40:
            com.google.android.recaptcha.internal.zzeg r7 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r8 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r9 = com.google.android.recaptcha.internal.zzed.zzaa
            java.lang.String r10 = r4.getMessage()
            r12 = 8
            r13 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.google.android.recaptcha.internal.zzeg r7 = com.google.android.recaptcha.internal.zzay.zza(r4, r7)
            com.google.android.recaptcha.internal.zzax r0 = r14.zzc
            java.lang.String r1 = r14.zzd
            long r2 = r14.zzb
            r14.zze = r7
            r8 = 2
            r14.zza = r8
            r5 = r14
            java.lang.Object r0 = r0.zzf(r1, r2, r4, r5)
            if (r0 != r6) goto L68
        L67:
            return r6
        L68:
            r0 = r7
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
