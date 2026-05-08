package com.datadog.android.rum.internal.tracking;

import defpackage.gu5;
import defpackage.mj8;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class AndroidXFragmentLifecycleCallbacks$executor$2 extends mj8 implements gu5<ScheduledExecutorService> {
    final /* synthetic */ AndroidXFragmentLifecycleCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidXFragmentLifecycleCallbacks$executor$2(AndroidXFragmentLifecycleCallbacks androidXFragmentLifecycleCallbacks) {
        super(0);
        this.this$0 = androidXFragmentLifecycleCallbacks;
    }

    @Override // defpackage.gu5
    public final ScheduledExecutorService invoke() {
        return this.this$0.getSdkCore().createScheduledExecutorService("rum-fragmentx-lifecycle");
    }
}
