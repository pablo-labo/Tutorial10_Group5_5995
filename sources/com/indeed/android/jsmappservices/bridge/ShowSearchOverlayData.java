package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.ewa;
import defpackage.j7;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowSearchOverlayData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] e = {boa.E(qt8.b, new j7(15)), null, null, null};
    public final SearchType a;
    public final String b;
    public final String c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ShowSearchOverlayData> serializer() {
            return ShowSearchOverlayData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShowSearchOverlayData(int i, SearchType searchType, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, ShowSearchOverlayData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = searchType;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SearchType getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowSearchOverlayData)) {
            return false;
        }
        ShowSearchOverlayData showSearchOverlayData = (ShowSearchOverlayData) obj;
        return this.a == showSearchOverlayData.a && wl7.b(this.b, showSearchOverlayData.b) && wl7.b(this.c, showSearchOverlayData.c) && wl7.b(this.d, showSearchOverlayData.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSearchOverlayData(searchType=");
        sb.append(this.a);
        sb.append(", whatInput=");
        sb.append(this.b);
        sb.append(", whereInput=");
        return z3.n(sb, this.c, ", origin=", this.d, ")");
    }
}
