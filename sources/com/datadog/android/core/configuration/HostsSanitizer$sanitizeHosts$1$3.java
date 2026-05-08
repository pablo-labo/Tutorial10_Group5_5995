package com.datadog.android.core.configuration;

import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class HostsSanitizer$sanitizeHosts$1$3 extends mj8 implements gu5<String> {
    final /* synthetic */ String $feature;
    final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostsSanitizer$sanitizeHosts$1$3(String str, String str2) {
        super(0);
        this.$it = str;
        this.$feature = str2;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return String.format(Locale.US, HostsSanitizer.ERROR_MALFORMED_HOST_IP_ADDRESS, Arrays.copyOf(new Object[]{this.$it, this.$feature}, 2));
    }
}
