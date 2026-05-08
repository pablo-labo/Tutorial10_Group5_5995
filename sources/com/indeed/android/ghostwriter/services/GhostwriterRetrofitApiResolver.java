package com.indeed.android.ghostwriter.services;

import defpackage.bw5;
import defpackage.bya;
import defpackage.ep0;
import defpackage.exe;
import defpackage.fi1;
import defpackage.g2a;
import defpackage.i63;
import defpackage.i9c;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m4b;
import defpackage.m6d;
import defpackage.py7;
import defpackage.r4b;
import defpackage.rre;
import defpackage.sre;
import defpackage.uhg;
import defpackage.vc3;
import defpackage.x5b;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0010J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\fJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r0\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\fJ>\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010#\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/indeed/android/ghostwriter/services/GhostwriterRetrofitApiResolver;", "", "", "url", "Lokhttp3/RequestBody;", "requestBody", "Lm6d;", "getScheduleApplyConsentStatus", "(Ljava/lang/String;Lokhttp3/RequestBody;Llu2;)Ljava/lang/Object;", "jobUrl", "Lpy7;", "getJobEligibility", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "", "Lep0;", "getApplications", "(Llu2;)Ljava/lang/Object;", "Lm4b;", "getParsedJobs", "applicationId", "Li63;", "payload", "createResponseSet", "(Ljava/lang/String;Li63;Llu2;)Ljava/lang/Object;", "Lexe;", "submitApplication", "(Ljava/lang/String;Lexe;Llu2;)Ljava/lang/Object;", "Lrre;", "data", "Lsre;", "startScheduleApply", "(Lrre;Llu2;)Ljava/lang/Object;", "Lj6g;", "deleteApplication", "getApplicationFiles", "groupId", "formFieldId", "Lokhttp3/MultipartBody$Part;", "file", "uploadFile", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Llu2;)Ljava/lang/Object;", "ghostwriter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GhostwriterRetrofitApiResolver {
    @bya("applications/{application_id}/response-sets")
    Object createResponseSet(@x5b("application_id") String str, @fi1 i63 i63Var, lu2<? super m6d<Object>> lu2Var);

    @vc3("applications/{application_id}")
    Object deleteApplication(@x5b("application_id") String str, lu2<? super m6d<j6g>> lu2Var);

    @bw5("applications/{application_id}/files")
    Object getApplicationFiles(@x5b("application_id") String str, lu2<? super m6d<List<Object>>> lu2Var);

    @bw5("applications")
    Object getApplications(lu2<? super m6d<List<ep0>>> lu2Var);

    @bw5("job-eligibility")
    Object getJobEligibility(@i9c("job_url") String str, lu2<? super m6d<py7>> lu2Var);

    @bw5("parsed-jobs")
    Object getParsedJobs(lu2<? super m6d<m4b>> lu2Var);

    @bw5
    Object getScheduleApplyConsentStatus(@uhg String str, @fi1 RequestBody requestBody, lu2<? super m6d<Object>> lu2Var);

    @bya("trigger-scheduled-apply")
    Object startScheduleApply(@fi1 rre rreVar, lu2<? super m6d<sre>> lu2Var);

    @bya("applications/{application_id}/submit")
    Object submitApplication(@x5b("application_id") String str, @fi1 exe exeVar, lu2<? super m6d<Object>> lu2Var);

    @bya("files/upload")
    @g2a
    Object uploadFile(@r4b("group_id") RequestBody requestBody, @r4b("form_field_id") RequestBody requestBody2, @r4b("application_id") RequestBody requestBody3, @r4b MultipartBody.Part part, lu2<? super m6d<Object>> lu2Var);
}
