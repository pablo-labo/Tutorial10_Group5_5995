package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkg {
    public static final String a(kwf kwfVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + kwfVar);
        sb.append('\n');
        sb.append("hashCode: " + kwfVar.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + kwfVar.getClass().getCanonicalName());
        sb.append('\n');
        for (aj3 aj3VarD = kwfVar.d(); aj3VarD != null; aj3VarD = aj3VarD.d()) {
            sb.append("fqName: ".concat(mz3.a.w(aj3VarD)));
            sb.append('\n');
            sb.append("javaClass: " + aj3VarD.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }
}
