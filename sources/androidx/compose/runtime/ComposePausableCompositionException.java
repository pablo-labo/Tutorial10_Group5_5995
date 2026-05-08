package androidx.compose.runtime;

import defpackage.gh7;
import defpackage.ona;
import defpackage.p3a;
import defpackage.q92;
import defpackage.s6e;
import defpackage.sve;
import defpackage.u63;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lona;", "", "instances", "Lona;", "reused", "Lgh7;", "operations", "Lgh7;", "", "lastOperation", "I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposePausableCompositionException extends Exception {
    private final ona<Object> instances;
    private final int lastOperation;
    private final gh7 operations;
    private final ona<Object> reused;

    public ComposePausableCompositionException(ona onaVar, p3a p3aVar, gh7 gh7Var, int i, Exception exc) {
        super(exc);
        this.instances = onaVar;
        this.reused = p3aVar;
        this.operations = gh7Var;
        this.lastOperation = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listZ;
        StringBuilder sb = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        s6e s6eVarW = q92.w(new a(this, null));
        if (s6eVarW.hasNext()) {
            Object next = s6eVarW.next();
            if (s6eVarW.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (s6eVarW.hasNext()) {
                    arrayList.add(s6eVarW.next());
                }
                listZ = arrayList;
            } else {
                listZ = u63.Z(next);
            }
        } else {
            listZ = zr4.a;
        }
        sb.append(z92.W0(z92.r1(10, listZ), "\n", null, null, null, 62));
        sb.append("\n            ");
        return sve.x(sb.toString());
    }
}
