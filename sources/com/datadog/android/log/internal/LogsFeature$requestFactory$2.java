package com.datadog.android.log.internal;

import com.datadog.android.log.internal.net.LogsRequestFactory;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/log/internal/net/LogsRequestFactory;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class LogsFeature$requestFactory$2 extends mj8 implements gu5<LogsRequestFactory> {
    final /* synthetic */ String $customEndpointUrl;
    final /* synthetic */ LogsFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogsFeature$requestFactory$2(String str, LogsFeature logsFeature) {
        super(0);
        this.$customEndpointUrl = str;
        this.this$0 = logsFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final LogsRequestFactory invoke() {
        return new LogsRequestFactory(this.$customEndpointUrl, this.this$0.sdkCore.getInternalLogger());
    }
}
