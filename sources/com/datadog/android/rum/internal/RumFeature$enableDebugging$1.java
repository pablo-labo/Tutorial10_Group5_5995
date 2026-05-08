package com.datadog.android.rum.internal;

import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RumFeature$enableDebugging$1 extends mj8 implements gu5<String> {
    public static final RumFeature$enableDebugging$1 INSTANCE = new RumFeature$enableDebugging$1();

    public RumFeature$enableDebugging$1() {
        super(0);
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot enable RUM debugging.";
    }
}
