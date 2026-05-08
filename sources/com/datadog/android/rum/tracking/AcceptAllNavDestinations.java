package com.datadog.android.rum.tracking;

import androidx.navigation.k;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/tracking/AcceptAllNavDestinations;", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/k;", "<init>", "()V", "component", "", "accept", "(Landroidx/navigation/k;)Z", "", "getViewName", "(Landroidx/navigation/k;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class AcceptAllNavDestinations implements ComponentPredicate<k> {
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return getClass().equals(other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // com.datadog.android.rum.tracking.ComponentPredicate
    public boolean accept(k component) {
        component.getClass();
        return true;
    }

    @Override // com.datadog.android.rum.tracking.ComponentPredicate
    public String getViewName(k component) {
        component.getClass();
        return null;
    }
}
