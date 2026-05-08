package defpackage;

import android.content.Context;
import android.content.Intent;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zw8 implements xh8 {
    public String a;
    public final Lazy b = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zw8 zw8Var) {
            super(0);
            this.$this_inject = zw8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public final void a(Intent intent, xu5<? super String, ? super String, ? super String, ? super Boolean, j6g> xu5Var, Function2<? super String, ? super LineApiError, j6g> function2, Function1<? super Integer, j6g> function1) {
        Integer numValueOf = Integer.valueOf(R.string.line_login_error_no_state);
        intent.getClass();
        int i = LineAuthenticationActivity.d;
        LineLoginResult lineLoginResultA = (LineLoginResult) intent.getParcelableExtra("authentication_result");
        if (lineLoginResultA == null) {
            lineLoginResultA = LineLoginResult.a(xw8.f, new LineApiError("Authentication result is not found."));
        }
        LineApiError lineApiError = lineLoginResultA.V;
        int iOrdinal = lineLoginResultA.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ArrayList arrayList = lz2.a;
                lz2.d("LineAuthManager", "LINE login was cancelled by user.", false, null);
                return;
            }
            ArrayList arrayList2 = lz2.a;
            lz2.c("LineAuthManager", "Other error: " + lineApiError, false, null, 12);
            String str = this.a;
            if (str == null) {
                function1.invoke(numValueOf);
                return;
            } else {
                lineApiError.getClass();
                function2.invoke(str, lineApiError);
                return;
            }
        }
        LineIdToken lineIdToken = lineLoginResultA.d;
        if (lineIdToken == null) {
            function1.invoke(Integer.valueOf(R.string.line_login_error_no_id_token));
            return;
        }
        String str2 = this.a;
        if (str2 == null) {
            function1.invoke(numValueOf);
            return;
        }
        String str3 = lineLoginResultA.b;
        if (str3 == null) {
            function1.invoke(Integer.valueOf(R.string.line_login_error_no_nonce));
            return;
        }
        String str4 = lineIdToken.a;
        str4.getClass();
        Boolean bool = lineLoginResultA.e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        xu5Var.j(str2, str3, str4, bool);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
