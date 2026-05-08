package com.datadog.android.core.internal;

import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class SdkFeature$setContextUpdateListener$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ SdkFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkFeature$setContextUpdateListener$1$1(SdkFeature sdkFeature) {
        super(0);
        this.this$0 = sdkFeature;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return String.format(Locale.US, SdkFeature.CONTEXT_UPDATE_LISTENER_ALREADY_EXISTS, Arrays.copyOf(new Object[]{this.this$0.getWrappedFeature().getName()}, 1));
    }
}
