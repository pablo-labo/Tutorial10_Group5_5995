package com.datadog.android.rum.internal;

import com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer;
import com.datadog.android.rum.internal.domain.event.RumViewEventFilter;
import com.datadog.android.rum.internal.net.RumRequestFactory;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/internal/net/RumRequestFactory;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RumFeature$requestFactory$2 extends mj8 implements gu5<RumRequestFactory> {
    final /* synthetic */ RumFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumFeature$requestFactory$2(RumFeature rumFeature) {
        super(0);
        this.this$0 = rumFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final RumRequestFactory invoke() {
        return new RumRequestFactory(this.this$0.getConfiguration().getCustomEndpointUrl(), new RumViewEventFilter(new RumEventMetaDeserializer(this.this$0.sdkCore.getInternalLogger())), this.this$0.sdkCore.getInternalLogger());
    }
}
