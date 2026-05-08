package com.indeed.android.jsmappservices.bridge.results;

import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.boa;
import defpackage.ewa;
import defpackage.k7;
import defpackage.o7e;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ShowSearchOverlayResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowSearchOverlayResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] d = {null, boa.E(qt8.b, new k7(17))};
    public final boolean b;
    public final SearchType c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ShowSearchOverlayResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/ShowSearchOverlayResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ShowSearchOverlayResult> serializer() {
            return ShowSearchOverlayResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShowSearchOverlayResult(int i, boolean z, SearchType searchType) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, ShowSearchOverlayResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = z;
        this.c = searchType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowSearchOverlayResult)) {
            return false;
        }
        ShowSearchOverlayResult showSearchOverlayResult = (ShowSearchOverlayResult) obj;
        return this.b == showSearchOverlayResult.b && this.c == showSearchOverlayResult.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ShowSearchOverlayResult(success=" + this.b + ", searchType=" + this.c + ")";
    }

    public ShowSearchOverlayResult(SearchType searchType) {
        searchType.getClass();
        this.b = true;
        this.c = searchType;
    }
}
