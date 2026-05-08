package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.backendservices.common.api.ApiError;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ug2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;

    public /* synthetic */ ug2(String str) {
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vg2.b(str, (b) obj, ka2.L(1));
                break;
            default:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((np7) cr8.p(np7.class)).c("GhostwriterImpl", l5.l("Failed to delete application ", str), false, apiError.getCause());
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ug2(String str, int i) {
        this.b = str;
    }
}
