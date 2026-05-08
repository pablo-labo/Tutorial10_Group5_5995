package com.indeed.android.jsmappservices.bridge;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/PushPrimerCommandData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushPrimerCommandData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final PushModalConfigData c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/PushPrimerCommandData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/PushPrimerCommandData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PushPrimerCommandData> serializer() {
            return PushPrimerCommandData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PushPrimerCommandData(int i, String str, String str2, PushModalConfigData pushModalConfigData) {
        if (1 != (i & 1)) {
            ewa.M(i, 1, PushPrimerCommandData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = pushModalConfigData;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushPrimerCommandData)) {
            return false;
        }
        PushPrimerCommandData pushPrimerCommandData = (PushPrimerCommandData) obj;
        return wl7.b(this.a, pushPrimerCommandData.a) && wl7.b(this.b, pushPrimerCommandData.b) && wl7.b(this.c, pushPrimerCommandData.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PushModalConfigData pushModalConfigData = this.c;
        return iHashCode2 + (pushModalConfigData != null ? pushModalConfigData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("PushPrimerCommandData(presentationType=", this.a, ", from=", this.b, ", customModalConfig=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }
}
