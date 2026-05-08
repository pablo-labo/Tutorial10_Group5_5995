package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.ewa;
import defpackage.ia;
import defpackage.k20;
import defpackage.k6;
import defpackage.l6;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.wl7;
import defpackage.wy2;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/OpenOnboardingModalData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenOnboardingModalData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] f = {null, boa.E(qt8.b, new wy2(16)), null, null, null};
    public final String a;
    public final Map<String, JsonElement> b;
    public final boolean c;
    public final String d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/OpenOnboardingModalData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/OpenOnboardingModalData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OpenOnboardingModalData> serializer() {
            return OpenOnboardingModalData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenOnboardingModalData(int i, String str, Map map, boolean z, String str2, String str3) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, OpenOnboardingModalData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final Map<String, JsonElement> a() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOnboardingModalData)) {
            return false;
        }
        OpenOnboardingModalData openOnboardingModalData = (OpenOnboardingModalData) obj;
        return wl7.b(this.a, openOnboardingModalData.a) && wl7.b(this.b, openOnboardingModalData.b) && this.c == openOnboardingModalData.c && wl7.b(this.d, openOnboardingModalData.d) && wl7.b(this.e, openOnboardingModalData.e);
    }

    public final int hashCode() {
        int iF = ia.f(k20.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOnboardingModalData(experienceKey=");
        sb.append(this.a);
        sb.append(", experienceData=");
        sb.append(this.b);
        sb.append(", skipExempt=");
        k6.k(", from=", this.d, ", origin=", sb, this.c);
        return l6.i(sb, this.e, ")");
    }
}
