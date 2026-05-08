package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.g;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.dialog.DialogModule;
import defpackage.lc9;
import defpackage.lr5;
import defpackage.nmc;
import defpackage.r6;
import defpackage.s55;
import defpackage.wab;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "DialogManagerAndroid")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003\"#$B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0018\u00010\u001dR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule;", "Lcom/facebook/fbreact/specs/NativeDialogManagerAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "Lj6g;", "initialize", "()V", "onHostPause", "onHostDestroy", "onHostResume", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "errorCallback", "actionCallback", "showAlert", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "invalidate", "", "isInForeground", "Z", "Lcom/facebook/react/modules/dialog/DialogModule$c;", "getFragmentManagerHelper", "()Lcom/facebook/react/modules/dialog/DialogModule$c;", "fragmentManagerHelper", "Companion", "c", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    private static final String KEY_CANCELABLE = "cancelable";
    private static final String KEY_ITEMS = "items";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean isInForeground;
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    private static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    private static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    private static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    private static final Map<String, Object> CONSTANTS = lc9.a0(new Pair(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED), new Pair(ACTION_DISMISSED, ACTION_DISMISSED), new Pair(KEY_BUTTON_POSITIVE, -1), new Pair(KEY_BUTTON_NEGATIVE, -2), new Pair(KEY_BUTTON_NEUTRAL, -3));

    public final class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        public final Callback a;
        public boolean b;

        public a(Callback callback) {
            this.a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.getClass();
            if (this.b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.a.invoke(DialogModule.ACTION_DISMISSED);
            this.b = true;
        }
    }

    public final class c {
        public final lr5 a;
        public b b;

        public c(lr5 lr5Var) {
            this.a = lr5Var;
        }

        public final void a() {
            b bVar;
            if (DialogModule.this.isInForeground && (bVar = (b) this.a.D(DialogModule.FRAGMENT_TAG)) != null && bVar.isResumed()) {
                bVar.F(false, false);
            }
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final c getFragmentManagerHelper() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof g)) {
            return null;
        }
        lr5 lr5VarU = ((g) currentActivity).u();
        lr5VarU.getClass();
        return new c(lr5VarU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlert$lambda$0(c cVar, Bundle bundle, Callback callback) {
        lr5 lr5Var = cVar.a;
        DialogModule dialogModule = DialogModule.this;
        bundle.getClass();
        UiThreadUtil.assertOnUiThread();
        cVar.a();
        b bVar = new b(callback != null ? dialogModule.new a(callback) : null, bundle);
        if (!dialogModule.isInForeground || lr5Var.O()) {
            cVar.b = bVar;
            return;
        }
        if (bundle.containsKey(KEY_CANCELABLE)) {
            boolean z = bundle.getBoolean(KEY_CANCELABLE);
            bVar.V = z;
            Dialog dialog = bVar.a0;
            if (dialog != null) {
                dialog.setCancelable(z);
            }
        }
        bVar.L(lr5Var, FRAGMENT_TAG);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            s55.a.getClass();
            if (wab.p(5)) {
                wab.t(5, "DialogModule", "onHostResume called but no FragmentManager found");
                return;
            }
            return;
        }
        UiThreadUtil.assertOnUiThread();
        SoftAssertions.assertCondition(DialogModule.this.isInForeground, "showPendingAlert() called in background");
        b bVar = fragmentManagerHelper.b;
        if (bVar == null) {
            return;
        }
        fragmentManagerHelper.a();
        bVar.L(fragmentManagerHelper.a, FRAGMENT_TAG);
        fragmentManagerHelper.b = null;
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap options, Callback errorCallback, final Callback actionCallback) {
        options.getClass();
        errorCallback.getClass();
        actionCallback.getClass();
        final c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            errorCallback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (options.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, options.getString(KEY_TITLE));
        }
        if (options.hasKey("message")) {
            bundle.putString("message", options.getString("message"));
        }
        if (options.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", options.getString(KEY_BUTTON_POSITIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", options.getString(KEY_BUTTON_NEGATIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", options.getString(KEY_BUTTON_NEUTRAL));
        }
        if (options.hasKey(KEY_ITEMS)) {
            ReadableArray array = options.getArray(KEY_ITEMS);
            if (array == null) {
                r6.g("Required value was null.");
                return;
            }
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            int size = array.size();
            for (int i = 0; i < size; i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (options.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, options.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: m44
            @Override // java.lang.Runnable
            public final void run() {
                DialogModule.showAlert$lambda$0(fragmentManagerHelper, bundle, actionCallback);
            }
        });
    }
}
