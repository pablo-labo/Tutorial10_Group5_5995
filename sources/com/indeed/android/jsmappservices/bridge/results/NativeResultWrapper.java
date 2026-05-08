package com.indeed.android.jsmappservices.bridge.results;

import defpackage.boa;
import defpackage.ewa;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.vz0;
import defpackage.wl7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/NativeResultWrapper;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NativeResultWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] b = {boa.E(qt8.b, new vz0(10))};
    public final NativeResult a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/NativeResultWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/NativeResultWrapper;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NativeResultWrapper> serializer() {
            return NativeResultWrapper$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NativeResultWrapper(int i, NativeResult nativeResult) {
        if (1 == (i & 1)) {
            this.a = nativeResult;
        } else {
            ewa.M(i, 1, NativeResultWrapper$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NativeResultWrapper) && wl7.b(this.a, ((NativeResultWrapper) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NativeResultWrapper(resultObj=" + this.a + ")";
    }

    public NativeResultWrapper(NativeResult nativeResult) {
        this.a = nativeResult;
    }
}
