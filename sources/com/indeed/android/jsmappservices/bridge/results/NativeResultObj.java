package com.indeed.android.jsmappservices.bridge.results;

import defpackage.boa;
import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.sz0;
import defpackage.wl7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/NativeResultObj;", "Lcom/indeed/android/jsmappservices/bridge/results/NativeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NativeResultObj extends NativeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] f = {null, null, null, boa.E(qt8.b, new sz0(6))};
    public final String b;
    public final boolean c;
    public final String d;
    public final BridgeResult e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/NativeResultObj$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/NativeResultObj;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NativeResultObj> serializer() {
            return NativeResultObj$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NativeResultObj(int i, String str, boolean z, String str2, BridgeResult bridgeResult) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, NativeResultObj$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = bridgeResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeResultObj)) {
            return false;
        }
        NativeResultObj nativeResultObj = (NativeResultObj) obj;
        return wl7.b(this.b, nativeResultObj.b) && this.c == nativeResultObj.c && wl7.b(this.d, nativeResultObj.d) && wl7.b(this.e, nativeResultObj.e);
    }

    public final int hashCode() {
        String str = this.b;
        int iF = ia.f((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        BridgeResult bridgeResult = this.e;
        return iHashCode + (bridgeResult != null ? bridgeResult.hashCode() : 0);
    }

    public final String toString() {
        return "NativeResultObj(error=" + this.b + ", success=" + this.c + ", callbackId=" + this.d + ", result=" + this.e + ")";
    }

    public NativeResultObj(String str, BridgeResult bridgeResult) {
        this.b = null;
        this.c = true;
        this.d = str;
        this.e = bridgeResult;
    }
}
