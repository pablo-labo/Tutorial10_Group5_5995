package com.datadog.android.core.constraints;

import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$validateAttributes$convertedAttributes$1$2 extends mj8 implements gu5<String> {
    final /* synthetic */ Map.Entry<String, T> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatadogDataConstraints$validateAttributes$convertedAttributes$1$2(Map.Entry<String, ? extends T> entry) {
        super(0);
        this.$it = entry;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return "\"" + this.$it + "\" key was in the reservedKeys set, and was dropped.";
    }
}
