package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.f8b;
import defpackage.g8b;
import defpackage.nmc;
import defpackage.r6;
import defpackage.s55;
import defpackage.wab;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "PermissionsAndroid")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/facebook/react/modules/permissions/PermissionsModule;", "Lcom/facebook/fbreact/specs/NativePermissionsAndroidSpec;", "Lg8b;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "permission", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "checkPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "shouldShowRequestPermissionRationale", "requestPermission", "Lcom/facebook/react/bridge/ReadableArray;", "permissions", "requestMultiplePermissions", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "", "requestCode", "", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "callbacks", "Landroid/util/SparseArray;", "I", "GRANTED", "Ljava/lang/String;", "DENIED", "NEVER_ASK_AGAIN", "Lf8b;", "getPermissionAwareActivity", "()Lf8b;", "permissionAwareActivity", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PermissionsModule extends NativePermissionsAndroidSpec implements g8b {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    public static final class b implements Callback {
        public final /* synthetic */ ArrayList<String> a;
        public final /* synthetic */ WritableNativeMap b;
        public final /* synthetic */ PermissionsModule c;
        public final /* synthetic */ Promise d;

        public b(ArrayList<String> arrayList, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, Promise promise) {
            this.a = arrayList;
            this.b = writableNativeMap;
            this.c = permissionsModule;
            this.d = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public final void invoke(Object... objArr) {
            objArr.getClass();
            int i = 0;
            Object obj = objArr[0];
            obj.getClass();
            int[] iArr = (int[]) obj;
            Object obj2 = objArr[1];
            obj2.getClass();
            f8b f8bVar = (f8b) obj2;
            ArrayList<String> arrayList = this.a;
            int size = arrayList.size();
            while (true) {
                WritableNativeMap writableNativeMap = this.b;
                if (i >= size) {
                    this.d.resolve(writableNativeMap);
                    return;
                }
                String str = arrayList.get(i);
                str.getClass();
                String str2 = str;
                int length = iArr.length;
                PermissionsModule permissionsModule = this.c;
                if (length > i && iArr[i] == 0) {
                    writableNativeMap.putString(str2, permissionsModule.GRANTED);
                } else if (f8bVar.shouldShowRequestPermissionRationale(str2)) {
                    writableNativeMap.putString(str2, permissionsModule.DENIED);
                } else {
                    writableNativeMap.putString(str2, permissionsModule.NEVER_ASK_AGAIN);
                }
                i++;
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ PermissionsModule b;
        public final /* synthetic */ String c;

        public c(Promise promise, PermissionsModule permissionsModule, String str) {
            this.a = promise;
            this.b = permissionsModule;
            this.c = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public final void invoke(Object... objArr) {
            objArr.getClass();
            Object obj = objArr[0];
            obj.getClass();
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Promise promise = this.a;
            PermissionsModule permissionsModule = this.b;
            if (length != 0 && iArr[0] == 0) {
                promise.resolve(permissionsModule.GRANTED);
                return;
            }
            Object obj2 = objArr[1];
            obj2.getClass();
            if (((f8b) obj2).shouldShowRequestPermissionRationale(this.c)) {
                promise.resolve(permissionsModule.DENIED);
            } else {
                promise.resolve(permissionsModule.NEVER_ASK_AGAIN);
            }
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final f8b getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            r6.g("Tried to use permissions API while not attached to an Activity.");
            return null;
        }
        if (currentActivity instanceof f8b) {
            return (f8b) currentActivity;
        }
        r6.g("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String permission, Promise promise) {
        permission.getClass();
        promise.getClass();
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0));
    }

    @Override // defpackage.g8b
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        try {
            Callback callback = this.callbacks.get(requestCode);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity());
                this.callbacks.remove(requestCode);
            } else {
                s55.p("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(requestCode));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e) {
            s55.a.getClass();
            if (!wab.p(6)) {
                return false;
            }
            wab.u(6, "PermissionsModule", "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", e);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray permissions, Promise promise) {
        permissions.getClass();
        promise.getClass();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = permissions.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String string = permissions.getString(i2);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (permissions.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            f8b permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new b(arrayList, writableNativeMap, this, promise));
            permissionAwareActivity.x((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String permission, Promise promise) {
        permission.getClass();
        promise.getClass();
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            f8b permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new c(promise, this, permission));
            permissionAwareActivity.x(new String[]{permission}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String permission, Promise promise) {
        permission.getClass();
        promise.getClass();
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }
}
