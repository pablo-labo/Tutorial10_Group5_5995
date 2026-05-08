package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq8 implements l74 {
    public final /* synthetic */ mr8 a;

    public xq8(mr8 mr8Var) {
        this.a = mr8Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        mr8 mr8Var = this.a;
        slb slbVar = mr8Var.d;
        if (slbVar != null) {
            slbVar.d = false;
        }
        mr8Var.d = null;
    }
}
