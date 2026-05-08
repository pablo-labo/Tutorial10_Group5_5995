package com.indeed.android.jobsearch.backend.tasks;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse;", "", "Companion", "Data", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewJobsCountResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final Data b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NewJobsCountResponse> serializer() {
            return NewJobsCountResponse$$serializer.INSTANCE;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse$Data;", "", "Companion", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String a;
        public final int b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse$Data$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse$Data;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Data> serializer() {
                return NewJobsCountResponse$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i, int i2, String str) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, NewJobsCountResponse$Data$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return wl7.b(this.a, data.a) && this.b == data.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Data(key=" + this.a + ", newCount=" + this.b + ")";
        }
    }

    public /* synthetic */ NewJobsCountResponse(int i, String str, Data data) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, NewJobsCountResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewJobsCountResponse)) {
            return false;
        }
        NewJobsCountResponse newJobsCountResponse = (NewJobsCountResponse) obj;
        return wl7.b(this.a, newJobsCountResponse.a) && wl7.b(this.b, newJobsCountResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NewJobsCountResponse(status=" + this.a + ", body=" + this.b + ")";
    }
}
