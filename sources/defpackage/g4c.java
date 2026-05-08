package defpackage;

import defpackage.hv1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g4c extends x3c implements f4c {
    public ui8 b0;
    public final f4c c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4c(d4c d4cVar, lf0 lf0Var, ax9 ax9Var, e04 e04Var, boolean z, boolean z2, boolean z3, hv1.a aVar, f4c f4cVar, qne qneVar) {
        super(ax9Var, e04Var, d4cVar, lf0Var, n8a.n("<get-" + d4cVar.getName() + ">"), z, z2, z3, aVar, qneVar);
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (ax9Var == null) {
            D0(2);
            throw null;
        }
        if (e04Var == null) {
            D0(3);
            throw null;
        }
        if (aVar == null) {
            D0(4);
            throw null;
        }
        if (qneVar == null) {
            D0(5);
            throw null;
        }
        this.c0 = f4cVar != null ? f4cVar : this;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.x3c, defpackage.dj3, defpackage.bj3, defpackage.aj3
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f4c a() {
        f4c f4cVar = this.c0;
        if (f4cVar != null) {
            return f4cVar;
        }
        D0(8);
        throw null;
    }

    public final void O0(ui8 ui8Var) {
        if (ui8Var == null) {
            ui8Var = V().getType();
        }
        this.b0 = ui8Var;
    }

    @Override // defpackage.fv1
    public final ui8 getReturnType() {
        return this.b0;
    }

    @Override // defpackage.fv1
    public final List<rlg> i() {
        List<rlg> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.hv1
    public final Collection<? extends f4c> m() {
        return M0(true);
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.d(this, d);
    }
}
