package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.ewa;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.wl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhi extends c1f implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzhj zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhi(long j, zzhj zzhjVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = j;
        this.zzc = zzhjVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhi zzhiVar = new zzhi(this.zzb, this.zzc, lu2Var);
        zzhiVar.zzd = obj;
        return zzhiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhi) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zzif zzifVar = (zzif) this.zzd;
                long j = this.zzb;
                zzhh zzhhVar = new zzhh(zzifVar, this.zzc, null);
                this.zza = 1;
                obj = ewa.O(j, zzhhVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            return (zzalo) obj;
        } catch (zzeg e) {
            if (wl7.b(e.zzb(), zzee.zzc)) {
                throw this.zzc.zzs(e, e);
            }
            throw e;
        } catch (TimeoutCancellationException e2) {
            throw this.zzc.zzs(e2, new zzeg(zzee.zzc, zzed.zzb, e2.getMessage(), null, 8, null));
        } catch (Exception e3) {
            throw this.zzc.zzs(e3, new zzeg(zzee.zzc, zzed.zzaz, e3.getMessage(), null, 8, null));
        }
    }
}
