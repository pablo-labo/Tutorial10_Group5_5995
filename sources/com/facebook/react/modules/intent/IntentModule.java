package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import defpackage.j6g;
import defpackage.l5;
import defpackage.nmc;
import defpackage.t40;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "IntentAndroid")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\nJ+\u0010\u001d\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/modules/intent/IntentModule;", "Lcom/facebook/fbreact/specs/NativeIntentAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "waitForActivityAndGetInitialURL", "(Lcom/facebook/react/bridge/Promise;)V", "Landroid/content/Intent;", "intent", "", "useNewTaskFlag", "sendOSIntent", "(Landroid/content/Intent;Z)V", "invalidate", "()V", "getInitialURL", "", "url", "openURL", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "canOpenURL", "openSettings", RumEventDeserializer.EVENT_TYPE_ACTION, "Lcom/facebook/react/bridge/ReadableArray;", "extras", "sendIntent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/LifecycleEventListener;", "initialURLListener", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "pendingOpenURLPromises", "Ljava/util/List;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    public static final String NAME = "IntentAndroid";
    private LifecycleEventListener initialURLListener;
    private final List<Promise> pendingOpenURLPromises;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class c implements LifecycleEventListener {
        public c() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
            IntentModule.this.getReactApplicationContext().removeLifecycleEventListener(this);
            IntentModule intentModule = IntentModule.this;
            synchronized (intentModule) {
                try {
                    Iterator it = intentModule.pendingOpenURLPromises.iterator();
                    while (it.hasNext()) {
                        intentModule.getInitialURL((Promise) it.next());
                    }
                    intentModule.initialURLListener = null;
                    intentModule.pendingOpenURLPromises.clear();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.pendingOpenURLPromises = new ArrayList();
    }

    private final void sendOSIntent(Intent intent, boolean useNewTaskFlag) {
        String packageName;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        String packageName2 = getReactApplicationContext().getPackageName();
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        ComponentName component = packageManager == null ? intent.getComponent() : intent.resolveActivity(packageManager);
        if (component == null || (packageName = component.getPackageName()) == null) {
            packageName = "";
        }
        if (useNewTaskFlag || currentActivity == null || !wl7.b(packageName2, packageName)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private final synchronized void waitForActivityAndGetInitialURL(Promise promise) {
        this.pendingOpenURLPromises.add(promise);
        if (this.initialURLListener != null) {
            return;
        }
        this.initialURLListener = new c();
        getReactApplicationContext().addLifecycleEventListener(this.initialURLListener);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String url, Promise promise) {
        promise.getClass();
        if (url == null || url.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.l("Invalid URL: ", url)));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addFlags(268435456);
            PackageManager packageManager = getReactApplicationContext().getPackageManager();
            promise.resolve(Boolean.valueOf((packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true));
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(t40.l("Could not check if URL '", url, "' can be opened: ", e.getMessage())));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        promise.getClass();
        try {
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            promise.resolve((data == null || !("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) ? null : data.toString());
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.l("Could not get the initial URL : ", e.getMessage())));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        synchronized (this) {
            try {
                this.pendingOpenURLPromises.clear();
                LifecycleEventListener lifecycleEventListener = this.initialURLListener;
                if (lifecycleEventListener != null) {
                    getReactApplicationContext().removeLifecycleEventListener(lifecycleEventListener);
                    j6g j6gVar = j6g.a;
                }
                this.initialURLListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        promise.getClass();
        try {
            Intent intent = new Intent();
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.l("Could not open the Settings: ", e.getMessage())));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String url, Promise promise) {
        promise.getClass();
        if (url == null || url.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.l("Invalid URL: ", url)));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(url).normalizeScheme()), false);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(t40.l("Could not open URL '", url, "': ", e.getMessage())));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String action, ReadableArray extras, Promise promise) {
        promise.getClass();
        if (action == null || action.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.m("Invalid Action: ", action, ".")));
            return;
        }
        Intent intent = new Intent(action);
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            promise.reject(new JSApplicationIllegalArgumentException(l5.m("Could not launch Intent with action ", action, ".")));
            return;
        }
        if (extras != null) {
            try {
                int size = extras.size();
                for (int i = 0; i < size; i++) {
                    ReadableMap map = extras.getMap(i);
                    if (map != null) {
                        String string = map.getString("key");
                        int i2 = b.a[map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal()];
                        if (i2 == 1) {
                            intent.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                        } else if (i2 == 2) {
                            intent.putExtra(string, map.getDouble(EXTRA_MAP_KEY_FOR_VALUE));
                        } else {
                            if (i2 != 3) {
                                promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                                return;
                            }
                            intent.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                        }
                    }
                }
            } catch (Exception e) {
                promise.reject(e);
                return;
            }
        }
        sendOSIntent(intent, true);
        promise.resolve(null);
    }
}
