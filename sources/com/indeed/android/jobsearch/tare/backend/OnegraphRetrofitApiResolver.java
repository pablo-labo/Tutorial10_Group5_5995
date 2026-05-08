package com.indeed.android.jobsearch.tare.backend;

import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.av1;
import defpackage.bya;
import defpackage.fi1;
import defpackage.og6;
import defpackage.uhg;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jo\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/indeed/android/jobsearch/tare/backend/OnegraphRetrofitApiResolver;", "", "", "url", "apiKey", "co", "locale", "adFormat", "rootTrackingKey", "clientSubApp", "Lokhttp3/RequestBody;", "body", "Lav1;", "Lokhttp3/ResponseBody;", "post", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lav1;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnegraphRetrofitApiResolver {
    @bya
    av1<ResponseBody> post(@uhg String url, @og6("Indeed-API-Key") String apiKey, @og6("indeed-co") String co, @og6("indeed-locale") String locale, @og6("adFormat") String adFormat, @og6(ConversationsRemoteDataSource.ROOT_TRACKING_KEY_HEADER) String rootTrackingKey, @og6("indeed-client-sub-app") String clientSubApp, @fi1 RequestBody body);
}
