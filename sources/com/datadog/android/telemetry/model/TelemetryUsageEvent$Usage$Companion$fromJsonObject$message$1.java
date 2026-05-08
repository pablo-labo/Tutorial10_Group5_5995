package com.datadog.android.telemetry.model;

import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class TelemetryUsageEvent$Usage$Companion$fromJsonObject$message$1 extends mj8 implements Function1<Throwable, CharSequence> {
    public static final TelemetryUsageEvent$Usage$Companion$fromJsonObject$message$1 INSTANCE = new TelemetryUsageEvent$Usage$Companion$fromJsonObject$message$1();

    public TelemetryUsageEvent$Usage$Companion$fromJsonObject$message$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Throwable th) {
        th.getClass();
        return String.valueOf(th.getMessage());
    }
}
