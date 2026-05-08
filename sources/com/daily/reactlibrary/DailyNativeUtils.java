package com.daily.reactlibrary;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.f8b;
import defpackage.g8b;
import defpackage.hd3;
import defpackage.id3;
import defpackage.o4;
import defpackage.ot2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class DailyNativeUtils extends ReactContextBaseJavaModule implements g8b {
    private static int PERMISSION_REQUEST_CODE = 666;
    private static final String TAG = "com.daily.reactlibrary.DailyNativeUtils";
    private DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
    private String iconName;
    private final ReactApplicationContext reactContext;
    private Set<String> requestersKeepingDeviceAwake;
    private Set<String> requestersShowingOngoingMeetingNotification;
    private String subtitle;
    private String title;

    public class a implements LifecycleEventListener {
        public final /* synthetic */ ReactApplicationContext a;

        public a(ReactApplicationContext reactApplicationContext) {
            this.a = reactApplicationContext;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
            DailyNativeUtils dailyNativeUtils = DailyNativeUtils.this;
            if (dailyNativeUtils.eventEmitter != null) {
                dailyNativeUtils.eventEmitter.emit("EventOnHostDestroy", Arguments.createMap());
            }
            Class<? extends Activity> cls = DailyOngoingMeetingForegroundService.a;
            ReactApplicationContext reactApplicationContext = this.a;
            reactApplicationContext.stopService(new Intent(reactApplicationContext, (Class<?>) DailyOngoingMeetingForegroundService.class));
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
        }
    }

    public DailyNativeUtils(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.requestersKeepingDeviceAwake = new HashSet();
        this.requestersShowingOngoingMeetingNotification = new HashSet();
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(new a(reactApplicationContext));
    }

    private void checkPermissions() {
        List<String> declaredPermissions = getDeclaredPermissions(this.reactContext.getApplicationContext());
        ArrayList arrayList = new ArrayList();
        if (declaredPermissions.contains("android.permission.FOREGROUND_SERVICE_CAMERA")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (declaredPermissions.contains("android.permission.FOREGROUND_SERVICE_MICROPHONE")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (ot2.a(this.reactContext.getApplicationContext(), (String) it.next()) != 0) {
                ComponentCallbacks2 currentActivity = this.reactContext.getCurrentActivity();
                if (currentActivity instanceof f8b) {
                    ((f8b) currentActivity).x((String[]) arrayList.toArray(new String[0]), PERMISSION_REQUEST_CODE, this);
                    return;
                }
                return;
            }
        }
        initializeOngoingMeetingForegroundService();
    }

    private List<String> getDeclaredPermissions(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            return strArr != null ? Arrays.asList(strArr) : arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    private void initializeOngoingMeetingForegroundService() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new o4(1, this, currentActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeOngoingMeetingForegroundService$3(Activity activity) {
        Class cls = activity.getClass();
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.iconName;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        DailyOngoingMeetingForegroundService.a = cls;
        NotificationChannel notificationChannel = new NotificationChannel("dailyOngoingMeetingNotificationChannel", "Daily Ongoing Meeting Notification Channel", 3);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableLights(false);
        notificationChannel.setVibrationPattern(new long[]{0});
        ((NotificationManager) reactApplicationContext.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        Intent intent = new Intent(reactApplicationContext, (Class<?>) DailyOngoingMeetingForegroundService.class);
        intent.putExtra("title", str);
        intent.putExtra("subtitle", str2);
        intent.putExtra("icon_name", str3);
        reactApplicationContext.startForegroundService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onRequestPermissionsResult$2(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setKeepDeviceAwake$0(boolean z, String str, Activity activity) {
        Set<String> set = this.requestersKeepingDeviceAwake;
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        updateKeepScreenOnFlag(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShowOngoingMeetingNotification$1(boolean z, String str, String str2, String str3, String str4) {
        Set<String> set = this.requestersShowingOngoingMeetingNotification;
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        this.title = str2;
        this.subtitle = str3;
        this.iconName = str4;
        updateOngoingMeetingForegroundService();
    }

    private void updateKeepScreenOnFlag(Activity activity) {
        Window window = activity.getWindow();
        if (this.requestersKeepingDeviceAwake.size() > 0) {
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else {
            window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
    }

    private void updateOngoingMeetingForegroundService() {
        if (!this.requestersShowingOngoingMeetingNotification.isEmpty()) {
            checkPermissions();
            return;
        }
        ReactApplicationContext reactApplicationContext = this.reactContext;
        Class<? extends Activity> cls = DailyOngoingMeetingForegroundService.a;
        reactApplicationContext.stopService(new Intent(reactApplicationContext, (Class<?>) DailyOngoingMeetingForegroundService.class));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DailyNativeUtils";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.eventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    @ReactMethod
    public void isScreenBeingCaptured(Promise promise) {
        Log.d(TAG, "isScreenBeingCaptured is not available on Android");
        promise.resolve(Boolean.FALSE);
    }

    @Override // defpackage.g8b
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == PERMISSION_REQUEST_CODE && Arrays.stream(iArr).allMatch(new id3())) {
            initializeOngoingMeetingForegroundService();
            return true;
        }
        System.err.println("Failed to grant permissions.");
        return true;
    }

    @ReactMethod
    public void presentSystemScreenCapturePrompt() {
        Log.d(TAG, "presentSystemScreenCapturePrompt is not available on Android");
    }

    @ReactMethod
    public void requestStopSystemScreenCapture() {
        Log.d(TAG, "requestStopSystemScreenCapture is not available on Android");
    }

    @ReactMethod
    public void setKeepDeviceAwake(boolean z, String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new hd3(this, z, str, currentActivity));
        }
    }

    @ReactMethod
    public void setShowOngoingMeetingNotification(final boolean z, final String str, final String str2, final String str3, final String str4) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: jd3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$setShowOngoingMeetingNotification$1(z, str4, str, str2, str3);
                }
            });
        }
    }
}
