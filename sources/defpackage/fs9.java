package defpackage;

import com.indeed.android.messaging.api.messaging.MessagingRetrofitApiResolver;
import java.io.File;
import kotlin.jvm.functions.Function1;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.MessagingTasks$uploadFile$3", f = "MessagingTasks.kt", l = {34}, m = "invokeSuspend")
public final class fs9 extends c1f implements Function1<lu2<? super m6d<ahg>>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ String $mimeType;
    int label;
    final /* synthetic */ gs9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs9(gs9 gs9Var, File file, String str, lu2<? super fs9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = gs9Var;
        this.$file = file;
        this.$mimeType = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new fs9(this.this$0, this.$file, this.$mimeType, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<ahg>> lu2Var) {
        return ((fs9) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        MessagingRetrofitApiResolver messagingRetrofitApiResolverC = this.this$0.c();
        MultipartBody.Part.Companion companion = MultipartBody.Part.c;
        String name = this.$file.getName();
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        File file = this.$file;
        MediaType.Companion companion3 = MediaType.e;
        String str = this.$mimeType;
        companion3.getClass();
        MediaType mediaTypeA = MediaType.Companion.a(str);
        companion2.getClass();
        file.getClass();
        RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(mediaTypeA, file);
        companion.getClass();
        MultipartBody.Part partB = MultipartBody.Part.Companion.b("file", name, requestBody$Companion$asRequestBody$1);
        this.label = 1;
        Object objUploadFile = messagingRetrofitApiResolverC.uploadFile(partB, this);
        g13 g13Var = g13.a;
        return objUploadFile == g13Var ? g13Var : objUploadFile;
    }
}
