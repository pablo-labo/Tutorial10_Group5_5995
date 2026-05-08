package com.datadog.android.core.internal.system;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAppVersionProvider;", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "initialVersion", "", "(Ljava/lang/String;)V", "value", "Ljava/util/concurrent/atomic/AtomicReference;", "version", "getVersion", "()Ljava/lang/String;", "setVersion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DefaultAppVersionProvider implements AppVersionProvider {
    private final AtomicReference<String> value;

    public DefaultAppVersionProvider(String str) {
        str.getClass();
        this.value = new AtomicReference<>(str);
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public String getVersion() {
        String str = this.value.get();
        str.getClass();
        return str;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public void setVersion(String str) {
        str.getClass();
        this.value.set(str);
    }
}
