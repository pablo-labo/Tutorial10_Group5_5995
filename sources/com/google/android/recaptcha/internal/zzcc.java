package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcc extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzcg zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(zzcg zzcgVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzcgVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcc zzccVar = new zzcc(this.zzb, this.zzc, lu2Var);
        zzccVar.zzd = obj;
        return zzccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zzif zzifVar;
        int i = this.zza;
        g13 g13Var = g13.a;
        if (i == 0) {
            r7d.b(obj);
            zzifVar = (zzif) this.zzd;
            zzcg zzcgVar = this.zzb;
            String str = this.zzc;
            this.zzd = zzifVar;
            this.zza = 1;
            obj = zzcgVar.zze(str, this);
            if (obj != g13Var) {
            }
        }
        if (i != 1) {
            r7d.b(obj);
            return obj;
        }
        zzifVar = (zzif) this.zzd;
        r7d.b(obj);
        this.zzd = null;
        this.zza = 2;
        Object objZza = ((zziq) obj).zza(zzifVar.zza(), this);
        return objZza == g13Var ? g13Var : objZza;
    }
}
