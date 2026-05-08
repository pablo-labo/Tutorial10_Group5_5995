package org.apache.avro.path;

import defpackage.b6b;
import defpackage.ipd;
import defpackage.l6b;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.AvroTypeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class TracingAvroTypeException extends AvroTypeException implements l6b<AvroTypeException> {
    private final List<b6b> reversePath;

    public TracingAvroTypeException(AvroTypeException avroTypeException) {
        super(avroTypeException.getMessage(), avroTypeException);
        this.reversePath = new ArrayList(3);
    }

    @Override // defpackage.l6b
    public final void a(b6b b6bVar) {
        this.reversePath.add(b6bVar);
    }

    @Override // defpackage.l6b
    public final Throwable b(g gVar) {
        AvroTypeException avroTypeException = (AvroTypeException) getCause();
        StringBuilder sb = new StringBuilder();
        sb.append(avroTypeException.getMessage());
        List<b6b> list = this.reversePath;
        if (list != null && !list.isEmpty()) {
            sb.append(" at ");
            if (gVar != null) {
                sb.append(ipd.b(gVar));
            }
            for (int size = this.reversePath.size() - 1; size >= 0; size--) {
                sb.append(this.reversePath.get(size).toString());
            }
        }
        AvroTypeException avroTypeException2 = new AvroTypeException(sb.toString());
        avroTypeException2.initCause(avroTypeException);
        return avroTypeException2;
    }
}
