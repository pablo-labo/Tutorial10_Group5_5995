package com.datadog.android.core.internal.net.info;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.persistence.DataWriter;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R$\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/datadog/android/core/internal/net/info/CallbackNetworkInfoProvider;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/api/context/NetworkInfo;", "dataWriter", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/DataWriter;Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "resolveUpBandwidth", "(Landroid/net/NetworkCapabilities;)Ljava/lang/Long;", "resolveDownBandwidth", "resolveStrength", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "getNetworkType", "(Landroid/net/NetworkCapabilities;)Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "Landroid/net/Network;", "network", "Lj6g;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "register", "(Landroid/content/Context;)V", "unregister", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/api/InternalLogger;", "value", "lastNetworkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "setLastNetworkInfo", "(Lcom/datadog/android/api/context/NetworkInfo;)V", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
@TargetApi(24)
public final class CallbackNetworkInfoProvider extends ConnectivityManager.NetworkCallback implements NetworkInfoProvider {
    public static final String ERROR_REGISTER = "We couldn't register a Network Callback, the network information reported will be less accurate.";
    public static final String ERROR_UNREGISTER = "We couldn't unregister the Network Callback";
    private final BuildSdkVersionProvider buildSdkVersionProvider;
    private final DataWriter<NetworkInfo> dataWriter;
    private final InternalLogger internalLogger;
    private NetworkInfo lastNetworkInfo;

    public CallbackNetworkInfoProvider(DataWriter<NetworkInfo> dataWriter, BuildSdkVersionProvider buildSdkVersionProvider, InternalLogger internalLogger) {
        dataWriter.getClass();
        buildSdkVersionProvider.getClass();
        internalLogger.getClass();
        this.dataWriter = dataWriter;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.internalLogger = internalLogger;
        this.lastNetworkInfo = new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    private final NetworkInfo.Connectivity getNetworkType(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) ? NetworkInfo.Connectivity.NETWORK_WIFI : networkCapabilities.hasTransport(3) ? NetworkInfo.Connectivity.NETWORK_ETHERNET : networkCapabilities.hasTransport(0) ? NetworkInfo.Connectivity.NETWORK_CELLULAR : networkCapabilities.hasTransport(2) ? NetworkInfo.Connectivity.NETWORK_BLUETOOTH : NetworkInfo.Connectivity.NETWORK_OTHER;
    }

    private final Long resolveDownBandwidth(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.getLinkDownstreamBandwidthKbps() > 0) {
            return Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private final Long resolveStrength(NetworkCapabilities networkCapabilities) {
        if (this.buildSdkVersionProvider.getVersion() < 29 || networkCapabilities.getSignalStrength() == Integer.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(networkCapabilities.getSignalStrength());
    }

    private final Long resolveUpBandwidth(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.getLinkUpstreamBandwidthKbps() > 0) {
            return Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps());
        }
        return null;
    }

    private final void setLastNetworkInfo(NetworkInfo networkInfo) {
        this.lastNetworkInfo = networkInfo;
        this.dataWriter.write(networkInfo);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    /* JADX INFO: renamed from: getLatestNetworkInfo, reason: from getter */
    public NetworkInfo getLastNetworkInfo() {
        return this.lastNetworkInfo;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        setLastNetworkInfo(new NetworkInfo(getNetworkType(networkCapabilities), null, null, resolveUpBandwidth(networkCapabilities), resolveDownBandwidth(networkCapabilities), resolveStrength(networkCapabilities), null, 70, null));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        setLastNetworkInfo(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null));
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void register(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(this);
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork == null || networkCapabilities == null) {
                return;
            }
            onCapabilitiesChanged(activeNetwork, networkCapabilities);
        } catch (SecurityException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            setLastNetworkInfo(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null));
        } catch (Exception e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass3.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            setLastNetworkInfo(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null));
        }
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void unregister(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) C05141.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) C05152.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        } catch (RuntimeException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) C05163.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_REGISTER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_REGISTER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_REGISTER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05141 extends mj8 implements gu5<String> {
        public static final C05141 INSTANCE = new C05141();

        public C05141() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_UNREGISTER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05152 extends mj8 implements gu5<String> {
        public static final C05152 INSTANCE = new C05152();

        public C05152() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_UNREGISTER;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05163 extends mj8 implements gu5<String> {
        public static final C05163 INSTANCE = new C05163();

        public C05163() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CallbackNetworkInfoProvider.ERROR_UNREGISTER;
        }
    }

    public /* synthetic */ CallbackNetworkInfoProvider(DataWriter dataWriter, BuildSdkVersionProvider buildSdkVersionProvider, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataWriter, (i & 2) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider, internalLogger);
    }
}
