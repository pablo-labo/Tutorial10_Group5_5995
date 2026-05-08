package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface im5 extends fm5 {
    Boolean a(int i, qtc qtcVar, Function1<? super FocusTargetNode, Boolean> function1);

    void b(sl5 sl5Var);

    boolean d(ufd ufdVar, l50 l50Var);

    boolean e(KeyEvent keyEvent);

    FocusTargetNode f();

    void g(FocusTargetNode focusTargetNode);

    void h();

    FocusOwnerImpl$modifier$1 i();

    boolean j();

    boolean k(KeyEvent keyEvent, gu5<Boolean> gu5Var);

    ym5 l();

    boolean m();

    boolean n(web webVar, AndroidComposeView.f fVar);

    qtc o();

    boolean p(int i, boolean z, boolean z2);

    void q(FocusTargetNode focusTargetNode);

    void r();

    p3a<em5> s();
}
