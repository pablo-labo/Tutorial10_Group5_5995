package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.j6g;
import defpackage.l;
import defpackage.u63;
import defpackage.z92;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzik implements zzig {
    private static Timer zza;
    private final Context zzb;
    private final zzid zzc;
    private final zzil zzd;
    private final zzfa zze;

    public zzik(Context context, zzil zzilVar, zzfa zzfaVar) {
        this.zzb = context;
        this.zzd = zzilVar;
        this.zze = zzfaVar;
        zzid zzidVar = null;
        try {
            zzid zzidVar2 = zzid.zzd;
            zzidVar2 = zzidVar2 == null ? new zzid(context, null) : zzidVar2;
            zzid.zzd = zzidVar2;
            zzidVar = zzidVar2;
        } catch (Exception unused) {
        }
        this.zzc = zzidVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzid zzidVar;
        zzann zzannVarZze;
        int iZzi;
        int i;
        zzid zzidVar2 = this.zzc;
        if (zzidVar2 != null) {
            for (List<zzie> list : z92.F1(zzidVar2.zzd(), 20, 20)) {
                zzakk zzakkVarZzc = zzakm.zzc();
                ArrayList arrayList = new ArrayList();
                for (zzie zzieVar : list) {
                    try {
                        zzannVarZze = zzann.zze(zzqg.zzg().zzj(zzieVar.zzc()));
                        iZzi = zzannVarZze.zzi();
                        i = iZzi - 1;
                    } catch (Exception unused) {
                        zzid zzidVar3 = this.zzc;
                        if (zzidVar3 != null) {
                            zzidVar3.zzf(zzieVar);
                        }
                    }
                    if (iZzi == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzakkVarZzc.zzc(zzannVarZze.zza());
                    } else if (i == 1) {
                        zzakkVarZzc.zzd(zzannVarZze.zzb());
                    } else {
                        if (i != 2) {
                            l.g();
                            return;
                        }
                        j6g j6gVar = j6g.a;
                    }
                    arrayList.add(zzieVar);
                }
                if (zzakkVarZzc.zzb() + zzakkVarZzc.zza() != 0) {
                    try {
                        if (this.zzd.zza((zzakm) zzakkVarZzc.zzq()) && (zzidVar = this.zzc) != null) {
                            zzidVar.zza(arrayList);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzih(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzig
    public final void zza(zzann zzannVar) {
        try {
            u63.Y(this.zze.zza(), null, null, new zzij(this, zzannVar, null), 3);
        } catch (Exception unused) {
        }
        zzh();
    }
}
