package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.l6;
import defpackage.r6;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrr {
    private static final zzrm zzb = new zzrm(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzro zzc = new zzro(new zzrp(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static /* bridge */ /* synthetic */ int zza(long[] jArr) {
        return zzsa.zzg(jArr)[0] & 1;
    }

    public static void zzb() {
        if (zzru.zza != null) {
            return;
        }
        r6.g("Could not initialize Ed25519.");
    }

    public static /* bridge */ /* synthetic */ boolean zzc(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzsa.zzc(jArr2);
        byte[] bArrZzg = zzsa.zzg(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrZzg[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b;
        byte[] bArr4 = bArr2;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i = 31;
        while (true) {
            if (i < 0) {
                break;
            }
            int i2 = bArrCopyOfRange[i] & 255;
            int i3 = zza[i] & 255;
            if (i2 == i3) {
                i--;
                bArr4 = bArr2;
            } else if (i2 < i3) {
                MessageDigest messageDigest = (MessageDigest) zzacq.zzb.zza("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzh = zzh(bArrDigest, 0) & 2097151;
                long jZzi = zzi(bArrDigest, 2) >> 5;
                long jZzh2 = zzh(bArrDigest, 5) >> 2;
                long jZzi2 = zzi(bArrDigest, 7) >> 7;
                long jZzi3 = zzi(bArrDigest, 10) >> 4;
                long jZzh3 = zzh(bArrDigest, 13) >> 1;
                long jZzi4 = zzi(bArrDigest, 15) >> 6;
                long jZzh4 = zzh(bArrDigest, 18) >> 3;
                long jZzh5 = zzh(bArrDigest, 21) & 2097151;
                long jZzi5 = zzi(bArrDigest, 23) >> 5;
                long jZzh6 = zzh(bArrDigest, 26) >> 2;
                long jZzi6 = zzi(bArrDigest, 28) >> 7;
                long jZzi7 = zzi(bArrDigest, 31) >> 4;
                long jZzh7 = zzh(bArrDigest, 34) >> 1;
                long jZzi8 = zzi(bArrDigest, 36) >> 6;
                long jZzh8 = zzh(bArrDigest, 39) >> 3;
                long jZzh9 = zzh(bArrDigest, 42) & 2097151;
                long jZzi9 = zzi(bArrDigest, 44) >> 5;
                long jZzh10 = (zzh(bArrDigest, 47) >> 2) & 2097151;
                long jZzi10 = (zzi(bArrDigest, 49) >> 7) & 2097151;
                long jZzi11 = (zzi(bArrDigest, 52) >> 4) & 2097151;
                long jZzh11 = (zzh(bArrDigest, 55) >> 1) & 2097151;
                long jZzi12 = (zzi(bArrDigest, 57) >> 6) & 2097151;
                long jZzi13 = zzi(bArrDigest, 60) >> 3;
                long j = (jZzi11 * 666643) + jZzh5;
                long j2 = (jZzi10 * 666643) + jZzh4;
                long j3 = (jZzh10 * 666643) + (jZzi4 & 2097151);
                long j4 = (j3 + 1048576) >> 21;
                long j5 = j4 << 21;
                long j6 = (jZzh10 * 654183) + (jZzi10 * 470296) + j;
                long j7 = (j6 + 1048576) >> 21;
                long j8 = (jZzh10 * 136657) + (((jZzi11 * 654183) + ((jZzh11 * 470296) + ((jZzi12 * 666643) + (jZzh6 & 2097151)))) - (jZzi10 * 997805));
                long j9 = (j8 + 1048576) >> 21;
                long j10 = j9 << 21;
                long j11 = ((jZzi11 * 136657) + (((jZzi12 * 654183) + ((jZzi13 * 470296) + (jZzi7 & 2097151))) - (jZzh11 * 997805))) - (jZzi10 * 683901);
                long j12 = (j11 + 1048576) >> 21;
                long j13 = ((jZzi12 * 136657) + ((jZzi8 & 2097151) - (jZzi13 * 997805))) - (jZzh11 * 683901);
                long j14 = (j13 + 1048576) >> 21;
                long j15 = jZzh9 - (jZzi13 * 683901);
                long j16 = (j15 + 1048576) >> 21;
                long jE = akb.e(jZzh10, 470296L, j2, j4);
                long j17 = (jE + 1048576) >> 21;
                long j18 = j17 << 21;
                long j19 = (((jZzi10 * 654183) + ((jZzi11 * 470296) + ((jZzh11 * 666643) + (jZzi5 & 2097151)))) - (jZzh10 * 997805)) + j7;
                long j20 = (j19 + 1048576) >> 21;
                long j21 = j20 << 21;
                long j22 = (((jZzi10 * 136657) + (((jZzh11 * 654183) + ((jZzi12 * 470296) + ((jZzi13 * 666643) + (jZzi6 & 2097151)))) - (jZzi11 * 997805))) - (jZzh10 * 683901)) + j9;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((jZzh11 * 136657) + (((jZzi13 * 654183) + (jZzh7 & 2097151)) - (jZzi12 * 997805))) - (jZzi11 * 683901)) + j12;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = (((jZzi13 * 136657) + jZzh8) - (jZzi12 * 683901)) + j14;
                long j28 = (j27 + 1048576) >> 21;
                long j29 = (j11 - (j12 << 21)) + j23;
                long j30 = (j29 * 666643) + jZzh;
                long j31 = (j30 + 1048576) >> 21;
                long j32 = j31 << 21;
                long j33 = (j13 - (j14 << 21)) + j26;
                long j34 = j25 - (j26 << 21);
                long j35 = (j29 * 654183) + (j34 * 470296) + (j33 * 666643) + (jZzh2 & 2097151);
                long j36 = (j35 + 1048576) >> 21;
                long j37 = j36 << 21;
                long j38 = (j15 - (j16 << 21)) + j28;
                long j39 = j27 - (j28 << 21);
                long j40 = (j29 * 136657) + (((j33 * 654183) + ((j39 * 470296) + ((j38 * 666643) + (jZzi3 & 2097151)))) - (j34 * 997805));
                long j41 = (j40 + 1048576) >> 21;
                long j42 = j41 << 21;
                long j43 = (jZzi9 & 2097151) + j16;
                long j44 = ((j33 * 136657) + (((j38 * 654183) + ((j43 * 470296) + (j3 - j5))) - (j39 * 997805))) - (j34 * 683901);
                long j45 = (j44 + 1048576) >> 21;
                long j46 = j45 << 21;
                long j47 = ((j38 * 136657) + (((j6 - (j7 << 21)) + j17) - (j43 * 997805))) - (j39 * 683901);
                long j48 = (j47 + 1048576) >> 21;
                long j49 = ((j8 - j10) + j20) - (j43 * 683901);
                long j50 = (j49 + 1048576) >> 21;
                long j51 = j50 << 21;
                long jE2 = akb.e(j29, 470296L, (j34 * 666643) + (jZzi & 2097151), j31);
                long j52 = (jE2 + 1048576) >> 21;
                long j53 = (((j34 * 654183) + ((j33 * 470296) + ((j39 * 666643) + (jZzi2 & 2097151)))) - (j29 * 997805)) + j36;
                long j54 = (j53 + 1048576) >> 21;
                long j55 = (((j34 * 136657) + (((j39 * 654183) + ((j38 * 470296) + ((j43 * 666643) + (jZzh3 & 2097151)))) - (j33 * 997805))) - (j29 * 683901)) + j41;
                long j56 = (j55 + 1048576) >> 21;
                long j57 = (((j39 * 136657) + (((j43 * 654183) + (jE - j18)) - (j38 * 997805))) - (j33 * 683901)) + j45;
                long j58 = (j57 + 1048576) >> 21;
                long j59 = (((j43 * 136657) + (j19 - j21)) - (j38 * 683901)) + j48;
                long j60 = (j59 + 1048576) >> 21;
                long j61 = (j22 - j24) + j50;
                long j62 = (j61 + 1048576) >> 21;
                long j63 = (j62 * 666643) + (j30 - j32);
                long j64 = j63 >> 21;
                long jE3 = akb.e(j62, 470296L, jE2 - (j52 << 21), j64);
                long j65 = jE3 >> 21;
                long jE4 = akb.e(j62, 654183L, (j35 - j37) + j52, j65);
                long j66 = jE4 >> 21;
                long j67 = ((j53 - (j54 << 21)) - (j62 * 997805)) + j66;
                long j68 = j67 >> 21;
                long jE5 = akb.e(j62, 136657L, (j40 - j42) + j54, j68);
                long j69 = jE5 >> 21;
                long j70 = j69 << 21;
                long j71 = ((j55 - (j56 << 21)) - (j62 * 683901)) + j69;
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = (j44 - j46) + j56 + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j57 - (j58 << 21)) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = (j47 - (j48 << 21)) + j58 + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j59 - (j60 << 21)) + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j49 - j51) + j60 + j84;
                long j87 = j86 >> 21;
                long j88 = (j61 - (j62 << 21)) + j87;
                long j89 = j88 >> 21;
                long j90 = (666643 * j89) + (j63 - (j64 << 21));
                long j91 = j90 >> 21;
                long jE6 = akb.e(j89, 470296L, jE3 - (j65 << 21), j91);
                long j92 = jE6 >> 21;
                long jE7 = akb.e(j89, 654183L, jE4 - (j66 << 21), j92);
                long j93 = jE7 >> 21;
                long j94 = j93 << 21;
                long j95 = ((j67 - (j68 << 21)) - (997805 * j89)) + j93;
                long j96 = j95 >> 21;
                long jE8 = akb.e(j89, 136657L, jE5 - j70, j96);
                long j97 = jE8 >> 21;
                long j98 = j97 << 21;
                long j99 = ((j71 - j73) - (j89 * 683901)) + j97;
                long j100 = j99 >> 21;
                long j101 = j100 << 21;
                long j102 = (j74 - j76) + j100;
                long j103 = j102 >> 21;
                long j104 = j103 << 21;
                long j105 = (j77 - j79) + j103;
                long j106 = j105 >> 21;
                long j107 = j106 << 21;
                long j108 = (j80 - j82) + j106;
                long j109 = j108 >> 21;
                long j110 = j109 << 21;
                long j111 = (j83 - j85) + j109;
                long j112 = j111 >> 21;
                long j113 = j112 << 21;
                long j114 = (j86 - (j87 << 21)) + j112;
                long j115 = j114 >> 21;
                bArrDigest[0] = (byte) (j90 - (j91 << 21));
                long j116 = j105 - j107;
                long j117 = j102 - j104;
                long j118 = j99 - j101;
                long j119 = jE8 - j98;
                long j120 = j95 - (j96 << 21);
                long j121 = jE7 - j94;
                long j122 = jE6 - (j92 << 21);
                bArrDigest[1] = (byte) (r7 >> 8);
                bArrDigest[2] = (byte) ((r7 >> 16) | (j122 << 5));
                bArrDigest[3] = (byte) (j122 >> 3);
                bArrDigest[4] = (byte) (j122 >> 11);
                bArrDigest[5] = (byte) ((j122 >> 19) | (j121 << 2));
                bArrDigest[6] = (byte) (j121 >> 6);
                bArrDigest[7] = (byte) ((j121 >> 14) | (j120 << 7));
                bArrDigest[8] = (byte) (j120 >> 1);
                bArrDigest[9] = (byte) (j120 >> 9);
                bArrDigest[10] = (byte) ((j120 >> 17) | (j119 << 4));
                bArrDigest[11] = (byte) (j119 >> 4);
                bArrDigest[12] = (byte) (j119 >> 12);
                bArrDigest[13] = (byte) ((j119 >> 20) | (j118 + j118));
                bArrDigest[14] = (byte) (j118 >> 7);
                bArrDigest[15] = (byte) ((j118 >> 15) | (j117 << 6));
                bArrDigest[16] = (byte) (j117 >> 2);
                bArrDigest[17] = (byte) (j117 >> 10);
                bArrDigest[18] = (byte) ((j117 >> 18) | (j116 << 3));
                long j123 = j114 - (j115 << 21);
                long j124 = (j88 - (j89 << 21)) + j115;
                long j125 = j111 - j113;
                bArrDigest[19] = (byte) (j116 >> 5);
                bArrDigest[20] = (byte) (j116 >> 13);
                bArrDigest[21] = (byte) (j108 - j110);
                bArrDigest[22] = (byte) (r7 >> 8);
                bArrDigest[23] = (byte) ((r7 >> 16) | (j125 << 5));
                bArrDigest[24] = (byte) (j125 >> 3);
                bArrDigest[25] = (byte) (j125 >> 11);
                bArrDigest[26] = (byte) ((j125 >> 19) | (j123 << 2));
                bArrDigest[27] = (byte) (j123 >> 6);
                bArrDigest[28] = (byte) ((j123 >> 14) | (j124 << 7));
                bArrDigest[29] = (byte) (j124 >> 1);
                bArrDigest[30] = (byte) (j124 >> 9);
                bArrDigest[31] = (byte) (j124 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzh = zzsa.zzh(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzsa.zzd(jArr4, jArrZzh);
                zzsa.zza(jArr5, jArr4, zzru.zza);
                zzsa.zze(jArr4, jArr4, jArr2);
                zzsa.zzf(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzsa.zzd(jArr8, jArr5);
                zzsa.zza(jArr8, jArr8, jArr5);
                zzsa.zzd(jArr, jArr8);
                zzsa.zza(jArr, jArr, jArr5);
                zzsa.zza(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzsa.zzd(jArr9, jArr);
                zzsa.zzd(jArr10, jArr9);
                zzsa.zzd(jArr10, jArr10);
                zzsa.zza(jArr10, jArr, jArr10);
                zzsa.zza(jArr9, jArr9, jArr10);
                zzsa.zzd(jArr9, jArr9);
                zzsa.zza(jArr9, jArr10, jArr9);
                zzsa.zzd(jArr10, jArr9);
                for (int i4 = 1; i4 < 5; i4++) {
                    zzsa.zzd(jArr10, jArr10);
                }
                zzsa.zza(jArr9, jArr10, jArr9);
                zzsa.zzd(jArr10, jArr9);
                for (int i5 = 1; i5 < 10; i5++) {
                    zzsa.zzd(jArr10, jArr10);
                }
                zzsa.zza(jArr10, jArr10, jArr9);
                zzsa.zzd(jArr11, jArr10);
                for (int i6 = 1; i6 < 20; i6++) {
                    zzsa.zzd(jArr11, jArr11);
                }
                zzsa.zza(jArr10, jArr11, jArr10);
                zzsa.zzd(jArr10, jArr10);
                for (int i7 = 1; i7 < 10; i7++) {
                    zzsa.zzd(jArr10, jArr10);
                }
                zzsa.zza(jArr9, jArr10, jArr9);
                zzsa.zzd(jArr10, jArr9);
                for (int i8 = 1; i8 < 50; i8++) {
                    zzsa.zzd(jArr10, jArr10);
                }
                zzsa.zza(jArr10, jArr10, jArr9);
                zzsa.zzd(jArr11, jArr10);
                for (int i9 = 1; i9 < 100; i9++) {
                    zzsa.zzd(jArr11, jArr11);
                }
                zzsa.zza(jArr10, jArr11, jArr10);
                zzsa.zzd(jArr10, jArr10);
                for (int i10 = 1; i10 < 50; i10++) {
                    zzsa.zzd(jArr10, jArr10);
                }
                zzsa.zza(jArr9, jArr10, jArr9);
                zzsa.zzd(jArr9, jArr9);
                zzsa.zzd(jArr9, jArr9);
                zzsa.zza(jArr, jArr9, jArr);
                zzsa.zza(jArr, jArr, jArr8);
                zzsa.zza(jArr, jArr, jArr4);
                zzsa.zzd(jArr6, jArr);
                zzsa.zza(jArr6, jArr6, jArr5);
                zzsa.zze(jArr7, jArr6, jArr4);
                if (zzc(jArr7)) {
                    zzsa.zzf(jArr7, jArr6, jArr4);
                    if (zzc(jArr7)) {
                        l6.m("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        return false;
                    }
                    zzsa.zza(jArr, jArr, zzru.zzc);
                }
                if (zzc(jArr)) {
                    b = 255;
                } else {
                    b = 255;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        l6.m("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return false;
                    }
                }
                if (zza(jArr) == ((bArr3[31] & b) >> 7)) {
                    zzl(jArr, jArr);
                }
                zzsa.zza(jArr3, jArr, jArrZzh);
                zzrq zzrqVar = new zzrq(new zzrp(jArr, jArrZzh, jArr2), jArr3);
                zzrn[] zzrnVarArr = new zzrn[8];
                zzrnVarArr[0] = new zzrn(zzrqVar);
                zzro zzroVar = new zzro(new zzrp(), new long[10]);
                zzk(zzroVar, zzrqVar.zza);
                zzrq zzrqVar2 = new zzrq(zzroVar);
                for (int i11 = 1; i11 < 8; i11++) {
                    zzj(zzroVar, zzrqVar2, zzrnVarArr[i11 - 1]);
                    zzrnVarArr[i11] = new zzrn(new zzrq(zzroVar));
                }
                byte[] bArrZzo = zzo(bArrDigest);
                byte[] bArrZzo2 = zzo(bArrCopyOfRange);
                zzro zzroVar2 = new zzro(zzc);
                zzrq zzrqVar3 = new zzrq();
                int i12 = b;
                while (i12 >= 0 && bArrZzo[i12] == 0 && bArrZzo2[i12] == 0) {
                    i12--;
                }
                while (i12 >= 0) {
                    zzk(zzroVar2, new zzrp(zzroVar2));
                    byte b2 = bArrZzo[i12];
                    if (b2 > 0) {
                        zzrq.zza(zzrqVar3, zzroVar2);
                        zzj(zzroVar2, zzrqVar3, zzrnVarArr[bArrZzo[i12] / 2]);
                    } else if (b2 < 0) {
                        zzrq.zza(zzrqVar3, zzroVar2);
                        zzn(zzroVar2, zzrqVar3, zzrnVarArr[(-bArrZzo[i12]) / 2]);
                    }
                    byte b3 = bArrZzo2[i12];
                    if (b3 > 0) {
                        zzrq.zza(zzrqVar3, zzroVar2);
                        zzj(zzroVar2, zzrqVar3, zzru.zze[bArrZzo2[i12] / 2]);
                    } else if (b3 < 0) {
                        zzrq.zza(zzrqVar3, zzroVar2);
                        zzn(zzroVar2, zzrqVar3, zzru.zze[(-bArrZzo2[i12]) / 2]);
                    }
                    i12--;
                }
                byte[] bArrZzb = new zzrp(zzroVar2).zzb();
                for (int i13 = 0; i13 < 32; i13++) {
                    if (bArrZzb[i13] != bArr2[i13]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static byte[] zze(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zzacq.zzb.zza("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static byte[] zzf(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        zzro zzroVar = new zzro(zzc);
        zzrq zzrqVar = new zzrq();
        for (i = 1; i < 64; i += 2) {
            zzrm zzrmVar = new zzrm(zzb);
            zzm(zzrmVar, i / 2, bArr2[i]);
            zzrq.zza(zzrqVar, zzroVar);
            zzj(zzroVar, zzrqVar, zzrmVar);
        }
        zzrp zzrpVar = new zzrp();
        zzrp.zza(zzrpVar, zzroVar);
        zzk(zzroVar, zzrpVar);
        zzrp.zza(zzrpVar, zzroVar);
        zzk(zzroVar, zzrpVar);
        zzrp.zza(zzrpVar, zzroVar);
        zzk(zzroVar, zzrpVar);
        zzrp.zza(zzrpVar, zzroVar);
        zzk(zzroVar, zzrpVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            zzrm zzrmVar2 = new zzrm(zzb);
            zzm(zzrmVar2, i7 / 2, bArr2[i7]);
            zzrq.zza(zzrqVar, zzroVar);
            zzj(zzroVar, zzrqVar, zzrmVar2);
        }
        zzrp zzrpVar2 = new zzrp(zzroVar);
        long[] jArr = new long[10];
        zzsa.zzd(jArr, zzrpVar2.zza);
        long[] jArr2 = new long[10];
        zzsa.zzd(jArr2, zzrpVar2.zzb);
        long[] jArr3 = new long[10];
        zzsa.zzd(jArr3, zzrpVar2.zzc);
        long[] jArr4 = new long[10];
        zzsa.zzd(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzsa.zze(jArr5, jArr2, jArr);
        zzsa.zza(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzsa.zza(jArr6, jArr, jArr2);
        zzsa.zza(jArr6, jArr6, zzru.zza);
        zzsa.zzf(jArr6, jArr6, jArr4);
        zzsa.zzb(jArr6, jArr6);
        if (MessageDigest.isEqual(zzsa.zzg(jArr5), zzsa.zzg(jArr6))) {
            return zzrpVar2.zzb();
        }
        r6.g("arithmetic error in scalar multiplication");
        return null;
    }

    private static int zzg(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static long zzh(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    private static long zzi(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | zzh(bArr, i);
    }

    private static void zzj(zzro zzroVar, zzrq zzrqVar, zzrm zzrmVar) {
        zzrp zzrpVar = zzrqVar.zza;
        zzrp zzrpVar2 = zzroVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzrpVar2.zza;
        long[] jArr3 = zzrpVar.zzb;
        long[] jArr4 = zzrpVar.zza;
        zzsa.zzf(jArr2, jArr3, jArr4);
        long[] jArr5 = zzrpVar2.zzb;
        zzsa.zze(jArr5, jArr3, jArr4);
        zzsa.zza(jArr5, jArr5, zzrmVar.zzb);
        long[] jArr6 = zzrmVar.zza;
        long[] jArr7 = zzrpVar2.zzc;
        zzsa.zza(jArr7, jArr2, jArr6);
        long[] jArr8 = zzroVar.zzb;
        zzsa.zza(jArr8, zzrqVar.zzb, zzrmVar.zzc);
        zzrmVar.zzb(jArr2, zzrpVar.zzc);
        zzsa.zzf(jArr, jArr2, jArr2);
        zzsa.zze(jArr2, jArr7, jArr5);
        zzsa.zzf(jArr5, jArr7, jArr5);
        zzsa.zzf(jArr7, jArr, jArr8);
        zzsa.zze(jArr8, jArr, jArr8);
    }

    private static void zzk(zzro zzroVar, zzrp zzrpVar) {
        zzrp zzrpVar2 = zzroVar.zza;
        long[] jArr = zzrpVar2.zza;
        long[] jArr2 = zzrpVar.zza;
        long[] jArr3 = new long[10];
        zzsa.zzd(jArr, jArr2);
        long[] jArr4 = zzrpVar2.zzc;
        long[] jArr5 = zzrpVar.zzb;
        zzsa.zzd(jArr4, jArr5);
        long[] jArr6 = zzroVar.zzb;
        zzsa.zzd(jArr6, zzrpVar.zzc);
        zzsa.zzf(jArr6, jArr6, jArr6);
        long[] jArr7 = zzrpVar2.zzb;
        zzsa.zzf(jArr7, jArr2, jArr5);
        zzsa.zzd(jArr3, jArr7);
        zzsa.zzf(jArr7, jArr4, jArr);
        zzsa.zze(jArr4, jArr4, jArr);
        zzsa.zze(jArr, jArr3, jArr7);
        zzsa.zze(jArr6, jArr6, jArr4);
    }

    private static void zzl(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    private static void zzm(zzrm zzrmVar, int i, byte b) {
        zzrm[][] zzrmVarArr = zzru.zzd;
        int i2 = (b & 255) >> 7;
        int i3 = (-i2) & b;
        int i4 = b - (i3 + i3);
        zzrmVar.zza(zzrmVarArr[i][0], zzg(i4, 1));
        zzrmVar.zza(zzrmVarArr[i][1], zzg(i4, 2));
        zzrmVar.zza(zzrmVarArr[i][2], zzg(i4, 3));
        zzrmVar.zza(zzrmVarArr[i][3], zzg(i4, 4));
        zzrmVar.zza(zzrmVarArr[i][4], zzg(i4, 5));
        zzrmVar.zza(zzrmVarArr[i][5], zzg(i4, 6));
        zzrmVar.zza(zzrmVarArr[i][6], zzg(i4, 7));
        zzrmVar.zza(zzrmVarArr[i][7], zzg(i4, 8));
        long[] jArr = zzrmVar.zzc;
        long[] jArr2 = zzrmVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzrmVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzl(jArrCopyOf3, jArrCopyOf3);
        zzrmVar.zza(new zzrm(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    private static void zzn(zzro zzroVar, zzrq zzrqVar, zzrm zzrmVar) {
        zzrp zzrpVar = zzrqVar.zza;
        zzrp zzrpVar2 = zzroVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzrpVar2.zza;
        long[] jArr3 = zzrpVar.zzb;
        long[] jArr4 = zzrpVar.zza;
        zzsa.zzf(jArr2, jArr3, jArr4);
        long[] jArr5 = zzrpVar2.zzb;
        zzsa.zze(jArr5, jArr3, jArr4);
        zzsa.zza(jArr5, jArr5, zzrmVar.zza);
        long[] jArr6 = zzrmVar.zzb;
        long[] jArr7 = zzrpVar2.zzc;
        zzsa.zza(jArr7, jArr2, jArr6);
        long[] jArr8 = zzroVar.zzb;
        zzsa.zza(jArr8, zzrqVar.zzb, zzrmVar.zzc);
        zzrmVar.zzb(jArr2, zzrpVar.zzc);
        zzsa.zzf(jArr, jArr2, jArr2);
        zzsa.zze(jArr2, jArr7, jArr5);
        zzsa.zzf(jArr5, jArr7, jArr5);
        zzsa.zze(jArr7, jArr, jArr8);
        zzsa.zzf(jArr8, jArr, jArr8);
    }

    private static byte[] zzo(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b2 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }
}
