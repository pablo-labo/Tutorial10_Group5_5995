package androidx.compose.runtime.tooling;

import defpackage.fl2;
import defpackage.iy8;
import defpackage.u63;
import defpackage.xad;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lfl2;", "trace", "Ljava/util/List;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiagnosticComposeException extends RuntimeException {
    private final List<fl2> trace;

    public DiagnosticComposeException(List<fl2> list) {
        this.trace = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        List<fl2> list = this.trace;
        iy8 iy8VarS = u63.s();
        list.getClass();
        xad xadVar = new xad(list);
        if (xadVar.a() > 0) {
            ((fl2) xadVar.get(0)).getClass();
            throw null;
        }
        iy8 iy8VarL = iy8VarS.l();
        iy8VarL.getClass();
        xad xadVar2 = new xad(iy8VarL);
        int iA = xadVar2.a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat " + ((String) xadVar2.get(i)));
            sb.append('\n');
        }
        return sb.toString();
    }
}
