package com.datadog.android.rum.resource;

import defpackage.wl7;
import defpackage.zve;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/resource/ResourceId;", "", "key", "", "uuid", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getUuid", "equals", "", "other", "hashCode", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ResourceId {
    private final String key;
    private final String uuid;

    public ResourceId(String str, String str2) {
        str.getClass();
        this.key = str;
        this.uuid = str2;
    }

    public boolean equals(Object other) {
        ResourceId resourceId;
        String str;
        if (!(other instanceof ResourceId)) {
            return false;
        }
        String str2 = this.uuid;
        return (str2 == null || zve.U(str2) || (str = (resourceId = (ResourceId) other).uuid) == null || zve.U(str)) ? wl7.b(this.key, ((ResourceId) other).key) : wl7.b(this.uuid, resourceId.uuid) && wl7.b(this.key, resourceId.key);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.key.hashCode();
    }
}
