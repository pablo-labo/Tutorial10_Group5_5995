package com.indeed.android.jsmappservices.bridge.results;

import defpackage.boa;
import defpackage.ewa;
import defpackage.g7;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.wl7;
import defpackage.zr0;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/GetRegisteredJSONCallbackIdsResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetRegisteredJSONCallbackIdsResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new zr0(4))};
    public final List<String> b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/GetRegisteredJSONCallbackIdsResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/GetRegisteredJSONCallbackIdsResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GetRegisteredJSONCallbackIdsResult> serializer() {
            return GetRegisteredJSONCallbackIdsResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetRegisteredJSONCallbackIdsResult(int i, List list) {
        if (1 == (i & 1)) {
            this.b = list;
        } else {
            ewa.M(i, 1, GetRegisteredJSONCallbackIdsResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRegisteredJSONCallbackIdsResult) && wl7.b(this.b, ((GetRegisteredJSONCallbackIdsResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g7.h("GetRegisteredJSONCallbackIdsResult(callbackIds=", ")", this.b);
    }
}
