package com.datadog.android.core.constraints;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$tagTransforms$5 extends mj8 implements Function1<String, String> {
    public static final DatadogDataConstraints$tagTransforms$5 INSTANCE = new DatadogDataConstraints$tagTransforms$5();

    public DatadogDataConstraints$tagTransforms$5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        str.getClass();
        return str.length() > 200 ? str.substring(0, UiRumDebugListener.DEFAULT_ALPHA) : str;
    }
}
