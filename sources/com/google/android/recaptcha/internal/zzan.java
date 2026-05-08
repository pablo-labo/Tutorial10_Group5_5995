package com.google.android.recaptcha.internal;

import defpackage.m6;
import defpackage.o6;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan implements Comparator {
    private final boolean zza;

    public zzan(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzc;
        Object objZzc2;
        int[] iArr = {1238241306, 1544407528, 274970277, -295806647, -1552805835, 183382075, 57564258, 871328242, 247849492};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 247849492;
        zzar zzarVar = (zzar) obj;
        zzar zzarVar2 = (zzar) obj2;
        int i10 = zzarVar.zza;
        if (i10 != zzarVar2.zza) {
            o6.h();
            return 0;
        }
        int i11 = i9 ^ iB;
        try {
            if (i10 == 0) {
                throw null;
            }
            switch (i10 + i11) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzarVar.zzo() != zzarVar2.zzo() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzarVar.zzb(), zzarVar2.zzb());
                case 3:
                    comparatorZza = zzv.zzb;
                    objZzc = zzarVar.zzc();
                    objZzc2 = zzarVar2.zzc();
                    break;
                case 4:
                    objZzc = zzarVar.zzp();
                    objZzc2 = zzarVar2.zzp();
                    comparatorZza = zznv.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzarVar.zzd() != zzarVar2.zzd() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzarVar.zza(), zzarVar2.zza());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzc, objZzc2);
        } catch (zzao e) {
            throw new AssertionError(zzt.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
