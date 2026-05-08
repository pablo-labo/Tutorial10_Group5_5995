package com.indeed.android.jsmappservices.bridge;

import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ViewJobHintData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewJobHintData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ViewJobHintData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ViewJobHintData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ViewJobHintData> serializer() {
            return ViewJobHintData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ViewJobHintData(int i, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJobHintData)) {
            return false;
        }
        ViewJobHintData viewJobHintData = (ViewJobHintData) obj;
        return wl7.b(this.a, viewJobHintData.a) && wl7.b(this.b, viewJobHintData.b) && wl7.b(this.c, viewJobHintData.c) && wl7.b(this.d, viewJobHintData.d) && wl7.b(this.e, viewJobHintData.e) && wl7.b(this.f, viewJobHintData.f);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ViewJobHintData(isSaved=" + this.a + ", title=" + this.b + ", isFromAce=" + this.c + ", jobResultTrackingKey=" + this.d + ", isDisliked=" + this.e + ", matchFactor=" + this.f + ")";
    }

    public ViewJobHintData() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
