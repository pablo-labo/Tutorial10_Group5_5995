package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mbi extends obi {
    @Override // defpackage.obi
    public final void g() {
        if (!this.d) {
            for (int i = 0; i < this.b.size(); i++) {
                Map.Entry entryD = d(i);
                if (((n4i) entryD.getKey()).i()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : h()) {
                if (((n4i) entry.getKey()).i()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }
}
