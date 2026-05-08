package com.datadog.android.core.internal.user;

import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.persistence.Serializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/user/UserInfoSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/api/context/UserInfo;", "()V", "serialize", "", "model", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UserInfoSerializer implements Serializer<UserInfo> {
    @Override // com.datadog.android.core.persistence.Serializer
    public String serialize(UserInfo model) {
        model.getClass();
        String string = model.toJson$dd_sdk_android_core_release().d().toString();
        string.getClass();
        return string;
    }
}
