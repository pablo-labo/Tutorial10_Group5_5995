package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public enum u3c {
    DATADOG(npf.a),
    /* JADX INFO: Fake field, exist only in values array */
    B3(npf.b, npf.c),
    /* JADX INFO: Fake field, exist only in values array */
    HAYSTACK(npf.d),
    /* JADX INFO: Fake field, exist only in values array */
    XRAY(npf.e);

    private final List<npf> newStyles;

    u3c(npf... npfVarArr) {
        this.newStyles = Collections.unmodifiableList(Arrays.asList(npfVarArr));
    }

    public final List<npf> a() {
        return this.newStyles;
    }
}
