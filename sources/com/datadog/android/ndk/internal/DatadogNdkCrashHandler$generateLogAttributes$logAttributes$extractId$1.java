package com.datadog.android.ndk.internal;

import defpackage.ab8;
import defpackage.fb8;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "property", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1 extends mj8 implements Function1<String, String> {
    final /* synthetic */ ab8 $lastRumViewEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1(ab8 ab8Var) {
        super(1);
        this.$lastRumViewEvent = ab8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        str.getClass();
        return ((fb8) ((ab8) this.$lastRumViewEvent.a.get(str)).a.get("id")).g();
    }
}
