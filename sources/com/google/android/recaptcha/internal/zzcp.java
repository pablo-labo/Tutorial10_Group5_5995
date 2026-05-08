package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcp extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzda zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzda zzdaVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdaVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcp zzcpVar = new zzcp(this.zzb, this.zzc, lu2Var);
        zzcpVar.zzd = obj;
        return zzcpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcp) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r7 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7 == r4) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zza
            r1 = 3
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1b
            if (r0 == r2) goto L13
            defpackage.r7d.b(r7)
            if (r0 == r1) goto L56
            goto L64
        L13:
            java.lang.Object r0 = r6.zzd
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r7)
            goto L49
        L1b:
            java.lang.Object r0 = r6.zzd
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L3c
            goto L39
        L23:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.zzd
            r0 = r7
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzda r7 = r6.zzb     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r6.zzc     // Catch: java.lang.Exception -> L3c
            r6.zzd = r0     // Catch: java.lang.Exception -> L3c
            r6.zza = r3     // Catch: java.lang.Exception -> L3c
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzda.zzc(r7, r5, r6)     // Catch: java.lang.Exception -> L3c
            if (r7 == r4) goto L67
        L39:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L3c
            return r7
        L3c:
            com.google.android.recaptcha.internal.zzda r7 = r6.zzb
            r6.zzd = r0
            r6.zza = r2
            java.lang.Object r7 = r7.zzd(r6)
            if (r7 != r4) goto L49
            goto L67
        L49:
            com.google.android.recaptcha.internal.zziq r7 = (com.google.android.recaptcha.internal.zziq) r7
            r2 = 0
            r6.zzd = r2
            r6.zza = r1
            java.lang.Object r7 = r7.zza(r0, r6)
            if (r7 == r4) goto L67
        L56:
            com.google.android.recaptcha.internal.zzda r7 = r6.zzb
            java.lang.String r0 = r6.zzc
            r1 = 4
            r6.zza = r1
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzda.zzc(r7, r0, r6)
            if (r7 != r4) goto L64
            goto L67
        L64:
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
