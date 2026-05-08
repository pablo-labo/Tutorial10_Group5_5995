package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class uqf implements c3h {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public uqf(Context context, x2h x2hVar) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        pe1 pe1Var = new pe1(applicationContext, x2hVar);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        se1 se1Var = new se1(applicationContext2, x2hVar);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        String str = bha.a;
        aha ahaVar = new aha(applicationContext3, x2hVar);
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        due dueVar = new due(applicationContext4, x2hVar);
        this.a = pe1Var;
        this.d = se1Var;
        this.b = ahaVar;
        this.c = dueVar;
    }

    @Override // defpackage.c3h
    public void a(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        d3h d3hVar = (d3h) this.c;
        zze zzeVarC = d3hVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            d3hVar.g(zzeVarC);
        }
    }

    @Override // defpackage.c3h
    public void b(b3h b3hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((rda) this.b).j(b3hVar);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
        }
    }

    @Override // defpackage.c3h
    public void c() throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tda tdaVar = (tda) this.d;
        zze zzeVarC = tdaVar.c();
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            tdaVar.g(zzeVarC);
        }
    }

    public uqf(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        int i = 1;
        this.b = new rda(workDatabase_Impl, i);
        this.c = new d3h(workDatabase_Impl, 0);
        this.d = new tda(workDatabase_Impl, i);
    }
}
