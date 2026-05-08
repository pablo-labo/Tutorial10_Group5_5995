package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.hh1;
import defpackage.lu2;
import defpackage.wl7;
import defpackage.xd2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhu implements zzgb {
    private final zzhj zza;
    private zzeg zzc;
    private zzalo zzd;
    private final zzfa zzf;
    private xd2 zzb = hh1.e();
    private zzga zze = zzga.zza;

    public zzhu(zzfa zzfaVar, zzhj zzhjVar, zzem zzemVar) {
        this.zzf = zzfaVar;
        this.zza = zzhjVar;
    }

    public static final /* synthetic */ boolean zzn(zzhu zzhuVar, Exception exc) {
        if (!(exc instanceof zzeg)) {
            return true;
        }
        zzeg zzegVar = (zzeg) exc;
        return (wl7.b(zzegVar.zzb(), zzee.zzd) || wl7.b(zzegVar.zzb(), zzee.zze) || wl7.b(zzegVar.zzb(), zzee.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzp(kotlin.jvm.functions.Function1 r5, defpackage.lu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzhl
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzhl r0 = (com.google.android.recaptcha.internal.zzhl) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzhl r0 = new com.google.android.recaptcha.internal.zzhl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.zza
            int r6 = r0.zzc
            r1 = 1
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L27
            com.google.android.recaptcha.internal.zzel r5 = r0.zzd
            defpackage.r7d.b(r4)
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.r7d.b(r4)
            com.google.android.recaptcha.internal.zzel r4 = new com.google.android.recaptcha.internal.zzel
            r4.<init>()
            r0.zzd = r4
            r0.zzc = r1
            java.lang.Object r5 = r5.invoke(r0)
            g13 r6 = defpackage.g13.a
            if (r5 == r6) goto L51
            r5 = r4
        L43:
            r5.zzc()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r5.zza(r4)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhu.zzp(kotlin.jvm.functions.Function1, lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j, lu2 lu2Var) {
        return new zziq(new zzht(this, j, null));
    }

    @Override // com.google.android.recaptcha.internal.zzgb
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, String str2, lu2 lu2Var) {
        return new zziq(new zzhk(this, j, str, recaptchaAction, null, null));
    }

    @Override // com.google.android.recaptcha.internal.zzgb
    public final Object zzb(long j, lu2 lu2Var) {
        return zzq(j, lu2Var);
    }

    public final zzga zzd() {
        return this.zze;
    }
}
