package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;
import defpackage.sy3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/BaseActivityEventListener;", "Lcom/facebook/react/bridge/ActivityEventListener;", "<init>", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "Lj6g;", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseActivityEventListener implements ActivityEventListener {
    @sy3
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        data.getClass();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        intent.getClass();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        activity.getClass();
    }
}
