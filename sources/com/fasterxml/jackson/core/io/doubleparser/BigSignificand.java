package com.fasterxml.jackson.core.io.doubleparser;

import defpackage.l5;
import defpackage.r6;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
class BigSignificand {
    private int firstNonZeroInt;
    private final int numInts;
    private final int[] x;

    public BigSignificand(long j) {
        if (j <= 0 || j >= 2147483647L) {
            l5.q(r6.c(j, "numBits="));
            throw null;
        }
        int i = (((int) ((j + 63) >>> 6)) + 1) << 1;
        this.numInts = i;
        this.x = new int[i];
        this.firstNonZeroInt = i;
    }

    private void x(int i, int i2) {
        this.x[i] = i2;
    }

    public void add(int i) {
        if (i == 0) {
            return;
        }
        long j = ((long) i) & 4294967295L;
        int i2 = this.numInts;
        while (true) {
            i2--;
            if (j == 0) {
                this.firstNonZeroInt = Math.min(this.firstNonZeroInt, i2 + 1);
                return;
            } else {
                long jX = (((long) x(i2)) & 4294967295L) + j;
                x(i2, (int) jX);
                j = jX >>> 32;
            }
        }
    }

    public void fma(int i, int i2) {
        long j = ((long) i) & 4294967295L;
        long j2 = i2;
        int i3 = this.numInts;
        while (true) {
            i3--;
            if (i3 < this.firstNonZeroInt) {
                break;
            }
            long jX = ((((long) x(i3)) & 4294967295L) * j) + j2;
            x(i3, (int) jX);
            j2 = jX >>> 32;
        }
        if (j2 != 0) {
            x(i3, (int) j2);
            this.firstNonZeroInt = i3;
        }
    }

    public BigInteger toBigInteger() {
        byte[] bArr = new byte[this.x.length << 2];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        int i = 0;
        while (true) {
            int[] iArr = this.x;
            if (i >= iArr.length) {
                return new BigInteger(bArr);
            }
            intBufferAsIntBuffer.put(i, iArr[i]);
            i++;
        }
    }

    private int x(int i) {
        return this.x[i];
    }
}
