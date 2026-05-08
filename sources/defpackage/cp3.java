package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.k;

/* JADX INFO: loaded from: classes.dex */
public final class cp3 implements ng9 {
    public final wqe a;
    public final e b;
    public k c;
    public ng9 d;
    public boolean e = true;
    public boolean f;

    public cp3(e eVar, d82 d82Var) {
        this.b = eVar;
        this.a = new wqe(d82Var);
    }

    public final void a(k kVar) {
        ng9 ng9Var;
        ng9 ng9VarC = kVar.C();
        if (ng9VarC == null || ng9VarC == (ng9Var = this.d)) {
            return;
        }
        if (ng9Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = ng9VarC;
        this.c = kVar;
        ((og9) ng9VarC).g(this.a.e);
    }

    @Override // defpackage.ng9
    public final cdb e() {
        ng9 ng9Var = this.d;
        return ng9Var != null ? ng9Var.e() : this.a.e;
    }

    @Override // defpackage.ng9
    public final void g(cdb cdbVar) {
        ng9 ng9Var = this.d;
        if (ng9Var != null) {
            ng9Var.g(cdbVar);
            cdbVar = this.d.e();
        }
        this.a.g(cdbVar);
    }

    @Override // defpackage.ng9
    public final boolean h() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        ng9 ng9Var = this.d;
        ng9Var.getClass();
        return ng9Var.h();
    }

    @Override // defpackage.ng9
    public final long w() {
        if (this.e) {
            return this.a.w();
        }
        ng9 ng9Var = this.d;
        ng9Var.getClass();
        return ng9Var.w();
    }
}
