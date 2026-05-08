package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.components.ResumeFileDisplayKt$ResumeFileDisplay$2$1", f = "ResumeFileDisplay.kt", l = {}, m = "invokeSuspend")
public final class b8d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ n9d $resumePreviewViewModelState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8d(n9d n9dVar, lu2<? super b8d> lu2Var) {
        super(2, lu2Var);
        this.$resumePreviewViewModelState = n9dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new b8d(this.$resumePreviewViewModelState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((b8d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        n9d n9dVar = this.$resumePreviewViewModelState;
        if (n9dVar.f) {
            String str = n9dVar.b;
            if (str == null) {
                str = "";
            }
            if (v1c.h(str)) {
                dg3.e("Resume File Preview Error", oub.FILE_PREVIEW);
            }
        }
        return j6g.a;
    }
}
