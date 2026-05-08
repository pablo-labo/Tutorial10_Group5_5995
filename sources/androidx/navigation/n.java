package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.k;
import androidx.navigation.s;
import defpackage.l5;
import defpackage.lc9;
import defpackage.luc;
import defpackage.o6;
import defpackage.u63;
import defpackage.yid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@s.b("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/n;", "Landroidx/navigation/s;", "Landroidx/navigation/l;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class n extends s<l> {
    public final u c;

    public n(u uVar) {
        uVar.getClass();
        this.c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, android.os.Bundle] */
    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            k kVar = dVar.b;
            kVar.getClass();
            l lVar = (l) kVar;
            luc lucVar = new luc();
            lucVar.element = dVar.a();
            int i = lVar.b0;
            String str = lVar.d0;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = lVar.W;
                if (i2 != 0) {
                    strValueOf = lVar.c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            k kVarN = str != null ? lVar.n(str, false) : lVar.a0.e(i);
            if (kVarN == null) {
                if (lVar.c0 == null) {
                    String strValueOf2 = lVar.d0;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(lVar.b0);
                    }
                    lVar.c0 = strValueOf2;
                }
                String str2 = lVar.c0;
                str2.getClass();
                l5.q(l5.m("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            LinkedHashMap linkedHashMap = kVarN.V;
            if (str != null) {
                if (!str.equals(kVarN.X)) {
                    k.b bVarG = kVarN.g(str);
                    Bundle bundle = bVarG != null ? bVarG.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        ?? bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) lucVar.element;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        lucVar.element = bundle2;
                    }
                }
                if (lc9.g0(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListH = yid.h(lc9.g0(linkedHashMap), new m(lucVar));
                    if (!arrayListH.isEmpty()) {
                        o6.o("Cannot navigate to startDestination ", kVarN, ". Missing required arguments [", arrayListH, 93);
                        return;
                    }
                }
            }
            this.c.b(kVarN.a).d(u63.Z(b().a(kVarN, kVarN.b((Bundle) lucVar.element))), pVar);
        }
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this);
    }
}
