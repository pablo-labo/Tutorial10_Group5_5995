package kotlinx.serialization;

import defpackage.z3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "missingFields", "Ljava/util/List;", "a", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(String str, ArrayList arrayList) {
        String strN;
        str.getClass();
        if (arrayList.size() == 1) {
            strN = z3.n(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strN = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(strN, null);
        this.missingFields = arrayList;
    }

    public final List<String> a() {
        return this.missingFields;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        list.getClass();
        this.missingFields = list;
    }
}
