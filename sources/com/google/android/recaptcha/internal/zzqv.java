package com.google.android.recaptcha.internal;

import defpackage.bg;
import defpackage.k20;
import defpackage.l5;
import defpackage.l6;
import defpackage.r6;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqv implements zzsn {
    private final List zza;
    private final zzsx zzb;

    private zzqv(zzwd zzwdVar, List list, zzsx zzsxVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzsxVar;
        if (zzre.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzwb zzwbVar : zzwdVar.zzh()) {
                if (hashSet.contains(Integer.valueOf(zzwbVar.zza()))) {
                    throw new GeneralSecurityException(bg.d(zzwbVar.zza(), "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(zzwbVar.zza()));
            }
            if (hashSet.contains(Integer.valueOf(zzwdVar.zzb()))) {
                return;
            }
            l6.m("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            throw null;
        }
    }

    @Deprecated
    public static final zzqv zzd(byte[] bArr) throws GeneralSecurityException {
        try {
            zzwd zzwdVarZzg = zzwd.zzg(bArr, zzafr.zza());
            for (zzwb zzwbVar : zzwdVarZzg.zzh()) {
                if (zzwbVar.zzb().zzb() == zzvs.UNKNOWN_KEYMATERIAL || zzwbVar.zzb().zzb() == zzvs.SYMMETRIC || zzwbVar.zzb().zzb() == zzvs.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains key material of type " + zzwbVar.zzb().zzb().name() + " for type url " + zzwbVar.zzb().zzg());
                }
            }
            if (zzwdVarZzg.zza() > 0) {
                return new zzqv(zzwdVarZzg, zzh(zzwdVarZzg), zzsx.zza);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (zzagq unused) {
            l6.m("invalid keyset");
            return null;
        }
    }

    private static zzum zzg(zzwb zzwbVar) {
        return zzum.zza(zzwbVar.zzb().zzg(), zzwbVar.zzb().zze(), zzwbVar.zzb().zzb(), zzwbVar.zze(), zzwbVar.zze() == zzwj.RAW ? null : Integer.valueOf(zzwbVar.zza()));
    }

    private static List zzh(zzwd zzwdVar) throws GeneralSecurityException {
        zzqp zzstVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzwdVar.zza());
        for (zzwb zzwbVar : zzwdVar.zzh()) {
            int iZza = zzwbVar.zza();
            try {
                zzum zzumVarZzg = zzg(zzwbVar);
                zztn zztnVarZzb = zztn.zzb();
                zzra zzraVarZza = zzra.zza();
                zzstVar = !zztnVarZzb.zzh(zzumVarZzg) ? new zzst(zzumVarZzg, zzraVarZza) : zztnVarZzb.zza(zzumVarZzg, zzraVarZza);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzre.zza.zza()) {
                    throw e;
                }
                zzstVar = new zzst(zzg(zzwbVar), zzra.zza());
                z = true;
            }
            if (zzre.zza.zza() && !zzi(zzwbVar.zzk())) {
                l6.m("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            boolean z2 = true;
            int iZzk = zzwbVar.zzk();
            if (iZza != zzwdVar.zzb()) {
                z2 = false;
            }
            arrayList.add(new zzqt(zzstVar, iZzk, iZza, z2, z, zzqt.zzf, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static boolean zzi(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzwd zzwdVarZze = zze();
        int i = zzrc.zza;
        zzwe zzweVarZza = zzwi.zza();
        zzweVarZza.zzb(zzwdVarZze.zzb());
        for (zzwb zzwbVar : zzwdVarZze.zzh()) {
            zzwf zzwfVarZza = zzwg.zza();
            zzwfVarZza.zzc(zzwbVar.zzb().zzg());
            zzwfVarZza.zzd(zzwbVar.zzk());
            zzwfVarZza.zzb(zzwbVar.zze());
            zzwfVarZza.zza(zzwbVar.zza());
            zzweVarZza.zza((zzwg) zzwfVarZza.zzq());
        }
        return ((zzwi) zzweVarZza.zzq()).toString();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final int zza() {
        return this.zza.size();
    }

    public final zzqt zzb(int i) {
        if (i < 0 || i >= zza()) {
            l5.s(k20.l("Invalid index ", i, zza(), " for keyset of size "));
            return null;
        }
        List list = this.zza;
        zzqt zzqtVar = (zzqt) list.get(i);
        if (!zzi(zzqtVar.zzg)) {
            r6.g(bg.d(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!zzqtVar.zze) {
            return (zzqt) list.get(i);
        }
        r6.g(bg.d(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public final zzqt zzc() {
        for (zzqt zzqtVar : this.zza) {
            if (zzqtVar != null && zzqtVar.zze()) {
                if (zzqtVar.zzc() == zzqr.zza) {
                    return zzqtVar;
                }
                r6.g("Keyset has primary which isn't enabled");
                return null;
            }
        }
        r6.g("Keyset has no valid primary");
        return null;
    }

    public final zzwd zze() {
        try {
            zzvz zzvzVarZzc = zzwd.zzc();
            for (zzqt zzqtVar : this.zza) {
                zzqp zzqpVarZzb = zzqtVar.zzb();
                int i = zzqtVar.zzg;
                int iZza = zzqtVar.zza();
                zzum zzumVar = (zzum) zztn.zzb().zzc(zzqpVarZzb, zzum.class, zzra.zza());
                Integer numZzf = zzumVar.zzf();
                if (numZzf != null && numZzf.intValue() != iZza) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzwa zzwaVarZzc = zzwb.zzc();
                zzvr zzvrVarZza = zzvu.zza();
                zzvrVarZza.zzb(zzumVar.zzg());
                zzvrVarZza.zzc(zzumVar.zze());
                zzvrVarZza.zza(zzumVar.zzb());
                zzwaVarZzc.zza(zzvrVarZza);
                zzwaVarZzc.zzd(i);
                zzwaVarZzc.zzb(iZza);
                zzwaVarZzc.zzc(zzumVar.zzc());
                zzvzVarZzc.zza((zzwb) zzwaVarZzc.zzq());
                if (zzqtVar.zze()) {
                    zzvzVarZzc.zzb(zzqtVar.zza());
                }
            }
            return (zzwd) zzvzVarZzc.zzq();
        } catch (GeneralSecurityException e) {
            throw new zzux(e);
        }
    }

    public final Object zzf(zzqn zzqnVar, Class cls) throws GeneralSecurityException {
        if (!(zzqnVar instanceof zzsd)) {
            l6.m("Currently only subclasses of InternalConfiguration are accepted");
            return null;
        }
        zzsd zzsdVar = (zzsd) zzqnVar;
        zzwd zzwdVarZze = zze();
        int i = zzrc.zza;
        int iZzb = zzwdVarZze.zzb();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzwb zzwbVar : zzwdVarZze.zzh()) {
            if (zzwbVar.zzk() == 3) {
                if (!zzwbVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzwbVar.zza())));
                }
                if (zzwbVar.zze() == zzwj.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzwbVar.zza())));
                }
                if (zzwbVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzwbVar.zza())));
                }
                if (zzwbVar.zza() == iZzb) {
                    if (z2) {
                        l6.m("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                z &= zzwbVar.zzb().zzb() == zzvs.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            l6.m("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            l6.m("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i3 = 0; i3 < zza(); i3++) {
            List list = this.zza;
            if (((zzqt) list.get(i3)).zze || !zzi(((zzqt) list.get(i3)).zzg)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzwdVarZze.zzd(i3).zzb().zzg() + " failed, unable to get primitive");
            }
        }
        return zzsdVar.zza(this, this.zzb, cls);
    }
}
