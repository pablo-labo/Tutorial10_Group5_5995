package com.datadog.android.ndk.internal;

import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1 extends mj8 implements gu5<String> {
    public static final DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1 INSTANCE = new DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1();

    public DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1() {
        super(0);
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return DatadogNdkCrashHandler.WARN_CANNOT_READ_VIEW_INFO_DATA;
    }
}
