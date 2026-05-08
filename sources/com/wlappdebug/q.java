package com.wlappdebug;

import android.text.SpannableStringBuilder;
import defpackage.ag5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.o0d;
import defpackage.pf5;
import defpackage.z92;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    public static final q a = new q(1);

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) throws IOException {
        String strW0;
        String str;
        String strAsString;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        try {
            HashMap mapA = ((o0d) pf5.c().b(o0d.class)).a().a();
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry entry : mapA.entrySet()) {
                String str2 = (String) entry.getKey();
                ag5 ag5Var = (ag5) entry.getValue();
                int iG = ag5Var.g();
                if (iG == 0) {
                    str = "static";
                } else if (iG == 1) {
                    str = "default";
                } else if (iG != 2) {
                    str = "unknown source " + ag5Var.g();
                } else {
                    str = "remote";
                }
                try {
                    strAsString = ag5Var.asString();
                } catch (IllegalArgumentException unused) {
                    strAsString = "(null)";
                }
                arrayList.add(str2 + " = (" + str + ") " + strAsString);
            }
            strW0 = z92.W0(z92.o1(arrayList), "\n", null, null, null, 62);
        } catch (IllegalStateException unused2) {
            strW0 = "No items";
        }
        spannableStringBuilder2.append((CharSequence) strW0);
        return j6g.a;
    }
}
