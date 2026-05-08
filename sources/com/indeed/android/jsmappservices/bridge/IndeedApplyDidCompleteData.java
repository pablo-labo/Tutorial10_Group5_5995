package com.indeed.android.jsmappservices.bridge;

import defpackage.ewa;
import defpackage.l6;
import defpackage.o7e;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/IndeedApplyDidCompleteData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndeedApplyDidCompleteData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/IndeedApplyDidCompleteData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/IndeedApplyDidCompleteData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<IndeedApplyDidCompleteData> serializer() {
            return IndeedApplyDidCompleteData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndeedApplyDidCompleteData(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, IndeedApplyDidCompleteData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndeedApplyDidCompleteData)) {
            return false;
        }
        IndeedApplyDidCompleteData indeedApplyDidCompleteData = (IndeedApplyDidCompleteData) obj;
        return wl7.b(this.a, indeedApplyDidCompleteData.a) && wl7.b(this.b, indeedApplyDidCompleteData.b) && wl7.b(this.c, indeedApplyDidCompleteData.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("IndeedApplyDidCompleteData(postApplyUrl=", this.a, ", postApplyConfirmMessage=", this.b, ", postApplyConfirmUrl="), this.c, ")");
    }
}
