package com.wlappdebug;

import com.wlappdebug.DebugFlagsActivity;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.mj8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DebugFlagsActivity.a $editor;
    final /* synthetic */ DebugFlagsActivity $tmp0_rcvr;
    final /* synthetic */ List<String> $tokens;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DebugFlagsActivity debugFlagsActivity, DebugFlagsActivity.a aVar, List<String> list, int i) {
        super(2);
        this.$tmp0_rcvr = debugFlagsActivity;
        this.$editor = aVar;
        this.$tokens = list;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        num.intValue();
        DebugFlagsActivity.A(this.$tmp0_rcvr, this.$editor, this.$tokens, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
