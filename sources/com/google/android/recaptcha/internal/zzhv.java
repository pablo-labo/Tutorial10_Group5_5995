package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhv extends c1f implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzhx zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhv(zzhx zzhxVar, long j, String str, RecaptchaAction recaptchaAction, String str2, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzhxVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhv zzhvVar = new zzhv(this.zzd, this.zze, this.zzf, this.zzg, null, lu2Var);
        zzhvVar.zzh = obj;
        return zzhvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[Catch: Exception -> 0x0128, zzeg -> 0x013b, PHI: r1 r4
  0x00ef: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v27 java.lang.Object) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x00ef: PHI (r4v5 com.google.android.recaptcha.internal.zziu) = (r4v4 com.google.android.recaptcha.internal.zziu), (r4v9 com.google.android.recaptcha.internal.zziu) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzeg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103 A[Catch: Exception -> 0x0128, zzeg -> 0x013b, PHI: r1 r2 r4
  0x0103: PHI (r1v16 com.google.android.recaptcha.internal.zzamh) = (r1v15 com.google.android.recaptcha.internal.zzamh), (r1v30 com.google.android.recaptcha.internal.zzamh) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v8 java.lang.Object) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r4v6 com.google.android.recaptcha.internal.zziu) = (r4v5 com.google.android.recaptcha.internal.zziu), (r4v10 com.google.android.recaptcha.internal.zziu) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzeg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws com.google.android.recaptcha.internal.zzeg {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
