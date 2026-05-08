package defpackage;

import androidx.compose.ui.layout.v;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.layout.x;
import defpackage.f81;
import defpackage.jn5;
import defpackage.pn5;
import defpackage.tia;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface rxa extends chb {

    public interface a {
        void l();
    }

    void A();

    void B(pm8 pm8Var, boolean z, boolean z2, boolean z3);

    void C();

    void a(boolean z);

    long b(long j);

    void c(pm8 pm8Var);

    void e(f81.b bVar);

    void f(pm8 pm8Var);

    default void g(int i, pm8 pm8Var) {
    }

    g6 getAccessibilityManager();

    h51 getAutofill();

    n51 getAutofillManager();

    p51 getAutofillTree();

    y72 getClipboard();

    z72 getClipboardManager();

    v03 getCoroutineContext();

    iy3 getDensity();

    p94 getDragAndDropManager();

    im5 getFocusOwner();

    pn5.a getFontFamilyResolver();

    jn5.a getFontLoader();

    wc6 getGraphicsContext();

    yf6 getHapticFeedBack();

    cf7 getInputModeManager();

    vl8 getLayoutDirection();

    mx9 getModifierLocalManager();

    default hwa getOutOfFrameExecutor() {
        return null;
    }

    default w.a getPlacementScope() {
        x.a aVar = x.a;
        return new v(this);
    }

    veb getPointerIconService();

    stc getRectManager();

    pm8 getRoot();

    j5e getSemanticsOwner();

    sm8 getSharedDrawScope();

    boolean getShowLayoutBounds();

    vxa getSnapshotObserver();

    hne getSoftwareKeyboardController();

    rhf getTextInputService();

    ujf getTextToolbar();

    opg getViewConfiguration();

    kzg getWindowInfo();

    void h(pm8 pm8Var);

    void j(pm8 pm8Var);

    void k(pm8 pm8Var, boolean z);

    void l(pm8 pm8Var);

    qxa m(Function2 function2, tia.f fVar, xc6 xc6Var);

    void n(pm8 pm8Var);

    void o(pm8 pm8Var);

    default void q() {
    }

    void r(pm8 pm8Var, boolean z, boolean z2);

    void s(pm8 pm8Var, long j);

    void setShowLayoutBounds(boolean z);

    long t(long j);

    default void u(float f) {
    }

    void w(gu5<j6g> gu5Var);

    void x(Function2 function2, pu2 pu2Var);

    default void y(int i, pm8 pm8Var) {
    }

    void z();
}
