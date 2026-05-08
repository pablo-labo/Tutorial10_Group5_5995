package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(a32.b);
        bytes.getClass();
        a = bytes;
    }

    public static final boolean a(lyd lydVar, int i, byte[] bArr, int i2) {
        int i3 = lydVar.c;
        byte[] bArr2 = lydVar.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                lydVar = lydVar.f;
                lydVar.getClass();
                bArr2 = lydVar.a;
                i = lydVar.b;
                i3 = lydVar.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(zn1 zn1Var, long j) throws EOFException {
        zn1Var.getClass();
        if (j > 0) {
            long j2 = j - 1;
            if (zn1Var.P(j2) == 13) {
                String strH0 = zn1Var.h0(j2, a32.b);
                zn1Var.skip(2L);
                return strH0;
            }
        }
        String strH02 = zn1Var.h0(j, a32.b);
        zn1Var.skip(1L);
        return strH02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(defpackage.zn1 r16, defpackage.pva r17, boolean r18) {
        /*
            r16.getClass()
            r17.getClass()
            r0 = r16
            lyd r0 = r0.a
            r1 = -1
            if (r0 != 0) goto L11
            if (r18 == 0) goto L10
            goto L5f
        L10:
            return r1
        L11:
            byte[] r2 = r0.a
            int r3 = r0.b
            int r4 = r0.c
            r5 = r17
            int[] r5 = r5.b
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L1f:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L2a
            r9 = r10
        L2a:
            if (r8 != 0) goto L2d
            goto L5d
        L2d:
            r10 = 0
            if (r11 >= 0) goto L75
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L34:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L41
            goto L7f
        L41:
            if (r13 != r12) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = r6
        L46:
            if (r11 != r4) goto L65
            r8.getClass()
            lyd r2 = r8.f
            r2.getClass()
            int r4 = r2.b
            byte[] r7 = r2.a
            int r8 = r2.c
            if (r2 != r0) goto L61
            if (r3 == 0) goto L5d
            r2 = r7
            r7 = r10
            goto L68
        L5d:
            if (r18 == 0) goto L7f
        L5f:
            r0 = -2
            return r0
        L61:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L68
        L65:
            r7 = r8
            r8 = r4
            r4 = r11
        L68:
            if (r3 == 0) goto L70
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto La1
        L70:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L34
        L75:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7d:
            if (r7 != r13) goto L80
        L7f:
            return r9
        L80:
            r14 = r5[r7]
            if (r3 != r14) goto Lab
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L9f
            lyd r8 = r8.f
            r8.getClass()
            int r2 = r8.b
            byte[] r4 = r8.a
            int r7 = r8.c
            if (r8 != r0) goto L9b
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto La1
        L9b:
            r15 = r4
            r4 = r2
            r2 = r15
            goto La1
        L9f:
            r7 = r4
            r4 = r12
        La1:
            if (r3 < 0) goto La4
            return r3
        La4:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L1f
        Lab:
            int r7 = r7 + 1
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.c(zn1, pva, boolean):int");
    }
}
