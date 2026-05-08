package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ActivityEventListener;", "", "Landroid/app/Activity;", "activity", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "Lj6g;", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onUserLeaveHint", "(Landroid/app/Activity;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data);

    void onNewIntent(Intent intent);

    default void onUserLeaveHint(Activity activity) {
        activity.getClass();
    }
}
