package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.l;
import defpackage.lc9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0004¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/BaseSpanEventMapper;", "T", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "()V", "resolveDeviceInfo", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "deviceInfo", "Lcom/datadog/android/api/context/DeviceInfo;", "resolveDeviceType", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "deviceType", "Lcom/datadog/android/api/context/DeviceType;", "resolveNetworkInfo", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "resolveOsInfo", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "resolveSimCarrier", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "resolveUserInfo", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "userInfo", "Lcom/datadog/android/api/context/UserInfo;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class BaseSpanEventMapper<T> implements ContextAwareMapper<T, SpanEvent> {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.TABLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceType.TV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceType.DESKTOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceType.GAMING_CONSOLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceType.BOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final SpanEvent.Type resolveDeviceType(DeviceType deviceType) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                return SpanEvent.Type.MOBILE;
            case 2:
                return SpanEvent.Type.TABLET;
            case 3:
                return SpanEvent.Type.TV;
            case 4:
                return SpanEvent.Type.DESKTOP;
            case 5:
                return SpanEvent.Type.GAMING_CONSOLE;
            case 6:
                return SpanEvent.Type.BOT;
            case 7:
                return SpanEvent.Type.OTHER;
            default:
                l.g();
                return null;
        }
    }

    private final SpanEvent.SimCarrier resolveSimCarrier(NetworkInfo networkInfo) {
        if (networkInfo.getCarrierId() == null && networkInfo.getCarrierName() == null) {
            return null;
        }
        Long carrierId = networkInfo.getCarrierId();
        return new SpanEvent.SimCarrier(carrierId != null ? carrierId.toString() : null, networkInfo.getCarrierName());
    }

    public final SpanEvent.Device resolveDeviceInfo(DeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return new SpanEvent.Device(resolveDeviceType(deviceInfo.getDeviceType()), deviceInfo.getDeviceName(), deviceInfo.getDeviceModel(), deviceInfo.getDeviceBrand(), deviceInfo.getArchitecture());
    }

    public final SpanEvent.Network resolveNetworkInfo(NetworkInfo networkInfo) {
        networkInfo.getClass();
        SpanEvent.SimCarrier simCarrierResolveSimCarrier = resolveSimCarrier(networkInfo);
        Long strength = networkInfo.getStrength();
        String string = strength != null ? strength.toString() : null;
        Long downKbps = networkInfo.getDownKbps();
        String string2 = downKbps != null ? downKbps.toString() : null;
        Long upKbps = networkInfo.getUpKbps();
        return new SpanEvent.Network(new SpanEvent.Client(simCarrierResolveSimCarrier, string, string2, upKbps != null ? upKbps.toString() : null, networkInfo.getConnectivity().toString()));
    }

    public final SpanEvent.Os resolveOsInfo(DeviceInfo deviceInfo) {
        deviceInfo.getClass();
        return new SpanEvent.Os(deviceInfo.getOsName(), deviceInfo.getOsVersion(), null, deviceInfo.getOsMajorVersion(), 4, null);
    }

    public final SpanEvent.Usr resolveUserInfo(UserInfo userInfo) {
        userInfo.getClass();
        return new SpanEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), lc9.i0(userInfo.getAdditionalProperties()));
    }
}
