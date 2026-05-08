package com.datadog.android.core.internal.system;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.datadog.android.api.context.DeviceType;
import defpackage.boa;
import defpackage.qt8;
import defpackage.r6;
import defpackage.zve;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u001b\u0010\u0017\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0018\u0010\rR\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b \u0010\rR\u0014\u0010\"\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\u0014\u0010$\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\r¨\u0006'"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAndroidInfoProvider;", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "rawDeviceBrand", "", "rawDeviceModel", "rawDeviceId", "rawOsVersion", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "architecture", "getArchitecture", "()Ljava/lang/String;", "architecture$delegate", "Lkotlin/Lazy;", "deviceBrand", "getDeviceBrand", "deviceBrand$delegate", "deviceBuildId", "getDeviceBuildId", "deviceModel", "getDeviceModel", "deviceName", "getDeviceName", "deviceName$delegate", "deviceType", "Lcom/datadog/android/api/context/DeviceType;", "getDeviceType", "()Lcom/datadog/android/api/context/DeviceType;", "deviceType$delegate", "osMajorVersion", "getOsMajorVersion", "osMajorVersion$delegate", "osName", "getOsName", "osVersion", "getOsVersion", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider implements AndroidInfoProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FEATURE_GOOGLE_ANDROID_TV = "com.google.android.tv";
    public static final int MIN_TABLET_WIDTH_DP = 800;

    /* JADX INFO: renamed from: architecture$delegate, reason: from kotlin metadata */
    private final Lazy architecture;

    /* JADX INFO: renamed from: deviceBrand$delegate, reason: from kotlin metadata */
    private final Lazy deviceBrand;
    private final String deviceBuildId;
    private final String deviceModel;

    /* JADX INFO: renamed from: deviceName$delegate, reason: from kotlin metadata */
    private final Lazy deviceName;

    /* JADX INFO: renamed from: deviceType$delegate, reason: from kotlin metadata */
    private final Lazy deviceType;

    /* JADX INFO: renamed from: osMajorVersion$delegate, reason: from kotlin metadata */
    private final Lazy osMajorVersion;
    private final String osName;
    private final String osVersion;

    public DefaultAndroidInfoProvider(Context context, String str, String str2, String str3, String str4) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        DefaultAndroidInfoProvider$deviceType$2 defaultAndroidInfoProvider$deviceType$2 = new DefaultAndroidInfoProvider$deviceType$2(str2, context);
        qt8 qt8Var = qt8.b;
        this.deviceType = boa.E(qt8Var, defaultAndroidInfoProvider$deviceType$2);
        this.deviceName = boa.E(qt8Var, new DefaultAndroidInfoProvider$deviceName$2(this));
        this.deviceBrand = boa.E(qt8Var, new DefaultAndroidInfoProvider$deviceBrand$2(str));
        this.deviceModel = str2;
        this.deviceBuildId = str3;
        this.osName = "Android";
        this.osVersion = str4;
        this.osMajorVersion = boa.E(qt8Var, new DefaultAndroidInfoProvider$osMajorVersion$2(this));
        this.architecture = boa.E(qt8Var, DefaultAndroidInfoProvider$architecture$2.INSTANCE);
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getArchitecture() {
        return (String) this.architecture.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBrand() {
        return (String) this.deviceBrand.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceName() {
        return (String) this.deviceName.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public DeviceType getDeviceType() {
        return (DeviceType) this.deviceType.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsMajorVersion() {
        return (String) this.osMajorVersion.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsName() {
        return this.osName;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsVersion() {
        return this.osVersion;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAndroidInfoProvider$Companion;", "", "()V", "FEATURE_GOOGLE_ANDROID_TV", "", "MIN_TABLET_WIDTH_DP", "", "hasTvFeature", "", "packageManager", "Landroid/content/pm/PackageManager;", "isMobile", "model", "appContext", "Landroid/content/Context;", "isTablet", "isTv", "resolveDeviceType", "Lcom/datadog/android/api/context/DeviceType;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean hasTvFeature(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.software.leanback") || packageManager.hasSystemFeature(DefaultAndroidInfoProvider.FEATURE_GOOGLE_ANDROID_TV);
        }

        private final boolean isMobile(String model, Context appContext) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = model.toLowerCase(locale);
            lowerCase.getClass();
            boolean z = false;
            if (zve.L(lowerCase, "phone", false)) {
                return true;
            }
            Object systemService = appContext.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                z = true;
            }
            return !z;
        }

        private final boolean isTablet(String model, Context appContext) {
            Locale locale = Locale.US;
            String strF = r6.f(locale, model, locale);
            return zve.L(strF, "tablet", false) || zve.L(strF, "sm-t", false) || appContext.getResources().getConfiguration().smallestScreenWidthDp >= 800;
        }

        private final boolean isTv(Context appContext) {
            Object systemService = appContext.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                return true;
            }
            PackageManager packageManager = appContext.getPackageManager();
            packageManager.getClass();
            return hasTvFeature(packageManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeviceType resolveDeviceType(String model, Context appContext) {
            return isTv(appContext) ? DeviceType.TV : isTablet(model, appContext) ? DeviceType.TABLET : isMobile(model, appContext) ? DeviceType.MOBILE : DeviceType.OTHER;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultAndroidInfoProvider(Context context) {
        context.getClass();
        String str = Build.BRAND;
        String str2 = str == null ? "" : str;
        String str3 = Build.MODEL;
        String str4 = str3 == null ? "" : str3;
        String str5 = Build.ID;
        String str6 = str5 == null ? "" : str5;
        String str7 = Build.VERSION.RELEASE;
        this(context, str2, str4, str6, str7 == null ? "" : str7);
    }
}
