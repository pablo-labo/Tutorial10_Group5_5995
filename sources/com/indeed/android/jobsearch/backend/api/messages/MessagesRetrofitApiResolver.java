package com.indeed.android.jobsearch.backend.api.messages;

import com.indeed.android.jobsearch.backend.tasks.UnreadMessagesResponse;
import defpackage.bw5;
import defpackage.lu2;
import defpackage.m6d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/indeed/android/jobsearch/backend/api/messages/MessagesRetrofitApiResolver;", "", "Lm6d;", "Lcom/indeed/android/jobsearch/backend/tasks/UnreadMessagesResponse;", "getUnreadMessagesCount", "(Llu2;)Ljava/lang/Object;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagesRetrofitApiResolver {
    @bw5("messaging/jobseekers/v2/summary?client=indeed-jobsearch-android")
    Object getUnreadMessagesCount(lu2<? super m6d<UnreadMessagesResponse>> lu2Var);
}
