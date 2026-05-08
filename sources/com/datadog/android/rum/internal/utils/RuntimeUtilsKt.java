package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.context.UserInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"hasUserData", "", "Lcom/datadog/android/api/context/UserInfo;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class RuntimeUtilsKt {
    public static final boolean hasUserData(UserInfo userInfo) {
        userInfo.getClass();
        return (userInfo.getId() == null && userInfo.getName() == null && userInfo.getEmail() == null && userInfo.getAdditionalProperties().isEmpty()) ? false : true;
    }
}
