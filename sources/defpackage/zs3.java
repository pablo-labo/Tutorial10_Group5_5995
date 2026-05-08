package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class zs3 extends e.c {
    public final int d0 = yia.e(this);
    public e.c e0;

    @Override // androidx.compose.ui.e.c
    public final void S1() {
        super.S1();
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.b2(this.W);
            if (!cVar.c0) {
                cVar.S1();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void T1() {
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.T1();
        }
        super.T1();
    }

    @Override // androidx.compose.ui.e.c
    public final void X1() {
        super.X1();
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.X1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void Y1() {
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.Y1();
        }
        super.Y1();
    }

    @Override // androidx.compose.ui.e.c
    public final void Z1() {
        super.Z1();
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.Z1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void a2(e.c cVar) {
        this.a = cVar;
        for (e.c cVar2 = this.e0; cVar2 != null; cVar2 = cVar2.f) {
            cVar2.a2(cVar);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void b2(tia tiaVar) {
        this.W = tiaVar;
        for (e.c cVar = this.e0; cVar != null; cVar = cVar.f) {
            cVar.b2(tiaVar);
        }
    }

    public final <T extends ts3> T c2(T t) {
        e.c cVarK = t.k();
        if (cVarK != t) {
            e.c cVar = t instanceof e.c ? (e.c) t : null;
            e.c cVar2 = cVar != null ? cVar.e : null;
            if (cVarK != this.a || !wl7.b(cVar2, this)) {
                r6.g("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (cVarK.c0) {
                ae7.b("Cannot delegate to an already attached node");
            }
            cVarK.a2(this.a);
            int i = this.c;
            int iF = yia.f(cVarK);
            cVarK.c = iF;
            int i2 = this.c;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof lm8)) {
                ae7.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVarK);
            }
            cVarK.f = this.e0;
            this.e0 = cVarK;
            cVarK.e = this;
            e2(iF | this.c, false);
            if (this.c0) {
                if (i3 == 0 || (i & 2) != 0) {
                    b2(this.W);
                } else {
                    ria riaVar = us3.f(this).t0;
                    this.a.b2(null);
                    riaVar.g();
                }
                cVarK.S1();
                cVarK.Y1();
                if (!cVarK.c0) {
                    ae7.b("autoInvalidateInsertedNode called on unattached node");
                }
                yia.a(cVarK, -1, 1);
            }
        }
        return t;
    }

    public final void d2(ts3 ts3Var) {
        e.c cVar = null;
        for (e.c cVar2 = this.e0; cVar2 != null; cVar2 = cVar2.f) {
            if (cVar2 == ts3Var) {
                boolean z = cVar2.c0;
                if (z) {
                    o3a<Object> o3aVar = yia.a;
                    if (!z) {
                        ae7.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    yia.a(cVar2, -1, 2);
                    cVar2.Z1();
                    cVar2.T1();
                }
                cVar2.a2(cVar2);
                cVar2.d = 0;
                e.c cVar3 = cVar2.f;
                if (cVar == null) {
                    this.e0 = cVar3;
                } else {
                    cVar.f = cVar3;
                }
                cVar2.f = null;
                cVar2.e = null;
                int i = this.c;
                int iF = yia.f(this);
                e2(iF, true);
                if (this.c0 && (i & 2) != 0 && (iF & 2) == 0) {
                    ria riaVar = us3.f(this).t0;
                    this.a.b2(null);
                    riaVar.g();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        ja.i(ts3Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void e2(int i, boolean z) {
        e.c cVar;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            e.c cVar2 = this.a;
            if (cVar2 == this) {
                this.d = i;
            }
            boolean z2 = this.c0;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == cVar2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == cVar2) {
                    i = yia.f(cVar2);
                    cVar2.c = i;
                }
                int i3 = i | ((r2 == 0 || (cVar = r2.f) == null) ? 0 : cVar.d);
                for (?? r22 = r2; r22 != 0; r22 = r22.e) {
                    i3 |= r22.c;
                    r22.d = i3;
                }
            }
        }
    }
}
