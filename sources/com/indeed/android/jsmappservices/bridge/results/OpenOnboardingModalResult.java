package com.indeed.android.jsmappservices.bridge.results;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/OpenOnboardingModalResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenOnboardingModalResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final boolean b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/OpenOnboardingModalResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/OpenOnboardingModalResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OpenOnboardingModalResult> serializer() {
            return OpenOnboardingModalResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenOnboardingModalResult(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, OpenOnboardingModalResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOnboardingModalResult)) {
            return false;
        }
        OpenOnboardingModalResult openOnboardingModalResult = (OpenOnboardingModalResult) obj;
        return this.b == openOnboardingModalResult.b && wl7.b(this.c, openOnboardingModalResult.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenOnboardingModalResult(completed=" + this.b + ", description=" + this.c + ")";
    }

    public OpenOnboardingModalResult(String str, boolean z) {
        this.b = z;
        this.c = str;
    }
}
