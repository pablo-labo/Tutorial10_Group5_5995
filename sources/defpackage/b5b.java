package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.EmptyResponseBodyError;
import com.indeed.android.backendservices.common.api.ErrorData;
import com.indeed.android.backendservices.common.api.HttpStatusCodeError;
import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.jobsearch.backend.api.passport.PassportRetrofitApiResolver;
import defpackage.wg0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface b5b extends b {
    @Override // com.indeed.android.backendservices.common.api.b
    default wg0.a a(Exception exc) {
        ArrayList arrayList = lz2.a;
        lz2.c("PassportBaseApiTask", bg.e(exc, "API Error in HttpResponse: "), false, null, 12);
        if (!(exc instanceof EmptyResponseBodyError)) {
            return new wg0.a(new ApiError(new a.e(), null, null, exc, 6, null));
        }
        return new wg0.a(new ApiError(a.d.d, bg.e(exc, "Missing response: "), null, exc, 4, null));
    }

    @Override // com.indeed.android.backendservices.common.api.b
    default wg0.a b(int i, String str) {
        String str2 = str == null ? "" : str;
        if (str2.length() > 0) {
            ArrayList arrayList = lz2.a;
            lz2.c("PassportBaseApiTask", l5.l("ApiError from ApiResponse: ", str), false, null, 12);
        }
        return new wg0.a(new ApiError(new a.C0162a(), null, new ErrorData(str2, String.valueOf(i)), new HttpStatusCodeError(i), 2, null));
    }

    PassportRetrofitApiResolver c();
}
