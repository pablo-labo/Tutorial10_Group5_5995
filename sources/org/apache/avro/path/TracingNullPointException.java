package org.apache.avro.path;

import defpackage.b6b;
import defpackage.ipd;
import defpackage.l6b;
import defpackage.q6;
import defpackage.vb9;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class TracingNullPointException extends NullPointerException implements l6b<NullPointerException> {
    private final NullPointerException cause;
    private final boolean customCoderUsed;
    private final g expected;
    private final List<b6b> reversePath = new ArrayList(3);

    public TracingNullPointException(NullPointerException nullPointerException, g gVar, boolean z) {
        this.cause = nullPointerException;
        this.expected = gVar;
        this.customCoderUsed = z;
    }

    @Override // defpackage.l6b
    public final void a(b6b b6bVar) {
        this.reversePath.add(b6bVar);
    }

    @Override // defpackage.l6b
    public final Throwable b(g gVar) {
        StringBuilder sbG = q6.g("null value for (non-nullable) ");
        List<b6b> list = this.reversePath;
        if (list != null && !list.isEmpty()) {
            b6b b6bVar = this.reversePath.get(0);
            if ((b6bVar instanceof vb9) && ((vb9) b6bVar).a == null) {
                sbG.delete(0, sbG.length());
                sbG.append("null key in map");
            } else {
                sbG.append(ipd.b(this.expected));
            }
            sbG.append(" at ");
            if (gVar != null) {
                sbG.append(ipd.b(gVar));
            }
            for (int size = this.reversePath.size() - 1; size >= 0; size--) {
                sbG.append(this.reversePath.get(size).toString());
            }
        } else if (this.customCoderUsed) {
            sbG.append("field or map key. No further details available as custom coders were used");
        } else {
            sbG.append(ipd.b(this.expected));
        }
        NullPointerException nullPointerException = new NullPointerException(sbG.toString());
        nullPointerException.initCause(this.cause);
        return nullPointerException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        NullPointerException nullPointerException;
        synchronized (this) {
            nullPointerException = this.cause;
        }
        return nullPointerException;
    }
}
