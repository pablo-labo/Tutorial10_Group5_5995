package com.indeed.android.jsmappservices.bridge.results;

import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewJobHintResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final Boolean b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final String g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ViewJobHintResult> serializer() {
            return ViewJobHintResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ViewJobHintResult(int i, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, String str3) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = bool3;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJobHintResult)) {
            return false;
        }
        ViewJobHintResult viewJobHintResult = (ViewJobHintResult) obj;
        return wl7.b(this.b, viewJobHintResult.b) && wl7.b(this.c, viewJobHintResult.c) && wl7.b(this.d, viewJobHintResult.d) && wl7.b(this.e, viewJobHintResult.e) && wl7.b(this.f, viewJobHintResult.f) && wl7.b(this.g, viewJobHintResult.g);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ViewJobHintResult(isSaved=" + this.b + ", title=" + this.c + ", isFromAce=" + this.d + ", jobResultTrackingKey=" + this.e + ", isDisliked=" + this.f + ", matchFactor=" + this.g + ")";
    }

    public ViewJobHintResult() {
        this(null, null, null, null, null, null);
    }

    public ViewJobHintResult(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, String str3) {
        this.b = bool;
        this.c = str;
        this.d = bool2;
        this.e = str2;
        this.f = bool3;
        this.g = str3;
    }
}
