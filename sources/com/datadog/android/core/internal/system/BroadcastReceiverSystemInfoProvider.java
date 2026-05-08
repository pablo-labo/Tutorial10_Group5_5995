package com.datadog.android.core.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.gf9;
import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.ut0;
import defpackage.wl7;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/core/internal/system/BroadcastReceiverSystemInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", RumEventDeserializer.EVENT_TYPE_ACTION, "Lj6g;", "registerIntentFilter", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "handleBatteryIntent", "(Landroid/content/Intent;)V", "handlePowerSaveIntent", "(Landroid/content/Context;)V", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "register", "unregister", "Lcom/datadog/android/core/internal/system/SystemInfo;", "getLatestSystemInfo", "()Lcom/datadog/android/core/internal/system/SystemInfo;", "Lcom/datadog/android/api/InternalLogger;", "systemInfo", "Lcom/datadog/android/core/internal/system/SystemInfo;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BroadcastReceiverSystemInfoProvider extends ThreadSafeReceiver implements SystemInfoProvider {
    private static final int BATTERY_LEVEL_UNKNOWN = -1;
    private static final int BATTERY_UNPLUGGED = -1;
    private static final int DEFAULT_BATTERY_SCALE = 100;
    private final InternalLogger internalLogger;
    private SystemInfo systemInfo;
    private static final Set<SystemInfo.BatteryStatus> batteryFullOrChargingStatus = ut0.I0(new SystemInfo.BatteryStatus[]{SystemInfo.BatteryStatus.CHARGING, SystemInfo.BatteryStatus.FULL});
    private static final Set<Integer> PLUGGED_IN_STATUS_VALUES = ut0.I0(new Integer[]{1, 4, 2});

    /* JADX INFO: renamed from: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider$onReceive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$action = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.m("Received unknown broadcast intent: [", this.$action, "]");
        }
    }

    public BroadcastReceiverSystemInfoProvider(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.systemInfo = new SystemInfo(false, 0, false, false, 15, null);
    }

    private final void handleBatteryIntent(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        SystemInfo.BatteryStatus batteryStatusFromAndroidStatus = SystemInfo.BatteryStatus.INSTANCE.fromAndroidStatus(intExtra);
        boolean booleanExtra = intent.getBooleanExtra("present", true);
        int iB = gf9.b((intExtra2 * 100.0f) / intExtra3);
        if (!PLUGGED_IN_STATUS_VALUES.contains(Integer.valueOf(intExtra4)) && booleanExtra) {
            z = false;
        }
        this.systemInfo = SystemInfo.copy$default(this.systemInfo, batteryFullOrChargingStatus.contains(batteryStatusFromAndroidStatus), iB, false, z, 4, null);
    }

    private final void handlePowerSaveIntent(Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.systemInfo = SystemInfo.copy$default(this.systemInfo, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11, null);
    }

    private final void registerIntentFilter(Context context, String action) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(action);
        Intent intentRegisterReceiver = registerReceiver(context, intentFilter);
        if (intentRegisterReceiver != null) {
            onReceive(context, intentRegisterReceiver);
        }
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    /* JADX INFO: renamed from: getLatestSystemInfo, reason: from getter */
    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        String action = intent != null ? intent.getAction() : null;
        if (wl7.b(action, "android.intent.action.BATTERY_CHANGED")) {
            handleBatteryIntent(intent);
        } else if (wl7.b(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            handlePowerSaveIntent(context);
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.DEBUG, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(action), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    @SuppressLint({"InlinedApi"})
    public void register(Context context) {
        context.getClass();
        registerIntentFilter(context, "android.intent.action.BATTERY_CHANGED");
        registerIntentFilter(context, "android.os.action.POWER_SAVE_MODE_CHANGED");
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public void unregister(Context context) {
        context.getClass();
        unregisterReceiver(context);
    }
}
