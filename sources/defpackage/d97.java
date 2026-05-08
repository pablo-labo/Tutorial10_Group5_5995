package defpackage;

import android.content.Context;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.ErrorData;
import defpackage.wg0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.fcm.IndeedFcmManager$associateDevice$1", f = "IndeedFcmManager.kt", l = {112}, m = "invokeSuspend")
public final class d97 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $token;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f97 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d97(f97 f97Var, Context context, String str, lu2<? super d97> lu2Var) {
        super(2, lu2Var);
        this.this$0 = f97Var;
        this.$context = context;
        this.$token = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d97(this.this$0, this.$context, this.$token, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d97) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        d97 d97Var;
        String str;
        String str2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String strB = this.this$0.b.b();
            if (strB == null) {
                ArrayList arrayList = lz2.a;
                lz2.h("IndeedFcmManager", "Device ID was null, skipping push registration", null, 12);
                return j6g.a;
            }
            Context context = this.$context;
            context.getClass();
            b8c b8cVar = (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? b8c.TABLET : b8c.MOBILE;
            String strM = ee3.m(this.$context);
            String strP = r03.p(d93.f());
            f97 f97Var = this.this$0;
            ksa ksaVar = f97Var.a;
            String str3 = this.$token;
            js0 js0Var = new js0(f97Var, 4);
            this.L$0 = strB;
            this.L$1 = null;
            this.L$2 = strM;
            this.L$3 = null;
            this.label = 1;
            d97Var = this;
            obj = ksaVar.E(str3, strM, strB, b8cVar, strP, e77.JOBSEARCH, js0Var, d97Var);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
            str = strM;
            str2 = strB;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            str2 = (String) this.L$0;
            r7d.b(obj);
            d97Var = this;
        }
        wg0 wg0Var = (wg0) obj;
        f97 f97Var2 = d97Var.this$0;
        String str4 = d97Var.$token;
        if (wg0Var instanceof wg0.b) {
            ArrayList arrayList2 = lz2.a;
            lz2.d("IndeedFcmManager", "Push registration succeeded", false, null);
            f97Var2.getClass();
            str4.getClass();
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            bu8.d0.b(bu8.b[13], bu8Var, str4);
        }
        String str5 = d97Var.$token;
        if (wg0Var instanceof wg0.a) {
            p81 p81Var = ((wg0.a) wg0Var).a;
            p81Var.getClass();
            ArrayList arrayList3 = lz2.a;
            ErrorData error = ((ApiError) p81Var).getError();
            StringBuilder sbF = u40.f("Push registration failure for device ID: ", str2, ", appVersion: ", str, ", push token: ");
            sbF.append(str5);
            sbF.append(", error: ");
            sbF.append(error);
            lz2.h("IndeedFcmManager", sbF.toString(), null, 12);
        }
        f97 f97Var3 = d97Var.this$0;
        f97Var3.d = false;
        String str6 = f97Var3.e;
        if (str6 != null) {
            String str7 = d97Var.$token;
            Context context2 = d97Var.$context;
            if (str6.equals(str7)) {
                f97Var3.e = null;
            } else {
                f97Var3.b(context2, str6, false);
            }
        }
        return j6g.a;
    }
}
