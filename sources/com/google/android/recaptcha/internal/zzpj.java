package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpj extends zzol {
    static final zzol zza = new zzpj(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzpj(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    public static zzpj zzf(int i, Object[] objArr, zzok zzokVar) {
        boolean z;
        int i2;
        int i3;
        short[] sArr;
        boolean z2;
        Object obj;
        boolean z3;
        ?? r16;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzpj) zza;
        }
        zzoj zzojVar = null;
        ?? r2 = 0;
        zzoj zzojVar2 = null;
        zzoj zzojVar3 = null;
        boolean z4 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zznj.zzb(obj2, obj3);
            return new zzpj(null, objArrCopyOf, 1);
        }
        zzmz.zzb(i4, objArrCopyOf.length >> 1, "index");
        int iZzg = zzoq.zzg(i4);
        if (i4 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zznj.zzb(obj4, obj5);
            r16 = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = iZzg - 1;
            if (iZzg <= 128) {
                byte[] bArr = new byte[iZzg];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj6 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i10 ^ 1];
                    Objects.requireNonNull(obj7);
                    zznj.zzb(obj6, obj7);
                    int iZza = zzoc.zza(obj6.hashCode());
                    while (true) {
                        int i11 = iZza & i6;
                        z3 = z4;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj6;
                                objArrCopyOf[i9 ^ 1] = obj7;
                            }
                            i8++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                                int i13 = ~i12;
                                Object obj8 = objArrCopyOf[i13 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzoj zzojVar4 = new zzoj(obj6, obj7, obj8);
                                objArrCopyOf[i13 == true ? 1 : 0] = obj7;
                                zzojVar2 = zzojVar4;
                                break;
                            }
                            iZza = i11 + 1;
                            z4 = z3;
                        }
                    }
                    i7++;
                    z4 = z3;
                }
                z = z4;
                obj = bArr;
                z2 = z;
                if (i8 != i4) {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i8);
                    sArr[2] = zzojVar2;
                    r2 = sArr;
                    i2 = 1;
                    r16 = z;
                }
                i2 = 1;
                r2 = obj;
                r16 = z2;
            } else {
                z = false;
                if (iZzg <= 32768) {
                    sArr = new short[iZzg];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj9 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj10);
                        zznj.zzb(obj9, obj10);
                        int iZza2 = zzoc.zza(obj9.hashCode());
                        while (true) {
                            int i18 = iZza2 & i6;
                            char c = (char) sArr[i18];
                            if (c == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj9;
                                    objArrCopyOf[i16 ^ 1] = obj10;
                                }
                                i14++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c])) {
                                    int i19 = c ^ 1;
                                    Object obj11 = objArrCopyOf[i19 == true ? 1 : 0];
                                    Objects.requireNonNull(obj11);
                                    zzoj zzojVar5 = new zzoj(obj9, obj10, obj11);
                                    objArrCopyOf[i19 == true ? 1 : 0] = obj10;
                                    zzojVar3 = zzojVar5;
                                    break;
                                }
                                iZza2 = i18 + 1;
                            }
                        }
                    }
                    if (i14 != i4) {
                        obj = new Object[]{sArr, Integer.valueOf(i14), zzojVar3};
                        z2 = z;
                        i2 = 1;
                        r2 = obj;
                        r16 = z2;
                    }
                    r2 = sArr;
                    i2 = 1;
                    r16 = z;
                } else {
                    int[] iArr = new int[iZzg];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj12 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i23 ^ i5];
                        Objects.requireNonNull(obj13);
                        zznj.zzb(obj12, obj13);
                        int iZza3 = zzoc.zza(obj12.hashCode());
                        while (true) {
                            int i24 = iZza3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj12;
                                    objArrCopyOf[i22 ^ 1] = obj13;
                                }
                                i21++;
                                i3 = i5;
                            } else {
                                i3 = i5;
                                if (obj12.equals(objArrCopyOf[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj14 = objArrCopyOf[i26];
                                    Objects.requireNonNull(obj14);
                                    zzoj zzojVar6 = new zzoj(obj12, obj13, obj14);
                                    objArrCopyOf[i26] = obj13;
                                    zzojVar = zzojVar6;
                                    break;
                                }
                                iZza3 = i24 + 1;
                                i5 = i3;
                            }
                        }
                        i20++;
                        i5 = i3;
                    }
                    i2 = i5;
                    if (i21 == i4) {
                        r2 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i2] = Integer.valueOf(i21);
                        objArr2[2] = zzojVar;
                        r2 = objArr2;
                        r16 = z;
                    }
                }
            }
        }
        boolean z5 = r2 instanceof Object[];
        ?? r22 = r2;
        if (z5) {
            Object[] objArr3 = (Object[]) r2;
            zzokVar.zzc = (zzoj) objArr3[2];
            Object obj15 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r22 = obj15;
            i4 = iIntValue;
        }
        return new zzpj(r22, objArrCopyOf, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.recaptcha.internal.zzol, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r8 = r0
            goto L9c
        L6:
            int r1 = r8.zzd
            java.lang.Object[] r2 = r8.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r8 = 0
            r8 = r2[r8]
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L3
            r8 = r2[r3]
            java.util.Objects.requireNonNull(r8)
            goto L9c
        L20:
            java.lang.Object r8 = r8.zzc
            if (r8 != 0) goto L25
            goto L3
        L25:
            boolean r1 = r8 instanceof byte[]
            r4 = -1
            if (r1 == 0) goto L51
            r1 = r8
            byte[] r1 = (byte[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.recaptcha.internal.zzoc.zza(r8)
        L38:
            r8 = r8 & r5
            r4 = r1[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L41
            goto L3
        L41:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L4e
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L4e:
            int r8 = r8 + 1
            goto L38
        L51:
            boolean r1 = r8 instanceof short[]
            if (r1 == 0) goto L7d
            r1 = r8
            short[] r1 = (short[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.recaptcha.internal.zzoc.zza(r8)
        L63:
            r8 = r8 & r5
            short r4 = r1[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6d
            goto L3
        L6d:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7a
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L7a:
            int r8 = r8 + 1
            goto L63
        L7d:
            int[] r8 = (int[]) r8
            int r1 = r8.length
            int r1 = r1 + r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.recaptcha.internal.zzoc.zza(r5)
        L89:
            r5 = r5 & r1
            r6 = r8[r5]
            if (r6 != r4) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r8 = r6 ^ 1
            r8 = r2[r8]
        L9c:
            if (r8 != 0) goto L9f
            return r0
        L9f:
            return r8
        La0:
            int r5 = r5 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzol
    public final zzof zza() {
        return new zzpi(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.recaptcha.internal.zzol
    public final zzoq zzc() {
        return new zzpg(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.recaptcha.internal.zzol
    public final zzoq zzd() {
        return new zzph(this, new zzpi(this.zzb, 0, this.zzd));
    }
}
