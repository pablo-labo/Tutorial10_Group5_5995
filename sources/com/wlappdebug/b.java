package com.wlappdebug;

import com.wlappdebug.DebugActivity;
import defpackage.gu5;
import defpackage.mj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends mj8 implements gu5<CharSequence> {
    final /* synthetic */ List<DebugActivity.a> $actions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<DebugActivity.a> list) {
        super(0);
        this.$actions = list;
    }

    @Override // defpackage.gu5
    public final CharSequence invoke() {
        return this.$actions.size() + " action(s)";
    }
}
