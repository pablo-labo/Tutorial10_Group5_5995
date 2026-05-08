package com.datadog.android.core.internal.system;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.z3;
import defpackage.zve;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider$deviceName$2 extends mj8 implements gu5<String> {
    final /* synthetic */ DefaultAndroidInfoProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAndroidInfoProvider$deviceName$2(DefaultAndroidInfoProvider defaultAndroidInfoProvider) {
        super(0);
        this.this$0 = defaultAndroidInfoProvider;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        boolean zU = zve.U(this.this$0.getDeviceBrand());
        DefaultAndroidInfoProvider defaultAndroidInfoProvider = this.this$0;
        if (zU) {
            return defaultAndroidInfoProvider.getDeviceModel();
        }
        boolean zL = zve.L(defaultAndroidInfoProvider.getDeviceModel(), this.this$0.getDeviceBrand(), false);
        DefaultAndroidInfoProvider defaultAndroidInfoProvider2 = this.this$0;
        return zL ? defaultAndroidInfoProvider2.getDeviceModel() : z3.m(defaultAndroidInfoProvider2.getDeviceBrand(), " ", this.this$0.getDeviceModel());
    }
}
