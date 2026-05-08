package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.tel.utils.LoggingUtilKt$LogImpressionEffect$1$1", f = "LoggingUtil.kt", l = {}, m = "invokeSuspend")
public final class m49 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $impressionLogName;
    final /* synthetic */ Function1<String, j6g> $onImpressionCallback;
    final /* synthetic */ String $timelineModuleType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m49(String str, Function1<? super String, j6g> function1, String str2, lu2<? super m49> lu2Var) {
        super(2, lu2Var);
        this.$impressionLogName = str;
        this.$onImpressionCallback = function1;
        this.$timelineModuleType = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m49(this.$impressionLogName, this.$onImpressionCallback, this.$timelineModuleType, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m49) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String str = this.$impressionLogName;
        if (str != null) {
            this.$onImpressionCallback.invoke("tel-" + this.$timelineModuleType + "-" + str);
        }
        return j6g.a;
    }
}
