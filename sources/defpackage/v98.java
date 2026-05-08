package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v98 implements qvf {
    public final pq2 a;

    public v98(pq2 pq2Var) {
        this.a = pq2Var;
    }

    public static pvf a(pq2 pq2Var, ae6 ae6Var, iyf iyfVar, u98 u98Var) {
        pvf pvfVarC;
        Object objB = pq2Var.b(new iyf(u98Var.value())).b();
        boolean zNullSafe = u98Var.nullSafe();
        if (objB instanceof pvf) {
            pvfVarC = (pvf) objB;
        } else if (objB instanceof qvf) {
            pvfVarC = ((qvf) objB).c(ae6Var, iyfVar);
        } else {
            boolean z = objB instanceof pb8;
            if (!z && !(objB instanceof ja8)) {
                u40.l("Invalid attempt to bind an instance of ", objB.getClass().getName(), " as a @JsonAdapter for ", a.g(iyfVar.b), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            otf otfVar = new otf(z ? (pb8) objB : null, objB instanceof ja8 ? (ja8) objB : null, ae6Var, iyfVar, zNullSafe);
            zNullSafe = false;
            pvfVarC = otfVar;
        }
        return (pvfVarC == null || !zNullSafe) ? pvfVarC : new ovf(pvfVarC);
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        u98 u98Var = (u98) iyfVar.a.getAnnotation(u98.class);
        if (u98Var == null) {
            return null;
        }
        return a(this.a, ae6Var, iyfVar, u98Var);
    }
}
