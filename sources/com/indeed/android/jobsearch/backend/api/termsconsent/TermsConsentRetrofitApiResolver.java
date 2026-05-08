package com.indeed.android.jobsearch.backend.api.termsconsent;

import defpackage.bya;
import defpackage.fi1;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.ubf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/jobsearch/backend/api/termsconsent/TermsConsentRetrofitApiResolver;", "", "Lubf;", "payload", "Lm6d;", "Lj6g;", "recordUserConsentForTerms", "(Lubf;Llu2;)Ljava/lang/Object;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TermsConsentRetrofitApiResolver {
    @bya("settings/arbitration_consent")
    Object recordUserConsentForTerms(@fi1 ubf ubfVar, lu2<? super m6d<j6g>> lu2Var);
}
