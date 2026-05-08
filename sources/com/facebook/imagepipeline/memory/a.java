package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import defpackage.bo9;
import defpackage.cr1;
import defpackage.mia;
import defpackage.wfb;

/* JADX INFO: loaded from: classes2.dex */
public class a extends BasePool<byte[]> implements cr1 {
    public final int[] Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bo9 bo9Var, wfb wfbVar, mia miaVar) {
        super(bo9Var, wfbVar, miaVar);
        bo9Var.getClass();
        wfbVar.getClass();
        miaVar.getClass();
        SparseIntArray sparseIntArray = wfbVar.c;
        if (sparseIntArray != null) {
            this.Y = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.Y[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.Y = new int[0];
        }
        this.b.getClass();
        this.X.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final byte[] b(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void d(byte[] bArr) {
        bArr.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int f(int i) {
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.Y) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int g(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        return bArr2.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i) {
        return i;
    }
}
