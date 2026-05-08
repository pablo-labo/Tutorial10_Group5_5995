package com.datadog.android.trace.internal.domain.event;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.v40;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class SpanEventSerializer$sanitizeUserAttributes$transformedAttributes$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ Map.Entry<String, Object> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanEventSerializer$sanitizeUserAttributes$transformedAttributes$1$1(Map.Entry<String, ? extends Object> entry) {
        super(0);
        this.$it = entry;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return v40.e(this.$it.getKey(), "Error converting value for key ", " to meta string, it will be dropped.");
    }
}
