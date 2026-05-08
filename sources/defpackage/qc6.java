package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.backendservices.graphql.api.GraphQlErrorsException;
import defpackage.wg0;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public interface qc6 extends b {

    public static final class a {
        public static /* synthetic */ Object a(qc6 qc6Var, String str, String str2, pua puaVar, Function2 function2, lu2 lu2Var, int i) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return qc6Var.D(str, str2, puaVar, function2, lu2Var);
        }

        public static wg0 b(sh0 sh0Var) {
            D d = sh0Var.c;
            if (d != 0) {
                return new wg0.b(d);
            }
            List list = sh0Var.d;
            if (list == null) {
                list = zr4.a;
            }
            return new wg0.a(new ApiError(a.d.d, "GraphQL response did not contain data", null, new GraphQlErrorsException(list), 4, null));
        }
    }

    Object D(String str, String str2, pua puaVar, Function2 function2, lu2 lu2Var);

    tc6 w(int i);
}
