package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.hv1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q4c extends x3c implements p4c {
    public rlg b0;
    public final p4c c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4c(d4c d4cVar, lf0 lf0Var, ax9 ax9Var, e04 e04Var, boolean z, boolean z2, boolean z3, hv1.a aVar, p4c p4cVar, qne qneVar) {
        super(ax9Var, e04Var, d4cVar, lf0Var, n8a.n("<set-" + d4cVar.getName() + ">"), z, z2, z3, aVar, qneVar);
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
        this.c0 = p4cVar != null ? p4cVar : this;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case DatadogLogGenerator.CRASH /* 9 */:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static slg N0(q4c q4cVar, ui8 ui8Var, lf0 lf0Var) {
        if (ui8Var == null) {
            D0(8);
            throw null;
        }
        if (lf0Var != null) {
            return new slg(q4cVar, null, 0, lf0Var, toe.g, ui8Var, false, false, false, null, qne.p);
        }
        D0(9);
        throw null;
    }

    @Override // defpackage.x3c, defpackage.dj3, defpackage.bj3, defpackage.aj3
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final p4c a() {
        p4c p4cVar = this.c0;
        if (p4cVar != null) {
            return p4cVar;
        }
        D0(13);
        throw null;
    }

    @Override // defpackage.fv1
    public final ui8 getReturnType() {
        return b04.e(this).x();
    }

    @Override // defpackage.fv1
    public final List<rlg> i() {
        rlg rlgVar = this.b0;
        if (rlgVar == null) {
            bg.h();
            return null;
        }
        List<rlg> listSingletonList = Collections.singletonList(rlgVar);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        D0(11);
        throw null;
    }

    @Override // defpackage.hv1
    public final Collection<? extends p4c> m() {
        return M0(false);
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.l(this, d);
    }
}
