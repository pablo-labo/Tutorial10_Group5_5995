package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yxf extends xxf {
    public final ylg a;
    public final ui8 b;

    public yxf(ui8 ui8Var, ylg ylgVar) {
        if (ylgVar == null) {
            d(0);
            throw null;
        }
        if (ui8Var == null) {
            d(1);
            throw null;
        }
        this.a = ylgVar;
        this.b = ui8Var;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.wxf
    public final wxf a(bj8 bj8Var) {
        if (bj8Var != null) {
            return new yxf(bj8Var.A0(this.b), this.a);
        }
        d(6);
        throw null;
    }

    @Override // defpackage.wxf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.wxf
    public final ylg c() {
        ylg ylgVar = this.a;
        if (ylgVar != null) {
            return ylgVar;
        }
        d(4);
        throw null;
    }

    @Override // defpackage.wxf
    public final ui8 getType() {
        ui8 ui8Var = this.b;
        if (ui8Var != null) {
            return ui8Var;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yxf(ui8 ui8Var) {
        this(ui8Var, ylg.INVARIANT);
        if (ui8Var != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
