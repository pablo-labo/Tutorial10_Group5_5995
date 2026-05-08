package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class coe {
    public static final int[] e = {1, 2, 4, 8, 16, 32, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 2048};
    public final float a;
    public final float[] b;
    public int c;
    public boolean d;

    public coe(float f) {
        this(f, new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN});
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r6) {
        /*
            r5 = this;
            r0 = 4
            if (r6 == r0) goto Lc
            r0 = 5
            if (r6 == r0) goto Lc
            switch(r6) {
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                default: goto L9;
            }
        L9:
            float r0 = r5.a
            goto Le
        Lc:
            r0 = 2143289344(0x7fc00000, float:NaN)
        Le:
            int r1 = r5.c
            if (r1 != 0) goto L13
            goto L3e
        L13:
            int[] r2 = defpackage.coe.e
            r3 = r2[r6]
            r3 = r3 & r1
            float[] r4 = r5.b
            if (r3 == 0) goto L1f
            r5 = r4[r6]
            return r5
        L1f:
            boolean r5 = r5.d
            if (r5 == 0) goto L3e
            r5 = 1
            if (r6 == r5) goto L2b
            r5 = 3
            if (r6 == r5) goto L2b
            r5 = 6
            goto L2c
        L2b:
            r5 = 7
        L2c:
            r6 = r2[r5]
            r6 = r6 & r1
            if (r6 == 0) goto L34
            r5 = r4[r5]
            return r5
        L34:
            r5 = 8
            r6 = r2[r5]
            r6 = r6 & r1
            if (r6 == 0) goto L3e
            r5 = r4[r5]
            return r5
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coe.a(int):float");
    }

    public final void b(float f, int i) {
        float[] fArr = this.b;
        if (pyd.t(fArr[i], f)) {
            return;
        }
        fArr[i] = f;
        boolean zM = dmc.m(f);
        int i2 = this.c;
        int[] iArr = e;
        int i3 = zM ? (~iArr[i]) & i2 : iArr[i] | i2;
        this.c = i3;
        this.d = ((iArr[8] & i3) == 0 && (iArr[7] & i3) == 0 && (iArr[6] & i3) == 0 && (i3 & iArr[9]) == 0) ? false : true;
    }

    public coe(float f, float[] fArr) {
        this.a = f;
        this.b = fArr;
    }
}
