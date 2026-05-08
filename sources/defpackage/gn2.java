package defpackage;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.PropSetException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gn2<ViewType extends View, PropType> extends uf0 {
    public final Function2<ViewType, PropType, j6g> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gn2(String str, rf0 rf0Var, Function2<? super ViewType, ? super PropType, j6g> function2) {
        super(str, rf0Var);
        str.getClass();
        function2.getClass();
        this.c = function2;
        rf0Var.a.i();
    }

    @Override // defpackage.uf0
    public final void a(Dynamic dynamic, View view, gk0 gk0Var) throws PropSetException {
        CodedException unexpectedException;
        dynamic.getClass();
        view.getClass();
        try {
            Function2<ViewType, PropType, j6g> function2 = this.c;
            d2f d2fVar = this.b.c;
            ((owf) d2fVar.getValue()).b();
            function2.invoke((ViewType) view, (PropType) ((owf) d2fVar.getValue()).a(dynamic, gk0Var, false));
            j6g j6gVar = j6g.a;
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            yd8 yd8VarB = fwc.a.b(view.getClass());
            String str = this.a;
            str.getClass();
            throw new PropSetException("Cannot set prop '" + str + "' on view '" + yd8VarB + "'", unexpectedException);
        }
    }
}
