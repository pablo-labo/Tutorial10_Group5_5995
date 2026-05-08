package com.datadog.android.rum.internal.tracking;

import com.datadog.android.api.feature.FeatureSdkCore;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.wl7;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class OreoFragmentLifecycleCallbacks$executor$2 extends mj8 implements gu5<ScheduledExecutorService> {
    final /* synthetic */ OreoFragmentLifecycleCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OreoFragmentLifecycleCallbacks$executor$2(OreoFragmentLifecycleCallbacks oreoFragmentLifecycleCallbacks) {
        super(0);
        this.this$0 = oreoFragmentLifecycleCallbacks;
    }

    @Override // defpackage.gu5
    public final ScheduledExecutorService invoke() {
        FeatureSdkCore featureSdkCore = this.this$0.sdkCore;
        if (featureSdkCore != null) {
            return featureSdkCore.createScheduledExecutorService("rum-fragment-lifecycle");
        }
        wl7.g("sdkCore");
        throw null;
    }
}
