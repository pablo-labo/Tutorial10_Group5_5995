package com.datadog.android.core.internal;

import defpackage.gu5;
import defpackage.mj8;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class CoreFeature$lastViewEventFile$2 extends mj8 implements gu5<File> {
    final /* synthetic */ CoreFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFeature$lastViewEventFile$2(CoreFeature coreFeature) {
        super(0);
        this.this$0 = coreFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final File invoke() {
        return new File(this.this$0.getStorageDir$dd_sdk_android_core_release(), CoreFeature.LAST_RUM_VIEW_EVENT_FILE_NAME);
    }
}
