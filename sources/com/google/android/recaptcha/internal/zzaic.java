package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaic extends zzaih {
    public zzaic() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzaih
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzafv) ((zzaid) zzg(i)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzafv) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
