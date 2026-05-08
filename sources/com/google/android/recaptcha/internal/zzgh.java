package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgh extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgk zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgh(zzgk zzgkVar, long j, RecaptchaAction recaptchaAction, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzgkVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgh zzghVar = new zzgh(this.zzb, this.zzc, this.zzd, lu2Var);
        zzghVar.zze = obj;
        return zzghVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgh) create((zzir) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzir zzirVar = (zzir) this.zze;
        zzgg zzggVar = new zzgg(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object objZza = zzirVar.zza(zzggVar, this);
        g13 g13Var = g13.a;
        return objZza == g13Var ? g13Var : objZza;
    }
}
