package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import defpackage.vf0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ja6<T extends IInterface> extends g91<T> implements vf0.f {
    public final Account A;
    public final w72 y;
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ja6(Context context, Looper looper, int i, w72 w72Var, oo2 oo2Var, jqa jqaVar) {
        fki fkiVarN0 = ka6.n0(context);
        na6 na6Var = na6.d;
        fib.i(oo2Var);
        fib.i(jqaVar);
        super(context, looper, fkiVarN0, na6Var, i, new qbh(oo2Var), new tbh(jqaVar), w72Var.f);
        this.y = w72Var;
        this.A = w72Var.a;
        Set set = w72Var.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                r6.g("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
    }

    @Override // defpackage.g91
    public final Account e() {
        return this.A;
    }

    @Override // defpackage.g91
    public final Set<Scope> h() {
        return this.z;
    }

    @Override // vf0.f
    public final Set<Scope> u0() {
        return t0() ? this.z : Collections.EMPTY_SET;
    }
}
