package com.datadog.android.api.context;

import defpackage.ab8;
import defpackage.fb8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ia;
import defpackage.ka8;
import defpackage.l6;
import defpackage.wl7;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 02\u00020\u0001:\u000201BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015Jb\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b/\u0010\u0015¨\u00062"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo;", "", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "connectivity", "", "carrierName", "", "carrierId", "upKbps", "downKbps", "strength", "cellularTechnology", "<init>", "(Lcom/datadog/android/api/context/NetworkInfo$Connectivity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "Lka8;", "toJson$dd_sdk_android_core_release", "()Lka8;", "toJson", "component1", "()Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "component7", "copy", "(Lcom/datadog/android/api/context/NetworkInfo$Connectivity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "getConnectivity", "Ljava/lang/String;", "getCarrierName", "Ljava/lang/Long;", "getCarrierId", "getUpKbps", "getDownKbps", "getStrength", "getCellularTechnology", "Companion", "Connectivity", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class NetworkInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long carrierId;
    private final String carrierName;
    private final String cellularTechnology;
    private final Connectivity connectivity;
    private final Long downKbps;
    private final Long strength;
    private final Long upKbps;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity r2, java.lang.String r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.datadog.android.api.context.NetworkInfo$Connectivity r2 = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.api.context.NetworkInfo.<init>(com.datadog.android.api.context.NetworkInfo$Connectivity, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ NetworkInfo copy$default(NetworkInfo networkInfo, Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            connectivity = networkInfo.connectivity;
        }
        if ((i & 2) != 0) {
            str = networkInfo.carrierName;
        }
        if ((i & 4) != 0) {
            l = networkInfo.carrierId;
        }
        if ((i & 8) != 0) {
            l2 = networkInfo.upKbps;
        }
        if ((i & 16) != 0) {
            l3 = networkInfo.downKbps;
        }
        if ((i & 32) != 0) {
            l4 = networkInfo.strength;
        }
        if ((i & 64) != 0) {
            str2 = networkInfo.cellularTechnology;
        }
        Long l5 = l4;
        String str3 = str2;
        Long l6 = l3;
        Long l7 = l;
        return networkInfo.copy(connectivity, str, l7, l2, l6, l5, str3);
    }

    public static final NetworkInfo fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final NetworkInfo fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Connectivity getConnectivity() {
        return this.connectivity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCarrierName() {
        return this.carrierName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCarrierId() {
        return this.carrierId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUpKbps() {
        return this.upKbps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDownKbps() {
        return this.downKbps;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStrength() {
        return this.strength;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    public final NetworkInfo copy(Connectivity connectivity, String carrierName, Long carrierId, Long upKbps, Long downKbps, Long strength, String cellularTechnology) {
        connectivity.getClass();
        return new NetworkInfo(connectivity, carrierName, carrierId, upKbps, downKbps, strength, cellularTechnology);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) other;
        return this.connectivity == networkInfo.connectivity && wl7.b(this.carrierName, networkInfo.carrierName) && wl7.b(this.carrierId, networkInfo.carrierId) && wl7.b(this.upKbps, networkInfo.upKbps) && wl7.b(this.downKbps, networkInfo.downKbps) && wl7.b(this.strength, networkInfo.strength) && wl7.b(this.cellularTechnology, networkInfo.cellularTechnology);
    }

    public final Long getCarrierId() {
        return this.carrierId;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    public final Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final Long getDownKbps() {
        return this.downKbps;
    }

    public final Long getStrength() {
        return this.strength;
    }

    public final Long getUpKbps() {
        return this.upKbps;
    }

    public int hashCode() {
        int iHashCode = this.connectivity.hashCode() * 31;
        String str = this.carrierName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.carrierId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.upKbps;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.downKbps;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.strength;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.cellularTechnology;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final ka8 toJson$dd_sdk_android_core_release() {
        ab8 ab8Var = new ab8();
        ab8Var.i("connectivity", this.connectivity.toJson$dd_sdk_android_core_release());
        String str = this.carrierName;
        if (str != null) {
            ab8Var.l("carrier_name", str);
        }
        Long l = this.carrierId;
        if (l != null) {
            ia.o(l, ab8Var, "carrier_id");
        }
        Long l2 = this.upKbps;
        if (l2 != null) {
            ia.o(l2, ab8Var, "up_kbps");
        }
        Long l3 = this.downKbps;
        if (l3 != null) {
            ia.o(l3, ab8Var, "down_kbps");
        }
        Long l4 = this.strength;
        if (l4 != null) {
            ia.o(l4, ab8Var, "strength");
        }
        String str2 = this.cellularTechnology;
        if (str2 != null) {
            ab8Var.l("cellular_technology", str2);
        }
        return ab8Var;
    }

    public String toString() {
        Connectivity connectivity = this.connectivity;
        String str = this.carrierName;
        Long l = this.carrierId;
        Long l2 = this.upKbps;
        Long l3 = this.downKbps;
        Long l4 = this.strength;
        String str2 = this.cellularTechnology;
        StringBuilder sb = new StringBuilder("NetworkInfo(connectivity=");
        sb.append(connectivity);
        sb.append(", carrierName=");
        sb.append(str);
        sb.append(", carrierId=");
        sb.append(l);
        sb.append(", upKbps=");
        sb.append(l2);
        sb.append(", downKbps=");
        sb.append(l3);
        sb.append(", strength=");
        sb.append(l4);
        sb.append(", cellularTechnology=");
        return l6.i(sb, str2, ")");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson$dd_sdk_android_core_release", "()Lka8;", "toJson", "Ljava/lang/String;", "Companion", "NETWORK_NOT_CONNECTED", "NETWORK_ETHERNET", "NETWORK_WIFI", "NETWORK_WIMAX", "NETWORK_BLUETOOTH", "NETWORK_2G", "NETWORK_3G", "NETWORK_4G", "NETWORK_5G", "NETWORK_MOBILE_OTHER", "NETWORK_CELLULAR", "NETWORK_OTHER", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Connectivity {
        NETWORK_NOT_CONNECTED("network_not_connected"),
        NETWORK_ETHERNET("network_ethernet"),
        NETWORK_WIFI("network_wifi"),
        NETWORK_WIMAX("network_wimax"),
        NETWORK_BLUETOOTH("network_bluetooth"),
        NETWORK_2G("network_2G"),
        NETWORK_3G("network_3G"),
        NETWORK_4G("network_4G"),
        NETWORK_5G("network_5G"),
        NETWORK_MOBILE_OTHER("network_mobile_other"),
        NETWORK_CELLULAR("network_cellular"),
        NETWORK_OTHER("network_other");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Connectivity(String str) {
            this.jsonValue = str;
        }

        public static final Connectivity fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson$dd_sdk_android_core_release() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "jsonString", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Connectivity fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    for (Connectivity connectivity : Connectivity.values()) {
                        if (wl7.b(connectivity.jsonValue, jsonString)) {
                            return connectivity;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (NoSuchElementException e) {
                    g7.n("Unable to parse json into type NetworkInfo.Connectivity", e);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/context/NetworkInfo;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/api/context/NetworkInfo;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkInfo fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type NetworkInfo", e);
                return null;
            }
        }

        public final NetworkInfo fromJsonObject(ab8 jsonObject) {
            jsonObject.getClass();
            try {
                Connectivity.Companion companion = Connectivity.INSTANCE;
                String strG = jsonObject.m("connectivity").g();
                strG.getClass();
                Connectivity connectivityFromJson = companion.fromJson(strG);
                ka8 ka8VarM = jsonObject.m("carrier_name");
                String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                ka8 ka8VarM2 = jsonObject.m("carrier_id");
                Long lValueOf = ka8VarM2 != null ? Long.valueOf(ka8VarM2.e()) : null;
                ka8 ka8VarM3 = jsonObject.m("up_kbps");
                Long lValueOf2 = ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null;
                ka8 ka8VarM4 = jsonObject.m("down_kbps");
                Long lValueOf3 = ka8VarM4 != null ? Long.valueOf(ka8VarM4.e()) : null;
                ka8 ka8VarM5 = jsonObject.m("strength");
                Long lValueOf4 = ka8VarM5 != null ? Long.valueOf(ka8VarM5.e()) : null;
                ka8 ka8VarM6 = jsonObject.m("cellular_technology");
                return new NetworkInfo(connectivityFromJson, strG2, lValueOf, lValueOf2, lValueOf3, lValueOf4, ka8VarM6 != null ? ka8VarM6.g() : null);
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type NetworkInfo", e);
                return null;
            } catch (NullPointerException e2) {
                g7.n("Unable to parse json into type NetworkInfo", e2);
                return null;
            } catch (NumberFormatException e3) {
                g7.n("Unable to parse json into type NetworkInfo", e3);
                return null;
            }
        }

        private Companion() {
        }
    }

    public NetworkInfo(Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        connectivity.getClass();
        this.connectivity = connectivity;
        this.carrierName = str;
        this.carrierId = l;
        this.upKbps = l2;
        this.downKbps = l3;
        this.strength = l4;
        this.cellularTechnology = str2;
    }

    public NetworkInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
