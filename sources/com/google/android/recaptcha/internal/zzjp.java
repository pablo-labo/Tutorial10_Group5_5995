package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.z92;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjp extends c1f implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zzkb zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzjs zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjp(zzkb zzkbVar, List list, zzjs zzjsVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzkbVar;
        this.zzc = list;
        this.zzd = zzjsVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzjp zzjpVar = new zzjp(this.zzb, this.zzc, this.zzd, lu2Var);
        zzjpVar.zzf = obj;
        return zzjpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjp) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            e13 e13Var = (e13) this.zzf;
            while (true) {
                zzkb zzkbVar = this.zzb;
                if (zzkbVar.zza() < 0) {
                    break;
                }
                List list = this.zzc;
                if (zzkbVar.zza() >= list.size() || !f13.e(e13Var)) {
                    break;
                }
                zzanv zzanvVar = (zzanv) list.get(zzkbVar.zza());
                try {
                    zzjs.zzf(this.zzd, zzanvVar, zzkbVar);
                } catch (Exception e) {
                    zzanvVar.zze();
                    new Integer(zzanvVar.zzb());
                    List listZzd = zzanvVar.zzd();
                    final zzjs zzjsVar = this.zzd;
                    z92.W0(listZzd, null, null, null, new Function1(zzjsVar) { // from class: com.google.android.recaptcha.internal.zzjo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((zzanu) obj2).getClass();
                            return "";
                        }
                    }, 31);
                    zzkb zzkbVar2 = this.zzb;
                    this.zza = 1;
                    Object objZzh = zzjsVar.zzh(e, zzkbVar2, this);
                    g13 g13Var = g13.a;
                    if (objZzh == g13Var) {
                        return g13Var;
                    }
                }
            }
            return j6g.a;
        }
        return j6g.a;
    }
}
