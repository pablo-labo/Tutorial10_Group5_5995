package com.indeed.android.jsmappservices.bridge.results;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/TriggerJSONCallbackResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TriggerJSONCallbackResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/TriggerJSONCallbackResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/TriggerJSONCallbackResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TriggerJSONCallbackResult> serializer() {
            return TriggerJSONCallbackResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TriggerJSONCallbackResult(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, TriggerJSONCallbackResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerJSONCallbackResult)) {
            return false;
        }
        TriggerJSONCallbackResult triggerJSONCallbackResult = (TriggerJSONCallbackResult) obj;
        return wl7.b(this.b, triggerJSONCallbackResult.b) && this.c == triggerJSONCallbackResult.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerJSONCallbackResult(callbackId=" + this.b + ", triggered=" + this.c + ")";
    }
}
