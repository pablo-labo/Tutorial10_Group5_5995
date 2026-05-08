package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.mj8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DebugProctorActivity.e $editor;
    final /* synthetic */ DebugProctorActivity $tmp0_rcvr;
    final /* synthetic */ List<String> $tokens;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(DebugProctorActivity debugProctorActivity, DebugProctorActivity.e eVar, List<String> list, int i) {
        super(2);
        this.$tmp0_rcvr = debugProctorActivity;
        this.$editor = eVar;
        this.$tokens = list;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        num.intValue();
        DebugProctorActivity.C(this.$tmp0_rcvr, this.$editor, this.$tokens, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
