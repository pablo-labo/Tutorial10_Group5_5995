package com.datadog.android.core.internal;

import defpackage.ab8;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lab8;", "invoke", "()Lab8;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
public final class CoreFeature$lastViewEvent$2 extends mj8 implements gu5<ab8> {
    final /* synthetic */ CoreFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFeature$lastViewEvent$2(CoreFeature coreFeature) {
        super(0);
        this.this$0 = coreFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final ab8 invoke() {
        ab8 lastViewEvent = this.this$0.readLastViewEvent();
        if (lastViewEvent != null) {
            this.this$0.deleteLastViewEvent$dd_sdk_android_core_release();
        }
        return lastViewEvent;
    }
}
