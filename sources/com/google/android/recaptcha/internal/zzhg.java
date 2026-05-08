package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.t92;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhg extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzamh zzb;
    final /* synthetic */ zzhj zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhg(zzamh zzamhVar, zzhj zzhjVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzamhVar;
        this.zzc = zzhjVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhg(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhg) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                List<zzamj> listZze = this.zzb.zze();
                int iV = kc9.V(t92.r0(listZze, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                for (zzamj zzamjVar : listZze) {
                    Pair pair = new Pair(zzamjVar.zzb(), zzamjVar.zzc());
                    linkedHashMap.put(pair.d(), pair.e());
                }
                zzfq zzfqVar = this.zzc.zzg;
                this.zza = 1;
                Object objZzb = zzfqVar.zzb(linkedHashMap, this);
                g13 g13Var = g13.a;
                if (objZzb == g13Var) {
                    return g13Var;
                }
            }
            this.zzc.zze.zze(this.zzb);
            return j6g.a;
        } catch (zzeg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzeg(zzee.zzb, zzed.zzav, e2.getMessage(), null, 8, null);
        }
    }
}
