package com.datadog.android.core.internal.user;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "Lcom/datadog/android/core/internal/user/UserInfoProvider;", "", "id", "name", "email", "", "", "extraInfo", "Lj6g;", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "properties", "addUserProperties", "(Ljava/util/Map;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface MutableUserInfoProvider extends UserInfoProvider {
    void addUserProperties(Map<String, ? extends Object> properties);

    void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo);
}
