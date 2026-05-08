package com.datadog.android.core.internal.system;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/internal/system/NoOpAppVersionProvider;", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "()V", "value", "", "version", "getVersion$annotations", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpAppVersionProvider implements AppVersionProvider {
    public static /* synthetic */ void getVersion$annotations() {
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public String getVersion() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public void setVersion(String str) {
        str.getClass();
    }
}
