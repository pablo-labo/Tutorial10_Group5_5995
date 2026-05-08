package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ejb extends wpa {
    public e13 d;
    public Function2<? super vi5<f71>, ? super lu2<? super j6g>, ? extends Object> e;
    public vpa f;
    public boolean g;

    public ejb() {
        throw null;
    }

    @Override // defpackage.wpa
    public final void a() {
        vpa vpaVar = this.f;
        if (vpaVar != null) {
            vpaVar.a();
        }
        vpa vpaVar2 = this.f;
        if (vpaVar2 != null) {
            vpaVar2.a = false;
        }
        this.g = false;
    }

    @Override // defpackage.wpa
    public final void b() {
        vpa vpaVar = this.f;
        if (vpaVar != null && !vpaVar.a) {
            vpaVar.a();
            this.f = null;
        }
        if (this.f == null) {
            this.f = new vpa(this.d, false, this.e, this);
        }
        vpa vpaVar2 = this.f;
        if (vpaVar2 != null) {
            vpaVar2.b.k(null);
        }
        vpa vpaVar3 = this.f;
        if (vpaVar3 != null) {
            vpaVar3.a = false;
        }
        this.g = false;
    }

    @Override // defpackage.wpa
    public final void c(f71 f71Var) {
        f71Var.getClass();
        vpa vpaVar = this.f;
        if (vpaVar != null) {
            vpaVar.b.f(f71Var);
        }
    }

    @Override // defpackage.wpa
    public final void d(f71 f71Var) {
        f71Var.getClass();
        vpa vpaVar = this.f;
        if (vpaVar != null) {
            vpaVar.a();
        }
        if (this.a) {
            this.f = new vpa(this.d, true, this.e, this);
        }
        this.g = true;
    }
}
