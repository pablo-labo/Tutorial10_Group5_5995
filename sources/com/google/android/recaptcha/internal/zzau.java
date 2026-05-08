package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzau extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzax zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzalo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzax zzaxVar, long j, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzaxVar;
        this.zzc = j;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzau zzauVar = new zzau(this.zzb, this.zzc, this.zzd, lu2Var);
        zzauVar.zze = obj;
        return zzauVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r10 != r3) goto L18;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r9 = this;
            int r0 = r9.zza
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.r7d.b(r10)
            goto L62
        L10:
            java.lang.Object r9 = r9.zze
            com.google.android.recaptcha.internal.zzeg r9 = (com.google.android.recaptcha.internal.zzeg) r9
            defpackage.r7d.b(r10)
            goto L73
        L18:
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L1c
            goto L42
        L1c:
            r10 = move-exception
            goto L53
        L1e:
            defpackage.r7d.b(r10)
            java.lang.Object r10 = r9.zze
            com.google.android.recaptcha.internal.zzif r10 = (com.google.android.recaptcha.internal.zzif) r10
            com.google.android.recaptcha.internal.zzax r0 = r9.zzb
            boolean r4 = r0.zzj()
            if (r4 == 0) goto L30
            j6g r9 = defpackage.j6g.a
            return r9
        L30:
            long r4 = r9.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzat r6 = new com.google.android.recaptcha.internal.zzat     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzalo r7 = r9.zzd     // Catch: java.lang.Exception -> L1c
            r8 = 0
            r6.<init>(r10, r0, r7, r8)     // Catch: java.lang.Exception -> L1c
            r9.zza = r2     // Catch: java.lang.Exception -> L1c
            java.lang.Object r10 = defpackage.ewa.O(r4, r6, r9)     // Catch: java.lang.Exception -> L1c
            if (r10 == r3) goto L71
        L42:
            o7d r10 = (defpackage.o7d) r10     // Catch: java.lang.Exception -> L1c
            java.lang.Object r10 = r10.b()     // Catch: java.lang.Exception -> L1c
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzax r10 = r9.zzb     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzax.zzh(r10, r2)     // Catch: java.lang.Exception -> L1c
            j6g r9 = defpackage.j6g.a
            return r9
        L53:
            com.google.android.recaptcha.internal.zzax r0 = r9.zzb
            r2 = 0
            com.google.android.recaptcha.internal.zzax.zzh(r0, r2)
            r9.zza = r1
            java.lang.Object r10 = r0.zzg(r10, r9)
            if (r10 != r3) goto L62
            goto L71
        L62:
            com.google.android.recaptcha.internal.zzax r0 = r9.zzb
            com.google.android.recaptcha.internal.zzeg r10 = (com.google.android.recaptcha.internal.zzeg) r10
            r9.zze = r10
            r1 = 3
            r9.zza = r1
            java.lang.Object r9 = r0.zzd(r10, r9)
            if (r9 != r3) goto L72
        L71:
            return r3
        L72:
            r9 = r10
        L73:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzau.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
