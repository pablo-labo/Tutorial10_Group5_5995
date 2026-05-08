package com.wlappdebug;

import defpackage.g4a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends mj8 implements gu5<j6g> {
    final /* synthetic */ g4a<Boolean> $customBucketDialogShown$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g4a<Boolean> g4aVar) {
        super(0);
        this.$customBucketDialogShown$delegate = g4aVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        g4a<Boolean> g4aVar = this.$customBucketDialogShown$delegate;
        int i = DebugProctorActivity.t0;
        g4aVar.setValue(Boolean.TRUE);
        return j6g.a;
    }
}
