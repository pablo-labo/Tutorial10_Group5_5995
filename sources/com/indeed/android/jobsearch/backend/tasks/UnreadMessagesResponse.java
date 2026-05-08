package com.indeed.android.jobsearch.backend.tasks;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse;", "", "Companion", "UnreadMessagesCount", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnreadMessagesResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final UnreadMessagesCount a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnreadMessagesResponse> serializer() {
            return UnreadMessagesResponse$$serializer.INSTANCE;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse$UnreadMessagesCount;", "", "Companion", "$serializer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnreadMessagesCount {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final int a;
        public final int b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse$UnreadMessagesCount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse$UnreadMessagesCount;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UnreadMessagesCount> serializer() {
                return UnreadMessagesResponse$UnreadMessagesCount$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UnreadMessagesCount(int i, int i2, int i3) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, UnreadMessagesResponse$UnreadMessagesCount$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnreadMessagesCount)) {
                return false;
            }
            UnreadMessagesCount unreadMessagesCount = (UnreadMessagesCount) obj;
            return this.a == unreadMessagesCount.a && this.b == unreadMessagesCount.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return w40.e("UnreadMessagesCount(totalUnreadConversationCount=", this.a, ", totalUnreadMessageCount=", this.b, ")");
        }
    }

    public /* synthetic */ UnreadMessagesResponse(int i, UnreadMessagesCount unreadMessagesCount) {
        if (1 == (i & 1)) {
            this.a = unreadMessagesCount;
        } else {
            ewa.M(i, 1, UnreadMessagesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnreadMessagesResponse) && wl7.b(this.a, ((UnreadMessagesResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnreadMessagesResponse(data=" + this.a + ")";
    }
}
