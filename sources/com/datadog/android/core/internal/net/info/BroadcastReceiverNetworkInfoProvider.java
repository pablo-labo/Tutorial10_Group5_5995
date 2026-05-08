package com.datadog.android.core.internal.net.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.persistence.DataWriter;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.pi3;
import defpackage.ut0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R$\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/datadog/android/core/internal/net/info/BroadcastReceiverNetworkInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/api/context/NetworkInfo;", "dataWriter", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/core/internal/persistence/DataWriter;Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/net/NetworkInfo;", "activeNetworkInfo", "buildNetworkInfo", "(Landroid/content/Context;Landroid/net/NetworkInfo;)Lcom/datadog/android/api/context/NetworkInfo;", "", "subtype", "buildMobileNetworkInfo", "(Landroid/content/Context;I)Lcom/datadog/android/api/context/NetworkInfo;", "", "getCellularTechnology", "(I)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "Lj6g;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "register", "(Landroid/content/Context;)V", "unregister", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "value", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "setNetworkInfo", "(Lcom/datadog/android/api/context/NetworkInfo;)V", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
@SuppressLint({"InlinedApi"})
public final class BroadcastReceiverNetworkInfoProvider extends ThreadSafeReceiver implements NetworkInfoProvider {
    public static final int NETWORK_TYPE_LTE_CA = 19;
    private static final String UNKNOWN_CARRIER_NAME = "Unknown Carrier Name";
    private final BuildSdkVersionProvider buildSdkVersionProvider;
    private final DataWriter<NetworkInfo> dataWriter;
    private NetworkInfo networkInfo;
    private static final Set<Integer> knownMobileTypes = ut0.I0(new Integer[]{0, 4, 5, 2, 3});
    private static final Set<Integer> known2GSubtypes = ut0.I0(new Integer[]{1, 2, 4, 7, 11, 16});
    private static final Set<Integer> known3GSubtypes = ut0.I0(new Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});
    private static final Set<Integer> known4GSubtypes = ut0.I0(new Integer[]{13, 18, 19});
    private static final Set<Integer> known5GSubtypes = pi3.k(20);

    public BroadcastReceiverNetworkInfoProvider(DataWriter<NetworkInfo> dataWriter, BuildSdkVersionProvider buildSdkVersionProvider) {
        dataWriter.getClass();
        buildSdkVersionProvider.getClass();
        this.dataWriter = dataWriter;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.networkInfo = new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    private final NetworkInfo buildMobileNetworkInfo(Context context, int subtype) {
        CharSequence simCarrierIdName;
        NetworkInfo.Connectivity connectivity = known2GSubtypes.contains(Integer.valueOf(subtype)) ? NetworkInfo.Connectivity.NETWORK_2G : known3GSubtypes.contains(Integer.valueOf(subtype)) ? NetworkInfo.Connectivity.NETWORK_3G : known4GSubtypes.contains(Integer.valueOf(subtype)) ? NetworkInfo.Connectivity.NETWORK_4G : known5GSubtypes.contains(Integer.valueOf(subtype)) ? NetworkInfo.Connectivity.NETWORK_5G : NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER;
        String cellularTechnology = getCellularTechnology(subtype);
        if (this.buildSdkVersionProvider.getVersion() < 28) {
            return new NetworkInfo(connectivity, null, null, null, null, null, cellularTechnology, 62, null);
        }
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
            simCarrierIdName = UNKNOWN_CARRIER_NAME;
        }
        return new NetworkInfo(connectivity, simCarrierIdName.toString(), telephonyManager != null ? Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, cellularTechnology, 56, null);
    }

    private final NetworkInfo buildNetworkInfo(Context context, android.net.NetworkInfo activeNetworkInfo) {
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? new NetworkInfo(NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null) : activeNetworkInfo.getType() == 1 ? new NetworkInfo(NetworkInfo.Connectivity.NETWORK_WIFI, null, null, null, null, null, null, 126, null) : activeNetworkInfo.getType() == 9 ? new NetworkInfo(NetworkInfo.Connectivity.NETWORK_ETHERNET, null, null, null, null, null, null, 126, null) : knownMobileTypes.contains(Integer.valueOf(activeNetworkInfo.getType())) ? buildMobileNetworkInfo(context, activeNetworkInfo.getSubtype()) : new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
    }

    private final String getCellularTechnology(int subtype) {
        switch (subtype) {
            case 1:
                return "GPRS";
            case 2:
                return "Edge";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMAEVDORev0";
            case 6:
                return "CDMAEVDORevA";
            case 7:
                return "CDMA1x";
            case 8:
                return "HSDPA";
            case DatadogLogGenerator.CRASH /* 9 */:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDen";
            case 12:
                return "CDMAEVDORevB";
            case 13:
                return "LTE";
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return "eHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case NETWORK_TYPE_LTE_CA /* 19 */:
                return "LTE_CA";
            case 20:
                return "New Radio";
            default:
                return null;
        }
    }

    private final void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        this.dataWriter.write(networkInfo);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    /* JADX INFO: renamed from: getLatestNetworkInfo, reason: from getter */
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        setNetworkInfo(buildNetworkInfo(context, connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null));
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void register(Context context) {
        context.getClass();
        onReceive(context, registerReceiver(context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void unregister(Context context) {
        context.getClass();
        unregisterReceiver(context);
    }

    public /* synthetic */ BroadcastReceiverNetworkInfoProvider(DataWriter dataWriter, BuildSdkVersionProvider buildSdkVersionProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataWriter, (i & 2) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }
}
