package com.google.android.recaptcha.internal;

import defpackage.e13;
import defpackage.eu2;
import defpackage.f13;
import defpackage.no3;
import defpackage.q15;
import defpackage.u63;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa {
    private final e13 zza = f13.b();
    private final e13 zzb;
    private final e13 zzc;
    private final e13 zzd;
    private final e13 zze;

    public zzfa() {
        eu2 eu2VarA = f13.a(new q15(Executors.newSingleThreadExecutor()));
        u63.Y(eu2VarA, null, null, new zzez(null), 3);
        this.zzb = eu2VarA;
        this.zzc = f13.a(no3.c);
        eu2 eu2VarA2 = f13.a(new q15(Executors.newSingleThreadExecutor()));
        u63.Y(eu2VarA2, null, null, new zzey(null), 3);
        this.zzd = eu2VarA2;
        eu2 eu2VarA3 = f13.a(new q15(Executors.newSingleThreadExecutor()));
        u63.Y(eu2VarA3, null, null, new zzex(null), 3);
        this.zze = eu2VarA3;
    }

    public final e13 zza() {
        return this.zzc;
    }

    public final e13 zzb() {
        return this.zza;
    }

    public final e13 zzc() {
        return this.zze;
    }

    public final e13 zzd() {
        return this.zzd;
    }

    public final e13 zze() {
        return this.zzb;
    }
}
