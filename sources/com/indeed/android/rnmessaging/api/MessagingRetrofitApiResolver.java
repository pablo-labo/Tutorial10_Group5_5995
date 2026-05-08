package com.indeed.android.rnmessaging.api;

import defpackage.bhg;
import defpackage.bw5;
import defpackage.bya;
import defpackage.fi1;
import defpackage.g2a;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.pue;
import defpackage.r4b;
import defpackage.sd7;
import defpackage.x5b;
import defpackage.z2d;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/indeed/android/rnmessaging/api/MessagingRetrofitApiResolver;", "", "", "base64ConvId", "Lz2d;", "payload", "Lm6d;", "Lj6g;", "reportSpam", "(Ljava/lang/String;Lz2d;Llu2;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "file", "Lbhg;", "uploadFile", "(Lokhttp3/MultipartBody$Part;Llu2;)Ljava/lang/Object;", "messageId", "contentHash", "Lokhttp3/ResponseBody;", "downloadAttachment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "token", "Lsd7;", "getInitiateConversation", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "rnmessaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagingRetrofitApiResolver {
    @pue
    @bw5("messaging/jobseekers/v2/conversations/{base64ConvId}/messages/{messageId}/files/{contentHash}?ims=1&inline=1")
    Object downloadAttachment(@x5b("base64ConvId") String str, @x5b("messageId") String str2, @x5b("contentHash") String str3, lu2<? super ResponseBody> lu2Var);

    @bw5("messaging/jobseekers/utilities/v1/initiateConversation/tokens/{token}?ims=1&inline=1")
    Object getInitiateConversation(@x5b("token") String str, lu2<? super m6d<sd7>> lu2Var);

    @bya("messaging/jobseekers/v2/conversations/{base64ConvId}/moderationRequests")
    Object reportSpam(@x5b("base64ConvId") String str, @fi1 z2d z2dVar, lu2<? super m6d<j6g>> lu2Var);

    @bya("messaging/jobseekers/v2/files?ims=1")
    @g2a
    Object uploadFile(@r4b MultipartBody.Part part, lu2<? super m6d<bhg>> lu2Var);
}
