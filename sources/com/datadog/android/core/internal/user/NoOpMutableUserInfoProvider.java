package com.datadog.android.core.internal.user;

import com.datadog.android.api.context.UserInfo;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/core/internal/user/NoOpMutableUserInfoProvider;", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "<init>", "()V", "", "id", "name", "email", "", "", "extraInfo", "Lj6g;", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "properties", "addUserProperties", "(Ljava/util/Map;)V", "Lcom/datadog/android/api/context/UserInfo;", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpMutableUserInfoProvider implements MutableUserInfoProvider {
    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public void addUserProperties(Map<String, ? extends Object> properties) {
        properties.getClass();
    }

    @Override // com.datadog.android.core.internal.user.UserInfoProvider
    public UserInfo getUserInfo() {
        return new UserInfo(null, null, null, null, 15, null);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
    }
}
