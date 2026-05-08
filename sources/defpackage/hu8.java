package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hu8 implements scb {
    public a a;

    public interface a {
        uqe C(b80 b80Var);

        sl8 K();

        lu8 K1();

        rgf d1();

        hne getSoftwareKeyboardController();

        opg getViewConfiguration();
    }

    @Override // defpackage.scb
    public final void e() {
        hne softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.c();
    }

    @Override // defpackage.scb
    public final void h() {
        hne softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    public abstract void i();

    public final void j(zt8 zt8Var) {
        if (this.a != zt8Var) {
            de7.c("Expected textInputModifierNode to be " + zt8Var + " but was " + this.a);
        }
        this.a = null;
    }
}
