package com.datadog.android.core.internal.user;

import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.internal.persistence.DataWriter;
import defpackage.lc9;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/core/internal/user/DatadogUserInfoProvider;", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/api/context/UserInfo;", "dataWriter", "<init>", "(Lcom/datadog/android/core/internal/persistence/DataWriter;)V", "", "id", "name", "email", "", "", "extraInfo", "Lj6g;", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "properties", "addUserProperties", "(Ljava/util/Map;)V", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "getDataWriter$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/DataWriter;", "value", "internalUserInfo", "Lcom/datadog/android/api/context/UserInfo;", "setInternalUserInfo", "(Lcom/datadog/android/api/context/UserInfo;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogUserInfoProvider implements MutableUserInfoProvider {
    private final DataWriter<UserInfo> dataWriter;
    private UserInfo internalUserInfo;

    public DatadogUserInfoProvider(DataWriter<UserInfo> dataWriter) {
        dataWriter.getClass();
        this.dataWriter = dataWriter;
        this.internalUserInfo = new UserInfo(null, null, null, null, 15, null);
    }

    private final void setInternalUserInfo(UserInfo userInfo) {
        this.internalUserInfo = userInfo;
        this.dataWriter.write(userInfo);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public void addUserProperties(Map<String, ? extends Object> properties) {
        properties.getClass();
        UserInfo userInfo = this.internalUserInfo;
        setInternalUserInfo(UserInfo.copy$default(userInfo, null, null, null, lc9.c0(userInfo.getAdditionalProperties(), properties), 7, null));
    }

    public final DataWriter<UserInfo> getDataWriter$dd_sdk_android_core_release() {
        return this.dataWriter;
    }

    @Override // com.datadog.android.core.internal.user.UserInfoProvider
    /* JADX INFO: renamed from: getUserInfo, reason: from getter */
    public UserInfo getInternalUserInfo() {
        return this.internalUserInfo;
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
        setInternalUserInfo(this.internalUserInfo.copy(id, name, email, lc9.g0(extraInfo)));
    }
}
