package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class b4 implements sjd {
    public HashMap a;

    @Override // defpackage.sjd
    public final boolean a(rc3 rc3Var) {
        for (Map.Entry entry : this.a.entrySet()) {
            Object obj = rc3Var.l().get(entry.getKey());
            if (obj != null) {
                if (((Pattern) entry.getValue()).matcher(String.valueOf(obj)).matches()) {
                    return false;
                }
            }
        }
        return true;
    }
}
