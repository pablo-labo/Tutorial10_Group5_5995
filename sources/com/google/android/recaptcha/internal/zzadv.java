package com.google.android.recaptcha.internal;

import defpackage.ia;

/* JADX INFO: loaded from: classes2.dex */
final class zzadv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzadu zzaduVar) {
        int iZzi = zzi(bArr, i, zzaduVar);
        int i2 = zzaduVar.zza;
        if (i2 < 0) {
            ia.p("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iZzi) {
            ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            zzaduVar.zzc = zzaef.zzb;
            return iZzi;
        }
        zzaduVar.zzc = zzaef.zzm(bArr, iZzi, i2);
        return iZzi + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzahz zzahzVar, byte[] bArr, int i, int i2, int i3, zzadu zzaduVar) {
        Object objZze = zzahzVar.zze();
        int iZzm = zzm(objZze, zzahzVar, bArr, i, i2, i3, zzaduVar);
        zzahzVar.zzf(objZze);
        zzaduVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzahz zzahzVar, byte[] bArr, int i, int i2, zzadu zzaduVar) {
        Object objZze = zzahzVar.zze();
        int iZzn = zzn(objZze, zzahzVar, bArr, i, i2, zzaduVar);
        zzahzVar.zzf(objZze);
        zzaduVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzahz zzahzVar, int i, byte[] bArr, int i2, int i3, zzagn zzagnVar, zzadu zzaduVar) {
        int iZzd = zzd(zzahzVar, bArr, i2, i3, zzaduVar);
        zzagnVar.add(zzaduVar.zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zzaduVar);
            if (i != zzaduVar.zza) {
                break;
            }
            iZzd = zzd(zzahzVar, bArr, iZzi, i3, zzaduVar);
            zzagnVar.add(zzaduVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzagn zzagnVar, zzadu zzaduVar) {
        zzagh zzaghVar = (zzagh) zzagnVar;
        int iZzi = zzi(bArr, i, zzaduVar);
        int i2 = zzaduVar.zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zzaduVar);
            zzaghVar.zzh(zzaduVar.zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int zzg(byte[] bArr, int i, zzadu zzaduVar) {
        int iZzi = zzi(bArr, i, zzaduVar);
        int i2 = zzaduVar.zza;
        if (i2 < 0) {
            ia.p("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            zzaduVar.zzc = "";
            return iZzi;
        }
        zzaduVar.zzc = new String(bArr, iZzi, i2, zzago.zza);
        return iZzi + i2;
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzaip zzaipVar, zzadu zzaduVar) {
        if ((i >>> 3) == 0) {
            ia.p("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzl = zzl(bArr, i2, zzaduVar);
            zzaipVar.zzj(i, Long.valueOf(zzaduVar.zzb));
            return iZzl;
        }
        if (i4 == 1) {
            zzaipVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzi = zzi(bArr, i2, zzaduVar);
            int i5 = zzaduVar.zza;
            if (i5 < 0) {
                ia.p("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iZzi) {
                ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zzaipVar.zzj(i, zzaef.zzb);
            } else {
                zzaipVar.zzj(i, zzaef.zzm(bArr, iZzi, i5));
            }
            return iZzi + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzaipVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                return i2 + 4;
            }
            ia.p("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzaip zzaipVarZzf = zzaip.zzf();
        int i7 = zzaduVar.zze + 1;
        zzaduVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzi2 = zzi(bArr, i2, zzaduVar);
            int i9 = zzaduVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i9, bArr, iZzi2, i3, zzaipVarZzf, zzaduVar);
            i8 = i9;
        }
        zzaduVar.zze--;
        if (i2 > i3 || i8 != i6) {
            ia.p("Failed to parse the message.");
            return 0;
        }
        zzaipVar.zzj(i, zzaipVarZzf);
        return i2;
    }

    public static int zzi(byte[] bArr, int i, zzadu zzaduVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzaduVar);
        }
        zzaduVar.zza = b;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zzadu zzaduVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzaduVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzaduVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzaduVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzaduVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzaduVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zzagn zzagnVar, zzadu zzaduVar) {
        zzagh zzaghVar = (zzagh) zzagnVar;
        int iZzi = zzi(bArr, i2, zzaduVar);
        zzaghVar.zzh(zzaduVar.zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zzaduVar);
            if (i != zzaduVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzaduVar);
            zzaghVar.zzh(zzaduVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzadu zzaduVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzaduVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zzaduVar.zzb = j2;
        return i3;
    }

    public static int zzm(Object obj, zzahz zzahzVar, byte[] bArr, int i, int i2, int i3, zzadu zzaduVar) {
        int i4 = zzaduVar.zze + 1;
        zzaduVar.zze = i4;
        zzq(i4);
        int iZzc = ((zzaho) zzahzVar).zzc(obj, bArr, i, i2, i3, zzaduVar);
        zzaduVar.zze--;
        zzaduVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzahz zzahzVar, byte[] bArr, int i, int i2, zzadu zzaduVar) {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zzaduVar);
            i3 = zzaduVar.zza;
        }
        int i4 = iZzj;
        if (i3 < 0 || i3 > i2 - i4) {
            ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = zzaduVar.zze + 1;
        zzaduVar.zze = i5;
        zzq(i5);
        int i6 = i4 + i3;
        zzahzVar.zzi(obj, bArr, i4, i6, zzaduVar);
        zzaduVar.zze--;
        zzaduVar.zzc = obj;
        return i6;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzadu zzaduVar) {
        if ((i >>> 3) == 0) {
            ia.p("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzaduVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzaduVar) + zzaduVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            ia.p("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzaduVar);
            i6 = zzaduVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzaduVar);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        ia.p("Failed to parse the message.");
        return 0;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzq(int i) throws zzagq {
        if (i < zzb) {
            return;
        }
        ia.p("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
