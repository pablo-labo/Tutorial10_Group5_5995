package com.indeed.android.jobsearch.backend.tasks;

import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewNotificationsResponse;", "", "Companion", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewNotificationsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/NewNotificationsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/NewNotificationsResponse;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NewNotificationsResponse> serializer() {
            return NewNotificationsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewNotificationsResponse(int i, String str, boolean z, boolean z2, int i2) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, NewNotificationsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewNotificationsResponse)) {
            return false;
        }
        NewNotificationsResponse newNotificationsResponse = (NewNotificationsResponse) obj;
        return wl7.b(this.a, newNotificationsResponse.a) && this.b == newNotificationsResponse.b && this.c == newNotificationsResponse.c && this.d == newNotificationsResponse.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ia.f(ia.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NewNotificationsResponse(status=" + this.a + ", shouldShowNew=" + this.b + ", authenticated=" + this.c + ", newCount=" + this.d + ")";
    }
}
