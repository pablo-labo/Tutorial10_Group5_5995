package com.datadog.android.rum.internal.utils;

import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
public final class WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 extends mj8 implements Function1<AdvancedRumMonitor, j6g> {
    public static final WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 INSTANCE = new WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1();

    public WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(AdvancedRumMonitor advancedRumMonitor) {
        invoke2(advancedRumMonitor);
        return j6g.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdvancedRumMonitor advancedRumMonitor) {
        advancedRumMonitor.getClass();
    }
}
