package com.indeed.android.jobsearch.backend.tasks;

import defpackage.akb;
import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/ConvertCookiesResponse;", "", "Companion", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConvertCookiesResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/ConvertCookiesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/ConvertCookiesResponse;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ConvertCookiesResponse> serializer() {
            return ConvertCookiesResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertCookiesResponse(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, ConvertCookiesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertCookiesResponse)) {
            return false;
        }
        ConvertCookiesResponse convertCookiesResponse = (ConvertCookiesResponse) obj;
        return wl7.b(this.a, convertCookiesResponse.a) && this.b == convertCookiesResponse.b && wl7.b(this.c, convertCookiesResponse.c) && wl7.b(this.d, convertCookiesResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(ia.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConvertCookiesResponse(access_token=");
        sb.append(this.a);
        sb.append(", expires_in=");
        sb.append(this.b);
        ia.r(sb, ", scope=", this.c, ", token_type=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
