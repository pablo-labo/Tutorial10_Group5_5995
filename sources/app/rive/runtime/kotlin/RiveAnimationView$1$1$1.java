package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "it", "Lj6g;", "invoke", "(Lapp/rive/runtime/kotlin/core/File;)V", "<anonymous>"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0})
public final class RiveAnimationView$1$1$1 extends mj8 implements Function1<File, j6g> {
    final /* synthetic */ RiveAnimationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView$1$1$1(RiveAnimationView riveAnimationView) {
        super(1);
        this.this$0 = riveAnimationView;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) throws ViewModelException, StateMachineException {
        file.getClass();
        this.this$0.getController().setFile(file);
        this.this$0.getController().setupScene$kotlin_release(this.this$0.getRendererAttributes());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(File file) throws ViewModelException, StateMachineException {
        invoke2(file);
        return j6g.a;
    }
}
