package com.datadog.android.core.constraints;

import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$validateTimings$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ Map.Entry<String, Long> $entry;
    final /* synthetic */ String $sanitizedKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogDataConstraints$validateTimings$1$1(Map.Entry<String, Long> entry, String str) {
        super(0);
        this.$entry = entry;
        this.$sanitizedKey = str;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return String.format(Locale.US, DatadogDataConstraints.CUSTOM_TIMING_KEY_REPLACED_WARNING, Arrays.copyOf(new Object[]{this.$entry.getKey(), this.$sanitizedKey}, 2));
    }
}
