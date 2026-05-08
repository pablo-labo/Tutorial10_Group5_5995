package org.apache.avro.path;

import defpackage.b6b;
import defpackage.ipd;
import defpackage.l6b;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class TracingClassCastException extends ClassCastException implements l6b<ClassCastException> {
    private final ClassCastException cause;
    private final Object datum;
    private final g expected;
    private final boolean customCoderUsed = false;
    private final List<b6b> reversePath = new ArrayList(3);

    public TracingClassCastException(ClassCastException classCastException, Object obj, g gVar) {
        this.cause = classCastException;
        this.datum = obj;
        this.expected = gVar;
    }

    @Override // defpackage.l6b
    public final void a(b6b b6bVar) {
        this.reversePath.add(b6bVar);
    }

    @Override // defpackage.l6b
    public final Throwable b(g gVar) {
        StringBuilder sb = new StringBuilder("value ");
        sb.append(ipd.a(this.datum));
        sb.append(" cannot be cast to expected type ");
        sb.append(ipd.b(this.expected));
        List<b6b> list = this.reversePath;
        if (list != null && !list.isEmpty()) {
            sb.append(" at ");
            if (gVar != null) {
                sb.append(ipd.b(gVar));
            }
            for (int size = this.reversePath.size() - 1; size >= 0; size--) {
                sb.append(this.reversePath.get(size).toString());
            }
        } else if (this.customCoderUsed) {
            sb.append(". No further details available as custom coders were used");
        }
        ClassCastException classCastException = new ClassCastException(sb.toString());
        classCastException.initCause(this.cause);
        return classCastException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        ClassCastException classCastException;
        synchronized (this) {
            classCastException = this.cause;
        }
        return classCastException;
    }
}
