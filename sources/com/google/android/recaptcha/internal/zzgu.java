package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.lu2;
import defpackage.ot2;
import defpackage.pnb;
import defpackage.z4a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgu {
    private final Application zza;
    private final zzhy zzb;
    private final z4a zzc = pnb.i();
    private zzgk zzd;

    public zzgu(Application application, zzhy zzhyVar) {
        this.zza = application;
        this.zzb = zzhyVar;
    }

    public static /* synthetic */ Object zzd(zzgu zzguVar, String str, long j, zzfv zzfvVar, lu2 lu2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            zzfvVar = zzfv.zza;
        }
        zzfv zzfvVar2 = zzfvVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzguVar.zzc(str, j, zzfvVar2, lu2Var);
    }

    public static final /* synthetic */ void zzf(zzgu zzguVar, long j, String str) throws zzeg {
        if (str.length() == 0) {
            throw new zzeg(zzee.zzd, zzed.zze, null, null, 12, null);
        }
        if (j < 5000) {
            throw new zzeg(zzee.zzj, zzed.zzI, null, null, 12, null);
        }
        if (ot2.a(zzguVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzeg(zzee.zzc, zzed.zzao, null, null, 12, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r18, long r19, com.google.android.recaptcha.internal.zzfv r21, defpackage.lu2 r22) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            r0 = r22
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzgo
            if (r2 == 0) goto L18
            r2 = r0
            com.google.android.recaptcha.internal.zzgo r2 = (com.google.android.recaptcha.internal.zzgo) r2
            int r3 = r2.zzf
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.zzf = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            com.google.android.recaptcha.internal.zzgo r2 = new com.google.android.recaptcha.internal.zzgo
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.zzd
            int r2 = r7.zzf
            r3 = 1
            r8 = 2
            r9 = 0
            g13 r10 = defpackage.g13.a
            if (r2 == 0) goto L52
            if (r2 == r3) goto L3f
            if (r2 != r8) goto L39
            java.lang.Object r1 = r7.zza
            z4a r1 = (defpackage.z4a) r1
            defpackage.r7d.b(r0)     // Catch: java.lang.Throwable -> L36
            goto Lab
        L36:
            r0 = move-exception
            goto Lb3
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r9
        L3f:
            long r2 = r7.zzc
            java.lang.Object r4 = r7.zzb
            z4a r4 = (defpackage.z4a) r4
            com.google.android.recaptcha.internal.zzfv r5 = r7.zzg
            java.lang.Object r6 = r7.zza
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r0)
            r11 = r4
            r3 = r2
            r2 = r6
            goto L71
        L52:
            defpackage.r7d.b(r0)
            z4a r0 = r1.zzc
            r2 = r18
            r7.zza = r2
            r4 = r21
            r7.zzg = r4
            r7.zzb = r0
            r5 = r19
            r7.zzc = r5
            r7.zzf = r3
            java.lang.Object r3 = r0.h(r7)
            if (r3 == r10) goto Lb7
            r15 = r5
            r5 = r4
            r3 = r15
            r11 = r0
        L71:
            com.google.android.recaptcha.internal.zzfv r0 = com.google.android.recaptcha.internal.zzfv.zza     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = defpackage.wl7.b(r5, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L7c
            r0 = 3
        L7a:
            r12 = r0
            goto L87
        L7c:
            com.google.android.recaptcha.internal.zzfv r0 = com.google.android.recaptcha.internal.zzfv.zzb     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = defpackage.wl7.b(r5, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L86
            r0 = 4
            goto L7a
        L86:
            r12 = r8
        L87:
            com.google.android.recaptcha.internal.zzhy r0 = r1.zzb     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzia r13 = r0.zzc()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzet r14 = r0.zza()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzgr r0 = new com.google.android.recaptcha.internal.zzgr     // Catch: java.lang.Throwable -> Lb1
            r6 = 0
            r0.<init>(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> Lb1
            r7.zza = r11     // Catch: java.lang.Throwable -> Lb1
            r7.zzg = r9     // Catch: java.lang.Throwable -> Lb1
            r7.zzb = r9     // Catch: java.lang.Throwable -> Lb1
            r7.zzf = r8     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzir r1 = new com.google.android.recaptcha.internal.zzir     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r13, r14, r2, r12)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r0.invoke(r1, r7)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == r10) goto Lb7
            r1 = r11
        Lab:
            com.google.android.recaptcha.internal.zzgk r0 = (com.google.android.recaptcha.internal.zzgk) r0     // Catch: java.lang.Throwable -> L36
            r1.p(r9)
            return r0
        Lb1:
            r0 = move-exception
            r1 = r11
        Lb3:
            r1.p(r9)
            throw r0
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgu.zzc(java.lang.String, long, com.google.android.recaptcha.internal.zzfv, lu2):java.lang.Object");
    }
}
