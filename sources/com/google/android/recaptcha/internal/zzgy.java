package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.luc;
import defpackage.r7d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzgy extends c1f implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ zzhj zzd;
    final /* synthetic */ zzamf zze;
    final /* synthetic */ luc zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzif zzifVar, zzhj zzhjVar, zzamf zzamfVar, luc lucVar, lu2 lu2Var) {
        super(1, lu2Var);
        this.zzc = zzifVar;
        this.zzd = zzhjVar;
        this.zze = zzamfVar;
        this.zzf = lucVar;
    }

    @Override // defpackage.x81
    public final lu2 create(lu2 lu2Var) {
        return new zzgy(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzgy) create((lu2) obj)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.google.android.recaptcha.internal.zzeg, java.lang.Throwable] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zzif zzifVar;
        int i = this.zzb;
        g13 g13Var = g13.a;
        try {
            if (i == 0) {
                r7d.b(obj);
                zzifVar = this.zzc;
                zzhj zzhjVar = this.zzd;
                zzamf zzamfVar = this.zze;
                this.zza = zzifVar;
                this.zzb = 1;
                obj = new zzip(48, new zzgw(zzhjVar, zzamfVar, null), null);
                if (obj != g13Var) {
                }
                return g13Var;
            }
            if (i != 1) {
                r7d.b(obj);
                return (zzamh) obj;
            }
            zzifVar = (zzif) this.zza;
            r7d.b(obj);
            this.zza = null;
            this.zzb = 2;
            obj = ((zzip) obj).zza(zzifVar.zza(), this);
            if (obj == g13Var) {
                return g13Var;
            }
            return (zzamh) obj;
        } catch (zzeg e) {
            this.zzf.element = e;
            throw e;
        }
    }
}
