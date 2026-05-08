package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function2;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$uploadResume$1", f = "ProfileViewModel.kt", l = {977, 987, 1002, 1026, 1046, 1054}, m = "invokeSuspend")
public final class l2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $originalResumeFileId;
    final /* synthetic */ RequestBody $requestBody;
    final /* synthetic */ String $sourceFileName;
    final /* synthetic */ Uri $sourceFileUri;
    final /* synthetic */ String $sourceMimeType;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2c(x1c x1cVar, String str, String str2, String str3, RequestBody requestBody, Context context, Uri uri, lu2<? super l2c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$originalResumeFileId = str;
        this.$sourceFileName = str2;
        this.$sourceMimeType = str3;
        this.$requestBody = requestBody;
        this.$context = context;
        this.$sourceFileUri = uri;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        l2c l2cVar = new l2c(this.this$0, this.$originalResumeFileId, this.$sourceFileName, this.$sourceMimeType, this.$requestBody, this.$context, this.$sourceFileUri, lu2Var);
        l2cVar.L$0 = obj;
        return l2cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a7  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
