package expo.modules.kotlin.sharedobjects;

import defpackage.ohd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedRef<RefType> extends SharedObject {
    public final RefType c;
    public final String d;

    public SharedRef(RefType reftype, ohd ohdVar) {
        super(ohdVar);
        this.c = reftype;
        this.d = "unknown";
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public String getD() {
        return this.d;
    }
}
