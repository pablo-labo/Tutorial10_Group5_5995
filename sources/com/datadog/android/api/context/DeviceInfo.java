package com.datadog.android.api.context;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, d2 = {"Lcom/datadog/android/api/context/DeviceInfo;", "", "deviceName", "", "deviceBrand", "deviceModel", "deviceType", "Lcom/datadog/android/api/context/DeviceType;", "deviceBuildId", "osName", "osMajorVersion", "osVersion", "architecture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArchitecture", "()Ljava/lang/String;", "getDeviceBrand", "getDeviceBuildId", "getDeviceModel", "getDeviceName", "getDeviceType", "()Lcom/datadog/android/api/context/DeviceType;", "getOsMajorVersion", "getOsName", "getOsVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class DeviceInfo {
    private final String architecture;
    private final String deviceBrand;
    private final String deviceBuildId;
    private final String deviceModel;
    private final String deviceName;
    private final DeviceType deviceType;
    private final String osMajorVersion;
    private final String osName;
    private final String osVersion;

    public DeviceInfo(String str, String str2, String str3, DeviceType deviceType, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        deviceType.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.deviceName = str;
        this.deviceBrand = str2;
        this.deviceModel = str3;
        this.deviceType = deviceType;
        this.deviceBuildId = str4;
        this.osName = str5;
        this.osMajorVersion = str6;
        this.osVersion = str7;
        this.architecture = str8;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, DeviceType deviceType, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.deviceName;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.deviceBrand;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.deviceModel;
        }
        if ((i & 8) != 0) {
            deviceType = deviceInfo.deviceType;
        }
        if ((i & 16) != 0) {
            str4 = deviceInfo.deviceBuildId;
        }
        if ((i & 32) != 0) {
            str5 = deviceInfo.osName;
        }
        if ((i & 64) != 0) {
            str6 = deviceInfo.osMajorVersion;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str7 = deviceInfo.osVersion;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str8 = deviceInfo.architecture;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str3;
        return deviceInfo.copy(str, str2, str14, deviceType, str13, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOsMajorVersion() {
        return this.osMajorVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getArchitecture() {
        return this.architecture;
    }

    public final DeviceInfo copy(String deviceName, String deviceBrand, String deviceModel, DeviceType deviceType, String deviceBuildId, String osName, String osMajorVersion, String osVersion, String architecture) {
        deviceName.getClass();
        deviceBrand.getClass();
        deviceModel.getClass();
        deviceType.getClass();
        deviceBuildId.getClass();
        osName.getClass();
        osMajorVersion.getClass();
        osVersion.getClass();
        architecture.getClass();
        return new DeviceInfo(deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId, osName, osMajorVersion, osVersion, architecture);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return wl7.b(this.deviceName, deviceInfo.deviceName) && wl7.b(this.deviceBrand, deviceInfo.deviceBrand) && wl7.b(this.deviceModel, deviceInfo.deviceModel) && this.deviceType == deviceInfo.deviceType && wl7.b(this.deviceBuildId, deviceInfo.deviceBuildId) && wl7.b(this.osName, deviceInfo.osName) && wl7.b(this.osMajorVersion, deviceInfo.osMajorVersion) && wl7.b(this.osVersion, deviceInfo.osVersion) && wl7.b(this.architecture, deviceInfo.architecture);
    }

    public final String getArchitecture() {
        return this.architecture;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getOsMajorVersion() {
        return this.osMajorVersion;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public int hashCode() {
        return this.architecture.hashCode() + akb.d(akb.d(akb.d(akb.d((this.deviceType.hashCode() + akb.d(akb.d(this.deviceName.hashCode() * 31, 31, this.deviceBrand), 31, this.deviceModel)) * 31, 31, this.deviceBuildId), 31, this.osName), 31, this.osMajorVersion), 31, this.osVersion);
    }

    public String toString() {
        String str = this.deviceName;
        String str2 = this.deviceBrand;
        String str3 = this.deviceModel;
        DeviceType deviceType = this.deviceType;
        String str4 = this.deviceBuildId;
        String str5 = this.osName;
        String str6 = this.osMajorVersion;
        String str7 = this.osVersion;
        String str8 = this.architecture;
        StringBuilder sbF = u40.f("DeviceInfo(deviceName=", str, ", deviceBrand=", str2, ", deviceModel=");
        sbF.append(str3);
        sbF.append(", deviceType=");
        sbF.append(deviceType);
        sbF.append(", deviceBuildId=");
        ia.r(sbF, str4, ", osName=", str5, ", osMajorVersion=");
        ia.r(sbF, str6, ", osVersion=", str7, ", architecture=");
        return l6.i(sbF, str8, ")");
    }
}
