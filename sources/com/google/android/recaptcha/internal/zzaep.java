package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzaep implements zzajb {
    private final zzaeo zza;

    private zzaep(zzaeo zzaeoVar) {
        byte[] bArr = zzago.zzb;
        this.zza = zzaeoVar;
        zzaeoVar.zza = this;
    }

    public static zzaep zza(zzaeo zzaeoVar) {
        Object obj = zzaeoVar.zza;
        return obj != null ? (zzaep) obj : new zzaep(zzaeoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzaha)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaha zzahaVar = (zzaha) list;
        if (!z) {
            while (i2 < zzahaVar.size()) {
                this.zza.zzh(i, zzahaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzahaVar.size(); i6++) {
            zzahaVar.zze(i6);
            i5 += 8;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzahaVar.size()) {
            zzaeoVar2.zzi(zzahaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzB(int i, int i2) {
        zzaeo zzaeoVar = this.zza;
        zzaeoVar.zzr(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzaeo zzaeoVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzaeoVar.zzr(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar2 = this.zza;
            zzaeoVar2.zzq(i, 2);
            int iZzx = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzx += zzaeo.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzaeoVar2.zzs(iZzx);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzaeoVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                zzaeo zzaeoVar3 = this.zza;
                int iZze = zzaghVar.zze(i2);
                zzaeoVar3.zzr(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar4 = this.zza;
        zzaeoVar4.zzq(i, 2);
        int iZzx2 = 0;
        for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
            int iZze2 = zzaghVar.zze(i4);
            iZzx2 += zzaeo.zzx((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzaeoVar4.zzs(iZzx2);
        while (i2 < zzaghVar.size()) {
            int iZze3 = zzaghVar.zze(i2);
            zzaeoVar4.zzs((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzD(int i, long j) {
        zzaeo zzaeoVar = this.zza;
        zzaeoVar.zzt(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzaha)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzaeo zzaeoVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzaeoVar.zzt(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar2 = this.zza;
            zzaeoVar2.zzq(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzy += zzaeo.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzaeoVar2.zzs(iZzy);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzaeoVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzaha zzahaVar = (zzaha) list;
        if (!z) {
            while (i2 < zzahaVar.size()) {
                zzaeo zzaeoVar3 = this.zza;
                long jZze = zzahaVar.zze(i2);
                zzaeoVar3.zzt(i, (jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar4 = this.zza;
        zzaeoVar4.zzq(i, 2);
        int iZzy2 = 0;
        for (int i4 = 0; i4 < zzahaVar.size(); i4++) {
            long jZze2 = zzahaVar.zze(i4);
            iZzy2 += zzaeo.zzy((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzaeoVar4.zzs(iZzy2);
        while (i2 < zzahaVar.size()) {
            long jZze3 = zzahaVar.zze(i2);
            zzaeoVar4.zzu((jZze3 >> 63) ^ (jZze3 + jZze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    @Deprecated
    public final void zzF(int i) {
        this.zza.zzq(i, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzG(int i, String str) {
        this.zza.zzo(i, str);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzH(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzagx)) {
            while (i2 < list.size()) {
                this.zza.zzo(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzagx zzagxVar = (zzagx) list;
        while (i2 < list.size()) {
            Object objZzc = zzagxVar.zzc();
            boolean z = objZzc instanceof String;
            zzaeo zzaeoVar = this.zza;
            if (z) {
                zzaeoVar.zzo(i, (String) objZzc);
            } else {
                zzaeoVar.zze(i, (zzaef) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzI(int i, int i2) {
        this.zza.zzr(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int iZzx = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzx += zzaeo.zzx(((Integer) list.get(i3)).intValue());
            }
            zzaeoVar.zzs(iZzx);
            while (i2 < list.size()) {
                zzaeoVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                this.zza.zzr(i, zzaghVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int iZzx2 = 0;
        for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
            iZzx2 += zzaeo.zzx(zzaghVar.zze(i4));
        }
        zzaeoVar2.zzs(iZzx2);
        while (i2 < zzaghVar.size()) {
            zzaeoVar2.zzs(zzaghVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzK(int i, long j) {
        this.zza.zzt(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzaha)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzy += zzaeo.zzy(((Long) list.get(i3)).longValue());
            }
            zzaeoVar.zzs(iZzy);
            while (i2 < list.size()) {
                zzaeoVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaha zzahaVar = (zzaha) list;
        if (!z) {
            while (i2 < zzahaVar.size()) {
                this.zza.zzt(i, zzahaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int iZzy2 = 0;
        for (int i4 = 0; i4 < zzahaVar.size(); i4++) {
            iZzy2 += zzaeo.zzy(zzahaVar.zze(i4));
        }
        zzaeoVar2.zzs(iZzy2);
        while (i2 < zzahaVar.size()) {
            zzaeoVar2.zzu(zzahaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzadw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzadw zzadwVar = (zzadw) list;
        if (!z) {
            while (i2 < zzadwVar.size()) {
                this.zza.zzd(i, zzadwVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadwVar.size(); i6++) {
            zzadwVar.zzf(i6);
            i5++;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzadwVar.size()) {
            zzaeoVar2.zzb(zzadwVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzd(int i, zzaef zzaefVar) {
        this.zza.zze(i, zzaefVar);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzaef) list.get(i2));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzafl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzafl zzaflVar = (zzafl) list;
        if (!z) {
            while (i2 < zzaflVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzaflVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaflVar.size(); i6++) {
            zzaflVar.zze(i6);
            i5 += 8;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzaflVar.size()) {
            zzaeoVar2.zzi(Double.doubleToRawLongBits(zzaflVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    @Deprecated
    public final void zzh(int i) {
        this.zza.zzq(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzi(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzy += zzaeo.zzy(((Integer) list.get(i3)).intValue());
            }
            zzaeoVar.zzs(iZzy);
            while (i2 < list.size()) {
                zzaeoVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                this.zza.zzj(i, zzaghVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int iZzy2 = 0;
        for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
            iZzy2 += zzaeo.zzy(zzaghVar.zze(i4));
        }
        zzaeoVar2.zzs(iZzy2);
        while (i2 < zzaghVar.size()) {
            zzaeoVar2.zzk(zzaghVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzk(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                this.zza.zzf(i, zzaghVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaghVar.size(); i6++) {
            zzaghVar.zze(i6);
            i5 += 4;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzaghVar.size()) {
            zzaeoVar2.zzg(zzaghVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzm(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzaha)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaha zzahaVar = (zzaha) list;
        if (!z) {
            while (i2 < zzahaVar.size()) {
                this.zza.zzh(i, zzahaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzahaVar.size(); i6++) {
            zzahaVar.zze(i6);
            i5 += 8;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzahaVar.size()) {
            zzaeoVar2.zzi(zzahaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzo(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzafy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzafy zzafyVar = (zzafy) list;
        if (!z) {
            while (i2 < zzafyVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzafyVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzafyVar.size(); i6++) {
            zzafyVar.zze(i6);
            i5 += 4;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzafyVar.size()) {
            zzaeoVar2.zzg(Float.floatToRawIntBits(zzafyVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzq(int i, Object obj, zzahz zzahzVar) {
        zzaeo zzaeoVar = this.zza;
        zzaeoVar.zzq(i, 3);
        zzahzVar.zzj((zzadq) obj, this);
        zzaeoVar.zzq(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzr(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzy += zzaeo.zzy(((Integer) list.get(i3)).intValue());
            }
            zzaeoVar.zzs(iZzy);
            while (i2 < list.size()) {
                zzaeoVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                this.zza.zzj(i, zzaghVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int iZzy2 = 0;
        for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
            iZzy2 += zzaeo.zzy(zzaghVar.zze(i4));
        }
        zzaeoVar2.zzs(iZzy2);
        while (i2 < zzaghVar.size()) {
            zzaeoVar2.zzk(zzaghVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzt(int i, long j) {
        this.zza.zzt(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzaha)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzy += zzaeo.zzy(((Long) list.get(i3)).longValue());
            }
            zzaeoVar.zzs(iZzy);
            while (i2 < list.size()) {
                zzaeoVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaha zzahaVar = (zzaha) list;
        if (!z) {
            while (i2 < zzahaVar.size()) {
                this.zza.zzt(i, zzahaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int iZzy2 = 0;
        for (int i4 = 0; i4 < zzahaVar.size(); i4++) {
            iZzy2 += zzaeo.zzy(zzahaVar.zze(i4));
        }
        zzaeoVar2.zzs(iZzy2);
        while (i2 < zzahaVar.size()) {
            zzaeoVar2.zzu(zzahaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzv(int i, Object obj, zzahz zzahzVar) {
        zzaeo zzaeoVar = this.zza;
        zzadq zzadqVar = (zzadq) obj;
        zzaeoVar.zzq(i, 2);
        zzaeoVar.zzs(zzadqVar.zzv(zzahzVar));
        zzahzVar.zzj(zzadqVar, this);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzw(int i, Object obj) {
        boolean z = obj instanceof zzaef;
        zzaeo zzaeoVar = this.zza;
        if (z) {
            zzaeoVar.zzn(i, (zzaef) obj);
        } else {
            zzaeoVar.zzm(i, (zzahl) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzx(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzagh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzaeo zzaeoVar = this.zza;
            zzaeoVar.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzaeoVar.zzs(i3);
            while (i2 < list.size()) {
                zzaeoVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzagh zzaghVar = (zzagh) list;
        if (!z) {
            while (i2 < zzaghVar.size()) {
                this.zza.zzf(i, zzaghVar.zze(i2));
                i2++;
            }
            return;
        }
        zzaeo zzaeoVar2 = this.zza;
        zzaeoVar2.zzq(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaghVar.size(); i6++) {
            zzaghVar.zze(i6);
            i5 += 4;
        }
        zzaeoVar2.zzs(i5);
        while (i2 < zzaghVar.size()) {
            zzaeoVar2.zzg(zzaghVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzajb
    public final void zzz(int i, long j) {
        this.zza.zzh(i, j);
    }
}
