package com.wlappdebug;

import com.wlappdebug.DebugActivity;
import defpackage.gu5;
import defpackage.mj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends mj8 implements gu5<CharSequence> {
    final /* synthetic */ List<DebugActivity.b<String>> $metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<DebugActivity.b<String>> list) {
        super(0);
        this.$metrics = list;
    }

    @Override // defpackage.gu5
    public final CharSequence invoke() {
        return this.$metrics.size() + " metric(s)";
    }
}
