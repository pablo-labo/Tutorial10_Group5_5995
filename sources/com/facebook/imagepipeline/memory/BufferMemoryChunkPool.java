package com.facebook.imagepipeline.memory;

import defpackage.bo9;
import defpackage.co1;
import defpackage.h84;
import defpackage.wfb;
import defpackage.wn9;
import defpackage.xfb;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class BufferMemoryChunkPool extends b {
    @h84
    public BufferMemoryChunkPool(bo9 bo9Var, wfb wfbVar, xfb xfbVar) {
        super(bo9Var, wfbVar, xfbVar);
    }

    @Override // com.facebook.imagepipeline.memory.b, com.facebook.imagepipeline.memory.BasePool
    public final wn9 b(int i) {
        return new co1(i);
    }

    @Override // com.facebook.imagepipeline.memory.b
    /* JADX INFO: renamed from: n */
    public final wn9 b(int i) {
        return new co1(i);
    }
}
