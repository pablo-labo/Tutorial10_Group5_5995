package com.datadog.android.okhttp;

import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;
import okhttp3.Call;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogEventListener$Factory$create$1 extends mj8 implements gu5<String> {
    final /* synthetic */ Call $call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogEventListener$Factory$create$1(Call call) {
        super(0);
        this.$call = call;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return "No SDK instance is available, skipping tracking timing information of request with url " + this.$call.getB().a + ".";
    }
}
