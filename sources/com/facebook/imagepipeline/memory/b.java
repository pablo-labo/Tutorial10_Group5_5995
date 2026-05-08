package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import defpackage.bo9;
import defpackage.wfb;
import defpackage.wn9;
import defpackage.xfb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends BasePool<wn9> {
    public final int[] Y;

    public b(bo9 bo9Var, wfb wfbVar, xfb xfbVar) {
        super(bo9Var, wfbVar, xfbVar);
        SparseIntArray sparseIntArray = wfbVar.c;
        sparseIntArray.getClass();
        this.Y = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.Y;
            if (i >= iArr.length) {
                this.b.getClass();
                this.X.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void d(wn9 wn9Var) {
        wn9 wn9Var2 = wn9Var;
        wn9Var2.getClass();
        wn9Var2.close();
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
    public final int g(wn9 wn9Var) {
        wn9 wn9Var2 = wn9Var;
        wn9Var2.getClass();
        return wn9Var2.a();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean k(wn9 wn9Var) {
        wn9Var.getClass();
        return !r1.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract wn9 b(int i);
}
