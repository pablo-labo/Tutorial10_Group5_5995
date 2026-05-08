package defpackage;

import android.os.OperationCanceledException;
import defpackage.c27;
import expo.modules.imagepicker.FailedToPickMediaException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.ImagePickerModule$launchPicker$2", f = "ImagePickerModule.kt", l = {243}, m = "invokeSuspend")
public final class i27 extends c1f implements Function2<e13, lu2<? super c27.c>, Object> {
    final /* synthetic */ Function1<lu2<? super c27>, Object> $pickerLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i27(Function1<? super lu2<? super c27>, ? extends Object> function1, lu2<? super i27> lu2Var) {
        super(2, lu2Var);
        this.$pickerLauncher = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i27(this.$pickerLauncher, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super c27.c> lu2Var) {
        return ((i27) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws FailedToPickMediaException {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Function1<lu2<? super c27>, Object> function1 = this.$pickerLauncher;
            this.label = 1;
            obj = function1.invoke(this);
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
        c27 c27Var = (c27) obj;
        if (c27Var instanceof c27.c) {
            return (c27.c) c27Var;
        }
        if (c27Var instanceof c27.a) {
            throw new OperationCanceledException();
        }
        if (c27Var instanceof c27.b) {
            throw new FailedToPickMediaException();
        }
        l.g();
        return null;
    }
}
