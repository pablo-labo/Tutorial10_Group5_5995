package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhk extends c1f implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzhu zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhk(zzhu zzhuVar, long j, String str, RecaptchaAction recaptchaAction, String str2, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzhuVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhk zzhkVar = new zzhk(this.zzd, this.zze, this.zzf, this.zzg, null, lu2Var);
        zzhkVar.zzh = obj;
        return zzhkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhk) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: Exception -> 0x0137, zzeg -> 0x014b, PHI: r0 r3 r12
  0x0120: PHI (r0v27 com.google.android.recaptcha.internal.zziu) = (r0v24 com.google.android.recaptcha.internal.zziu), (r0v29 com.google.android.recaptcha.internal.zziu) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v25 java.lang.Object) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r12v24 com.google.android.recaptcha.internal.zzamh) = (r12v23 com.google.android.recaptcha.internal.zzamh), (r12v25 com.google.android.recaptcha.internal.zzamh) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzeg -> 0x014b, Exception -> 0x0137, blocks: (B:5:0x000c, B:55:0x0131, B:8:0x0019, B:52:0x0120, B:11:0x0025, B:50:0x010b, B:14:0x0032, B:47:0x00fb, B:17:0x003d, B:41:0x00d3, B:44:0x00e4, B:20:0x004c, B:38:0x00c1, B:23:0x0055, B:35:0x0095, B:26:0x0061, B:32:0x0085, B:29:0x006d), top: B:64:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws com.google.android.recaptcha.internal.zzeg {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
