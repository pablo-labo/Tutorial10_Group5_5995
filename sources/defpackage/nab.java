package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import defpackage.wna;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nab extends z1<n82<l82>, b17> {
    public final ym3 t;
    public final rn9<ot1, l82> u;
    public ot1 v;
    public gze<ye3<n82<l82>>> w;
    public boolean x;

    public nab(Resources resources, bs3 bs3Var, nb4 nb4Var, pg8 pg8Var, d5g d5gVar, rn9 rn9Var) {
        super(bs3Var, d5gVar);
        this.t = new ym3(resources, nb4Var, pg8Var);
        this.u = rn9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zmd A(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof zmd) {
            return (zmd) drawable;
        }
        if (drawable instanceof ub4) {
            return A(((ub4) drawable).q());
        }
        if (!(drawable instanceof bt0)) {
            return null;
        }
        bt0 bt0Var = (bt0) drawable;
        int length = bt0Var.c.length;
        for (int i = 0; i < length; i++) {
            zmd zmdVarA = A(bt0Var.a(i));
            if (zmdVarA != null) {
                return zmdVarA;
            }
        }
        return null;
    }

    public final void B(l82 l82Var) {
        zmd zmdVarA;
        if (this.x) {
            if (this.g == null) {
                gh3 gh3Var = new gh3();
                f(new t17(gh3Var));
                this.g = gh3Var;
                dbe dbeVar = this.f;
                if (dbeVar != null) {
                    dbeVar.c(gh3Var);
                }
            }
            gh3 gh3Var2 = this.g;
            if (gh3Var2 != null) {
                String str = this.h;
                if (str == null) {
                    str = "none";
                }
                gh3Var2.a = str;
                gh3Var2.invalidateSelf();
                dbe dbeVar2 = this.f;
                gh3Var2.e = (dbeVar2 == null || (zmdVarA = A(dbeVar2.b())) == null) ? null : zmdVarA.d;
                Object obj = this.i;
                String string = obj != null ? obj.toString() : null;
                if (string != null) {
                    gh3Var2.f.put("cc", string);
                }
                if (l82Var == null) {
                    gh3Var2.b();
                    return;
                }
                int width = l82Var.getWidth();
                int height = l82Var.getHeight();
                gh3Var2.b = width;
                gh3Var2.c = height;
                gh3Var2.invalidateSelf();
                gh3Var2.d = l82Var.t0();
            }
        }
    }

    @Override // defpackage.z1, defpackage.gc4
    public final void b(ic4 ic4Var) {
        super.b(ic4Var);
        B(null);
    }

    @Override // defpackage.z1
    public final Drawable g(n82<l82> n82Var) {
        n82<l82> n82Var2 = n82Var;
        try {
            it5.a();
            web.i(n82.W(n82Var2));
            l82 l82VarP = n82Var2.P();
            B(l82VarP);
            Drawable drawableA = this.t.a(l82VarP);
            if (drawableA != null) {
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + l82VarP);
        } finally {
            it5.a();
        }
    }

    @Override // defpackage.z1
    public final n82<l82> h() {
        ot1 ot1Var;
        it5.a();
        try {
            rn9<ot1, l82> rn9Var = this.u;
            if (rn9Var != null && (ot1Var = this.v) != null) {
                n82<l82> n82Var = rn9Var.get(ot1Var);
                if (n82Var == null || n82Var.P().o1().c) {
                    return n82Var;
                }
                n82Var.close();
                return null;
            }
            return null;
        } finally {
            it5.a();
        }
    }

    @Override // defpackage.z1
    public final ye3<n82<l82>> j() {
        it5.a();
        s55.a.getClass();
        if (wab.p(2)) {
            s55.i(nab.class, Integer.valueOf(System.identityHashCode(this)), "controller %x: getDataSource");
        }
        ye3<n82<l82>> ye3Var = this.w.get();
        it5.a();
        return ye3Var;
    }

    @Override // defpackage.z1
    public final int k(n82<l82> n82Var) {
        n82<l82> n82Var2 = n82Var;
        if (n82Var2 == null || !n82Var2.Q()) {
            return 0;
        }
        return System.identityHashCode(n82Var2.b.a());
    }

    @Override // defpackage.z1
    public final b17 l(Object obj) {
        n82 n82Var = (n82) obj;
        web.i(n82.W(n82Var));
        return ((l82) n82Var.P()).s1();
    }

    @Override // defpackage.z1
    public final Map s(b17 b17Var) {
        b17 b17Var2 = b17Var;
        if (b17Var2 == null) {
            return null;
        }
        return b17Var2.getExtras();
    }

    @Override // defpackage.z1
    public final String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.b(super.toString(), "super");
        aVarB.b(this.w, "dataSourceSupplier");
        return aVarB.toString();
    }

    @Override // defpackage.z1
    public final void u(Object obj) {
        synchronized (this) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z1
    public final void w(Drawable drawable) {
        if (drawable instanceof dc4) {
            ((dc4) drawable).a();
        }
    }

    @Override // defpackage.z1
    public final void y(n82<l82> n82Var) {
        n82.G(n82Var);
    }
}
