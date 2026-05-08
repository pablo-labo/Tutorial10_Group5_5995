package com.indeed.android.jobsearch.locationselector;

import defpackage.bo0;
import defpackage.boa;
import defpackage.ewa;
import defpackage.h5;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.wl7;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/locationselector/CountryConfig;", "", "Companion", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] c = {null, boa.E(qt8.b, new bo0(3))};
    public final String a;
    public final List<String> b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/locationselector/CountryConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/locationselector/CountryConfig;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CountryConfig> serializer() {
            return CountryConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountryConfig(int i, String str, List list) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, CountryConfig$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryConfig)) {
            return false;
        }
        CountryConfig countryConfig = (CountryConfig) obj;
        return wl7.b(this.a, countryConfig.a) && wl7.b(this.b, countryConfig.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("CountryConfig(cc=", this.a, ", lcs=", ")", this.b);
    }
}
