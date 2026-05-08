package defpackage;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u7e implements Function {
    public final /* synthetic */ Map a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        StringBuilder sbG = h5.g(str, "=");
        sbG.append((String) this.a.get(str));
        return sbG.toString();
    }
}
