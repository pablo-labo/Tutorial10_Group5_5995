package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mge extends p7g implements oge, cwf {
    @Override // defpackage.p7g
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public abstract mge Q0(boolean z);

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public abstract mge S0(gwf gwfVar);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator<af0> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", mz3.c.x(it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(M0());
        if (!K0().isEmpty()) {
            z92.V0(K0(), sb, ", ", "<", ">", null, 112);
        }
        if (N0()) {
            sb.append(CoreFeature.DEFAULT_APP_VERSION);
        }
        return sb.toString();
    }
}
