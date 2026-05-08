package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgi extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgk zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgi(zzgk zzgkVar, RecaptchaAction recaptchaAction, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzgkVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgi(this.zzb, this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgi) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objZzd;
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            objZzd = ((o7d) obj).b();
        } else {
            zzgk zzgkVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzd = zzgkVar.zzd(recaptchaAction, j, this);
            g13 g13Var = g13.a;
            if (objZzd == g13Var) {
                return g13Var;
            }
        }
        r7d.b(objZzd);
        return objZzd;
    }
}
