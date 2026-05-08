package defpackage;

import android.content.res.Resources;
import com.indeed.android.jobsearch.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u50 {
    public static final boolean a(f5e f5eVar) {
        w4e w4eVarK = f5eVar.k();
        return !w4eVarK.a.b(k5e.i);
    }

    public static final boolean b(f5e f5eVar, Resources resources) {
        List list = (List) x4e.a(f5eVar.d, k5e.a);
        return !ypd.C(f5eVar) && (f5eVar.d.c || (f5eVar.n() && ((list != null ? (String) z92.Q0(list) : null) != null || f(f5eVar) != null || e(f5eVar, resources) != null || d(f5eVar))));
    }

    public static final pm8 c(pm8 pm8Var, Function1<? super pm8, Boolean> function1) {
        for (pm8 pm8VarK = pm8Var.K(); pm8VarK != null; pm8VarK = pm8VarK.K()) {
            if (function1.invoke(pm8VarK).booleanValue()) {
                return pm8VarK;
            }
        }
        return null;
    }

    public static final boolean d(f5e f5eVar) {
        inf infVar = (inf) x4e.a(f5eVar.d, k5e.I);
        w4e w4eVar = f5eVar.d;
        qed qedVar = (qed) x4e.a(w4eVar, k5e.x);
        boolean z = infVar != null;
        if (((Boolean) x4e.a(w4eVar, k5e.H)) == null || (qedVar != null && qedVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String e(f5e f5eVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object objA = x4e.a(f5eVar.d, k5e.b);
        w4e w4eVar = f5eVar.d;
        inf infVar = (inf) x4e.a(w4eVar, k5e.I);
        qed qedVar = (qed) x4e.a(w4eVar, k5e.x);
        Object string = null;
        if (infVar != null) {
            int iOrdinal = infVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        l.g();
                        return null;
                    }
                    if (objA == null) {
                        objA = resources.getString(R.string.indeterminate);
                    }
                } else if (qedVar != null && qedVar.a == 2 && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (qedVar != null && qedVar.a == 2 && objA == null) {
                objA = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) x4e.a(w4eVar, k5e.H);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((qedVar == null || qedVar.a != 4) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        r2c r2cVar = (r2c) x4e.a(w4eVar, k5e.c);
        if (r2cVar != null) {
            if (r2cVar != r2c.c) {
                if (objA == null) {
                    s82 s82Var = r2cVar.b;
                    float f = s82Var.b;
                    float f2 = s82Var.a;
                    float fFloatValue = Float.valueOf(f).floatValue() - Float.valueOf(f2).floatValue() == 0.0f ? 0.0f : (r2cVar.a - Float.valueOf(f2).floatValue()) / (Float.valueOf(s82Var.b).floatValue() - Float.valueOf(f2).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == 0.0f ? 0 : fFloatValue == 1.0f ? 100 : nic.C(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        r5e<le0> r5eVar = k5e.E;
        if (w4eVar.a.b(r5eVar)) {
            w4e w4eVarK = new f5e(f5eVar.a, true, f5eVar.c, w4eVar).k();
            Collection collection2 = (Collection) x4e.a(w4eVarK, k5e.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) x4e.a(w4eVarK, k5e.A)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) x4e.a(w4eVarK, r5eVar)) == null || charSequence.length() == 0))) {
                string = resources.getString(R.string.state_empty);
            }
            objA = string;
        }
        return (String) objA;
    }

    public static final le0 f(f5e f5eVar) {
        le0 le0Var = (le0) x4e.a(f5eVar.d, k5e.E);
        List list = (List) x4e.a(f5eVar.d, k5e.A);
        return le0Var == null ? list != null ? (le0) z92.Q0(list) : null : le0Var;
    }
}
