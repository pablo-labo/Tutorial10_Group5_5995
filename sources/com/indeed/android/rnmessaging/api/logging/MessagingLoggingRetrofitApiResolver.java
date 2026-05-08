package com.indeed.android.rnmessaging.api.logging;

import defpackage.bya;
import defpackage.fi1;
import defpackage.i9c;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m0b;
import defpackage.m6d;
import defpackage.n47;
import defpackage.yig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/indeed/android/rnmessaging/api/logging/MessagingLoggingRetrofitApiResolver;", "", "", "pageLoadTk", "Lm0b;", "payload", "Lm6d;", "Lj6g;", "postPageLoadLog", "(Ljava/lang/String;Lm0b;Llu2;)Ljava/lang/Object;", "Ln47;", "postImpressionLog", "(Ljava/lang/String;Ln47;Llu2;)Ljava/lang/Object;", "Lyig;", "postUserActionLog", "(Ljava/lang/String;Lyig;Llu2;)Ljava/lang/Object;", "rnmessaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagingLoggingRetrofitApiResolver {
    @bya("/messaging/jobseekers/logging/v1/impressions")
    Object postImpressionLog(@i9c("pageLoadTk") String str, @fi1 n47 n47Var, lu2<? super m6d<j6g>> lu2Var);

    @bya("/messaging/jobseekers/logging/v1/pageLoads")
    Object postPageLoadLog(@i9c("pageLoadTk") String str, @fi1 m0b m0bVar, lu2<? super m6d<j6g>> lu2Var);

    @bya("/messaging/jobseekers/logging/v1/userActions")
    Object postUserActionLog(@i9c("pageLoadTk") String str, @fi1 yig yigVar, lu2<? super m6d<j6g>> lu2Var);
}
