package defpackage;

import android.content.Context;
import com.indeed.android.jobsearch.R;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$downloadIndeedResumeAsFile$1", f = "ProfileViewModel.kt", l = {1251}, m = "invokeSuspend")
public final class a2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ gu5<j6g> $onSuccess;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2c(x1c x1cVar, Context context, gu5<j6g> gu5Var, lu2<? super a2c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$context = context;
        this.$onSuccess = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a2c(this.this$0, this.$context, this.$onSuccess, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((a2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            x1c x1cVar = this.this$0;
            zcd zcdVar = x1cVar.c;
            String str = x1cVar.o().h;
            if (str == null) {
                str = "";
            }
            this.label = 1;
            obj = zcdVar.C(str, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            ((gme) this.this$0.Y).setValue(b5g.c);
        } else {
            LinkedHashMap linkedHashMap = e94.a;
            Context context = this.$context;
            String string = context.getString(R.string.profile_download_file_name);
            string.getClass();
            e94.a(context, str2, string, true);
            this.$onSuccess.invoke();
        }
        return j6g.a;
    }
}
