package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.context.DatadogContext;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DataOkHttpUploader$upload$uploadStatus$1 extends mj8 implements gu5<String> {
    final /* synthetic */ DatadogContext $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataOkHttpUploader$upload$uploadStatus$1(DatadogContext datadogContext) {
        super(0);
        this.$context = datadogContext;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return "Unable to find host for site " + this.$context.getSite() + "; we will retry later.";
    }
}
