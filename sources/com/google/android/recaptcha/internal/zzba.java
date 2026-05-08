package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.g61;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import defpackage.u63;
import defpackage.xr3;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzba extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzbf zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzif zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(zzbf zzbfVar, String str, zzif zzifVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbfVar;
        this.zzc = str;
        this.zzd = zzifVar;
        this.zze = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzba zzbaVar = new zzba(this.zzb, this.zzc, this.zzd, this.zze, lu2Var);
        zzbaVar.zzf = obj;
        return zzbaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzba) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            e13 e13Var = (e13) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzax zzaxVar : this.zzb.zzd()) {
                if (zzaxVar.zzj()) {
                    arrayList.add(u63.l(e13Var, null, new zzaz(this.zzd, zzaxVar, this.zzc, this.zze, null), 3));
                }
            }
            xr3[] xr3VarArr = (xr3[]) arrayList.toArray(new xr3[0]);
            xr3[] xr3VarArr2 = (xr3[]) Arrays.copyOf(xr3VarArr, xr3VarArr.length);
            this.zza = 1;
            obj = xr3VarArr2.length == 0 ? zr4.a : new g61(xr3VarArr2).a(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        }
        String str = this.zzc;
        zzalx zzalxVarZza = zzaly.zza();
        zzalxVarZza.zza(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object objB = ((o7d) it.next()).b();
            if (!(objB instanceof o7d.a)) {
                zzalxVarZza.zzn((zzaly) objB);
            }
        }
        return (zzaly) zzalxVarZza.zzq();
    }
}
