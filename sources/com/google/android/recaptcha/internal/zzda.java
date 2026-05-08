package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.lu2;
import defpackage.pnb;
import defpackage.xd2;
import defpackage.z4a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzda {
    public xd2 zza;
    private final StandardIntegrityManager zzb;
    private long zzd;
    private boolean zzf;
    private final zzfa zzg;
    private zzdb zzc = zzdb.zza;
    private final z4a zze = pnb.i();

    public zzda(zzfa zzfaVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzg = zzfaVar;
        this.zzb = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(defpackage.lu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcq
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcq r0 = (com.google.android.recaptcha.internal.zzcq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcq r0 = new com.google.android.recaptcha.internal.zzcq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            return r6
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r3 = r5.zzd
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r6 = r6.setCloudProjectNumber(r3)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r6 = r6.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r5 = r5.zzb
            com.google.android.gms.tasks.Task r5 = r5.prepareIntegrityToken(r6)
            xr3 r5 = com.google.android.recaptcha.internal.zzfm.zza(r5)
            r0.zzc = r2
            java.lang.Object r5 = r5.n1(r0)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L52
            return r6
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzl(lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r8 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(java.lang.String r7, defpackage.lu2 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r8)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L31:
            java.lang.String r7 = r0.zzd
            defpackage.r7d.b(r8)
            goto L48
        L37:
            defpackage.r7d.b(r8)
            xd2 r6 = r6.zze()
            r0.zzd = r7
            r0.zzc = r4
            java.lang.Object r8 = r6.n1(r0)
            if (r8 == r5) goto L70
        L48:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r6.setRequestHash(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r8.request(r6)
            xr3 r6 = com.google.android.recaptcha.internal.zzfm.zza(r6)
            r0.zzd = r2
            r0.zzc = r3
            java.lang.Object r8 = r6.n1(r0)
            if (r8 != r5) goto L69
            goto L70
        L69:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r8
            java.lang.String r6 = r8.token()
            return r6
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzm(java.lang.String, lu2):java.lang.Object");
    }

    public final Object zzd(lu2 lu2Var) {
        return new zziq(new zzcz(this, null));
    }

    public final xd2 zze() {
        xd2 xd2Var = this.zza;
        if (xd2Var != null) {
            return xd2Var;
        }
        return null;
    }

    public final void zzi(long j) {
        this.zzd = j;
    }
}
