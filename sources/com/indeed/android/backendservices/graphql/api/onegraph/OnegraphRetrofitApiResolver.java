package com.indeed.android.backendservices.graphql.api.onegraph;

import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.av1;
import defpackage.bya;
import defpackage.fi1;
import defpackage.og6;
import defpackage.tc6;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Je\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/indeed/android/backendservices/graphql/api/onegraph/OnegraphRetrofitApiResolver;", "Ltc6;", "", "apiKey", "co", "locale", "adFormat", "rootTrackingKey", "clientSubApp", "Lokhttp3/RequestBody;", "body", "Lav1;", "Lokhttp3/ResponseBody;", "post", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lav1;", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OnegraphRetrofitApiResolver extends tc6 {
    @Override // defpackage.tc6
    @bya("graphql")
    av1<ResponseBody> post(@og6("Indeed-API-Key") String apiKey, @og6("indeed-co") String co, @og6("indeed-locale") String locale, @og6("adFormat") String adFormat, @og6(ConversationsRemoteDataSource.ROOT_TRACKING_KEY_HEADER) String rootTrackingKey, @og6("indeed-client-sub-app") String clientSubApp, @fi1 RequestBody body);
}
