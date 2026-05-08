package com.microsoft.codepush.react;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushDialog extends BaseJavaModule {

    public class a implements LifecycleEventListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Callback e;

        public a(String str, String str2, String str3, String str4, Callback callback) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = callback;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
            CodePushDialog codePushDialog = CodePushDialog.this;
            Activity currentActivity = codePushDialog.getReactApplicationContext().getCurrentActivity();
            if (currentActivity != null) {
                codePushDialog.getReactApplicationContext().removeLifecycleEventListener(this);
                codePushDialog.showDialogInternal(this.a, this.b, this.c, this.d, this.e, currentActivity);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Callback a;

        public b(Callback callback) {
            this.a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.cancel();
                Callback callback = this.a;
                if (i == -2) {
                    callback.invoke(1);
                } else {
                    if (i != -1) {
                        throw new CodePushUnknownException("Unknown button ID pressed.");
                    }
                    callback.invoke(0);
                }
            } catch (Throwable th) {
                g.i(th);
            }
        }
    }

    public CodePushDialog(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialogInternal(String str, String str2, String str3, String str4, Callback callback, Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        b bVar = new b(callback);
        if (str != null) {
            builder.setTitle(str);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        if (str3 != null) {
            builder.setPositiveButton(str3, bVar);
        }
        if (str4 != null) {
            builder.setNegativeButton(str4, bVar);
        }
        builder.create().show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePushDialog";
    }

    @ReactMethod
    public void showDialog(String str, String str2, String str3, String str4, Callback callback, Callback callback2) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            getReactApplicationContext().addLifecycleEventListener(new a(str, str2, str3, str4, callback));
        } else {
            showDialogInternal(str, str2, str3, str4, callback, currentActivity);
        }
    }
}
