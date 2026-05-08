package com.datadog.android.core.internal.system;

import android.content.Context;
import com.datadog.android.api.context.DeviceType;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/api/context/DeviceType;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider$deviceType$2 extends mj8 implements gu5<DeviceType> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ String $rawDeviceModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAndroidInfoProvider$deviceType$2(String str, Context context) {
        super(0);
        this.$rawDeviceModel = str;
        this.$appContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final DeviceType invoke() {
        return DefaultAndroidInfoProvider.INSTANCE.resolveDeviceType(this.$rawDeviceModel, this.$appContext);
    }
}
