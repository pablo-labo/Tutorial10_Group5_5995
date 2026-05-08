package defpackage;

import android.net.Uri;
import defpackage.nq7;
import defpackage.qq7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.debug.TareDebugFragment$fetchResumeFileAndOpenPreview$1", f = "TareDebugFragment.kt", l = {288}, m = "invokeSuspend")
public final class w8f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ x8f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8f(x8f x8fVar, lu2<? super w8f> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x8fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new w8f(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((w8f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            y8f y8fVarR = this.this$0.R();
            ((np7) cr8.p(np7.class)).a("TareDebugViewModel", "Fetching resume file metadata...");
            ((gme) y8fVarR.c).setValue("Fetching resume file metadata...");
            o8d o8dVar = this.this$0.i0;
            this.label = 1;
            obj = o8dVar.l(this);
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
        e8d e8dVar = (e8d) obj;
        if (e8dVar == null) {
            x8f.Q(this.this$0, "No resume file found on user's profile");
            this.this$0.R().g(false);
            return j6g.a;
        }
        String str = e8dVar.i;
        String str2 = e8dVar.c;
        if (str == null || str2 == null) {
            x8f.Q(this.this$0, "Resume file metadata missing hashCode or fileName");
            this.this$0.R().g(false);
            return j6g.a;
        }
        Uri uri = (Uri) e94.a.get(str);
        x8f x8fVar = this.this$0;
        if (uri != null) {
            x8f.Q(x8fVar, "Found cached resume file URI, opening preview");
            this.this$0.R().g(false);
            x8f x8fVar2 = this.this$0;
            String string = uri.toString();
            string.getClass();
            x8fVar2.getClass();
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            lr5 lr5VarU = x8fVar2.requireActivity().u();
            lr5VarU.getClass();
            rq7Var.c(lr5VarU, new nq7.c(new qq7.d(new bq7(string, str2)), new uz7(9)), "tare-debug-screen");
        } else {
            x8f.Q(x8fVar, "No local resume file. Go to profile and download it locally in order to preview from the TARE Navigation Debug View.");
            this.this$0.R().g(false);
            ((gme) this.this$0.R().d).setValue(Boolean.TRUE);
        }
        return j6g.a;
    }
}
