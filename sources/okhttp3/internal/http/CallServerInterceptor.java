package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {
    public final boolean a;

    public CallServerInterceptor(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016e A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019c A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ab A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ed A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d A[Catch: IOException -> 0x010d, TryCatch #5 {IOException -> 0x010d, blocks: (B:79:0x00ff, B:81:0x0108, B:84:0x0110, B:92:0x0134, B:94:0x013d, B:95:0x0140, B:96:0x0154, B:100:0x0161, B:102:0x017c, B:104:0x018d, B:107:0x0196, B:114:0x01ab, B:116:0x01af, B:120:0x01bc, B:122:0x01cf, B:124:0x01d9, B:125:0x01e3, B:109:0x019c, B:101:0x016e), top: B:142:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
