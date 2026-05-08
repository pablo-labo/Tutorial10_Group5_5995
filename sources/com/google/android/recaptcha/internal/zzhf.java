package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.ewa;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhf extends c1f implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzhj zzc;
    final /* synthetic */ zzalo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhf(long j, zzhj zzhjVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = j;
        this.zzc = zzhjVar;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhf zzhfVar = new zzhf(this.zzb, this.zzc, this.zzd, lu2Var);
        zzhfVar.zze = obj;
        return zzhfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhf) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zziu zziuVar = (zziu) this.zze;
                long j = this.zzb;
                zzhe zzheVar = new zzhe(zziuVar, this.zzc, this.zzd, j, null);
                this.zza = 1;
                Object objO = ewa.O(j, zzheVar, this);
                g13 g13Var = g13.a;
                if (objO == g13Var) {
                    return g13Var;
                }
            }
            return j6g.a;
        } catch (zzeg e) {
            throw e;
        } catch (TimeoutCancellationException e2) {
            throw new zzeg(zzee.zzb, zzed.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzb, zzed.zzap, e3.getMessage(), null, 8, null);
        }
    }
}
