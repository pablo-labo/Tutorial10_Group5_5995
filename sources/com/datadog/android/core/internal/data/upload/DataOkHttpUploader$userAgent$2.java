package com.datadog.android.core.internal.data.upload;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.u40;
import defpackage.z3;
import defpackage.zve;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DataOkHttpUploader$userAgent$2 extends mj8 implements gu5<String> {
    final /* synthetic */ DataOkHttpUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataOkHttpUploader$userAgent$2(DataOkHttpUploader dataOkHttpUploader) {
        super(0);
        this.this$0 = dataOkHttpUploader;
    }

    @Override // defpackage.gu5
    public final String invoke() throws IOException {
        String strSanitizeHeaderValue = this.this$0.sanitizeHeaderValue(System.getProperty(DataOkHttpUploader.SYSTEM_UA));
        DataOkHttpUploader dataOkHttpUploader = this.this$0;
        if (!zve.U(strSanitizeHeaderValue)) {
            return strSanitizeHeaderValue;
        }
        String sdkVersion = dataOkHttpUploader.getSdkVersion();
        String osVersion = dataOkHttpUploader.getAndroidInfoProvider().getOsVersion();
        return z3.n(u40.f("Datadog/", sdkVersion, " (Linux; U; Android ", osVersion, "; "), dataOkHttpUploader.getAndroidInfoProvider().getDeviceModel(), " Build/", dataOkHttpUploader.getAndroidInfoProvider().getDeviceBuildId(), ")");
    }
}
