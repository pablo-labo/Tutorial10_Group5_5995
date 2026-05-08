package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.luc;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcr extends c1f implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzda zzd;
    final /* synthetic */ luc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzda zzdaVar, luc lucVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzdaVar;
        this.zze = lucVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcr(this.zzd, this.zze, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcr) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (defpackage.ls3.b(r4, r7) != r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:14:0x0024, B:16:0x0030, B:8:0x0016), top: B:41:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.zzc
            r1 = 0
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L14
            boolean r0 = r7.zzb
            long r4 = r7.zza
            defpackage.r7d.b(r8)
        L11:
            r8 = r0
            goto L76
        L14:
            long r4 = r7.zza
            defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L42
        L1c:
            defpackage.r7d.b(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r2
        L22:
            if (r8 == 0) goto L7a
            com.google.android.recaptcha.internal.zzda r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzda.zzb(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r3) goto L78
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzda r0 = r7.zzd     // Catch: java.lang.Exception -> L1a
            xd2 r6 = r0.zze()     // Catch: java.lang.Exception -> L1a
            r6.j0(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzdb r8 = com.google.android.recaptcha.internal.zzdb.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzda.zzh(r0, r8)     // Catch: java.lang.Exception -> L1a
            r8 = r1
            goto L22
        L42:
            luc r0 = r7.zze
            r0.element = r8
            boolean r0 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r0 == 0) goto L63
            r0 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r0 = (com.google.android.play.core.integrity.StandardIntegrityException) r0
            int r0 = r0.getErrorCode()
            r6 = -100
            if (r0 == r6) goto L65
            r6 = -18
            if (r0 == r6) goto L65
            r6 = -12
            if (r0 == r6) goto L65
            r6 = -8
            if (r0 == r6) goto L65
            r6 = -3
            if (r0 == r6) goto L65
        L63:
            r0 = r1
            goto L66
        L65:
            r0 = r2
        L66:
            if (r0 == 0) goto L79
            r7.zza = r4
            r7.zzb = r2
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = defpackage.ls3.b(r4, r7)
            if (r8 == r3) goto L78
            goto L11
        L76:
            long r4 = r4 + r4
            goto L22
        L78:
            return r3
        L79:
            throw r8
        L7a:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
