package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import defpackage.is4;
import defpackage.lc9;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh {
    public zzeh() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzajo.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzajo.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzajo.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzajo.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzajo.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return is4.a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(0, zzajo.NET_CAPABILITY_MMS), new Pair(1, zzajo.NET_CAPABILITY_SUPL), new Pair(2, zzajo.NET_CAPABILITY_DUN), new Pair(3, zzajo.NET_CAPABILITY_FOTA), new Pair(4, zzajo.NET_CAPABILITY_IMS), new Pair(5, zzajo.NET_CAPABILITY_CBS), new Pair(6, zzajo.NET_CAPABILITY_WIFI_P2P), new Pair(7, zzajo.NET_CAPABILITY_IA), new Pair(8, zzajo.NET_CAPABILITY_RCS), new Pair(9, zzajo.NET_CAPABILITY_XCAP), new Pair(10, zzajo.NET_CAPABILITY_EIMS), new Pair(11, zzajo.NET_CAPABILITY_NOT_METERED), new Pair(12, zzajo.NET_CAPABILITY_INTERNET), new Pair(13, zzajo.NET_CAPABILITY_NOT_RESTRICTED), new Pair(14, zzajo.NET_CAPABILITY_TRUSTED), new Pair(15, zzajo.NET_CAPABILITY_NOT_VPN));
        linkedHashMapB0.put(17, zzajo.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapB0.put(16, zzajo.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMapB0.put(18, zzajo.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapB0.put(19, zzajo.NET_CAPABILITY_FOREGROUND);
            linkedHashMapB0.put(20, zzajo.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapB0.put(21, zzajo.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapB0.put(23, zzajo.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapB0.put(25, zzajo.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapB0.put(32, zzajo.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapB0.put(29, zzajo.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapB0.put(35, zzajo.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapB0.put(34, zzajo.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapB0.put(33, zzajo.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapB0;
    }
}
