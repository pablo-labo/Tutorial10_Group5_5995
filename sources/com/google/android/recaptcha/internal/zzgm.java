package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgm extends c1f implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgm(Application application, String str, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgm(this.zzb, this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgm) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j = this.zzd;
        zzgn zzgnVar = zzgn.zza;
        this.zza = 1;
        Object objZzc = zzgnVar.zzc(application, str, j, this);
        g13 g13Var = g13.a;
        return objZzc == g13Var ? g13Var : objZzc;
    }
}
