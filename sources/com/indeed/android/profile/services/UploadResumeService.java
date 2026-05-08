package com.indeed.android.profile.services;

import defpackage.fi1;
import defpackage.j6g;
import defpackage.jya;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.uhg;
import kotlin.Metadata;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/profile/services/UploadResumeService;", "", "", "url", "Lokhttp3/RequestBody;", "requestBody", "Lm6d;", "Lj6g;", "putResume", "(Ljava/lang/String;Lokhttp3/RequestBody;Llu2;)Ljava/lang/Object;", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UploadResumeService {
    @jya
    Object putResume(@uhg String str, @fi1 RequestBody requestBody, lu2<? super m6d<j6g>> lu2Var);
}
