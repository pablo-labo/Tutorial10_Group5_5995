package com.indeed.android.myjobs.data.remote.api;

import com.indeed.android.myjobs.data.model.ServiceResultResponse;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineRequest;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineSurveyRequest;
import com.indeed.android.myjobs.data.model.request.ContactedInterestedRequest;
import defpackage.bya;
import defpackage.fi1;
import defpackage.i9c;
import defpackage.lu2;
import defpackage.m6d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/ResumeContactsService;", "", "Lcom/indeed/android/myjobs/data/model/request/ContactedInterestedRequest;", "body", "", "csrfToken", "Lm6d;", "Lcom/indeed/android/myjobs/data/model/ServiceResultResponse;", "postInterested", "(Lcom/indeed/android/myjobs/data/model/request/ContactedInterestedRequest;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineRequest;", "postDecline", "(Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineRequest;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineSurveyRequest;", "postDeclineSurvey", "(Lcom/indeed/android/myjobs/data/model/request/ContactedDeclineSurveyRequest;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ResumeContactsService {
    @bya("api/v1/contacted/decline")
    Object postDecline(@fi1 ContactedDeclineRequest contactedDeclineRequest, @i9c("indeedcsrftoken") String str, lu2<? super m6d<ServiceResultResponse>> lu2Var);

    @bya("api/v1/contacted/decline/survey")
    Object postDeclineSurvey(@fi1 ContactedDeclineSurveyRequest contactedDeclineSurveyRequest, @i9c("indeedcsrftoken") String str, lu2<? super m6d<ServiceResultResponse>> lu2Var);

    @bya("api/v1/contacted/interested")
    Object postInterested(@fi1 ContactedInterestedRequest contactedInterestedRequest, @i9c("indeedcsrftoken") String str, lu2<? super m6d<ServiceResultResponse>> lu2Var);
}
