package org.apache.avro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class AvroMissingFieldException extends AvroRuntimeException {
    private List<g.f> chainOfFields;

    public AvroMissingFieldException(String str, g.f fVar) {
        super(str);
        ArrayList arrayList = new ArrayList(8);
        this.chainOfFields = arrayList;
        arrayList.add(fVar);
    }

    public final void c(g.f fVar) {
        this.chainOfFields.add(fVar);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<g.f> it = this.chainOfFields.iterator();
        while (it.hasNext()) {
            sb.insert(0, " --> " + it.next().b);
        }
        return "Path in schema:".concat(String.valueOf(sb));
    }
}
